package ilmoitin;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;

public class IlmoitinSovellus extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage ikkuna){
        TextField tekstikentta = new TextField();
        Button b = new Button("Päivitä");
        VBox vbox = new VBox();
        vbox.getChildren().add(tekstikentta);
        vbox.getChildren().add(b);
        
        Label label = new Label("");
        vbox.getChildren().add(label);
        b.setOnAction(value->{
            label.setText(tekstikentta.getText());
        });
        
        Scene scene = new Scene(vbox);
        ikkuna.setScene(scene);
        ikkuna.show();
        
    }
}
