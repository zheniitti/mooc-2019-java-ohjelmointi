package ristinolla;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import java.util.ArrayList;
import javafx.scene.Node;

public class RistinollaSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage ikkuna){
        Toimintalogiikka t = new Toimintalogiikka();
        BorderPane asettelu = new BorderPane();
        ArrayList<Button> lista = new ArrayList<>();
        GridPane ristikko = new GridPane();       
        for(int sarake=0; sarake<3; sarake++){
            for(int rivi=0; rivi < 3; rivi++){
                Button nappi = new Button(" ");
                lista.add(nappi);
                String id = sarake+","+rivi;
                nappi.setOnMouseClicked(value->{                    
                    nappi.setId((id));
                    t.painettu(nappi);
                    asettelu.setTop(t.setLabel());
                    nappi.setText(t.kumpi(1));                    
                    nappi.setDisable(true);
                    lista.remove(nappi);
                    if(t.loppuiko()){
                        for (Node n : ristikko.getChildren()) {
	n.setDisable(true);
}
                    }
                });
                nappi.setFont(Font.font("Monospaced", 40));
                ristikko.add(nappi, sarake, rivi);
            }
        }
        asettelu.setTop(t.setLabel());
        asettelu.setCenter(ristikko);
        
        Scene scene = new Scene(asettelu);
        ikkuna.setScene(scene);
        ikkuna.setTitle("Ristinollapeli");
        ikkuna.show();
        
        
        
    }
}
