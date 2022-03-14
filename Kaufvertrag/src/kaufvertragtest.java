public class kaufvertragtest {
    public static void main(String[] args) {
        {
            Vertragspartner v1 = new Vertragspartner("Ulf", "Rabuu", "3211");
            Adresse2 a1 = new Adresse2("Holzstr", "5a", "2312", "Teststadt");
            Vertragspartner v2 = new Vertragspartner("Hans", "Müller", "3123");
            Adresse2 a2 = new Adresse2("Hochstr", "2b", "2312", "Teststadt");
            v1.setAdresse(a1);
            v2.setAdresse(a2);
        }}




    }

