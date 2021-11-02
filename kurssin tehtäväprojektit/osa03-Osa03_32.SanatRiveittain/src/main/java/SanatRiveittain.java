
import java.util.Scanner;

public class SanatRiveittain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
            while(true){
                String merkkijono = lukija.nextLine();
                if(merkkijono.length()==0){
                    break;
                }
                String[] jononOsa = merkkijono.split("\\s+");
                int i = 0;
                while(i<jononOsa.length){
                    System.out.println(jononOsa[i]);
                    i++;
                }
                i=0;
            }
            
                
            
            
            
        }
        

    }

