/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ufotehtava;


public class Haivainto {
    private int vuosi;
    private double kesto;
    private String muoto;
    private int havaintotunti;
    private String kuvaus;
    
    public Haivainto(String[] palat){
        String ajat = palat[0];
        vuosi = Integer.valueOf(ajat.split(" ")[0].split("/")[2].trim());
        kesto = Double.valueOf(palat[5]);
        muoto = palat[4].trim();
        havaintotunti = Integer.valueOf(ajat.split(" ")[1].split(":")[0].trim());
        kuvaus = palat[8].toLowerCase();
    }

    public int getVuosi() {
        return vuosi;
    }

    public double getKesto() {
        return kesto;
    }

    public String getMuoto() {
        return muoto;
    }

    public int getHavaintotunti() {
        return havaintotunti;
    }

    public String getKuvaus() {
        return kuvaus;
    }
    
    
    
    
}
