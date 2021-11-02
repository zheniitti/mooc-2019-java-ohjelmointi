package sovellus;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class TervehtijaSovellus extends Application{


    public static void main(String[] args) {
        launch(args);
    }
    
    public void start(Stage stage){
        GridPane gridpane = new GridPane();
        gridpane.setAlignment(Pos.CENTER);
        gridpane.add(new Label("Kirjoita nimesi ja aloita."), 0, 0);
        TextField textfield = new TextField();
        PasswordField passw = new PasswordField();
        gridpane.add(passw, 0, 1);
        Button aloitusbutton = new Button("Aloita");
        gridpane.add(aloitusbutton,0,2);
        Scene eka = new Scene(gridpane);
        
        StackPane stackpane = new StackPane();
        stackpane.setAlignment(Pos.CENTER);
        
        Scene toka = new Scene(stackpane);
        aloitusbutton.setOnAction(value->{ stackpane.getChildren().add(new Label("Tervetuloa "+passw.getText().trim()+"!"));
        stage.setScene(toka);} );
        
        stage.setScene(eka);
        stage.show();
    }
}
