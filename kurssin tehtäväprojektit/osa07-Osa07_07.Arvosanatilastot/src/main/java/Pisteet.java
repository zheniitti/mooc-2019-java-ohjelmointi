import java.util.ArrayList;
public class Pisteet {
    private ArrayList<Integer> pistelista;
    
    public Pisteet(){
        pistelista = new ArrayList<>();
    }
    
    public void lisaa(int piste){
        if(0<=piste && piste<=100){
        pistelista.add(piste);
    }
    }
    
    public String ka(){
        int summa = 0;
        for(int piste: pistelista){
            summa = summa + piste;
        }
        return "Pisteiden keskiarvo (kaikki): " + 1.0*summa/pistelista.size();
    }
    
    public String hyvaksyttyjenKA(){
        int summa = 0;
        int maara = 0;
        for (int piste: pistelista){
            if(piste>=50){
                summa = summa + piste;
                maara++;
            }
        }
        if(maara>0){
            return "Pisteiden keskiarvo (hyväksytyt): " + 1.0*summa/maara;
        }
        else return "Pisteiden keskiarvo (hyväksytyt): -";
    }
    
    public String hyvaksymisprosentti(){
        int hyvaksyttyja = 0;
        for (int piste: pistelista){
            if(piste>=50){
                hyvaksyttyja++;
            }
        }
        return "Hyväksymisprosentti: " + 1.0*hyvaksyttyja/pistelista.size()*100;
    }
    
    public void tulostaJakauma(){
        int nolla = 0; int yksi=0; int kaksi = 0; int kolme = 0; int nelja = 0; int viisi = 0;
        for(int piste: pistelista){
            if(piste<50){
                nolla++;
            }
            else if(piste<60){
                yksi++;
            }
            else if(piste<70){
                kaksi ++;
            }
            else if(piste < 80){
                kolme++;
            }
            else if (piste < 90){
                nelja++;
            }
            else{
                viisi++;
            }
        }
        
        System.out.println("Arvosanajakauma:");
        System.out.print("5: "); tulostaTahtia(viisi);
        System.out.println("");
        System.out.print("4: "); tulostaTahtia(nelja);
        System.out.println("");
        System.out.print("3: "); tulostaTahtia(kolme);
        System.out.println("");
        System.out.print("2: "); tulostaTahtia(kaksi);
        System.out.println("");
        System.out.print("1: "); tulostaTahtia(yksi);
        System.out.println("");
        System.out.print("0: "); tulostaTahtia(nolla);
        
    }
    
    public void  tulostaTahtia(int montako){
        int a = 0;
        while(a<montako){
            System.out.print("*");
            a++;
        }
    }
}
