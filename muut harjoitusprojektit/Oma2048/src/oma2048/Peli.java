package oma2048;

import java.util.*;
import java.util.stream.Collectors;


class Peli {
    
     int[][] taulukko;
    
    Peli(){
        this.taulukko = new int[4][4];  
    }
    
    
    void siirrOikealle(){
       
        
        for(int rivi = 0; rivi<4; rivi++){ 
            //luodaan uusi lista jokaisella rivilla
            ArrayList<Integer> list = new ArrayList<>();
            //poimitaan positiiviset luvut taulukon tästä rivistä listaan
            for(int sarake = 3; sarake>=0; sarake--){                
                int luku = this.taulukko[rivi][sarake];
                if(luku>0){
                   list.add(luku); 
                } //rivi lisätty
            //valmis
            }
            int listankoko = list.size();
            //valmis
            
            
            //käsitellään riviä ja muunnellaan riviä/listaa
            if(onkoRivillaSamojaLukuja(list)){ // 11  111,  112 211, 1121 1112 1211 2111, 1122 1212 2121 2211 
                
                
                
                if(rivillaVierekkaisia(list).size()==2 ){  //1112  2111 111 1122 2211
                    
                    if(listankoko==3 ){ // 111
                        int korvattava = list.get(0);
                        list.clear();
                        list.add(korvattava*2);
                    }//valmis
                    
                    //muuten listan koko = 4
                    else{ //.  1112  2111  1122 2211
                        
                        if(rivillaVierekkaisia(list).containsKey(1)){ //1112  2111
                            // 2111
                            if(rivillaVierekkaisia(list).containsKey(2)){ 
                              // 2111 -> 21
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); 
                                int korvattava = list.get(1);
                                list.set(1, korvattava*2);  
                            }  
                            else{ //1112
                                    // 1112 -> 12
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); // 2111 -> 21
                                int korvattava = list.get(0);
                                list.set(1, korvattava*2);
                            }
                        }//valmis
                    }
                } 
                else if(rivillaVierekkaisia(list).size()==1){ // 11 1124 2114 2411
                    // 11 1124
                    if(rivillaVierekkaisia(list).containsKey(0)){
                        list.remove(0);
                        int korvattava = list.get(0);
                        list.set(0, korvattava*2);
                    }
                    // 2114 
                    if(rivillaVierekkaisia(list).containsKey(1)){
                        list.remove(1); 
                        int korvattava = list.get(1);
                        list.set(1, korvattava*2);
                    }
                    // 2411
                    if(rivillaVierekkaisia(list).containsKey(2)){
                        list.remove(2); 
                        int korvattava = list.get(2);
                        list.set(2, korvattava*2);
                    }                     
                //valmis
                }
            //valmis
            
            
            
            }            
            // muuten rivin kaikki luvut eri, ei tarvita tehdä listalle mitään
            nollaaTaulukonRivi(rivi);
            asetaListanLuvutTaulukonRiviin(list, rivi, true);            
        }
        this.arvoUusiLukuTaulukkoon();
        this.tulostaTaulukko();
}
    
    private void asetaListanLuvutTaulukonRiviin(ArrayList<Integer> list, int rivi , Boolean oikea){
        if(oikea){
            int alkuindeksi = 3;
            for(int luku: list){
                this.taulukko[rivi][alkuindeksi] = luku;
                alkuindeksi--;
            }
        }
        else{
            int alkuindeksi = 0;
            for(int luku: list){
                this.taulukko[rivi][alkuindeksi] = luku;
                alkuindeksi++;
            }
        }
    }
    
    private void nollaaTaulukonRivi(int rivi){
        for(int i=0; i<4; i++){
            this.taulukko[rivi][i] = 0;
        }
    }
    
    private void nollaaTaulukonSarake(int sarake){
        for(int rivi=0; rivi<3; rivi++){
            this.taulukko[rivi][sarake] = 0;
        }
    }
    
    void siirraVasemmalle(){
 
                
        for(int rivi = 0; rivi<4; rivi++){ 
            //luodaan uusi lista jokaisella rivilla
            ArrayList<Integer> list = new ArrayList<>();
            //poimitaan positiiviset luvut taulukon tästä rivistä listaan
            for(int sarake = 0; sarake<4; sarake++){                
                int luku = this.taulukko[rivi][sarake];
                if(luku>0){
                   list.add(luku); 
                } //rivi lisätty
            //valmis
            }
            int listankoko = list.size();
            //valmis
            
            
            //käsitellään riviä ja muunnellaan riviä/listaa
            if(onkoRivillaSamojaLukuja(list)){ // 11  111,  112 211, 1121 1112 1211 2111, 1122 1212 2121 2211 
                
                
                
                if(rivillaVierekkaisia(list).size()==2 ){  //1112  2111 111 1122 2211
                    
                    if(listankoko==3 ){ // 111
                        int korvattava = list.get(0);
                        list.clear();
                        list.add(korvattava*2);
                    }//valmis
                    
                    //muuten listan koko = 4
                    else{ //.  1112  2111  1122 2211
                        
                        if(rivillaVierekkaisia(list).containsKey(1)){ //1112  2111
                            // 2111
                            if(rivillaVierekkaisia(list).containsKey(2)){ 
                              // 2111 -> 21
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); 
                                int korvattava = list.get(1);
                                list.set(1, korvattava*2);  
                            }  
                            else{ //1112
                                    // 1112 -> 12
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); // 2111 -> 21
                                int korvattava = list.get(0);
                                list.set(1, korvattava*2);
                            }
                        }//valmis
                    }
                } 
                else if(rivillaVierekkaisia(list).size()==1){ // 11 1124 2114 2411
                    // 11 1124
                    if(rivillaVierekkaisia(list).containsKey(0)){
                        list.remove(0);
                        int korvattava = list.get(0);
                        list.set(0, korvattava*2);
                    }
                    // 2114 
                    if(rivillaVierekkaisia(list).containsKey(1)){
                        list.remove(1); 
                        int korvattava = list.get(1);
                        list.set(1, korvattava*2);
                    }
                    // 2411
                    if(rivillaVierekkaisia(list).containsKey(2)){
                        list.remove(2); 
                        int korvattava = list.get(2);
                        list.set(2, korvattava*2);
                    }                     
                //valmis
                }
            //valmis
            
            
            
            }            
            // muuten rivin kaikki luvut eri, ei tarvita tehdä listalle mitään
            nollaaTaulukonRivi(rivi);
            asetaListanLuvutTaulukonRiviin(list, rivi, false);   
            
            
        }
        this.arvoUusiLukuTaulukkoon();
        this.tulostaTaulukko();        
    }
    
    void siirraAlas(){
        //!! rivi = sarake kommenteissa
        for(int sarake = 0; sarake<4; sarake++){ 
            //luodaan uusi lista jokaisella rivilla
            ArrayList<Integer> list = new ArrayList<>();
            //poimitaan positiiviset luvut taulukon tästä rivistä listaan
            for(int rivi = 3; rivi>=0; rivi--){                
                int luku = this.taulukko[rivi][sarake];
                if(luku>0){
                   list.add(luku); 
                } //rivi lisätty
            //valmis
            }
            int listankoko = list.size();
            //valmis
            
            
            //käsitellään riviä ja muunnellaan riviä/listaa
            if(onkoSarakkeessaSamojaLukuja(list)){ // 11  111,  112 211, 1121 1112 1211 2111, 1122 1212 2121 2211 
                
                
                
                if(sarakkeessaVierekkaisia(list).size()==2 ){  //1112  2111 111 1122 2211
                    
                    if(listankoko==3 ){ // 111
                        int korvattava = list.get(0);
                        list.clear();
                        list.add(korvattava*2);
                    }//valmis
                    
                    //muuten listan koko = 4
                    else{ //.  1112  2111  1122 2211
                        
                        if(sarakkeessaVierekkaisia(list).containsKey(1)){ //1112  2111
                            // 2111
                            if(sarakkeessaVierekkaisia(list).containsKey(2)){ 
                              // 2111 -> 21
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); 
                                int korvattava = list.get(1);
                                list.set(1, korvattava*2);  
                            }  
                            else{ //1112
                                    // 1112 -> 12
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); // 2111 -> 21
                                int korvattava = list.get(0);
                                list.set(1, korvattava*2);
                            }
                        }//valmis
                    }
                } 
                else if(sarakkeessaVierekkaisia(list).size()==1){ // 11 1124 2114 2411
                    // 11 1124
                    if(sarakkeessaVierekkaisia(list).containsKey(0)){
                        list.remove(0);
                        int korvattava = list.get(0);
                        list.set(0, korvattava*2);
                    }
                    // 2114 
                    if(sarakkeessaVierekkaisia(list).containsKey(1)){
                        list.remove(1); 
                        int korvattava = list.get(1);
                        list.set(1, korvattava*2);
                    }
                    // 2411
                    if(sarakkeessaVierekkaisia(list).containsKey(2)){
                        list.remove(2); 
                        int korvattava = list.get(2);
                        list.set(2, korvattava*2);
                    }                     
                //valmis
                }
            //valmis
            
            
            
            }            
            // muuten rivin kaikki luvut eri, ei tarvita tehdä listalle mitään
            boolean ylos = true;
            nollaaTaulukonSarake(sarake);
            asetaListanLuvutTaulukonSarakkeeseen(list, sarake, !ylos);            
        }
        this.arvoUusiLukuTaulukkoon();
        this.tulostaTaulukko();
    }
     
    public static Boolean onkoRivillaSamojaLukuja(ArrayList<Integer> rivi){
        if(rivi.size()<2){
            return false;
        }
        int kokoennen = rivi.size();
        int kokonyt = (int) rivi.stream().distinct().count();
        return kokoennen>kokonyt;        
    }
    
    public static Boolean onkoSarakkeessaSamojaLukuja(ArrayList<Integer> sarake){
        if(sarake.size()<2){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();        
        for(int i = 0; i<sarake.size(); i++){
            map.put(sarake.get(i), i);
        }
        if(map.size()<sarake.size()){
            return true;
        }
        return false;
        
    }  
    
                         //indeksi, luku  listan koko on vähintään 2
    public static HashMap<Integer, Integer> rivillaVierekkaisia(ArrayList<Integer> rivi){
        HashMap <Integer, Integer> hashmap = new HashMap<>();        
        for(int indeksi = 0; indeksi < rivi.size()-1; indeksi++){
            if( rivi.get(indeksi) == rivi.get(indeksi+1) ){
                hashmap.put(indeksi, rivi.get(indeksi));
            }
        }
        // jos hashmap on tyhjä -> ei vierekkäisiä
        // hashmapin koko voi olla enintään 2;
        return hashmap;
    }
    
    public static HashMap<Integer, Integer> sarakkeessaVierekkaisia(ArrayList<Integer> sarake){
        HashMap <Integer, Integer> hashmap = new HashMap<>();
        for(int indeksi = 0; indeksi < sarake.size()-1; indeksi++){
            if( sarake.get(indeksi) == sarake.get(indeksi+1) && sarake.get(indeksi)!=0){
                hashmap.put(indeksi, sarake.get(indeksi));
            }
        }
        // jos hashmap on tyhjä -> ei vierekkäisiä
        return hashmap;
    }
            
            
    void kaynnista() {
        Arrays.fill(this.taulukko[0], 0);
        this.arvoUusiLukuTaulukkoon();
        this.arvoUusiLukuTaulukkoon();
        System.out.println("Peli alkaa!");
        this.tulostaTaulukko();
    }
    
    private void arvoUusiLukuTaulukkoon(){
        Random random = new Random();
        int rivi = random.nextInt(4);
        int sarake = random.nextInt(4);
        if(this.taulukko[rivi][sarake]==0){
            this.taulukko[rivi][sarake] = 1;
        }
        else{
            while(this.taulukko[rivi][sarake]!=0 ){
            rivi = random.nextInt(4);
            sarake = random.nextInt(4);
            }
        }        
    }
    
    void tulostaTaulukko(){
        for(int rivi = 0; rivi<4; rivi++){            
            for(int sarake = 0; sarake<4; sarake++){
                System.out.print(this.taulukko[rivi][sarake]+"    ");
            }
            System.out.println("");
            System.out.println("");
        }    
        System.out.println("");
    }
    
    
    

    boolean peliKaynnissa() {
        
        return true;
    }

    private void asetaListanLuvutTaulukonSarakkeeseen(ArrayList<Integer> list, int sarake, boolean b) {
        if(!b){
            int alkuindeksi = 3;
            for(int luku: list){
                this.taulukko[alkuindeksi][sarake] = luku;
                alkuindeksi--;
            }
        }
        else{
            int alkuindeksi = 0;
            for(int luku: list){
                this.taulukko[alkuindeksi][sarake] = luku;
                alkuindeksi++;
            }
        }

    }

    void siirraYlos() {
        //!! rivi = sarake kommenteissa
        for(int sarake = 0; sarake<4; sarake++){ 
            //luodaan uusi lista jokaisella rivilla
            ArrayList<Integer> list = new ArrayList<>();
            //poimitaan positiiviset luvut taulukon tästä rivistä listaan
            for(int rivi = 0; rivi<=3; rivi++){                
                int luku = this.taulukko[rivi][sarake];
                if(luku>0){
                   list.add(luku); 
                } //rivi lisätty
            //valmis
            }
            int listankoko = list.size();
            //valmis
            
            
            //käsitellään riviä ja muunnellaan riviä/listaa
            if(onkoSarakkeessaSamojaLukuja(list)){ // 11  111,  112 211, 1121 1112 1211 2111, 1122 1212 2121 2211 
                
                
                
                if(sarakkeessaVierekkaisia(list).size()==2 ){  //1112  2111 111 1122 2211
                    
                    if(listankoko==3 ){ // 111
                        int korvattava = list.get(0);
                        list.clear();
                        list.add(korvattava*2);
                    }//valmis
                    
                    //muuten listan koko = 4
                    else{ //.  1112  2111  1122 2211
                        
                        if(sarakkeessaVierekkaisia(list).containsKey(1)){ //1112  2111
                            // 2111
                            if(sarakkeessaVierekkaisia(list).containsKey(2)){ 
                              // 2111 -> 21
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); 
                                int korvattava = list.get(1);
                                list.set(1, korvattava*2);  
                            }  
                            else{ //1112
                                    // 1112 -> 12
                                list =  list.stream().distinct().collect(Collectors.toCollection(ArrayList::new)); // 2111 -> 21
                                int korvattava = list.get(0);
                                list.set(1, korvattava*2);
                            }
                        }//valmis
                    }
                } 
                else if(sarakkeessaVierekkaisia(list).size()==1){ // 11 1124 2114 2411
                    // 11 1124
                    if(sarakkeessaVierekkaisia(list).containsKey(0)){
                        list.remove(0);
                        int korvattava = list.get(0);
                        list.set(0, korvattava*2);
                    }
                    // 2114 
                    if(sarakkeessaVierekkaisia(list).containsKey(1)){
                        list.remove(1); 
                        int korvattava = list.get(1);
                        list.set(1, korvattava*2);
                    }
                    // 2411
                    if(sarakkeessaVierekkaisia(list).containsKey(2)){
                        list.remove(2); 
                        int korvattava = list.get(2);
                        list.set(2, korvattava*2);
                    }                     
                //valmis
                }
            //valmis
            
            
            
            }            
            // muuten rivin kaikki luvut eri, ei tarvita tehdä listalle mitään
            boolean ylos = true;
            nollaaTaulukonSarake(sarake);
            asetaListanLuvutTaulukonSarakkeeseen(list, sarake, ylos);            
        }
        this.arvoUusiLukuTaulukkoon();
        this.tulostaTaulukko();

    }

    
    
    
}
