
import java.util.ArrayList;
import java.util.Random;

public class Lottorivi {

    private ArrayList<Integer> numerot;

    public Lottorivi() {
        numerot = new ArrayList<>();
        
        this.arvoNumerot();
    }

    public ArrayList<Integer> numerot() {
        return this.numerot;
    }

    public void arvoNumerot() {
        this.numerot = new ArrayList<>();
        for(int i = 1; i<8; i++){
            int luku = new Random().nextInt(40)+1;
            while(this.sisaltaaNumeron(luku)){
            luku = new Random().nextInt(40)+1;
        }
            this.numerot.add(luku);
        }
        
    }

    public boolean sisaltaaNumeron(int numero) {
        if(numerot.contains(numero)){
            return true;
        }
        return false;
    }
}
