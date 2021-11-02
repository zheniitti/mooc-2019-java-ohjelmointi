
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // Kyseessä on yksi iso tehtävä jota koko ajan laajennetaan -- tehtävä
        // on viiden yksittäisen tehtäväpisteen arvoinen

        // Voit halutessasi lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. Jo tehdyt osat kuitenkin kirjautuvat tehdyiksi.
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä luvut:");
        int summa=0;
        int määrä= 0;
        int parillisia=0;
        int parittomia=0;
                
        while(true){
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku==-1){
                break;
            } 
            summa=summa+luku;
            määrä=määrä+1;
            if(luku%2==0){
                parillisia=parillisia+1;
            }
            if(luku%2!=0){
                parittomia=parittomia+1;
            }
        }
        
        System.out.println("Kiitos ja näkemiin!");
        System.out.println("Summa: "+summa);
        System.out.println("Lukuja: "+määrä);
        System.out.println("Keskiarvo: "+1.0*summa/määrä);
        System.out.println("Parillisia: "+parillisia);
        System.out.println("Parittomia: "+parittomia);
    }
}
