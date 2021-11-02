
public class Lista<T> {
    private T[] arvot;
    private int arvoja;

    public Lista() {
        this.arvot = (T[]) new Object[10];
        this.arvoja = 0;
    }

    public void lisaa(T arvo) {
        if(this.arvoja == this.arvot.length) {
            kasvata();
        }

        this.arvot[this.arvoja] = arvo;
        this.arvoja++;
}
    
    public void poista(T arvo) {
        int arvonIndeksi = arvonIndeksi(arvo);
        if (arvonIndeksi < 0) {
            return; // ei löydy
        }

        siirraVasemmalle(arvonIndeksi);
        this.arvoja--;
    }
    
    public boolean sisaltaa(T arvo) {
        return arvonIndeksi(arvo) >= 0;
    }
    
    public int arvonIndeksi(T arvo) {
        for (int i = 0; i < this.arvoja; i++) {
            if (this.arvot[i].equals(arvo)) {
                return i;
            }
        }

        return -1;
    }
    
    public int koko() {
        return this.arvoja;
    }
    
    
    
    
    
    
    private void siirraVasemmalle(int indeksistaLahtien) {
        for (int i = indeksistaLahtien; i < this.arvoja - 1; i++) {
            this.arvot[i] = this.arvot[i + 1];
        }
    }
    


    
    private void kasvata() {
        int uusiKoko = this.arvot.length + this.arvot.length / 2;
        T[] uusi = (T[]) new Object[uusiKoko];
        for (int i = 0; i < this.arvot.length; i++) {
            uusi[i] = this.arvot[i];
        }

        this.arvot = uusi;
    }
}
