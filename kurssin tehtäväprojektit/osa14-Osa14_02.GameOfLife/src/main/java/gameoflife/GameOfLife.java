package gameoflife;

import java.util.Random;

public class GameOfLife {

    private int[][] taulukko;

    public GameOfLife(int leveys, int korkeus) {
        this.taulukko = new int[leveys][korkeus];
    }

    public void alustaSatunnaisesti() {
        Random satunnaistaja = new Random();

        int x = 0;
        while (x < taulukko.length) {

            int y = 0;
            while (y < taulukko[x].length) {
                if (satunnaistaja.nextDouble() < 0.1) {
                    taulukko[x][y] = 1;
                }

                y++;
            }
            x++;
        }
    }
    
    

    public void kehity() {
        // säännöt kehittymiselle:
        int[][] kopio = new int[this.taulukko.length][this.taulukko[0].length];
        for (int x = 0; x < taulukko.length; x++) {
                    for (int y = 0; y < taulukko[x].length; y++) {
                        int naapurit = this.elossaOleviaNaapureita(taulukko, x, y);
                        if (taulukko[x][y] == 1) {
                            if(naapurit <2 || naapurit >3){
                                kopio[x][y] = 0;
                            }else if(naapurit == 3 || naapurit == 2){
                                kopio[x][y] = 1;
                                }
                        }
                        else if(naapurit == 3){
                            kopio[x][y] = 1;
                         
                        }
                    }
                }
        this.taulukko = kopio;
    }
    
    

    public int[][] getTaulukko() {
        return taulukko;
    }

    public void setTaulukko(int[][] taulukko) {
        this.taulukko = taulukko;
    }

    public int elossaOleviaNaapureita(int[][] taulukko, int x, int y) {
        int naapureita = 0;
        
        if(x>0 && y>0 && x<taulukko.length-1 && y<taulukko[x].length-1){
            for(int rivi = x-1; rivi<x+2; rivi++){
                for(int sarake = y-1; sarake<y+2; sarake++){
                    if(!(rivi==x && sarake==y)){
                        if(taulukko[rivi][sarake]==1){
                            naapureita++;
                        }
                    }
                }
            }
        }else if(x==0&&y==0){ //vasen yläkulma
            if(taulukko[x][y+1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y]==1){
                naapureita ++;
            }
            if(taulukko[x+1][y+1]==1){
                naapureita++;
            }
        }else if(x==0&&y==taulukko[x].length-1){  //oikea yläkulma
            if(taulukko[x][y-1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y]==1){
                naapureita ++;
            }
            if(taulukko[x+1][y-1]==1){
                naapureita++;
            }
        }else if(x==taulukko.length-1&&y==0){ //vasen alakulma
            if(taulukko[x-1][y+1]==1){
                naapureita++;
            }
            if(taulukko[x-1][y]==1){
                naapureita ++;
            }
            if(taulukko[x][y+1]==1){
                naapureita++;
            }
        }else if(x==taulukko.length-1&&y==taulukko[x].length-1){ // oikea alakulma
            if(taulukko[x][y-1]==1){
                naapureita++;
            }
            if(taulukko[x-1][y-1]==1){
                naapureita ++;
            }
            if(taulukko[x-1][y]==1){
                naapureita++;
            }
        }else if(x==0&&y>0&&y<taulukko[x].length){ //ylärivi
            if(taulukko[x][y+1]==1){
                naapureita++;
            }
            if(taulukko[x][y-1]==1){
                naapureita ++;
            }
            if(taulukko[x+1][y+1]==1){
                naapureita++;
            }if(taulukko[x+1][y-1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y]==1){
                naapureita++;
            }
        }else if(x==taulukko.length-1&&y>0&&y<taulukko[x].length){   //alarivi
            if(taulukko[x][y+1]==1){
                naapureita++;
            }
            if(taulukko[x][y-1]==1){
                naapureita ++;
            }
            if(taulukko[x-1][y]==1){
                naapureita++;
            }if(taulukko[x-1][y+1]==1){
                naapureita++;
            }
            if(taulukko[x-1][y-1]==1){
                naapureita++;
            }
        }else if(x>0&&x<taulukko.length&&y==0){ //vasenrivi
            if(taulukko[x-1][y]==1){
                naapureita++;
            }
            if(taulukko[x][y+1]==1){
                naapureita ++;
            }
            if(taulukko[x+1][y]==1){
                naapureita++;
            }
            if(taulukko[x-1][y+1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y+1]==1){
                naapureita++;
            }
        }else if(x>0&&x<taulukko.length && y==taulukko[x].length-1){   //oikea rivi
            if(taulukko[x][y-1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y]==1){
                naapureita ++;
            }
            if(taulukko[x-1][y]==1){
                naapureita++;
            }
            if(taulukko[x-1][y-1]==1){
                naapureita++;
            }
            if(taulukko[x+1][y-1]==1){
                naapureita++;
            }
        }        
        return naapureita;
    }
}
