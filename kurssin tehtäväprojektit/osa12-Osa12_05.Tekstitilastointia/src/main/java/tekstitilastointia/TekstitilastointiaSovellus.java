package tekstitilastointia;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class TekstitilastointiaSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage){
        BorderPane b = new BorderPane();
        b.setCenter(new TextArea());
        HBox h = new HBox();
        h.setSpacing(40);
        h.getChildren().add(new Label("Kirjaimia: 0"));
        h.getChildren().add(new Label("Sanoja: 0"));
        h.getChildren().add(new Label("Pisin sana on:"));
        b.setBottom(h);
        
        Scene s = new Scene(b);
        
        stage.setScene(s);
        stage.show();
    }

}
