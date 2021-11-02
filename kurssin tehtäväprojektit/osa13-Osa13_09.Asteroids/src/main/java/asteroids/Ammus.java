package asteroids;
 
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
 
 
public class Ammus extends Hahmo{
    private double suuntax;
    private double suuntay;
    private Point2D nopeus;
    public Ammus(Alus alus, double x, double y) {
        super(new Polygon(3,-2,  3,2, -3,2, -3,-2), x, y);
        super.getHahmo().setFill(Color.CYAN);
        suuntax = Math.cos(Math.toRadians(alus.getHahmo().getRotate()));
        suuntay = Math.sin(Math.toRadians(alus.getHahmo().getRotate()));
        nopeus = alus.getP2D();
    }
    
   public void liiku(){
        this.getHahmo().setTranslateX(this.getHahmo().getTranslateX() + suuntax*3 + nopeus.getX());
        this.getHahmo().setTranslateY(this.getHahmo().getTranslateY() + suuntay*3 + nopeus.getY());   
        
        if (this.getHahmo().getTranslateX() < 0) {
        this.getHahmo().setTranslateX(AsteroidsSovellus.LEVEYS);
        }
 
        if (this.getHahmo().getTranslateX() > AsteroidsSovellus.LEVEYS) {
            this.getHahmo().setTranslateX(0);
        }
 
        if (this.getHahmo().getTranslateY() < 0) {
            this.getHahmo().setTranslateY(AsteroidsSovellus.KORKEUS);
        }
 
        if (this.getHahmo().getTranslateY() > AsteroidsSovellus.KORKEUS) {
            this.getHahmo().setTranslateY(0);
        }
   }
    
}