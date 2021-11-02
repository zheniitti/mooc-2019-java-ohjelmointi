package otsikko;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("SYötä otsikko:");
        String otsikko = lukija.nextLine();
        Application.launch(KayttajanOtsikko.class,
                "--key="+otsikko);

    }

   

}
