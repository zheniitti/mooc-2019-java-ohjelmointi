

public class Tarkistin {

    public boolean onViikonpaiva(String merkkijono){
        if(merkkijono.matches("ma|ti|ke|to|pe|la|su")){
            return true;
        }
        return false;
    }
    
    public boolean kaikkiVokaaleja(String merkkijono){
        if(merkkijono.matches("(a|e|i|o|u|ä|ö)+")){
            return true;
        }
        return false;
    }
    
    public boolean kellonaika(String merkkijono){
        if(merkkijono.length()!=8){
            return false;
        }
        String eka = String.valueOf(merkkijono.charAt(2));
        String toka = String.valueOf(merkkijono.charAt(5));
        if(!(eka.equals(":") && toka.equals(":"))){
            return false;
        }
        if(String.valueOf(merkkijono.charAt(3)).matches("[0-5]") && String.valueOf(merkkijono.charAt(6)).matches("[0-6]")
                && String.valueOf(merkkijono.charAt(4)).matches("[0-9]") && String.valueOf(merkkijono.charAt(7)).matches("[0-9]")){
            
            if(String.valueOf(merkkijono.charAt(0)).equals("2") && String.valueOf(merkkijono.charAt(1))
                .matches("[0-3]")){
                
                return true;
                
                
        }
            if(String.valueOf(merkkijono.charAt(0)).matches("(1|0)")
                    && String.valueOf(merkkijono.charAt(1))
                    .matches("[0-9]")){
                return true;
            }
            
        }
        return false;
    }
    
}
