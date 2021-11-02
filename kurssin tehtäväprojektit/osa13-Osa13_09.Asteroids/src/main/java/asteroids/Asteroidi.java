package asteroids;
 
import java.util.Random;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
 
/**
 *
 * @author Zhenyu
 */
public class Asteroidi extends Hahmo{
    private double pyori;
    public Asteroidi(Polygon hah, int x, int y) {
        super(hah, x, y);
        super.getHahmo().setFill(Color.BURLYWOOD);
        
        super.getHahmo().setRotate(new Random().nextInt(360));
         int kiihdytystenMaara = 1 + new Random().nextInt(10);
        for (int i = 0; i < kiihdytystenMaara; i++) {
            kiihdyta();
        }
        this.pyori = 0.5 - new Random().nextDouble();
    }
    @Override
    public void liiku() {
        super.liiku();
        super.getHahmo().setRotate(super.getHahmo().getRotate() + pyori);
    }
    
    
} 
    

