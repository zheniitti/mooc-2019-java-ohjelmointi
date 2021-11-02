
import java.util.ArrayList;
import java.util.Scanner;

public class ListanLuvut {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        ArrayList<Integer> luvut = new ArrayList<>();
        while (true) {
            int luku = Integer.valueOf(lukija.nextLine());
            if (luku == -1) {
                break;
            }

            luvut.add(luku);
        }
        int i = 0;
        while(true){
            
            if(i>=luvut.size()){
                break;
            }
            System.out.println(luvut.get(i));
            i=i+1;
        }
    }
}
