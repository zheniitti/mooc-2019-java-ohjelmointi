package ristinolla;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Label;

public class Toimintalogiikka {
    private String kumpi;
    private int i;
    private int[][] ristikko;
    private boolean loppuiko;
    
    public Toimintalogiikka(){
        kumpi = "X";
        i = 1;
        ristikko = new int[3][3];
        loppuiko = false;
    }
    public Parent setLabel(){
        Label loppu = new Label("Loppu!");
        loppu.setAlignment(Pos.CENTER);
        Label vuoro = new Label("Vuoro: " + kumpi(0));
        vuoro.setAlignment(Pos.CENTER);
        if(loppuiko()){
            return loppu;
        }else{
            return vuoro;
        }       
        
    }
    
    public String kumpi(int i){
        if((this.i-i)%2!=0){ //jos this.i - i on pariton
            kumpi = "X";
        }else{
            kumpi = "O";
        }
        return kumpi;
    }
    
    public boolean loppuiko(){
        if(i==10){
            return true;
        }
        return loppuiko;
    }
    
    public void painettu(Parent nappi){
        String sarake = nappi.getId().split(",")[0];
        String rivi = nappi.getId().split(",")[1];
        int kumpi = 1;
        if(kumpi(0).equals("X")){
            kumpi = 1;
        }else{
            kumpi = 10;
        }
        loppuiko = voitto(Integer.valueOf(sarake), Integer.valueOf(rivi), kumpi);
        i++;
    }
    
    private boolean voitto(int sarake, int rivi, int kumpi){
        ristikko[rivi][sarake] = kumpi;
        int summa = 0;
        for(int x = 0; x<3; x++){
            for(int y = 0; y<3; y++){
                summa = summa + ristikko[x][y]; 
            }
            if(summa==30||summa==3){
                    return true;
                }else{
                    summa = 0;
                }
        }
        for(int y = 0; y<3; y++){
            for(int x = 0; x<3; x++){
                summa = summa + ristikko[x][y]; 
            }
            if(summa==30||summa==3){
                    return true;
                }else{
                    summa = 0;
                }
        }
        for(int x = 0; x<3; x++){
            summa += ristikko[x][x];
            if(summa==30||summa==3){
                    return true;
            }
        }
        summa = 0;
        for(int x = 0; x<3; x++){
            summa += ristikko[x][ristikko.length-x-1];
            if(summa==30||summa==3){
                    return true;
            }
        }
            
        return false;
    }
}
