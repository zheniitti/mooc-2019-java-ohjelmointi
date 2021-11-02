/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc18koe_t4_lippuvaraamo;
import java.util.*;
/**
 *
 * @author zheny
 */
public class MOOC18Koe_T4_Lippuvaraamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Matka> matkat = new ArrayList();
        
        Scanner lukija = new Scanner(System.in);
        
        while(true){
            System.out.println( "1) lisaa matka\n" +
                            "2) listaa matkat\n" +
                            "3) varaa lippu matkalle\n" +
                            "4) listaa matkan liput\n" +
                            "5) lopeta\n" +
                            "(muut tulostavat valikon)");
        String komento = lukija.nextLine();
            System.out.println("");
        
        if(komento.equals("5")){
            break;
        }
        if(komento.equals("1")){
            System.out.println("Mistä:");
            String mista = lukija.nextLine();
            System.out.println("Minne:");
            String minne = lukija.nextLine();
            System.out.println("Paikkoja:");            
            int paikkoja = Integer.valueOf(lukija.nextLine());
            matkat.add( new Matka(mista, minne, paikkoja) );            
        }
        
        if(komento.equals("2")){
            if(matkat.size()>0){
                for(int ind=0; ind<matkat.size(); ind++){
                System.out.println(ind+": " + matkat.get(ind).toString());
                }
                System.out.println("");
            }
            
        }
        if(komento.equals("3")){
            System.out.println("Mikä matka: ");
            int matka = Integer.valueOf(lukija.nextLine());
            if(matka < matkat.size()){
                System.out.println("Sähköposti:");
                String sp = lukija.nextLine();
                Matka m =matkat.get(matka);
                m.varaaLippu(new Lippu(m, sp));
            }            
        }
        if(komento.equals("4")){
            System.out.println("Minkä matkan liput listataan?");
            int matka = Integer.valueOf(lukija.nextLine());
            if(matka < matkat.size()){
                Matka m = matkat.get(matka);
                if(m.getLiput().size()>0){
                    for(Lippu lip: m.getLiput()){
                        System.out.println(lip);
                    }
                }
                System.out.println("");
            }
            
        }
        
        }
        
        
    }
    
}
