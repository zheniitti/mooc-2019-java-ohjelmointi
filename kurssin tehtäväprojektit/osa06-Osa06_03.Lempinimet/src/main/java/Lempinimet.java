
import java.util.HashMap;

public class Lempinimet {

    public static void main(String[] args) {
        HashMap<String, String> lempinimi = new HashMap<>();
        lempinimi.put("matti", "mage");
        lempinimi.put("mikaeli", "mixu");
        lempinimi.put("arton", "arppa");
        
        System.out.println(lempinimi.get("mikaeli"));
    }

}
