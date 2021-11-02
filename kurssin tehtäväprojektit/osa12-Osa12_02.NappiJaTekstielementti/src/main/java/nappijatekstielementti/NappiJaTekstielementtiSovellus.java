package nappijatekstielementti;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class NappiJaTekstielementtiSovellus extends Application{

    public static void main(String[] args) {
        launch(NappiJaTekstielementtiSovellus.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Button b = new Button();
        Label l = new Label("");
        FlowPane f = new FlowPane();
        f.getChildren().add(b);
        f.getChildren().add(l);
        Scene s = new Scene(f);
        stage.setScene(s);
        stage.show();
    }

}
