package sovellus;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;

public class VitsiSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        BorderPane borderpane = new BorderPane();
        HBox hbox = new HBox();
        hbox.setSpacing(20);
        Button vitsibutton = new Button("Vitsi");
        Button vastausbutton = new Button("Vastaus");
        Button selitysbutton = new Button("Selitys");
        hbox.getChildren().addAll(vitsibutton, vastausbutton, selitysbutton);
        borderpane.setTop(hbox);
        
        Label kysymys = new Label("What do you call a bear with no teeth?");
        Label vastaus = new Label("A gummy bear.");
        Label selitys = new Label("Tämä on selitys.");
        
        borderpane.setCenter(kysymys);
        
        vastausbutton.setOnAction(value->borderpane.setCenter(vastaus));
        selitysbutton.setOnAction(value->borderpane.setCenter(selitys));
        vitsibutton.setOnAction(value->borderpane.setCenter(kysymys));
        
        stage.setScene(new Scene(borderpane));
        stage.show();
    }
    
}
