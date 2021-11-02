package kollaasi;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class KollaasiSovellus extends Application {

    @Override
    public void start(Stage stage) {

        // esimerkki avaa kuvan, luo uuden kuvan, ja kopioi avatun kuvan 
        // uuteen kuvaan pikseli kerrallaan
        Image lahdeKuva = new Image("file:monalisa.png");

        PixelReader kuvanLukija = lahdeKuva.getPixelReader();

        int leveys = (int) lahdeKuva.getWidth();
        if(leveys%2!=0){
            leveys --;
        }
        int korkeus = (int) lahdeKuva.getHeight();
        if(korkeus%2!=0){
            korkeus--;
        }

        WritableImage kohdeKuva = new WritableImage(leveys, korkeus);
        PixelWriter kuvanKirjoittaja = kohdeKuva.getPixelWriter();

        int x =0;
        int y = 0;
        int apux = 0;
        int apuy=0;
        
        for(int a = 0; a<4; a++){
                        
            if(a==1||a==3){
                apux = leveys/2;
            }else{
                apux = 0;
            }
            if(a>=2){
                apuy = korkeus/2;
            }else{
                apuy=0;
            }
            y=apuy;
            x=apux;
            
            for(int y1 = 0; y1<korkeus; y1+=2){              
                
                for(int x1 = 0;   x1 < leveys;   x1 += 2){                    
                    Color vari = kuvanLukija.getColor(x1, y1);
                    double punainen = 1.0-vari.getRed();
                    double vihrea = 1.0-vari.getGreen();
                    double sininen = 1.0-vari.getBlue();
                    double lapinakyvyys = vari.getOpacity();
                    Color uusiVari = new Color(punainen, vihrea, sininen, lapinakyvyys); 
                    
                    kuvanKirjoittaja.setColor(x, y, uusiVari);  //yksi pikseli piirretty!
                    x++;
                    
                } // yksi xrivi piirretty! Seuraava rivi! y1++;  
                x=apux;
                y++;            
            }//pieni kuva piirretty! Nyt uudestaan eri koordinaattiin;    
        }
        
        
        ImageView kuva = new ImageView(kohdeKuva);

        Pane pane = new Pane();
        pane.getChildren().add(kuva);
        pane.setPrefSize(leveys, korkeus);
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
