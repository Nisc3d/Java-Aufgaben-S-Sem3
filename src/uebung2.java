import java.sql.*;

public class uebung2 {

    public static void main(String[] args) {
        try {

            double durchschnittsnote = 0;
            int lauf = 0;
            Connection Verbindung;
            Statement Abfrage;
            String db = "jdbc:mysql://localhost:3306/notenverwaltung";
            String user = "root";
            String pw = "";
            String SQLString = "select note from klausurstudent;";
            Verbindung = DriverManager.getConnection(db, user, pw);
            Abfrage = Verbindung.createStatement();
            ResultSet rs = Abfrage.executeQuery(SQLString);
//            System.out.println(rs);
            while (rs.next()) {
                durchschnittsnote = rs.getDouble(1) + durchschnittsnote;
                lauf += 1;
            }
            durchschnittsnote = durchschnittsnote / lauf;
            System.out.println("Durschschnittsnote: " + durchschnittsnote);


        } catch (Exception Fehler) {
            System.out.println("Fehler im Programm: ");
            System.out.println(Fehler.toString());
            System.exit(0);
        }
    }
}
