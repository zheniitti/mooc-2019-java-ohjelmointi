package sovellus;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.NumberAxis; //akselit

public class ShanghaiSovellus extends Application{

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage ikkuna) throws Exception {
        NumberAxis xnumberaxis = new NumberAxis(2007,2018,1);
        xnumberaxis.setLabel("Vuosi");
        NumberAxis ynumberaxis = new NumberAxis(); 
        ynumberaxis.setLabel("Sijoitus");
        LineChart<Number,Number> linechartkaavio = new LineChart<>(xnumberaxis,ynumberaxis);
        linechartkaavio.setTitle("Helsingin yliopiston sijoitus vuosina 2007-2017");
        XYChart.Series xychartseriestiedot = new XYChart.Series();
        xychartseriestiedot.setName("Helsingin Yliopisto");
        String tiedot = "2007 73\n" +
                        "2008 68\n" +
                        "2009 72\n" +
                        "2010 72\n" +
                        "2011 74\n" +
                        "2012 73\n" +
                        "2013 76\n" +
                        "2014 73\n" +
                        "2015 67\n" +
                        "2016 56\n" +
                        "2017 56";
        
        String[] taulukko = tiedot.split("\n"); 
        for(String s: taulukko){
            String[] pari = s.trim().split(" ");
            int vuosi = Integer.parseInt(pari[0].trim());
            int sijoitus = Integer.parseInt(pari[1].trim());
            xychartseriestiedot.getData().add(new XYChart.Data<>(vuosi, sijoitus));            
        }
        linechartkaavio.getData().add(xychartseriestiedot);
        
        Scene s = new Scene(linechartkaavio);
        ikkuna.setScene(s);
        ikkuna.show();
    }

}
