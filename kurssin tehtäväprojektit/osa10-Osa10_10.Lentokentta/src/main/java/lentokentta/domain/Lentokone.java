/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lentokentta.domain;
import java.util.ArrayList;

public class Lentokone {
    private String tunnus;
    private int kapasiteetti;
    private ArrayList<Lento> lennot;

    public Lentokone(String tunnus, int kapasiteetti) {
        this.tunnus = tunnus;
        this.kapasiteetti = kapasiteetti;
        lennot = new ArrayList<>();
    }

    public String getTunnus() {
        return this.tunnus;
    }
    
     public int getKapasiteetti() {
        return this.kapasiteetti;
    }

    @Override
    public String toString() {
        return this.tunnus + " (" + this.kapasiteetti + " henkilöä)";
    }
}
