
import buissnessObjects.Vertragspartner;
import buissnessObjects.Ware;
import dao.VertragspartnerDao;
import dao.WareDAO;

import java.sql.SQLException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        VertragspartnerDao vertragspartnerDao = new VertragspartnerDao();
        ArrayList<Vertragspartner> vertragspartnerListe = vertragspartnerDao.read();
        System.out.println(vertragspartnerListe);

        WareDAO wareDAO = new WareDAO();
        ArrayList<Ware> warenListe = wareDAO.read();
        System.out.println(warenListe);

    }
}