
import java.util.Scanner;

public class Salasana {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        String salasana = "porkkana"; // käytä porkkanaa salasanana testejä ajaessasi!

        while(true){
            System.out.println("Anna salasana:");
            String sana=lukija.nextLine();
            if(sana.equals(salasana)){
                System.out.println("Oikein!");
                System.out.println("Salaisuus on: znvavbfgv grugl!");
                break;
            }else{
                System.out.println("Väärin!");
            }
        }
        
            
        
    }
}
