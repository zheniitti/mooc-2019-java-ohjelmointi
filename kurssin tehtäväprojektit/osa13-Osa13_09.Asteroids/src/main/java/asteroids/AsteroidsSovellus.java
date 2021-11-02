package asteroids;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.media.AudioClip;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.stage.Stage;
 
public class AsteroidsSovellus extends Application{
    public static int LEVEYS = 1000;
    public static int KORKEUS = 700;
 
    public static void main(String[] args) {
        launch(args);
    }
 
    public static int osiaToteutettu() {
        return 4;
    }
 
    @Override
    public void start(Stage ik) throws Exception {
        Pane pane = new Pane();
        Text text = new Text(10, 20, "Points: 0");
        Image kuva = new Image("File:space.jpg");
        ImageView tausta =new ImageView(kuva);
        pane.getChildren().add(tausta);
        pane.setPrefSize(LEVEYS, KORKEUS);
        pane.getChildren().add(text);        
        AtomicInteger pisteet = new AtomicInteger();   
        
        Map<KeyCode,Boolean> napitHashMap = new HashMap<>();   
        ArrayList<Asteroidi> asteroiditList = new ArrayList<>();
        ArrayList<Ammus> ammukset = new ArrayList<>();
      
        //laitetaan alkuun viisi asteroidia ruudulle
        Random r = new Random();        
        for(int m = 0; m<5; m++){
            Asteroidi asteroidi = new Asteroidi(teeKulmio(),r.nextInt(LEVEYS / 3), r.nextInt(KORKEUS));
            asteroiditList.add(asteroidi);
        }        
        asteroiditList.forEach(arvo->  pane.getChildren().add(arvo.getHahmo()) );     
        
        //luodaan alus ja laitetaan se keskelle ruudua
        Alus alus = new Alus(LEVEYS / 2, KORKEUS / 2);
        pane.getChildren().add(alus.getHahmo());
        
        AudioClip clip = new AudioClip("file:shoot.wav");
        AudioClip explo = new AudioClip("file:explosion.wav");
        
        Scene s = new Scene(pane);
        s.setOnKeyPressed(value->{
            napitHashMap.putIfAbsent(value.getCode(), Boolean.TRUE); 
                          
        });
        s.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) { 
                napitHashMap.remove(event.getCode());
  
            }
        });     
                
        new AnimationTimer(){
         
            public void handle(long now) {
                
                
                
//                ei toimi jostain syystä:
//                pane.setOnKeyPressed(event -> { 
//                    Ammus ammus = new Ammus(alus, alus.getHahmo().getTranslateX(), alus.getHahmo().getTranslateY() );
//                    ammukset.add(ammus);
//                    ammus.getHahmo().setRotate(alus.getHahmo().getRotate());
//                    pane.getChildren().add(ammus.getHahmo());
//                    
//                });
                
                alus.liiku(); 
                if(napitHashMap.getOrDefault(KeyCode.LEFT, false)){
                    alus.kaannaVasemmalle();
                }
                if(napitHashMap.getOrDefault(KeyCode.RIGHT,false)){
                    alus.kaannaOikealle();
                }
                if(napitHashMap.getOrDefault(KeyCode.UP, false)){
                    alus.kiihdyta();
                } 
                //kun space-näppäintä painetaan, luodaan uusi ammus, lisätään se ruudulle
                if (napitHashMap.getOrDefault(KeyCode.SPACE, false) ) { 
                    napitHashMap.put(KeyCode.SPACE, Boolean.FALSE);
                    Ammus ammus = new Ammus(alus, (int) alus.getHahmo().getTranslateX(), (int) alus.getHahmo().getTranslateY());
                    ammus.getHahmo().setRotate(alus.getHahmo().getRotate());
                    ammukset.add(ammus);                                    
                    pane.getChildren().add(ammus.getHahmo());
                    clip.play();                    
                }
                
                asteroiditList.forEach(asteroidi->{  asteroidi.liiku();
                     if ( alus.tormaa(asteroidi) ) {
                         new AudioClip("file:Mario_Game_Over-a7d4826f-c99f-3cc5-9ead-a84859464d84.mp3").play();
                        stop();
                      }  
                });
 

                ammukset.forEach(ammus -> {
                            ammus.liiku();
                            for(Asteroidi asteroidi: asteroiditList){
                                if(ammus.tormaa(asteroidi)){
                                    pane.getChildren().remove(ammus.getHahmo()); 
                                    explo.play();
                                }
                            }
                            List<Asteroidi> tormatyt = asteroiditList.stream().filter(asteroidi -> asteroidi.tormaa(ammus)).collect(Collectors.toList());
                            tormatyt.stream().forEach(tormatty -> {
                                    asteroiditList.remove(tormatty);
                                    pane.getChildren().remove(tormatty.getHahmo());
                                    text.setText("Pisteet: " + pisteet.addAndGet(1000));
                            });
                            
                });   
                
                synnytaUusiAsteroidi(r, alus,asteroiditList, pane);
                
            }   
            
            
        }.start();
        
 
        
        
        ik.setTitle("Asteroids!");
        ik.setScene(s);
        ik.show();
    }
    
    private static Polygon teeKulmio(){
        Random rnd = new Random();
        double koko = 10 + rnd.nextInt(40);
        Polygon k = new Polygon();
        double c1 = Math.cos(Math.PI * 2 / 5);
        double c2 = Math.cos(Math.PI / 5);
        double s1 = Math.sin(Math.PI * 2 / 5);
        double s2 = Math.sin(Math.PI * 4 / 5);
 
        k.getPoints().addAll(
            koko,           0.0,
            koko*c1,        -1*koko*s1,
            -1*koko*c2,     -1 * koko * s2,
            -1*koko*c2,     koko*s2,
            koko*c1,        koko*s1);
        
        for (int i = 0;  i<k.getPoints().size();  i++ ) {
            int muutos = rnd.nextInt(6) - 3;
            k.getPoints().set(i, k.getPoints().get(i) + muutos);
        }
        
        return k;
    }
     
    private void synnytaUusiAsteroidi(Random r, Alus alus, ArrayList<Asteroidi> asteroiditList, Pane pane){
        if(r.nextDouble()<0.03){
                    int x = new Random().nextInt(LEVEYS);
                    int y = new Random().nextInt(KORKEUS);
                    while(Math.abs(x-alus.getHahmo().getTranslateX())<100 || Math.abs(y-alus.getHahmo().getTranslateY())<100){
                        x = new Random().nextInt(LEVEYS);
                       y= new Random().nextInt(KORKEUS);
                    }
                    Asteroidi ast = new Asteroidi(teeKulmio(),x, y);
                    asteroiditList.add(ast);
                    pane.getChildren().add(ast.getHahmo());
                }
    }
 
}
 