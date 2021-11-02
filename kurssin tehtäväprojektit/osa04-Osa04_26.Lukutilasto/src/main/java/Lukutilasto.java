
public class Lukutilasto {
    private int lukujenMaara;
    private int summa;
    

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }
  
    
    public void lisaaLuku(int luku) {
        this.lukujenMaara ++;
        this.summa = this.summa + luku;
    }

    public int haeLukujenMaara() {
        return lukujenMaara;
        }
    

    public int summa() {
    return summa;
    }

    
    public double keskiarvo() {
        if(this.lukujenMaara!=0){
            return 1.0*this.summa/this.lukujenMaara;
        }
        else return 0;
    }
    
}

