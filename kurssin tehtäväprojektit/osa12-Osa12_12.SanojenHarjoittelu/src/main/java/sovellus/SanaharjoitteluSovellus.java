package sovellus;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.util.Random;
import java.util.ArrayList;
import javafx.scene.Parent;
public class SanaharjoitteluSovellus extends Application{
    private HashMap<String,String> hashmap = new HashMap<>();
    private ArrayList<String> list = new ArrayList<>();
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {       
        Sanakirja sanakirja = new Sanakirja();
        Syottonakyma syottonakyma= new Syottonakyma(sanakirja);
        Harjoittelunakyma harjoittelunakyma = new Harjoittelunakyma(sanakirja);
        
        BorderPane nakyma = new BorderPane();
        Button s = new Button("Lisää sanoja");
        Button h = new Button("Harjoittele");
        HBox a = new HBox();
        a.getChildren().addAll(s,h);
        nakyma.setTop(a);
        nakyma.setCenter(syottonakyma.getNakyma());
        
        s.setOnAction(value->{nakyma.setCenter(syottonakyma.getNakyma());});
        h.setOnAction(value->nakyma.setCenter(harjoittelunakyma.getNakyma()));
        
        stage.setScene(new Scene(nakyma));
        stage.show();
    }
    
}
