
package oma2048;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Oma2048 extends Application{   
    
    public static void main(String[] args) {
        launch(args);
     
    }

    @Override
    public void start(Stage ik) throws Exception {
        Peli peli = new Peli();
        peli.kaynnista();
        HBox hbox = new HBox();
//        BorderPane asettelu = new BorderPane();
        VBox asettelu = new VBox();
        GridPane ruudukko = new GridPane();
        asettelu.getChildren().addAll(hbox, ruudukko);
        ruudukko.setPrefSize(300, 300);
        asettelu.setPrefSize(300, 400);
        
        paivitaRuudukko(peli, ruudukko);
        
        
        Scene s = new Scene(asettelu);
        ik.setScene(s);
        ik.show();
        ik.setTitle("2048 peli");

        s.setOnKeyPressed(e -> {
            if(e.getCode()==KeyCode.LEFT){
                peli.siirraVasemmalle();
            }
            if(e.getCode()==KeyCode.RIGHT){
                peli.siirrOikealle();
            }
            if(e.getCode()==KeyCode.UP){
                peli.siirraYlos();
            }
            if(e.getCode()==KeyCode.DOWN){
                peli.siirraAlas();
            }
            paivitaRuudukko(peli, ruudukko);
        }        
        );
        
        
        ruudukko.setPrefSize(300, 300);
        asettelu.setPrefSize(300, 400);
    }
    
    private static void paivitaRuudukko(Peli peli, GridPane ruudukko){
        ruudukko.getChildren().clear();
        for(int rivi=0; rivi<4; rivi++){
            for(int sarake=0; sarake<4; sarake++){  
                Label l = new Label("  "+peli.taulukko[rivi][sarake]+"  ");                
                ruudukko.add(l, sarake, rivi);
            }
        }
    }
    
  


    
    
}
