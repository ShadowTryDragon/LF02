public class test {
    public static void main(String[] args) throws KeinBenzinExeption, FalscheKlasseExeption, SchadenExeption {

        Adresse ad1 = new Adresse("Hauptstr", "6", "28239", "Bremen");
        Fahrer f1 = new Fahrer("Heinz", "Müller", "A1", "10", ad1);
        Auto a1 = new Auto("Mercedes", "4", "B", f1, 0, "Nein");




       try {
           a1.fahren();
       }
catch(KeinBenzinExeption e) {
    System.out.println(e.getMessage());
    System.out.println(a1.getTreibstoff());
}
        a1.tanken();

        try {
            a1.fahren();
        }
        catch(KeinBenzinExeption e) {
            System.out.println(e.getMessage());
            System.out.println(a1.getTreibstoff());
       }

    }

}
