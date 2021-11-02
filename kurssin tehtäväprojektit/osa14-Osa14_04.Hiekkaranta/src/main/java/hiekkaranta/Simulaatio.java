package hiekkaranta;
 
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javafx.geometry.Point2D;
 
 
public class Simulaatio {
    private Tyyppi[][] taul;
    private Random ram;
    private int leveys;
    private int korkeus;
 
    public Simulaatio(int leveys, int korkeus) {
        this.leveys = leveys;
        this.korkeus = korkeus;
        taul = new Tyyppi[leveys][korkeus];
        for(int x= 0; x<leveys; x++){
            for(int y = 0; y<korkeus; y++){
                taul[x][y] = Tyyppi.TYHJA;
            }
        }
        ram = new Random();
    }
 
    public void lisaa(int x, int y, Tyyppi tyyppi) {
        taul[x][y] = tyyppi;
    }
 
    public Tyyppi sisalto(int x, int y) {
        if(x<0 || x>=taul.length || y<0 || y>=taul[x].length){
            return Tyyppi.METALLI;
        }
        return taul[x][y];
    }
    
    public void tyhjenna(){
        for(int x=0; x<taul.length; x++){
            for( int y = 0; y<taul[x].length; y++){
                taul[x][y] = Tyyppi.TYHJA;
            }
        }
    }
 
    public void paivita() {
        int apux =-1;
        int x =0;
        
        for(int laskenta= 0; laskenta<=leveys; laskenta++){            
            if(laskenta%2==0 && apux<leveys/2){
                    apux ++;
                    x=apux;
            }
            else{x = leveys-(laskenta-1)/2 -1;}            
            for(int y = korkeus-2; y>=0; y--){
                this.siirra(x, y);
                
            }                
        }
        this.siirraUloinVesi();
        
    }
    
    
    
    private void siirra(int x, int y){
        Tyyppi tyyppi = taul[x][y];                
            if(tyyppi!=Tyyppi.TYHJA && tyyppi!=Tyyppi.METALLI){
                ArrayList<Point2D> allavapaat = this.allaVapaat(x, y);
                    ArrayList<Point2D> allavedet = this.allaVedet(x, y);

                    if(allavapaat.isEmpty()){
                        //hiekka
                        if(!allavedet.isEmpty() && tyyppi == Tyyppi.HIEKKA){
                            int indeksi = ram.nextInt(allavedet.size());
                            Point2D p = allavedet.get(indeksi);
                            taul[(int)p.getX()][(int)p.getY()] = tyyppi;
                            taul[x][y]=Tyyppi.VESI;
                        }
                        //vesi valuu sivulle
                        
                        
                    }                    
                    else{                        
                        int indeksi = ram.nextInt(allavapaat.size());
                        Point2D p = allavapaat.get(indeksi);
                        taul[(int)p.getX()][(int)p.getY()] = tyyppi;
                        taul[x][y]=Tyyppi.TYHJA;
                    }        
         }
    }
    
    private void siirraUloinVesi(){
        //uloimmat
        ArrayList<Point2D> list = this.uloimmatvedet();
        for(Point2D piste: list){
            int x = (int)piste.getX();
            int y = (int) piste.getY();
            ArrayList<Point2D> sivut = this.sivuVapaat(x,y);
            if(sivut.size()!=0){
                int uusix = (int)sivut.get(0).getX();
                taul[uusix][y] = Tyyppi.VESI;
                taul[x][y] = Tyyppi.TYHJA;                
            }

        }
    }
                
    
    private ArrayList<Point2D> uloimmatvedet(){
        ArrayList<Point2D> p = new ArrayList<>();
        
        for(int x=0; x<this.taul.length; x++){
            for(int y= 0; y<taul[x].length; y++){
                Tyyppi tyyppi = taul[x][y];                 
                if(tyyppi== Tyyppi.VESI){
                    if(this.sivuVapaat(x, y).size()>=1 && this.allaVapaat(x, y).size()==0){
                         p.add(new Point2D(x,y));
                    }                                       
                }                
            }
        }        
        return p;
    }
 
    private ArrayList<Point2D> allaVapaat(int x, int y){
        ArrayList<Point2D> allavapaat = new ArrayList<>();
        for(int a = -1; a<2; a++){
                        if(a+x<0 || a+x>=leveys || y+1>=taul[x].length){
                            continue;
                        }
                        if(taul[x+a][y+1] == Tyyppi.TYHJA){
                            allavapaat.add(new Point2D(x+a,y+1));
                        }
        }
        return allavapaat;
    }
    
    private ArrayList<Point2D> allaVedet(int x, int y){
        ArrayList<Point2D> allavedet = new ArrayList<>();
        for(int a = -1; a<2; a++){
                        if(a+x<0 || a+x>=leveys){
                            continue;
                        }
                        if(taul[x+a][y+1] == Tyyppi.VESI ){
                            allavedet.add(new Point2D(x+a,y+1));
                        }
                    }
        return allavedet;
    }
    
    private ArrayList<Point2D> sivuVapaat(int x, int y){
        ArrayList<Point2D> sivuvapaat = new ArrayList<>();
        for(int kumpi = -1; kumpi<2; kumpi++){
                                if(x+kumpi<0||x+kumpi>=leveys || kumpi==0){
                                    continue;
                                }
                                if(taul[x+kumpi][y]==Tyyppi.TYHJA){
                                    sivuvapaat.add(new Point2D(x+kumpi,y));
                                }
                            }
        return sivuvapaat;
    }
}