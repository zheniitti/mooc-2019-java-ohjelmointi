package sovellus;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.LineChart;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class PuolueetSovellus extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        NumberAxis x = new NumberAxis(1968,2008,4);
        x.setLabel("Vuosi");
        NumberAxis y = new NumberAxis(0,40,4);
        y.setLabel("Kannatusprosentti(%)");
        LineChart<Number, Number> linechart = new LineChart<>(x,y);
        linechart.setTitle("Puolueiden suhteellinen kannatus vuosina 1968 - 2008");
        
        try(Scanner lukija = new Scanner(new File("puoluedata.tsv"))){
            ArrayList<String> rivit = new ArrayList<>();
            while(lukija.hasNext()){
                rivit.add(lukija.nextLine());
            }
            rivit.stream().forEach(string->{System.out.println(string);});
            
            if(!rivit.isEmpty()){
                String[] ekarivi = rivit.get(0).split("\t");
                for(int a = 1; a < rivit.size(); a++){
                    XYChart.Series puolue = new XYChart.Series();
                    puolue.setName(rivit.get(a).split("\t")[0].trim());
                    
                    for(int i = 1; i < ekarivi.length; i++){  
                        if(!rivit.get(a).split("\t")[i].trim().equals("-")){
                        puolue.getData().add(new XYChart.Data(Integer.parseInt(ekarivi[i]), 
                                Double.parseDouble(rivit.get(a).split("\t")[i].trim())));
                        }
                    }     
                    linechart.getData().add(puolue);                    
                }
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        ikkuna.setScene(new Scene(linechart));
        ikkuna.show();
        
    }

}
