package tekstitilastointia;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import java.util.Arrays;

public class TekstitilastointiaSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }

      @Override
    public void start(Stage stage){
        BorderPane b = new BorderPane();
        TextArea textarea = new TextArea();
        b.setCenter(textarea);
        HBox h = new HBox();
        h.setSpacing(40);
        Label ki = new Label("Kirjaimia: " );
        Label sa = new Label("Sanoja: " );
        Label pi = new Label("Pisin sana on: " );
        b.setBottom(h);
        
        textarea.textProperty().addListener((muutos, vanhaArvo, uusiArvo) -> {
        int merkkeja = uusiArvo.length();
        String[] palat = uusiArvo.split(" ");
        int sanoja = palat.length;
        String pisin = Arrays.stream(palat)
            .sorted((s1, s2) -> s2.length() - s1.length())
            .findFirst()
            .get();
        ki.setText("Kirjaimia: " + merkkeja);
        sa.setText("Sanoja: " + sanoja);
        pi.setText("Pisin sana on: " + pisin);

    });
        h.getChildren().addAll(ki, sa, pi);
        
        Scene s = new Scene(b);
        
        stage.setScene(s);
        stage.show();
    }

}
