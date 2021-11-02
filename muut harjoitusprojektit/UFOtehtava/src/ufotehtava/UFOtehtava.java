/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufotehtava;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
/**
 *
 * @author zheny
 */
public class UFOtehtava {

    public static void main(String[] args) {
        System.out.print("tiedosto(tai paina enter): ");
        String tiedosto = new Scanner(System.in).nextLine().trim();
        
        try(Scanner tlukija = new Scanner(new File("havainnot.xml"))){
            
            List<Haivainto> havainnot = new ArrayList();
            while(tlukija.hasNextLine()){
                
                String[] palat = tlukija.nextLine().split(";");
                
                Haivainto h = new Haivainto(palat);
                
                havainnot.add( h);
                
                
            }
            
            havaintoja(havainnot);
            esineidenMuodot(havainnot);
            havainnotVuosittain(havainnot);
            havainnotTunneittain(havainnot);
            muodotHavainnonKestonMukaanRyhmiteltynä(havainnot);
            tunnitHavainnonKestonMukaanRyhmiteltynä(havainnot);
            yleisimmatSanatEsiintymiskertojenMukaanJarjestettyna(havainnot);
            
        } catch (FileNotFoundException ex) {
            System.out.println("tiedostoa ei voi avata");
        }
        
        
        
    }
    
    private static void havaintoja(List<Haivainto> havainnot){
        System.out.println("Havaintoja: "+havainnot.size());
        double lyhin = havainnot.stream().mapToDouble(h -> h.getKesto())
                .sorted().findFirst().getAsDouble();
        double pisin = havainnot.stream().mapToDouble(h -> h.getKesto())
                .sorted().max().getAsDouble();
        double ka = havainnot.stream().mapToDouble(h -> h.getKesto())
                .average().getAsDouble();
        System.out.println(
                "Lyhimmän havainnon kesto sekunteina: "+lyhin+"\n" +
                "Pisimmän havainnon kesto sekunteina: "+pisin+"\n" +
                "Keskimääräinen havainnon kesto sekunteina: " + ka);
        System.out.println("");
    }
    
    private static void esineidenMuodot(List<Haivainto> havainnot){
        System.out.println("Esineiden muodot");
        
        Map<String, Integer> map = new HashMap();
        
        //lisätään muodot mappiin
        havainnot.stream().forEach(h -> {
            String muoto = h.getMuoto();
            map.put(muoto, map.getOrDefault(muoto, 0)+1);
        });
        
        //tulostetaan muodot järjestettyinä
        map.keySet().stream().sorted(((m1, m2) -> m1.compareTo(m2)))
                .forEach(muoto -> {
                    System.out.println("      "+muoto+", havaintoja: "+map.get(muoto));
                });
        
        // etsitään eniten esiintyvä muoto/muodot
        
        
        int enitenluku = map.keySet().stream().mapToInt(muoto -> map.get(muoto)).max().getAsInt();
        
        StringBuilder sb = new StringBuilder();
        map.keySet().stream().filter( m -> map.get(m) == enitenluku).forEach(m -> sb.append(m+", "));
        
        System.out.println("Eniten havaintoja: "+sb.toString()+enitenluku);
        System.out.println("");
    }
    
    
    
   
    private static void havainnotVuosittain(List<Haivainto> havainnot){
        
        System.out.println("Havainnot vuosittain");
        
        Map<Integer, Integer> map = new HashMap();
        
        //lisätään vudet mappiin
        havainnot.stream().forEach(h -> {
            int vuosi = h.getVuosi();
            map.put(vuosi, map.getOrDefault(vuosi, 0)+1);
        });
        
        //tulostetaan vuodet järjestettyinä
        map.keySet().stream().sorted(((m1, m2) -> m1.compareTo(m2)))
                .forEach(vuosi -> {
                    System.out.println("      "+vuosi+", havaintoja: "+map.get(vuosi));
                });
        
        
        System.out.println("");
        
    }
    
    
    private static void havainnotTunneittain(List<Haivainto> havainnot){
        
        System.out.println("Havainnot tunneittain");
        
        Map<Integer, Integer> map = new HashMap();
        
        //lisätään tunnit mappiin
        havainnot.stream().forEach(h -> {
            int tunti = h.getHavaintotunti();
            map.put(tunti, map.getOrDefault(tunti, 0)+1);
        });
        
        //tulostetaan tunnit järjestettyinä
        map.keySet().stream().sorted(((h1, h2) -> h1.compareTo(h2)))
                .forEach(tunti -> {
                    System.out.println("      "+tunti+" - "+(tunti+1)+
                    ", havaintoja: "+map.get(tunti) + ", " + 
                     100.0*map.get(tunti)/havainnot.size()+"%");
                });
        
        
        System.out.println("");
        
    }
    
    
    private static void muodotHavainnonKestonMukaanRyhmiteltynä(List<Haivainto> havainnot){
        
        System.out.println("Muodot havainnon keston mukaan ryhmiteltynä");
        
        Map<String, int[]> map = new HashMap();
        
        //lisätään muodot mappiin
        havainnot.stream().forEach(h -> {
            String muoto = h.getMuoto();
            int[] taulukko = new int[3];
            int kestonryhma = kestonRyhma(h.getKesto());
            if(map.containsKey(muoto)){
                map.get(muoto)[kestonryhma]++;
            }
            else{
                taulukko[kestonryhma] ++;
                map.put(muoto, taulukko);
            }
        });
        
        int lyhyt = 0;
        int keski = 0;
        int pitka = 0;
        
        for(int[] t: map.values()){
            lyhyt += t[0];
            keski += t[1];
            pitka += t[2];            
        }
        System.out.println("lyhyt: 0-60.0, havaintoja "+lyhyt+"\n" +
                        "keskipitkä: 60.0-1200.0, havaintoja "+keski+"\n" +
                        "pitkä: 1200.0-3600.0, havaintoja "+pitka+"\n"
                        +"      muoto lyhyt   keskipitkä  pitkä");
        //tulostetaan taulukkona
        map.keySet().stream().sorted(((m1, m2) -> m1.compareTo(m2)))
                .forEach(muoto -> {
                    int[] t= map.get(muoto);
                    System.out.println("      "+muoto+"   "+t[0]+"   "+t[1]+"    "+t[2] );
                });
        
        
        System.out.println("");
        

    }
    private static int kestonRyhma(double kesto){
        if(kesto<=60.0){
            return 0;
        }
        if(kesto>60.0 && kesto<1200.0){
            return 1;
        }
        else if(kesto>=1200.0 && kesto<=3600.0){
            return 2;
        }
        else return -1;
    }


    private static void tunnitHavainnonKestonMukaanRyhmiteltynä(List<Haivainto> havainnot){
        
        System.out.println("Tunnit havainnon keston mukaan ryhmiteltynä");
        
        Map<Integer, int[]> map = new HashMap();
        
        //lisätään tunnit mappiin
        havainnot.stream().forEach(h -> {
            int tunti = h.getHavaintotunti();
            int[] taulukko = new int[3];
            int kestonryhma = kestonRyhma(h.getKesto());
            if(map.containsKey(tunti)){
                map.get(tunti)[kestonryhma]++;
            }
            else{
                taulukko[kestonryhma] ++;
                map.put(tunti, taulukko);
            }
        });
        
               
        //tulostetaan taulukkona
        map.keySet().stream().sorted(((t1, t2) -> t1.compareTo(t2)))
                .forEach(tunti -> {
                    int[] t= map.get(tunti);
                    System.out.println("      "+tunti+" - "+(tunti+1)+"   "+t[0]+"   "+t[1]+"    "+t[2] );
                });
        
        
        System.out.println("");
        

    }

    private static void yleisimmatSanatEsiintymiskertojenMukaanJarjestettyna(List<Haivainto> havainnot){
        Map<String, Integer> map = new HashMap();
        
        havainnot.stream().forEach(h -> {
            String[] palat = h.getKuvaus().replaceAll("[-.,/?;)(*_0-9]", " ").split(" ");
            
            for(int i = 0; i<palat.length; i++){                
                map.put(palat[i], map.getOrDefault(palat[i], 0)+1);
            }
            
        });
        
        map.keySet().stream().sorted((s1, s2) -> {
            if(map.get(s1) == map.get(s2)){
                return s1.compareTo(s2);
            }
            return map.get(s1) - map.get(s2);
        }).limit(15).forEach(sana -> {
            System.out.println(sana+", "+map.get(sana));
        });
        
    }
    
}
