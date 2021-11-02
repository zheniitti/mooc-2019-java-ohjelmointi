
import java.util.Scanner;

public class YkkostenOsuus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkösiä=0;
        int lukuja=0;
        while(true){
            int luku=Integer.valueOf(lukija.nextLine());
            if(luku==0){
                break;
            }
            if(luku==1){
                ykkösiä=ykkösiä+1;
            }
            lukuja=lukuja+1;
        }
        if(lukuja==0){
            System.out.println("ykkösten osuutta ei voida laskea");
        }
        System.out.println(1.0*ykkösiä/lukuja);
    }
}
