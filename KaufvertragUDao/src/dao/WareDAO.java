
package dao;

import buissnessObjects.Ware;

import java.sql.*;

public class WareDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KaufvertragUDao/src/data/kaufvertrag.db";

    public WareDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);

    }

    public Ware read(String bezeichnung) {
        Ware ware = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {

            connection = DriverManager.getConnection(CONNECTIONSTRING);
            //Abfrage erstellen
            String sql = "SELECT * From Ware WHERE bezeichnung = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, bezeichnung);
            // SQL ausführen
            ResultSet resultSet = preparedStatement.executeQuery();
            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();
            // resultSet Auswerten
            String wnr = resultSet.getString("WarenNr");
            String beschreibung = resultSet.getString("Beschreibung");
            double preis = resultSet.getDouble("Preis");
            String besonderheiten = resultSet.getString("Besonderheiten");
            String maengel = resultSet.getString("Mängel");
            // Ware erstellen
            ware = new Ware(bezeichnung, preis);
            ware.setBezeichnung(wnr);
            ware.setPreis(preis);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return ware;
        }
    }
}









