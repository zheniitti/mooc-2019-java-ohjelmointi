package hymio;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class HymioSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane asettelu = new BorderPane();
        Canvas taulu = new Canvas(300,300);
        asettelu.setCenter(taulu);
        GraphicsContext piirturi = taulu.getGraphicsContext2D();
        piirturi.fillOval(110, 75, 30, 20);
        piirturi.fillOval(155, 75, 30, 20);
        piirturi.fillRect(90, 160, 120, 15);
        piirturi.fillRect(70, 145, 20, 15);
        piirturi.fillRect(210, 145, 20, 15);
        
        Scene s = new Scene(asettelu);
        primaryStage.setScene(s);
        primaryStage.show();
    }

}
