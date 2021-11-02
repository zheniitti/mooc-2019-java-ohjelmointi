package asteroids;
import javafx.scene.paint.Color;
import javafx.scene.shape.*;
public class Alus extends Hahmo{
 
    public Alus( int x, int y) {
        super(new Polygon(0,0, -20,-8, -20,8), x, y);
        super.getHahmo().setFill(Color.GOLD);
    }
    
    
}
