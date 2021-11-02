/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc16koe;

import java.util.Arrays;

/**
 *
 * @author zheny
 */
public class Ehdokas {
    boolean valittu;
    double mielipiteidenKA;
    String puolue;
    
    public Ehdokas(String rivi){
        valittu = Integer.valueOf(rivi.split(";")[9] ) == 1;
        puolue = rivi.split(";")[4].trim();
        
        String[] rivitaulukkona = rivi.split(";");
        
        this.mielipiteidenKA = Arrays.stream(rivitaulukkona).map(kohta -> kohta.trim().toLowerCase().replaceAll(";", "")).filter(kohta -> kohta
                .matches("(täysin eri mieltä|jokseenkin eri mieltä|ohita kysymys|jokseenkin samaa mieltä|täysin samaa mieltä)") )
                .mapToInt(mielipide -> {
                    if(mielipide.equals("täysin eri mieltä")){
                        return 1;
                    }
                    if(mielipide.equals("jokseenkin eri mieltä")){
                        return 2;
                    }
                    if(mielipide.equals("ohita kysymys")){
                        return 3;
                    }
                    if(mielipide.equals("jokseenkin samaa mieltä")){
                        return 4;
                    }
                    return 5;
                }).average().getAsDouble();
        
    }

    Ehdokas(String rivi, int i) {
        valittu = Integer.valueOf(rivi.split(";")[9] ) == 1;
        puolue = rivi.split(";")[4].trim();
        this.mielipiteidenKA = 3;
    }
    
}
