public class test {
    public static void main(String[] args) throws KeinBenzinExeption, FalscheKlasseExeption, KeinPlatzExeption {

        Adresse ad1 = new Adresse("Hauptstr", "6", "28239", "Bremen");
        Fahrer f1 = new Fahrer("Heinz", "Müller", "A1", "10", ad1);
        Auto a1 = new Auto("Mercedes", 0, "B", f1, 2, "Nein");


        try {
            a1.einsteigenLassen(1);
            System.out.println(a1.getSitzplaetze());
        }
        catch(KeinPlatzExeption e) {
            System.out.println(e.getMessage());

            System.out.println(a1.getSitzplaetze());
        }

       try {
           a1.fahren();
           System.out.println(a1.getTreibstoff());
       }
catch(KeinBenzinExeption e) {
    System.out.println(e.getMessage());

    System.out.println(a1.getTreibstoff());
}


        try {
            a1.fahren();
            System.out.println(a1.getTreibstoff());
        }
        catch(KeinBenzinExeption e) {
            System.out.println(e.getMessage());
            System.out.println(a1.getTreibstoff());
       }

        try {
            a1.fahren();
            System.out.println(a1.getTreibstoff());
        }
        catch(KeinBenzinExeption e) {
            System.out.println(e.getMessage());
            System.out.println(a1.getTreibstoff());
    }}}


