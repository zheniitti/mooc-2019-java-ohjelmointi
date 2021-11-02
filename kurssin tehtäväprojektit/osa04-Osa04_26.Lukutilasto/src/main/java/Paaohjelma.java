
import java.util.Scanner;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto tilastoparilliset = new Lukutilasto();
        Lukutilasto tilastoparittomat = new Lukutilasto();
       
        
        int luku = 0;
        System.out.println("Anna lukuja:");
        while(true){
            luku = Integer.valueOf(lukija.nextLine());
            if (luku==-1){
                break;
            }
            tilasto.lisaaLuku(luku);
            
            if(luku%2==0){
                tilastoparilliset.lisaaLuku(luku);
            }
            if(luku%2!=0){
                tilastoparittomat.lisaaLuku(luku);
            }
        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten summa: " + tilastoparilliset.summa());
        System.out.println("Parittomien summa: " + tilastoparittomat.summa());

        
        
        
    }
}
