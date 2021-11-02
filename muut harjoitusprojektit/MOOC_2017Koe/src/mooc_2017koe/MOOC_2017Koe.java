package mooc_2017koe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MOOC_2017Koe {
    
    public static void main(String[] args) throws FileNotFoundException {        
        Scanner lukija = new Scanner(System.in);
        System.out.println("Tiedosto: ");
        String tiedosto = lukija.nextLine();
        try(Scanner tlukija = new Scanner(new File("havainnot.xml")) ) {
            ArrayList<Havainto> havainnot = new ArrayList<>();
            while ( tlukija.hasNextLine()){
//                if(!tlukija.nextLine().equals("")){
                    String rivi = tlukija.nextLine();
                    havainnot.add(new Havainto(rivi, new Sijainti(rivi), new Paivamaara(rivi)));
//                }
                
            }
            
            if(!havainnot.isEmpty()){
                tulosta1(havainnot); //desimaalit vielä
                tulosta2(havainnot);
                tulostaHavainnotVuosittain(havainnot);  
                tulostaHavainnotTunneittain(havainnot);
                tulostaMuodotHavainnonKestonMukaan(havainnot);
                tulostaYleisimmatSanat(havainnot);
                tulostaYleisimmatSanaparit(havainnot);
                 }            
        }
//        catch(Exception e){
//            System.out.println("Tiedoston lukemisessa ongelma:  "+ e);
//        }
    }
    
    private static void tulosta1(ArrayList<Havainto> lista){
        double lyhinkesto = lista.stream().mapToDouble(h -> h.getKestoAsDouble())
                .sorted().findFirst().getAsDouble();
        double pisinkesto = lista.stream().mapToDouble(h -> h.getKestoAsDouble()).sorted()
                .max().getAsDouble();
        double keskiarvo = lista.stream().mapToDouble(h -> h.getKestoAsDouble()).average().getAsDouble();
        System.out.println("Havaintoja: "+lista.size()+"\n" +
                            "Lyhimmän havainnon kesto sekunteina: "+lyhinkesto+"\n" +
                            "Pisimmän havainnon kesto sekunteina: "+pisinkesto+"\n" +
                            "Keskimääräinen havainnon kesto sekunteina: "+keskiarvo);
        System.out.println("");
    }
    

    private static void tulosta2(ArrayList<Havainto> havainnot){
        System.out.println("Esineiden muodot");
        HashMap<String, Integer> map = new HashMap<>();        
        havainnot.stream().map(havainto -> havainto.muoto.toLowerCase())                 
                .forEach(muoto -> { map.put(muoto, map.getOrDefault(muoto, 0)+1); }) ;
        
        map.keySet().stream().sorted((muoto1, muoto2) -> { return muoto1.compareTo(muoto2); }) // järjestetään muodot aakkosjärjestyksen mukaan
                .forEach(muoto -> System.out.println("      " + muoto +", havaintoja: "+map.get(muoto)));
        
        int enitenMaara = map.values().stream().max((luku1, luku2) -> { return luku1 - luku2;}).get();
        StringBuilder sbuilder = new StringBuilder();
        for(String muoto: map.keySet()){
            if(map.get(muoto) == enitenMaara){
                sbuilder.append(muoto+", ");
            }
        }
        System.out.println("Eniten havaintoja: "+sbuilder + enitenMaara +" kertaa" );        
        System.out.println("");
    }
    
    
    
    public static void tulostaHavainnotVuosittain(ArrayList<Havainto> havainnot){
        System.out.println("Havainnot vuosittain");
        HashMap<Integer, Integer> vuodetJaHavainnot = new HashMap<>();
        havainnot.stream().mapToInt(h -> h.paivamaara.getAsInteger(h.paivamaara.vuosi))
                .forEach(vuos -> {
                    vuodetJaHavainnot.put(vuos, vuodetJaHavainnot.getOrDefault(vuos, 0)+1);
                });
        
        vuodetJaHavainnot.keySet().stream().sorted()
                .forEach(vuos -> {
                    System.out.println("      "+vuos+", havaintoja "+vuodetJaHavainnot.get(vuos));
                });
        System.out.println();
    }
    
    public static void tulostaHavainnotTunneittain(ArrayList<Havainto> havainnot){
        HashMap<Integer, Integer> map = new HashMap();
        
        havainnot.stream().forEach(rivi -> {
            int tunti = rivi.paivamaara.getAsInteger(rivi.paivamaara.tunti);
            map.put(tunti, map.getOrDefault(tunti, 0)+1);
        });
        
        map.entrySet().stream().sorted((v1, v2 ) -> {return v1.getKey() - v2.getKey();}).forEach(pari -> {
            System.out.println( pari.getKey() + "-" + (pari.getKey()+1) + ", havaintoja: "+pari.getValue()
                    +", "+ 100.0*pari.getValue()/havainnot.size() + "%" );
        });
        System.out.println();
    }
    
    public static void tulostaMuodotHavainnonKestonMukaan(ArrayList<Havainto> havainnot){
        int lyhyita = havainnot.stream().mapToInt(h -> h.getkestonRyhma())
                .filter(ryhma -> ryhma == 1).sum();
        int keski =(int) havainnot.stream().mapToInt(h -> h.getkestonRyhma())
                .filter(ryhma -> ryhma == 2).count();
        int pitkia = (int) havainnot.stream().mapToInt(h -> h.getkestonRyhma())
                .filter(ryhma -> ryhma == 3).count();
        System.out.println("Muodot havainnon keston mukaan ryhmiteltynä\n" +
                            "lyhyt: 0-60.0, havaintoja "+lyhyita+"\n" +
                            "keskipitkä: 60.0-1200.0, havaintoja "+keski+"\n" +
                            "pitkä: 1200.0-3600.0, havaintoja "+pitkia);
        System.out.println();
        System.out.println("muoto         lyhyt        keskipitkä         pitkä");
        
        HashMap<String, int[]> map = new HashMap<>();        
        havainnot.stream().forEach(h -> {
            if(map.containsKey(h.muoto)){
                if(h.getkestonRyhma()==1){
                    map.get(h.muoto)[0] = map.get(h.muoto)[0] + 1;
                }
                if(h.getkestonRyhma()==2){
                    map.get(h.muoto)[1] = map.get(h.muoto)[1] + 1;
                }
                if(h.getkestonRyhma()==3){
                    map.get(h.muoto)[2] = map.get(h.muoto)[2] + 1;
                }
            }
            else{
                if(h.getkestonRyhma()==1){
                    map.put(h.muoto, new int[]{1,0,0});
                }
                if(h.getkestonRyhma()==2){
                    map.put(h.muoto, new int[]{0,1,0});
                }
                if(h.getkestonRyhma()==3){
                    map.put(h.muoto, new int[]{0,0,1});
                }
                
            }
        });
        
        map.keySet().stream().sorted().forEach(muoto -> {
            if(muoto.length()<8){
                System.out.println(muoto + "\t\t"+ map.get(muoto)[0]+"\t\t"+map.get(muoto)[1]+"\t\t"+map.get(muoto)[2]);
            }
            else{
                System.out.println(muoto + "\t"+ map.get(muoto)[0]+"\t\t"+map.get(muoto)[1]+"\t\t"+map.get(muoto)[2]);
                
            }
        });
        
        System.out.println();        
    }
    
    public static void tulostaTunnitHavainnonKestonMukaan(ArrayList<Havainto> havainnot){
        
        
    }
    
    public static void tulostaYleisimmatSanat(ArrayList<Havainto> havainnot){
        System.out.println("Yleisimmät sanat esiintymiskertojen mukaan järjestettynä");
        HashMap<String, Integer> sanat = new HashMap();
        
        havainnot.stream().forEach(h ->{
            
            String[] sanattaul = h.kuvaus.toLowerCase().split(" ");
            
            Arrays.stream(sanattaul).forEach(sana -> {

                sana = sana.trim().replace("[-.,/?;)(*_0-9]", " ");
                
                if(sana.contains(" ")){
                    String[] uusitaul = sana.split(" ");
                    Arrays.stream(uusitaul).forEach(san ->{ 
                            san = san.trim();
                            sanat.put(san, sanat.getOrDefault(san, 0)+1);});
                }
                
                else{
                    sanat.put(sana.trim(), sanat.getOrDefault(sana.trim(), 0)+1);
                
                }                
            });
        });
        
        ArrayList<String> sanatjarjestettyina = new ArrayList<>();
        sanat.keySet().stream().sorted((s1, s2) -> {
            return sanat.get(s2) - sanat.get(s1);
        }).forEach(sana -> {
            sanatjarjestettyina.add(sana+", "+sanat.get(sana));
        });
        
        Collections.sort(sanatjarjestettyina, new SanaNumeroVertailija());
        for(int i=0; i<15 && i<sanatjarjestettyina.size(); i++){
            System.out.println(sanatjarjestettyina.get(i));
        }
        System.out.println("");
    }
    
    public static void tulostaYleisimmatSanaparit(ArrayList<Havainto> havainnot){
        ArrayList<String> listasanoja = new ArrayList();
        havainnot.stream().forEach(h ->{
            String[] sanattaul = h.kuvaus.toLowerCase().split(" ");
            Arrays.stream(sanattaul).forEach(sana -> {

                sana = sana.trim().replaceAll("[-.,/?;)(*_0-9]", " ");
                
                if(sana.contains(" ")){
                    String[] uusitaul = sana.split(" ");
                    Arrays.stream(uusitaul).forEach(san ->{ 
                            listasanoja.add(san.trim());
                    });
                }
                else{
                    listasanoja.add(sana.trim());
                }  
                
            });
        });
        
        
        HashMap<String, Integer> mapSanaparit = new HashMap<>();
        for(int i=1; i<listasanoja.size(); i++){
            mapSanaparit.put(listasanoja.get(i-1)+" "+listasanoja.get(i), mapSanaparit.getOrDefault(listasanoja.get(i-1)+" "+listasanoja.get(i), 0)+1);
        }
        
        List<String> uusi = new ArrayList();
        mapSanaparit.keySet().stream().forEach(pari -> {
            uusi.add(pari+", "+ mapSanaparit.get(pari));
        }               
        );
        
        Collections.sort(uusi, new SanaNumeroVertailija());
        for(int i=0; i<10; i++){
            System.out.println(uusi.get(i));
        }
        
    }
}
