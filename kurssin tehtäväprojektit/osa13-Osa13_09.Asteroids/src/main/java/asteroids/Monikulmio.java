/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asteroids;

import java.util.Random;
import javafx.scene.shape.Polygon;

/**
 *
 * @author Zhenyu
 */
public class Monikulmio {
    public Polygon teeKulmio(){
        Random rnd = new Random();
        double koko = 10 + rnd.nextInt(10);
        Polygon k = new Polygon();
        double c1 = Math.cos(Math.PI * 2 / 5);
        double c2 = Math.cos(Math.PI / 5);
        double s1 = Math.sin(Math.PI * 2 / 5);
        double s2 = Math.sin(Math.PI * 4 / 5);

        k.getPoints().addAll(
            koko, 0.0,
            koko * c1, -1 * koko * s1,
            -1 * koko * c2, -1 * koko * s2,
            -1 * koko * c2, koko * s2,
            koko * c1, koko * s1);
        
        for (int i = 0; i < k.getPoints().size(); i++) {
            int muutos = rnd.nextInt(5) - 2;
            k.getPoints().set(i, k.getPoints().get(i) + muutos);
        }
        
        return k;
    }
}
