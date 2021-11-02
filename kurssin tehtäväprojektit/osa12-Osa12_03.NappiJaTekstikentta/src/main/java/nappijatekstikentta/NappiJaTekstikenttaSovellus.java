package nappijatekstikentta;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.TextField;

public class NappiJaTekstikenttaSovellus extends Application{


    public static void main(String[] args) {
        launch(NappiJaTekstikenttaSovellus.class);
    }

    @Override
    public void start(Stage primaryStage)  {
        Button b = new Button("nappi");
        TextField t = new TextField("moi\n");
        FlowPane f = new FlowPane();
        f.getChildren().add(t);
        f.getChildren().add(b);
        Scene s = new Scene(f);
        primaryStage.setScene(s);
        primaryStage.show();
    }

}
