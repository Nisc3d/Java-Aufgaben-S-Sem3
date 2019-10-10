import java.sql.*;

public class erster_dbzugriff {
    public static void main(String[] args) {
        try {
            Connection Verbindung;
            Statement Abfrage;
            String db = "jdbc:mysql://localhost:3306/verkauf";
            String user = "root";
            String pw = "";
            String SQLString = "select * from artikel";
            Verbindung = DriverManager.getConnection(db, user, pw);
            Abfrage = Verbindung.createStatement();
            ResultSet rs = Abfrage.executeQuery(SQLString);
            System.out.println(rs);
//            while (rs.next ()) {
//                String nachname = rs.getString(1);
//                System.out.println(nachname);
//            }
            Verbindung.close();

        } catch (Exception Fehler){
            System.out.println("Fehler im Programm: ");
            System.out.println(Fehler.toString());
            System.exit(0);
        }
    }
}