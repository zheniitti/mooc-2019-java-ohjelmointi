
public class StringUtils {
    public static boolean sisaltaa(String sana, String haettava){
        String SANA = sana.toUpperCase();
        String HAETTAVA = haettava.toUpperCase();
        String SANAtrimmattu = SANA.trim();
        String HAETTAVAtrimmattu = HAETTAVA.trim();
        if(SANAtrimmattu.contains(HAETTAVAtrimmattu)){
            return true;
        }
        return false;
        
    }
}
