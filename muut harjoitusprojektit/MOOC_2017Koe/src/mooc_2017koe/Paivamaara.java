/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc_2017koe;

public class Paivamaara {
   String paiva;        //1-31
   String kuukausi;     //1-12
   String vuosi;        //1900 -
   String tunti;        // 00, 01, 11, 21
   String minuutti;     
   
   public Paivamaara(String rivi){
        paiva = rivi.split(";")[0].split("/")[0];
        kuukausi = rivi.split(";")[0].split("/")[1];
        vuosi = rivi.split(";")[0].split("/")[2].split(" ")[0];
        tunti = rivi.split(";")[0].split("/")[2].split(" ")[1].trim().split(":")[0].trim();
        minuutti = rivi.split(";")[0].split("/")[2].split(" ")[1].trim().split(":")[1];
   }
   
   public int getAsInteger(String s){ //paivät, kuukausi, vuosi, tunti, minuutti
       int luku = 0;
       if(s.length()>1 && s.substring(0, 1).equals("0")){
           luku = Integer.valueOf(s.substring(1, s.length()));
       }
       else if(s.length() > 1){
           luku = Integer.valueOf(s);
       }
       return luku;
   }
   

   
}
