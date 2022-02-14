public class program {

    public static void main(String[] args) throws BetragNichtKorrektException, KreditLimitUeberschreibenException {


        Betreuer betreuer = new Betreuer("Yechan","Baek");
        Betreuer betreuer2 = new Betreuer("Yechan","Baek");
        Kunde kunde2 = new Kunde(betreuer2,"Max","Raber" );
        Kunde kunde = new Kunde(betreuer,"Yechan","Baek");
        Girokonto g1 = new Girokonto(kunde,0,50,50);
        Girokonto g2 = new Girokonto(kunde2,4,50,4);
     g1.setKontoStand(50000);
g2.setKontoStand(5000);


        System.out.println("[Hallo]");
        System.out.println(kunde.getVorname());
        System.out.println(kunde.getNachname());
        System.out.println(kunde.getAdresse());

        try {
            g1.einzahlen(5000);

        }
        catch (BetragNichtKorrektException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());
        try {
            g1.ueberweisen(1,g1);

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());

        try {
            g1.auszahlen(1);

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());

        try {
            g1.einzahlen(0);

        }
        catch (BetragNichtKorrektException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());

        try {
            g1.auszahlen(51);

        }
        catch (KreditLimitUeberschreibenException e ) {
            System.out.println(e.getMessage());}
        System.out.println(g1.getKontoStand());
    }

    }
