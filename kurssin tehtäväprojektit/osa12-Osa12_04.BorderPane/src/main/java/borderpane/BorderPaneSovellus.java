package borderpane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class BorderPaneSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
        
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane b = new BorderPane();
        b.setBottom(new Label("SOUTH"));
        b.setTop(new Label("NORTH"));
        b.setRight(new Label("EAST"));

        Scene s = new Scene(b);
        primaryStage.setScene(s);
        primaryStage.show();
        
        
    }
    
    

}
