
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
    
    
    //vaalipiiri;id;sukunimi;etunimi;puolue;ik??;sukupuoli;Toimin t??ll?? hetkell?? kansanedustajana.;vastattu;valittu;sitoutumaton;kotikunta;ehdokasnumero;Miksi juuri sinut kannattaisi valita eduskuntaan?<sub>(enint????n 200 merkki??)</sub>;Mit?? asioita haluat edist???? tai ajaa tulevalla vaalikaudella;Vaalilupaus 1;Vaalilupaus 2;Vaalilupaus 3;??idinkieli;Kotisivun osoite:;Facebook-profiilin osoite:;Twitter-profiilin osoite:;Lapsia;Perheeseeni kuuluu:;Vapaa-ajalla syd??nt??ni l??hinn?? on;Ty??nantaja;Ammattiasema;Ammatti;Koulutus;Kielitaito;Uskonnollinen yhteis??;Poliittisen puolueen j??sen;Poliittinen kokemus;K??yt??n vaaleihin rahaa;Ulkopuolisen rahoituksen osuus;T??rkein ulkopuolinen rahoitusl??hde;Taloudelliset sidonnaisuudet;Vuositulot;Sijoitusten arvo (esim. osakkeet - rahastot);127|Suomessa on liian helppo el???? sosiaaliturvan varassa;127|kommentti;128|Kaupan ja muiden liikkeiden aukioloajat on vapautettava.;128|kommentti;129|Suomessa on siirrytt??v?? perustuloon joka korvaisi nykyisen sosiaaliturvan v??himm??istason.;129|kommentti;130|Ty??ntekij??lle on turvattava lailla minimity??aika.;130|kommentti;131|Ansiosidonnaisen ty??tt??myysturvan kestoa pit???? lyhent????.;131|kommentti;132|Euron ulkopuolella Suomi p??rj??isi paremmin.;132|kommentti;133|Ruoan verotusta on varaa kirist????.;133|kommentti;134|Valtion ja kuntien taloutta on tasapainotettava ensisijaisesti leikkaamalla menoja.;134|kommentti;135|Lapsilisi?? on korotettava ja laitettava verolle.;135|kommentti;136|Suomella ei ole varaa nykyisen laajuisiin sosiaali- ja terveyspalveluihin.;136|kommentti;137|Nato-j??senyys vahvistaisi Suomen turvallisuuspoliittista asemaa.;137|kommentti;138|Suomeen tarvitaan enemm??n poliiseja.;138|kommentti;139|Maahanmuuttoa Suomeen on rajoitettava terrorismin uhan vuoksi.;139|kommentti;140|Ven??j??n etupiiripolitiikka on uhka Suomelle.;140|kommentti;141|Verkkovalvonnassa valtion turvallisuus on t??rke??mp???? kuin kansalaisten yksityisyyden suoja.;141|kommentti;142|Suomen on osallistuttava Isisin vastaiseen taisteluun kouluttamalla Irakin hallituksen joukkoja.;142|kommentti;143|Parantumattomasti sairaalla on oltava oikeus avustettuun kuolemaan.;143|kommentti;144|Terveys- ja sosiaalipalvelut on tuotettava ensijaisesti julkisina palveluina.;144|kommentti;145|Viranomaisten pit???? puuttua lapsiperheiden ongelmiin nykyist?? herkemmin.;145|kommentti;146|Vanhuksen ja h??nen omaistensa vastuuta hoitokustannuksista on lis??tt??v??.;146|kommentti;147|Kansalaisten oikeus terveyspalveluihin on t??rke??mp???? kuin kuntien itsehallinto.;147|kommentti;148|Ilmastonmuutoksen hillitseminen pit???? asettaa teollisuuden kilpailukyvyn edelle.;148|kommentti;149|Geenimuunneltu ruoka on turvallista ihmiselle ja ymp??rist??lle.;149|kommentti;150|Suomen pit???? ottaa suurempi vastuu EU:n alueelle tulevista turvapaikanhakijoista.;150|kommentti;151|On aika luopua ajatuksesta, ett?? koko Suomi on pidett??v?? asuttuna.;151|kommentti;152|Peruskoulun opetusryhmien koko on rajattava lailla esimerkiksi 20 oppilaaseen.;152|kommentti;201|Suomen Nato-j??senyydest?? on j??rjestett??v?? kansan????nestys.;201|kommentti;244|Hyv??ksyt????n periaatep????t??s uuden ydinvoimalaitosyksik??n rakentamisesta.;244|kommentti;245|Tuloveroa alennetaan tasaisesti kaikissa tuloluokissa talouden elvytt??miseksi.;245|kommentti;246|Edellisen eduskunnan hyv??ksym?? lainmuutos samaa sukupuolta olevien avioliiton sallimisesta peruutetaan.;246|kommentti;247|Mietojen viinien ja vahvojen oluiden myynti ruokakaupassa sallitaan.;247|kommentti;248|Ruotsin kielen opiskelu muutetaan vapaaehtoiseksi.;248|kommentti;153|Helsingin seudulla pit???? ottaa k??ytt????n ruuhkamaksut.;153|kommentti;159|Helsingin seudulla pit???? ottaa k??ytt????n ruuhkamaksut.;159|kommentti;162|Valtatie kahdeksan perusparannus on kiireellisempi hanke kuin  Salo-Lohja-Espoo-oikoradan toteuttaminen.;162|kommentti;165|Kanta- ja P??ij??t-H??meen eriytyminen sotealueina merkitsee samalla muunkin maakuntien v??lisen yhteisty??n murentumista.;165|kommentti;168|Pirkanmaalle tarvitaan puolet v??hemm??n kuntia kuin nykyisin.;168|kommentti;171|Satakunnan pit???? jatkossakin s??ily?? omana vaalipiirin????n, vaikka kansanedustajam????r?? on pudonnut kahdeksaan.;171|kommentti;174|Talvivaaran toimintaa pit???? jatkaa valtiollisena yhti??n??, ellei muita sijoittajia l??ydy.;174|kommentti;177|Ven??l??isten viisumivapaudesta olisi enemm??n haittaa kuin hy??ty??.;177|kommentti;180|Vaalipiirin toisen asteen oppilaitoksia ja lukioita on varaa v??hent????, kunhan koulutus turvataan kohtuullisen matkan p????ss??.;180|kommentti;183|S????nn??llinen lentoliikenne Vaasan vaalipiiriss?? pit???? keskitt???? Vaasan lentoasemalle.;183|kommentti;186|Kemihaaraan pit???? rakentaa tulvansuojeluallas.;186|kommentti;189|Akateemisia ty??tt??mi?? on alettava Keski-Suomessa kouluttaa yritt??j??ksi valtion rahoituksella.;189|kommentti;198|Valtion tulee lis??t?? tukensa merenkululle.;198|kommentti;154|Kuntaliitoksiin perustuva Suur-Helsinki on parempi vaihtoehto kuin itsen??isten kuntien yhteinen metropolihallinto.;154|kommentti;160|Uudenmaan tiet on kunnostettava ennen kuin uusia ratayhteyksi?? it????n tai l??nteen rakennetaan.;160|kommentti;164|Varsinais-Suomen kuntien lukum????r???? pit???? supistaa. Erityisesti keskuskaupunki. Turun elinvoimaisuus on turvattava liitosratkaisuin.;164|kommentti;167|Entist?? suurempi osa kirjaston palveluista tulee tehd?? maksullisiksi.;167|kommentti;169|Tampereen korkeakoulut pohtivat yhdistymist??: lakia pit??isi muuttaa siten, ett?? yhdistyminen on mahdollista.;169|kommentti;172|Satakuntaan pit??isi muodostaa seuraavalla vaalikaudella nelj?? isoa kaupunkia Porin, Rauman, Kankaanp????n ja Huittisten ymp??rille, koska pikkukunnat eiv??t ole elinvoimaisia.;172|kommentti;175|Rosatom on velvoitettava ty??llist??m????n my??s paikallisia, jos Pyh??joen ydinvoimalahanke toteutuu.;175|kommentti;178|Kaakkois-Suomeen riitt???? yksi vahva ammattikorkeakoulu ja yksi vahva yliopisto.;178|kommentti;181|Pohjois-Savon ja Pohjois-Karjalan maakuntarajan tarpeellisuutta pit??isi tarkastella tulevalla vaalikaudella.;181|kommentti;184|Tuulivoimapuistoja pit??isi sijoittaa my??s rannikolle.;184|kommentti;187|Lapista pit???? rakentaa rautatieyhteys j????merelle Norjan kautta.;187|kommentti;190|L????k??ripulan helpottamiseksi suomalaisen koulutuksen saanut l????k??ri on velvoitettava ty??skentelem????n tietty ajanjakso julkisessa terveydenhuollossa valmistumisensa j??lkeen.;190|kommentti;199|Ahvenanmaan tulee saada oma verotusoikeus.;199|kommentti;155|Guggenheim-museon saaminen Helsinkiin on koko Suomen etu.;155|kommentti;161|Suuret kuntaliitokset ovat parempi vaihtoehto kuin itsen??isten kuntien yhteinen metropolihallinto.;161|kommentti;163|Merimetso- ja hyljekantojen rajoittamista tulisi helpottaa esimerkiksi viranomaistoimin.;163|kommentti;166|H??meess?? Lahden etel??inen keh??tie pit???? asettaa valtion tiehankkeista etusijalle kymppitien ja valtatie 12:n parantamiseen n??hden.;166|kommentti;170|Delfinaariotoiminta pit??isi kielt???? Suomessa lailla.;170|kommentti;173|Valtion pit???? tukea Porin ja Helsingin v??list?? lentoliikennett?? maksamalla puolet reitin kustannuksista.;173|kommentti;176|Kollajan allas pit??isi rakentaa.;176|kommentti;179|Norppaa suojellaan jo liikaa.;179|kommentti;182|It??-Suomen lentoasemaverkosto on turvattava nykyisen laajuisena yhteiskunnan tuella, jos se muuten on tappiollista.;182|kommentti;185|Vaasan vaalipiiriss?? tarvitaan lis???? kuntaliitoksia.;185|kommentti;188|Lappia on kehitetty liikaa matkailun ja luontaistalouden ehdoilla ja muut elinkeinot ovat j????neet liian v??h??lle huomiolle.;188|kommentti;191|Toimet turpeen energiank??yt??n lopettamiseksi on k??ynnistett??v?? alkavalla hallituskaudella.;191|kommentti;200|Ahvenanmaalaisilla on pienet mahdollisuudet vaikuttaa asioihinsa eduskunnan kautta.;200|kommentti;205|Valtion pit???? antaa Helsingille erityistukea maahanmuuttajien kotouttamiseen.;205|kommentti;207|Uudellamaalla on liikaa pieni?? sairaaloita. Hoitoa pit??isi keskitt???? suurempiin yksik??ihin.;207|kommentti;209|Tuulivoiman rakentamisen esteit?? tulee poistaa muun muassa meluvaatimuksia lievent??m??ll??.;209|kommentti;211|Valtion on l??hdett??v?? mukaan omistajaksi Rauman telakalle ensi vaalikaudella, koska valtio on tukenut my??s Turun telakkaa.;211|kommentti;213|Manner-Suomessa monet kunnat yhdistyv??t. My??s Ahvenanmaalle riitt??isi pienempi m????r?? kuntia.;213|kommentti;215|Valtion toimintoja pit???? hajasijoittaa jatkossa enemm??n Lahden seudulle kuin H??meenlinnan seudulle.;215|kommentti;217|Pirkanmaalla on suurpeto-ongelma.;217|kommentti;219|Kaksoisraiteen rakentaminen Luum??elt?? Imatralle ajaa Kaakkois-Suomen tiehankkeiden edelle.;219|kommentti;221|Kaivosteollisuutta pit??isi suitsia nykyist?? tiukemmin.;221|kommentti;223|Kaikkien pohjalaiskuntien pit??isi vastaanottaa pakolaisia.;223|kommentti;225|Bioenergian puuntarve t??ytyy kartoittaa ja energiapuun hakkuita tarvittaessa rajoittaa metsien monimuotoisuuden s??ilytt??miseksi.;225|kommentti;227|Kasitien parantaminen on Oulun vaalipiirin t??rkein tiehanke ensi vaalikaudella ydinvoimalasuunnitelmien takia.;227|kommentti;229|Alkuper??iskansojen oikeuksia koskeva ILO-sopimus pit???? ratifioida.;229|kommentti;206|Laitospaikka on yksin??iselle helsinkil??isvanhukselle parempi vaihtoehto kuin kotihoito.;206|kommentti;208|Valtion pit???? velvoittaa kunnat ottamaan tasapuolisesti kiinti??pakolaisia.;208|kommentti;210|Rajavartiolaitoksen merelliset toiminnot keskitet????n ty??llisyys-, s????st??- ja tehostamistoimenpiteen?? Turkuun.;210|kommentti;212|Satakuntalaiset kansanedustajat ovat onnistuneet hyvin maakunnan edunvalvonnassa vaalikaudella 2011-2015.;212|kommentti;214|Merimetson ja hylkeen mets??stys tulee vapauttaa Ahvenanmaalla.;214|kommentti;216|V??yl??rahoitusta tulee siirt???? rautatieliikenteest?? teiden kunnossapitoon.;216|kommentti;218|Kyl??/l??hikoulu on jokaisen pirkanmaalaislapsen perusoikeus.;218|kommentti;220|Valtion pit??isi tukea rahallisesti enemm??n Kaakkois-Suomessa pk-yrityksi?? kuin suurteollisuutta.;220|kommentti;222|Kuntaliitoksia tarvitaan alueella lis???? vahvojen keskusten muodostumiseksi.;222|kommentti;224|Maatalouden tukia pit???? suunnata entist?? suuremmille ja harvemmille tiloille.;224|kommentti;226|Tienpidon m????r??rahat on Keski-Suomessa suunnattava seuraavalla vaalikaudella alemmalle tieverkolle biotalouden tukemiseksi.;226|kommentti;228|29 kuntaa Pohjois-Pohjanmaalla ja kahdeksan kuntaa Kainuussa on selv??sti liian paljon.;228|kommentti;230|Kemi-Tornio-aluetta ei ole kohdeltu Rovaniemen seutuun verrattuna tasapuolisesti.;230|kommentti;231|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;231|kommentti;232|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;232|kommentti;233|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;233|kommentti;234|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;234|kommentti;235|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;235|kommentti;236|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;236|kommentti;237|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;237|kommentti;238|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;238|kommentti;239|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;239|kommentti;240|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;240|kommentti;241|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;241|kommentti;242|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;242|kommentti;243|Jokeri-kysymys:  Vaalilupauksista t??ytyy pit???? kiinni.;243|kommentti

    private static void tokatehtava(Scanner s) throws FileNotFoundException{
        System.out.println("Mit?? tiesostoa luetaan? (tai paina enter)");
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
        
        System.out.println("Tilastoja lukum????rist??\n" +
                            "  vastaajia: "+lista.size()+"\n" +
                            "  valittuja: "+valittuja+"\n" +
                            "  ei-valittuja: "+ (lista.size()-valittuja) +"\n\n" +
                            "Tilastoja perusteluista\n" +
                            "  lyhin perustelu: "+lyhinp+"\n" +
                            "  lyhimm??n perustelun pituus: "+lyhinp.length()+"\n" +
                            "  keskim????r??isen perustelun pituus: "+ka);        
        System.out.println();
        
        
        
        HashMap<String, Integer> map = new HashMap<>();
        
        lista.stream().map(rivi -> rivi.split(";")[13]).forEach(p -> {
            p = p.toLowerCase().replaceAll("[?.,!]", " ");
            String[] sanat = p.split(" ");
            Arrays.stream(sanat).forEach(s -> map.put(s, map.getOrDefault(s, 0)+1));
        });
        
        System.out.println("Yleisimm??t sanat");
        
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
            if(rivi.contains("mielt??")){
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
        
        System.out.println("Yleisimm??t sanaparit");
        
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
