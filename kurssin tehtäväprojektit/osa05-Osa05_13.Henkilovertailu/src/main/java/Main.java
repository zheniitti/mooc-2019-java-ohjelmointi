
public class Main {

    public static void main(String[] args) {
        // voit kirjoittaa testikoodia tänne
        Paivays yksip = new Paivays(1,2,2003);
        Henkilo henkilö1 = new Henkilo("henkilö1", yksip, 170, 60);
        Henkilo henkilö2 = new Henkilo("henkilö1", new Paivays(1,2,2003), 170, 60);
        Henkilo henkilö3 = new Henkilo("henkilö1", yksip, 171, 60);
        
        if(henkilö1.equals(henkilö2)){
            System.out.println("sama");
        }else {
            System.out.println("eri 1");
        }
        
        if(henkilö1.equals(henkilö3)){
            System.out.println("sama");
        }else {
            System.out.println("eri 2");
        }
        
        Henkilo eka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        Henkilo toka = new Henkilo("Leevi", new Paivays(1, 1, 2017), 70, 10);
        System.out.println(eka.equals(toka)); 
        
    }
}
