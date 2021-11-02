package asteroids;
 
import javafx.geometry.Point2D;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Shape;
 
/**
 *
 * @author Zhenyu
 */
public abstract class Hahmo {
    private Polygon hahmo;
    private Point2D point2d;
    private boolean elossa;
    
    public Hahmo(Polygon hah, double x, double y){
        hahmo = hah;
        hahmo.setTranslateX(x);
        hahmo.setTranslateY(y);
        point2d = new Point2D(0,0);
        elossa = true;
    }
    
    public Polygon getHahmo(){
        return hahmo;        
    }
    public Point2D getP2D(){
        return point2d;
}    
 
    public void kaannaVasemmalle(){
        hahmo.setRotate(hahmo.getRotate()-5);
    }
    
    public void kaannaOikealle(){
        hahmo.setRotate(hahmo.getRotate()+5);
    }
    
    public void liiku(){
        
        this.hahmo.setTranslateX(this.hahmo.getTranslateX() + this.point2d.getX());
        this.hahmo.setTranslateY(this.hahmo.getTranslateY() + this.point2d.getY());   
        
        if (this.hahmo.getTranslateX() < 0) {
        this.hahmo.setTranslateX(AsteroidsSovellus.LEVEYS);
        }
 
        if (this.hahmo.getTranslateX() > AsteroidsSovellus.LEVEYS) {
            this.hahmo.setTranslateX(0);
        }
 
        if (this.hahmo.getTranslateY() < 0) {
            this.hahmo.setTranslateY(AsteroidsSovellus.KORKEUS);
        }
 
        if (this.hahmo.getTranslateY() > AsteroidsSovellus.KORKEUS) {
            this.hahmo.setTranslateY(0);
        }
    }
    
    public void kiihdyta(){
        double muutosX = Math.cos(Math.toRadians(this.hahmo.getRotate()));
        double muutosY = Math.sin(Math.toRadians(this.hahmo.getRotate()));
 
        muutosX *= 0.05;
        muutosY *= 0.05;
        int rajoitus = 5;
        if((this.point2d.getX()+muutosX)<rajoitus&&(this.point2d.getX()+muutosX>-rajoitus)){
            this.point2d = this.point2d.add(muutosX, 0);
        }
        if((this.point2d.getY()+muutosY)<rajoitus&&(this.point2d.getY()+muutosY>-rajoitus)){
            this.point2d = this.point2d.add(0, muutosY);
        }
    }
    
    public boolean tormaa(Hahmo toinen) {
        Shape tormaysalue = Shape.intersect(this.hahmo, toinen.getHahmo());
        
        return tormaysalue.getBoundsInLocal().getWidth() != -1;
    }
 
    public void setKuollut(){
        elossa = false;
    }
 
    public boolean onkoElossa(){
        return elossa;
    }
}
 