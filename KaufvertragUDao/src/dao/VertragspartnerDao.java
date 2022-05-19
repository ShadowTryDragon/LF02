package dao;

import buissnessObjects.Adresse;
import buissnessObjects.Vertragspartner;

import java.sql.*;
import java.util.ArrayList;

public class VertragspartnerDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:VertragspartnerUDao/src/data/Kaufvertrag.db";

    public VertragspartnerDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
// Verbindung zu Datenbank herstellen
    }
    public Vertragspartner read(String ausweisNr) {
        Vertragspartner vertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
// Abfrage erstellen
            String sql = "SELECT * From Vertragspartner WHERE ausweisNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, ausweisNr);
            // SQL ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();
            // resultSet Auswerten
            String nr = resultSet.getString("ausweisNr");
            String vorname = resultSet.getString("Vorname");
            String nachname = resultSet.getString("Nachname");
            String strasse = resultSet.getString("Strasse");
            String hausNr = resultSet.getString("hausNr");
            String plz = resultSet.getString("plz");
            String ort = resultSet.getString("ort");
            // Vertragspartner erstellen
            vertragspartner = new Vertragspartner(vorname, nachname);
            vertragspartner.setAusweisNr(nr);
            Adresse adresse = new Adresse(strasse,hausNr,plz,ort);
            vertragspartner.getAdresse(adresse);



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return  vertragspartner;
        }
    }
    public ArrayList<Vertragspartner> read() {
        ArrayList<Vertragspartner> alleVertragspartner = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);


            // SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner";
            preparedStatement = connection.prepareStatement(sql);

            //SQL-Abfrage ausführen & ArrayList erstellen
            ResultSet resultSet = preparedStatement.executeQuery();
            alleVertragspartner= new ArrayList<>();

            // Zeiger auf den ersten Datensatz setzen
            // ResultSet auswerten
            while (resultSet.next()) {

                String nr = resultSet.getString("ausweisNr");
                String vorname = resultSet.getString("vorname");
                String nachname = resultSet.getString("nachname");
                String strasse = resultSet.getString("strasse");
                String hausNr = resultSet.getString("hausNr");
                String plz = resultSet.getString("plz");
                String ort = resultSet.getString("ort");

                // Vertragspartner erstellen
                Vertragspartner vertragspartner = new Vertragspartner(vorname, nachname);
                vertragspartner.setAusweisNr(nr);
                Adresse adresse = new Adresse(strasse, hausNr, plz, ort);
                vertragspartner.setAdresse(adresse);
                alleVertragspartner.add(vertragspartner);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();

            }
        }

        return alleVertragspartner;
    }
}
