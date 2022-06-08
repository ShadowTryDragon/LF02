package dao;

import buissnessObjects.Artikel;

import java.sql.*;

public class artikelDAO {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:CDs/src/data/Artikel.db";
    Connection connection;

    public artikelDAO() throws ClassNotFoundException {
        Class.forName(CLASSNAME);
    }

    /**
     * Liest einen Vertragspartner auf Basis seiner Ausweisnummer
     *
     * @param artikelNr die Ausweisnummer
     * @return Der gewünschte Vertragspartner
     */
    public Artikel read(String artikelNr) {
        Artikel artikel = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        // Verbindung zu Datenbank herstellen
        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);

            //SQL-Abfrage erstellen
            String sql = "SELECT * FROM vertragspartner WHERE artikelNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, artikelNr);

            //SQL-Abfrage ausführen
            ResultSet resultSet = preparedStatement.executeQuery();

            //Zeiger auf den ersten Datensatz setzen
            resultSet.next();

            //ResultSet auswerten
            artikel = createObject(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();

            } catch (SQLException e) {
                e.printStackTrace();
            }
            return artikel;

        }


    }
    private Artikel createObject(ResultSet resultSet) throws SQLException {
        String nr = resultSet.getString("ArtikelNr");
        String bezeichnung = resultSet.getString("Bezeichnung");
        double preis = resultSet.getDouble("Preis");
        int bewertung = resultSet.getInt("Bewertung");

        Artikel artikel = new Artikel(nr, bezeichnung,preis,bewertung);
        return artikel;

}
    public void  delete(String nr) {
        connection = null;
        PreparedStatement preparedStatement = null;



        try {
            connection = DriverManager.getConnection(CONNECTIONSTRING);
            String sql = "DELETE FROM vertragspartner WHERE artikelNr = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, nr);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            }
            catch(SQLException e) {
                e.printStackTrace();
            }

        }
    }

}
