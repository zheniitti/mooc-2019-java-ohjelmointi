package schelling;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Eriytymismalli {

    private Taulukko taulukko;

    private double prosAlueestaKaytossa;
    private int tyytyvaisyysraja;
    private int ryhmienLukumaara;
    private boolean kaynnissa;

    public Eriytymismalli(int leveys, int korkeus, int tyytyvaisyysraja, int ryhmienLukumaara, double prosAlueestaKaytossa) {
        this.taulukko = new Taulukko(leveys, korkeus);

        this.tyytyvaisyysraja = tyytyvaisyysraja;
        this.ryhmienLukumaara = ryhmienLukumaara;
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;

        this.kaynnissa = false;
    }
    
    public void tyhjenna(){
        for(int x = 0; x<this.taulukko.getLeveys(); x++){
            for(int y = 0; y<this.taulukko.getKorkeus();y++){
                taulukko.aseta(x, y, 0);
            }
        }
    }

    public void kaynnista() {
        this.kaynnissa = true;
    }

    public void sammuta() {
        this.kaynnissa = false;
    }

    public boolean onKaynnissa() {
        return this.kaynnissa;
    }

    public void asetaRyhmienLukumaara(int ryhmia) {
        this.ryhmienLukumaara = ryhmia;
    }

    public void asetaProsAlueestaKaytossa(double prosAlueestaKaytossa) {
        this.prosAlueestaKaytossa = prosAlueestaKaytossa;
    }

    public void asetaTyytyvaisyysRaja(int tyytyvaisyysraja) {
        this.tyytyvaisyysraja = tyytyvaisyysraja;

    }

    public void alusta() {
        arvoAlkuarvot();
    }

    public void arvoAlkuarvot() {
        Random arpoja = new Random();

        for (int x = 0; x < taulukko.getLeveys(); x++) {

            for (int y = 0; y < taulukko.getKorkeus(); y++) {

                // Random-luokan metodi nextDouble palauttaa satunnaisen luvun
                // nollan ja yhden välillä
                double satunnainenLukuNollanJaYhdenValilla = arpoja.nextDouble();
                // jos 100*arvo on pienempi kuin prosAlueestaKaytossa, paikkaan
                // asetetaan arvo
                if (100 * satunnainenLukuNollanJaYhdenValilla < prosAlueestaKaytossa) {
                    int ryhma = 1 + arpoja.nextInt(ryhmienLukumaara);
                    this.taulukko.aseta(x, y, ryhma);

                }
            }
        }
    }

    public Taulukko getData() {
        return this.taulukko;
    }

    public void setData(Taulukko taulukko) {
        this.taulukko = taulukko;
    }
    
    public ArrayList<Piste> tyhjatPaikat() {
        ArrayList<Piste> tyhjat = new ArrayList<>();
        for(int x = 0; x<this.taulukko.getLeveys(); x++){
            for(int y = 0; y<this.taulukko.getKorkeus();y++){
                if(taulukko.hae(x, y)==0){
                    tyhjat.add(new Piste(x,y));
                }
            }
        }
        return tyhjat;
    }

    public void paivita() {
        ArrayList<Piste> tyytymattomatPisteet = haeTyytymattomat();        
        if (tyytymattomatPisteet.isEmpty()) {
            return;
        }
        Collections.shuffle(tyytymattomatPisteet);
        while (!tyytymattomatPisteet.isEmpty()) {
            Piste tyytymatonPiste = tyytymattomatPisteet.get(0);
            tyytymattomatPisteet.remove(0);
            ArrayList<Piste> tyhjatPaikat = tyhjatPaikat();
            Collections.shuffle(tyhjatPaikat);
            Piste tyhjaPaikka = tyhjatPaikat.get(0);
            int tyytymattomanRyhma = this.taulukko.hae(tyytymatonPiste.getX(), tyytymatonPiste.getY());
            this.taulukko.aseta(tyhjaPaikka.getX(), tyhjaPaikka.getY(), tyytymattomanRyhma);
            this.taulukko.aseta(tyytymatonPiste.getX(), tyytymatonPiste.getY(), 0);
        }
    }

    public ArrayList<Piste> haeTyytymattomat() {
        ArrayList<Piste> tyytymattomat = new ArrayList<>();
        
        for(int x = 0; x<this.taulukko.getLeveys(); x++){            
            for(int y = 0; y<this.taulukko.getKorkeus();y++){
                
                int ryhma = this.taulukko.hae(x, y);
                int tyytyvaisyys = 0;
                
                for(int a=-1; a<2;a++){    
                    if(a+x<0 || a+x>=taulukko.getLeveys()){
                        continue;
                    }
                    
                    for(int b=-1; b<2; b++){
                        if(b+y<0 || b+y>=taulukko.getLeveys() ||(a==0 && b==0)){
                            continue;
                        }
                        int nykyinen = taulukko.hae(a+x, b+y);
                        if(ryhma == nykyinen){
                            tyytyvaisyys++;
                        }
                    }
                }
                
                if(tyytyvaisyys<this.tyytyvaisyysraja){
                    tyytymattomat.add(new Piste(x,y));
                }
                
            }
        }
        return tyytymattomat;
    }


}
