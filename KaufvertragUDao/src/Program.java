
import dao.VertragspartnerDao;


public class Program {
    public static void main(String[] args) throws ClassNotFoundException {
        VertragspartnerDao vertragspartnerDao = new VertragspartnerDao();
        System.out.println("Suche nach ausweisNr 0123");
        System.out.println(vertragspartnerDao);
    }

}