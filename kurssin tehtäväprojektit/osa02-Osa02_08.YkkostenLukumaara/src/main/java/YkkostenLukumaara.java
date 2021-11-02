
import java.util.Scanner;

public class YkkostenLukumaara {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int ykkösiä=0;
        while (true){
            int luku=Integer.valueOf(lukija.nextLine());
            if(luku==0){
                break;
            }
            if(luku==1){
                ykkösiä=ykkösiä+1;
            }
        }
        System.out.println(ykkösiä);
    }
}
