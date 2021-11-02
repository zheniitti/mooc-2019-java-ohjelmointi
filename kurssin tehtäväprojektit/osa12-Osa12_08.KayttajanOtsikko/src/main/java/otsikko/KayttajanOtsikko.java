package otsikko;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.application.Application.Parameters;

public class KayttajanOtsikko extends Application{
    
    public void start(Stage ikkuna){
        ikkuna.setTitle(getParameters().getNamed().get("key"));
        ikkuna.show();
    }

}
