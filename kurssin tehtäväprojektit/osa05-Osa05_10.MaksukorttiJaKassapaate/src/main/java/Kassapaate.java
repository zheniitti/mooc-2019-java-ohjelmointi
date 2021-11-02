
public class Kassapaate {


    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä


    public Kassapaate() {
        this.rahaa = 1000.0;
    }

    public double syoEdullisesti(double maksu) {
        double hinta = 2.5; // edullinen lounas maksaa 2.50 euroa.
        if(maksu>=hinta){
            this.rahaa = this.rahaa + hinta;
            double vaihtorahaa = maksu - hinta; edulliset ++;
            return vaihtorahaa;}
        return maksu;
    }

    public double syoMaukkaasti(double maksu) {
        double hinta = 4.3; // edullinen lounas maksaa 2.50 euroa.
        if(maksu>=hinta){
            this.rahaa = this.rahaa + hinta;
            double vaihtorahaa = maksu - hinta; 
            maukkaat ++;
            return vaihtorahaa;
        }
        return maksu;
    }

     public boolean syoEdullisesti(Maksukortti kortti) {
        if(kortti.otaRahaa(2.5)){
             edulliset ++; return true;
        }
        
        return false;
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        double hinta = 4.3;
        if(kortti.otaRahaa(hinta)){
             maukkaat ++; return true;
        }
       
        return false;
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
    if(summa>0){kortti.lataaRahaa(summa);
    this.rahaa = this.rahaa + summa;}
}


    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty " +
               edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
