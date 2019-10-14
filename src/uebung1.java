import java.sql.*;

public class uebung1 {

    public static void main(String[] args) {
        try {
            Connection Verbindung;
            Statement Abfrage;
            String db = "jdbc:mysql://localhost:3306/notenverwaltung";
            String user = "root";
            String pw = "";
            String SQLString = "select * from studierende where martikelnr <= 55555;";
            Verbindung = DriverManager.getConnection(db, user, pw);
            Abfrage = Verbindung.createStatement();
            ResultSet rs = Abfrage.executeQuery(SQLString);
//            System.out.println(rs);
            while (rs.next ()) {
                String spalte = "Martikelnr: " + rs.getString(1) + " Nachname: " + rs.getString(2) + " Vorname: " + rs.getString(3);
                System.out.println(spalte);
            }
            Verbindung.close();

        } catch (Exception Fehler){
            System.out.println("Fehler im Programm: ");
            System.out.println(Fehler.toString());
            System.exit(0);
        }
    }
}
