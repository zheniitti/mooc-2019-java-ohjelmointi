import java.util.ArrayList;
public class Kirjasto {
    private ArrayList<Kirja> kirjalista;
    public Kirjasto(){
        this.kirjalista = new ArrayList<>();
    }
            
    public void lisaaKirja(Kirja uusiKirja){
        this.kirjalista.add(uusiKirja);
    }
        
    public void tulostaKirjat(){
        for(Kirja kirja: kirjalista){
            System.out.println(kirja);
        }
    }
    
    public ArrayList<Kirja> haeKirjaNimekkeella(String nimeke){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        int i = 0;
        if(!(kirjalista.isEmpty())){
            while(i<kirjalista.size()){
            if(StringUtils.sisaltaa(kirjalista.get(i).nimeke(),nimeke)){
            loydetyt.add(kirjalista.get(i));
        }
            i++;
        }
        return loydetyt;
    }
        return null;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisijalla(String julkaisija){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        int i = 0;
        if(!(kirjalista.isEmpty())){
            while(i<kirjalista.size()){
            if(StringUtils.sisaltaa(kirjalista.get(i).julkaisija(),julkaisija)){
            loydetyt.add(kirjalista.get(i));
        }
            i++;
        }
        return loydetyt;
    } return null;
    }
    
    public ArrayList<Kirja> haeKirjaJulkaisuvuodella(int julkaisuvuosi){
        ArrayList<Kirja> loydetyt = new ArrayList<>();
        if(!(kirjalista.isEmpty())){
            for(Kirja kirja: kirjalista){
            if(kirja.julkaisuvuosi()==julkaisuvuosi){
                loydetyt.add(kirja);
            }
        }
        return loydetyt;
    } return null;
    }
    
    
}
