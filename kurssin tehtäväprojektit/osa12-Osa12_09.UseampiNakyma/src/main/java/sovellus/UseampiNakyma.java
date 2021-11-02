package sovellus;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.GridPane;

public class UseampiNakyma extends Application{

    public static void main(String[] args) {
        launch(UseampiNakyma.class);
    }

    public void start(Stage stage){
        BorderPane borderpane = new BorderPane();
        borderpane.setTop(new Label("Eka näkymä!"));
        Button ekabutton = new Button("Tokaan näkymään!");
        borderpane.setCenter(ekabutton);
        Scene ekanakyma = new Scene(borderpane);
        
        VBox vbox = new VBox();
        Button tokabutton = new Button("Kolmanteen näkymään");
        vbox.getChildren().addAll(tokabutton, new Label("Kolmas näkymä!"));
        Scene tokanakyma = new Scene(vbox);
        
        ekabutton.setOnAction(value->{
            stage.setScene(tokanakyma);
        });
        
        GridPane gridpane = new GridPane();
        Button kolmasbutton = new Button("Ekaan näkymään!");
        gridpane.add(new Label("Kolmas näkymä!"), 0, 0);
        gridpane.add(kolmasbutton, 1, 1);
        Scene kolmasscene = new Scene(gridpane);
        
        tokabutton.setOnAction(value->{
            stage.setScene(kolmasscene);
        });
        kolmasbutton.setOnAction(value->{ 
            stage.setScene(ekanakyma);
        });
        
        stage.setScene(ekanakyma);
        stage.show();
    }
}
