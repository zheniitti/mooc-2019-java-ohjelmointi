
package mooc16koe;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
/**
 *
 * @author zheny
 */
public class MOOC16Koe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner lukija = new Scanner(System.in);
//        ekatehtava(lukija);
        System.out.println();
        tokatehtava(lukija);
    }
    
    
    private static HashMap taulukko(){
        String v = 
                "13 000 - 8,6 %\n" +
                "14 000 - 10,2 %\n" +
                "15 000 - 11,8 %\n" +
                "16 000 - 13,2 %\n" +
                "17 000 - 14,4 %\n" +
                "18 000 - 15,5 %\n" +
                "19 000 - 16,6 %\n" +
                "20 000 - 17,8 %";
        HashMap<Integer, Double> map = new HashMap<>();
        String[] t = v.split("\n");
        Arrays.stream(t).forEach(rivi -> {
            rivi = rivi.replaceAll("[ %]", "");
            Integer tulo = Integer.valueOf(rivi.split("-")[0]);
            Double pros = Double.valueOf(rivi.split("-")[1].replace(",", "."));
            map.put(tulo, pros);        
        });
        return  map;
    }
    
    private static void ekatehtava(Scanner lukija){
        System.out.print("Tulotaso: ");
        int tulotaso =Integer.valueOf(lukija.nextLine());
        double pros = 0.0;
        if(tulotaso<11000 && tulotaso>=0){
            pros = 7.7;
            System.out.println("Veroprosentti: " + pros +
                "\nVeroja maksetaan: "+ Integer.valueOf(tulotaso)*pros/100);
        }
        else if(tulotaso>=11000 && tulotaso<13000){
            pros = 8.3;
            System.out.println("Veroprosentti: " + pros +
                "\nVeroja maksetaan: "+ Integer.valueOf(tulotaso)*pros/100);
        }
        else{
            taulukko().keySet().stream().forEach(tulo -> {
            if(tulotaso >= (int)tulo && tulotaso < (int)tulo+1000){
               double prose = (double) taulukko().get(tulo);
               System.out.println("Veroprosentti: " + prose +
                "\nVeroja maksetaan: "+ Integer.valueOf(tulotaso)*prose/100);
            }
        });
        }
    }
    
    
    //vaalipiiri;id;sukunimi;etunimi;puolue;ikä;sukupuoli;Toimin tällä hetkellä kansanedustajana.;vastattu;valittu;sitoutumaton;kotikunta;ehdokasnumero;Miksi juuri sinut kannattaisi valita eduskuntaan?<sub>(enintään 200 merkkiä)</sub>;Mitä asioita haluat edistää tai ajaa tulevalla vaalikaudella;Vaalilupaus 1;Vaalilupaus 2;Vaalilupaus 3;Äidinkieli;Kotisivun osoite:;Facebook-profiilin osoite:;Twitter-profiilin osoite:;Lapsia;Perheeseeni kuuluu:;Vapaa-ajalla sydäntäni lähinnä on;Työnantaja;Ammattiasema;Ammatti;Koulutus;Kielitaito;Uskonnollinen yhteisö;Poliittisen puolueen jäsen;Poliittinen kokemus;Käytän vaaleihin rahaa;Ulkopuolisen rahoituksen osuus;Tärkein ulkopuolinen rahoituslähde;Taloudelliset sidonnaisuudet;Vuositulot;Sijoitusten arvo (esim. osakkeet - rahastot);127|Suomessa on liian helppo elää sosiaaliturvan varassa;127|kommentti;128|Kaupan ja muiden liikkeiden aukioloajat on vapautettava.;128|kommentti;129|Suomessa on siirryttävä perustuloon joka korvaisi nykyisen sosiaaliturvan vähimmäistason.;129|kommentti;130|Työntekijälle on turvattava lailla minimityöaika.;130|kommentti;131|Ansiosidonnaisen työttömyysturvan kestoa pitää lyhentää.;131|kommentti;132|Euron ulkopuolella Suomi pärjäisi paremmin.;132|kommentti;133|Ruoan verotusta on varaa kiristää.;133|kommentti;134|Valtion ja kuntien taloutta on tasapainotettava ensisijaisesti leikkaamalla menoja.;134|kommentti;135|Lapsilisiä on korotettava ja laitettava verolle.;135|kommentti;136|Suomella ei ole varaa nykyisen laajuisiin sosiaali- ja terveyspalveluihin.;136|kommentti;137|Nato-jäsenyys vahvistaisi Suomen turvallisuuspoliittista asemaa.;137|kommentti;138|Suomeen tarvitaan enemmän poliiseja.;138|kommentti;139|Maahanmuuttoa Suomeen on rajoitettava terrorismin uhan vuoksi.;139|kommentti;140|Venäjän etupiiripolitiikka on uhka Suomelle.;140|kommentti;141|Verkkovalvonnassa valtion turvallisuus on tärkeämpää kuin kansalaisten yksityisyyden suoja.;141|kommentti;142|Suomen on osallistuttava Isisin vastaiseen taisteluun kouluttamalla Irakin hallituksen joukkoja.;142|kommentti;143|Parantumattomasti sairaalla on oltava oikeus avustettuun kuolemaan.;143|kommentti;144|Terveys- ja sosiaalipalvelut on tuotettava ensijaisesti julkisina palveluina.;144|kommentti;145|Viranomaisten pitää puuttua lapsiperheiden ongelmiin nykyistä herkemmin.;145|kommentti;146|Vanhuksen ja hänen omaistensa vastuuta hoitokustannuksista on lisättävä.;146|kommentti;147|Kansalaisten oikeus terveyspalveluihin on tärkeämpää kuin kuntien itsehallinto.;147|kommentti;148|Ilmastonmuutoksen hillitseminen pitää asettaa teollisuuden kilpailukyvyn edelle.;148|kommentti;149|Geenimuunneltu ruoka on turvallista ihmiselle ja ympäristölle.;149|kommentti;150|Suomen pitää ottaa suurempi vastuu EU:n alueelle tulevista turvapaikanhakijoista.;150|kommentti;151|On aika luopua ajatuksesta, että koko Suomi on pidettävä asuttuna.;151|kommentti;152|Peruskoulun opetusryhmien koko on rajattava lailla esimerkiksi 20 oppilaaseen.;152|kommentti;201|Suomen Nato-jäsenyydestä on järjestettävä kansanäänestys.;201|kommentti;244|Hyväksytään periaatepäätös uuden ydinvoimalaitosyksikön rakentamisesta.;244|kommentti;245|Tuloveroa alennetaan tasaisesti kaikissa tuloluokissa talouden elvyttämiseksi.;245|kommentti;246|Edellisen eduskunnan hyväksymä lainmuutos samaa sukupuolta olevien avioliiton sallimisesta peruutetaan.;246|kommentti;247|Mietojen viinien ja vahvojen oluiden myynti ruokakaupassa sallitaan.;247|kommentti;248|Ruotsin kielen opiskelu muutetaan vapaaehtoiseksi.;248|kommentti;153|Helsingin seudulla pitää ottaa käyttöön ruuhkamaksut.;153|kommentti;159|Helsingin seudulla pitää ottaa käyttöön ruuhkamaksut.;159|kommentti;162|Valtatie kahdeksan perusparannus on kiireellisempi hanke kuin  Salo-Lohja-Espoo-oikoradan toteuttaminen.;162|kommentti;165|Kanta- ja Päijät-Hämeen eriytyminen sotealueina merkitsee samalla muunkin maakuntien välisen yhteistyön murentumista.;165|kommentti;168|Pirkanmaalle tarvitaan puolet vähemmän kuntia kuin nykyisin.;168|kommentti;171|Satakunnan pitää jatkossakin säilyä omana vaalipiirinään, vaikka kansanedustajamäärä on pudonnut kahdeksaan.;171|kommentti;174|Talvivaaran toimintaa pitää jatkaa valtiollisena yhtiönä, ellei muita sijoittajia löydy.;174|kommentti;177|Venäläisten viisumivapaudesta olisi enemmän haittaa kuin hyötyä.;177|kommentti;180|Vaalipiirin toisen asteen oppilaitoksia ja lukioita on varaa vähentää, kunhan koulutus turvataan kohtuullisen matkan päässä.;180|kommentti;183|Säännöllinen lentoliikenne Vaasan vaalipiirissä pitää keskittää Vaasan lentoasemalle.;183|kommentti;186|Kemihaaraan pitää rakentaa tulvansuojeluallas.;186|kommentti;189|Akateemisia työttömiä on alettava Keski-Suomessa kouluttaa yrittäjäksi valtion rahoituksella.;189|kommentti;198|Valtion tulee lisätä tukensa merenkululle.;198|kommentti;154|Kuntaliitoksiin perustuva Suur-Helsinki on parempi vaihtoehto kuin itsenäisten kuntien yhteinen metropolihallinto.;154|kommentti;160|Uudenmaan tiet on kunnostettava ennen kuin uusia ratayhteyksiä itään tai länteen rakennetaan.;160|kommentti;164|Varsinais-Suomen kuntien lukumäärää pitää supistaa. Erityisesti keskuskaupunki. Turun elinvoimaisuus on turvattava liitosratkaisuin.;164|kommentti;167|Entistä suurempi osa kirjaston palveluista tulee tehdä maksullisiksi.;167|kommentti;169|Tampereen korkeakoulut pohtivat yhdistymistä: lakia pitäisi muuttaa siten, että yhdistyminen on mahdollista.;169|kommentti;172|Satakuntaan pitäisi muodostaa seuraavalla vaalikaudella neljä isoa kaupunkia Porin, Rauman, Kankaanpään ja Huittisten ympärille, koska pikkukunnat eivät ole elinvoimaisia.;172|kommentti;175|Rosatom on velvoitettava työllistämään myös paikallisia, jos Pyhäjoen ydinvoimalahanke toteutuu.;175|kommentti;178|Kaakkois-Suomeen riittää yksi vahva ammattikorkeakoulu ja yksi vahva yliopisto.;178|kommentti;181|Pohjois-Savon ja Pohjois-Karjalan maakuntarajan tarpeellisuutta pitäisi tarkastella tulevalla vaalikaudella.;181|kommentti;184|Tuulivoimapuistoja pitäisi sijoittaa myös rannikolle.;184|kommentti;187|Lapista pitää rakentaa rautatieyhteys jäämerelle Norjan kautta.;187|kommentti;190|Lääkäripulan helpottamiseksi suomalaisen koulutuksen saanut lääkäri on velvoitettava työskentelemään tietty ajanjakso julkisessa terveydenhuollossa valmistumisensa jälkeen.;190|kommentti;199|Ahvenanmaan tulee saada oma verotusoikeus.;199|kommentti;155|Guggenheim-museon saaminen Helsinkiin on koko Suomen etu.;155|kommentti;161|Suuret kuntaliitokset ovat parempi vaihtoehto kuin itsenäisten kuntien yhteinen metropolihallinto.;161|kommentti;163|Merimetso- ja hyljekantojen rajoittamista tulisi helpottaa esimerkiksi viranomaistoimin.;163|kommentti;166|Hämeessä Lahden eteläinen kehätie pitää asettaa valtion tiehankkeista etusijalle kymppitien ja valtatie 12:n parantamiseen nähden.;166|kommentti;170|Delfinaariotoiminta pitäisi kieltää Suomessa lailla.;170|kommentti;173|Valtion pitää tukea Porin ja Helsingin välistä lentoliikennettä maksamalla puolet reitin kustannuksista.;173|kommentti;176|Kollajan allas pitäisi rakentaa.;176|kommentti;179|Norppaa suojellaan jo liikaa.;179|kommentti;182|Itä-Suomen lentoasemaverkosto on turvattava nykyisen laajuisena yhteiskunnan tuella, jos se muuten on tappiollista.;182|kommentti;185|Vaasan vaalipiirissä tarvitaan lisää kuntaliitoksia.;185|kommentti;188|Lappia on kehitetty liikaa matkailun ja luontaistalouden ehdoilla ja muut elinkeinot ovat jääneet liian vähälle huomiolle.;188|kommentti;191|Toimet turpeen energiankäytön lopettamiseksi on käynnistettävä alkavalla hallituskaudella.;191|kommentti;200|Ahvenanmaalaisilla on pienet mahdollisuudet vaikuttaa asioihinsa eduskunnan kautta.;200|kommentti;205|Valtion pitää antaa Helsingille erityistukea maahanmuuttajien kotouttamiseen.;205|kommentti;207|Uudellamaalla on liikaa pieniä sairaaloita. Hoitoa pitäisi keskittää suurempiin yksiköihin.;207|kommentti;209|Tuulivoiman rakentamisen esteitä tulee poistaa muun muassa meluvaatimuksia lieventämällä.;209|kommentti;211|Valtion on lähdettävä mukaan omistajaksi Rauman telakalle ensi vaalikaudella, koska valtio on tukenut myös Turun telakkaa.;211|kommentti;213|Manner-Suomessa monet kunnat yhdistyvät. Myös Ahvenanmaalle riittäisi pienempi määrä kuntia.;213|kommentti;215|Valtion toimintoja pitää hajasijoittaa jatkossa enemmän Lahden seudulle kuin Hämeenlinnan seudulle.;215|kommentti;217|Pirkanmaalla on suurpeto-ongelma.;217|kommentti;219|Kaksoisraiteen rakentaminen Luumäeltä Imatralle ajaa Kaakkois-Suomen tiehankkeiden edelle.;219|kommentti;221|Kaivosteollisuutta pitäisi suitsia nykyistä tiukemmin.;221|kommentti;223|Kaikkien pohjalaiskuntien pitäisi vastaanottaa pakolaisia.;223|kommentti;225|Bioenergian puuntarve täytyy kartoittaa ja energiapuun hakkuita tarvittaessa rajoittaa metsien monimuotoisuuden säilyttämiseksi.;225|kommentti;227|Kasitien parantaminen on Oulun vaalipiirin tärkein tiehanke ensi vaalikaudella ydinvoimalasuunnitelmien takia.;227|kommentti;229|Alkuperäiskansojen oikeuksia koskeva ILO-sopimus pitää ratifioida.;229|kommentti;206|Laitospaikka on yksinäiselle helsinkiläisvanhukselle parempi vaihtoehto kuin kotihoito.;206|kommentti;208|Valtion pitää velvoittaa kunnat ottamaan tasapuolisesti kiintiöpakolaisia.;208|kommentti;210|Rajavartiolaitoksen merelliset toiminnot keskitetään työllisyys-, säästö- ja tehostamistoimenpiteenä Turkuun.;210|kommentti;212|Satakuntalaiset kansanedustajat ovat onnistuneet hyvin maakunnan edunvalvonnassa vaalikaudella 2011-2015.;212|kommentti;214|Merimetson ja hylkeen metsästys tulee vapauttaa Ahvenanmaalla.;214|kommentti;216|Väylärahoitusta tulee siirtää rautatieliikenteestä teiden kunnossapitoon.;216|kommentti;218|Kylä/lähikoulu on jokaisen pirkanmaalaislapsen perusoikeus.;218|kommentti;220|Valtion pitäisi tukea rahallisesti enemmän Kaakkois-Suomessa pk-yrityksiä kuin suurteollisuutta.;220|kommentti;222|Kuntaliitoksia tarvitaan alueella lisää vahvojen keskusten muodostumiseksi.;222|kommentti;224|Maatalouden tukia pitää suunnata entistä suuremmille ja harvemmille tiloille.;224|kommentti;226|Tienpidon määrärahat on Keski-Suomessa suunnattava seuraavalla vaalikaudella alemmalle tieverkolle biotalouden tukemiseksi.;226|kommentti;228|29 kuntaa Pohjois-Pohjanmaalla ja kahdeksan kuntaa Kainuussa on selvästi liian paljon.;228|kommentti;230|Kemi-Tornio-aluetta ei ole kohdeltu Rovaniemen seutuun verrattuna tasapuolisesti.;230|kommentti;231|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;231|kommentti;232|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;232|kommentti;233|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;233|kommentti;234|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;234|kommentti;235|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;235|kommentti;236|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;236|kommentti;237|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;237|kommentti;238|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;238|kommentti;239|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;239|kommentti;240|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;240|kommentti;241|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;241|kommentti;242|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;242|kommentti;243|Jokeri-kysymys:  Vaalilupauksista täytyy pitää kiinni.;243|kommentti

    private static void tokatehtava(Scanner s) throws FileNotFoundException{
        System.out.println("Mitä tiesostoa luetaan? (tai paina enter)");
        String tiedosto = s.nextLine();
        ArrayList<String> rivit = new ArrayList();
        
        try(Scanner lukija = new Scanner(new File("vastaukset.csv"))){
            String ekarivi = lukija.nextLine();
            
            while (lukija.hasNextLine()){
                String rivi = lukija.nextLine().trim();
                if( rivi.length() !=0 ){
                rivit.add(rivi);
                }
            }
            
            tilastojaLukumaaristaJaPerusteluista(rivit);
            tulostaMielipidekeskiarvot(rivit);
            tulostaYleisimmatSanaparitPerusteluissa(rivit);
        }
        
        System.out.println("");
    }
    
    private static void tilastojaLukumaaristaJaPerusteluista(ArrayList<String> lista) {
        
        int valittuja = lista.stream().mapToInt(rivi -> Integer.valueOf(rivi.split(";")[9]) ).sum();
        String lyhinp = lista.stream().map(rivi -> rivi.split(";")[13])
                .filter(perustelu -> perustelu.length()>0)
                .sorted((s1, s2) -> { return s1.length() - s2.length();}).findFirst().get().trim();
        
        double ka = lista.stream().mapToInt(rivi -> rivi.split(";")[13].length())
                .filter(luku -> luku>0)
                .average().getAsDouble();
        
        System.out.println("Tilastoja lukumääristä\n" +
                            "  vastaajia: "+lista.size()+"\n" +
                            "  valittuja: "+valittuja+"\n" +
                            "  ei-valittuja: "+ (lista.size()-valittuja) +"\n\n" +
                            "Tilastoja perusteluista\n" +
                            "  lyhin perustelu: "+lyhinp+"\n" +
                            "  lyhimmän perustelun pituus: "+lyhinp.length()+"\n" +
                            "  keskimääräisen perustelun pituus: "+ka);        
        System.out.println();
        
        
        
        HashMap<String, Integer> map = new HashMap<>();
        
        lista.stream().map(rivi -> rivi.split(";")[13]).forEach(p -> {
            p = p.toLowerCase().replaceAll("[?.,!]", " ");
            String[] sanat = p.split(" ");
            Arrays.stream(sanat).forEach(s -> map.put(s, map.getOrDefault(s, 0)+1));
        });
        
        System.out.println("Yleisimmät sanat");
        
        List list = map.keySet().stream().filter(k -> k.length()>1).sorted((k1, k2) -> {
           return map.get(k2) - map.get(k1);
        }).map(k -> k+" ("+map.get(k)+")").collect(Collectors.toCollection(ArrayList::new));
        
        for(int i=0; i<10; i++){
            System.out.println("  "+list.get(i));
        }
        System.out.println("");
        
        
        
    }
    
    private static void tulostaMielipidekeskiarvot(List<String> l){
        List<Ehdokas> ehdokkaat = new ArrayList<>();
        l.stream().forEach(rivi -> {
            if(rivi.contains("mieltä")){
                ehdokkaat.add(new Ehdokas(rivi)) ;
            }
            else{
                ehdokkaat.add(new Ehdokas(rivi, 0));
            }
                });
        double kaikkienKA = ehdokkaat.stream().mapToDouble(ehdokas -> ehdokas.mielipiteidenKA).average().getAsDouble();
        double valittujenKA = ehdokkaat.stream().filter(ehdokas -> ehdokas.valittu).mapToDouble(ehd -> ehd.mielipiteidenKA).average().getAsDouble();
        double eiValittujenKA = ehdokkaat.stream().filter(ehdokas -> !ehdokas.valittu).mapToDouble(ehd -> ehd.mielipiteidenKA).average().getAsDouble();
    
        System.out.println("Mielipidekeskiarvot\n" +
                            "  kaikki ehdokkaat: "+kaikkienKA+"\n" +
                            "  valitut ehdokkaat: "+valittujenKA+"\n" +
                            "  ei-valitut ehdokkaat: "+eiValittujenKA+"\n");
        
        HashMap<String, Double> puolueetJaKA = new HashMap();
        ehdokkaat.stream().forEach(ehd -> { puolueetJaKA.put((String)ehd.puolue, (puolueetJaKA.getOrDefault((String)ehd.puolue, 0.0)+ehd.mielipiteidenKA)/2) ;});
        puolueetJaKA.keySet().stream().sorted().forEach(puol -> System.out.println("  "+puol+": "+puolueetJaKA.get(puol)));
        
        System.out.println("");
    }
    
    private static void tulostaYleisimmatSanaparitPerusteluissa(ArrayList<String> lista){
        
        List<String> list1 = new ArrayList<>();
        
        lista.stream().map(rivi -> rivi.split(";")[13]).forEach(p -> {
            p = p.toLowerCase().replaceAll("[?.,!]", " ");
            String[] sanat = p.split(" ");            
            Arrays.stream(sanat).filter(sana -> sana.length()>1).forEach(s -> list1.add(s));
        });
        
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=1; i<list1.size(); i++){
            map.put(list1.get(i-1)+" "+list1.get(i), map.getOrDefault(list1.get(i-1)+" "+list1.get(i), 0)+1);
        }
        
        System.out.println("Yleisimmät sanaparit");
        
        List list = map.keySet().stream().filter(k -> k.length()>1).sorted((k1, k2) -> {
            if(map.get(k2) == map.get(k1)){
                return k1.compareTo(k2);
            }
           return map.get(k2) - map.get(k1);
        }).map(pari -> pari+" ("+map.get(pari)+")").collect(Collectors.toCollection(ArrayList::new));
        
        for(int i=0; i<10; i++){
            System.out.println("  "+list.get(i));
        }
        System.out.println("");
        
        
        
    }
    
    
    
}
