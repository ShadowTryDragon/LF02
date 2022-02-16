public class program {

    public static void main(String[] args) throws BetragNichtKorrektException, KreditLimitUeberschreibenException {
Adresse adresse = new Adresse("Hauptstr","40","28239","Bremen");
Adresse adresse1 = new Adresse("Nebenstr", "50", "28239", "Bremen");

        Betreuer betreuer = new Betreuer("Yechan","Baek");
        Betreuer betreuer2 = new Betreuer("Yechan","Baek");
        Kunde kunde2 = new Kunde(betreuer2,"Max","Raber" );
        Kunde kunde = new Kunde(betreuer,"Yechan","Baek");
        Girokonto g1 = new Girokonto(kunde,0,1,50);
        Girokonto g2 = new Girokonto(kunde2,4,50,4);
     g1.setKontoStand(50000);
g2.setKontoStand(5000);
kunde.setAdresse(adresse);
kunde2.setAdresse(adresse1);



        System.out.println( kunde.getVorname() + " " +  kunde.getNachname());
        System.out.println( " Und ");
        System.out.println( kunde2.getVorname() + " " + kunde2.getNachname());
        System.out.println( " Bankverbindung wird hergestellt ");
        System.out.println("---------------------");
        System.out.println( kunde.getVorname() + " ihr Kontostand beträgt " + g1.getKontoStand());
        System.out.println(kunde2.getVorname() + " Ihr Kontostand beträgt " + g2.getKontoStand());
        System.out.println("---------------------");
        try {
            g1.einzahlen(5000);
            System.out.println(g1.getKontoStand());

        }
        catch (BetragNichtKorrektException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());

        try {
            g1.ueberweisen(1,g1);

            System.out.println(g1.getKontoStand());

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());


        try {
            g1.auszahlen(1);
            System.out.println(g1.getKontoStand());

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());


        try {
            g1.einzahlen(0);
            System.out.println(g1.getKontoStand());

        }
        catch (BetragNichtKorrektException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());


        try {
            g1.auszahlen(51);
            System.out.println(g1.getKontoStand());

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());


    }

    }
