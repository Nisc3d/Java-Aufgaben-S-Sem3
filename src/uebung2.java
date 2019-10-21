import java.sql.*;

public class uebung2 {

    public static void main(String[] args) {
        try {

            double durchschnittsnote = 0;
            int[] noten = new int[6];
            int lauf = 0;
            Connection Verbindung;
            Statement Abfrage;
            String db = "jdbc:mysql://localhost:3306/notenverwaltung";
            String user = "root";
            String pw = "";
            String SQLString = "select note from klausurstudent where " ;
            Verbindung = DriverManager.getConnection(db, user, pw);
            Abfrage = Verbindung.createStatement();
            ResultSet rs = Abfrage.executeQuery(SQLString);
//            while (rs.next()) {
//                durchschnittsnote = rs.getDouble(3) + durchschnittsnote;
//                lauf += 1;
//            }
//            durchschnittsnote = durchschnittsnote / lauf;

//            while (rs.next()) {
//                for (int i = 1; i <= 10; i++) {
//                    if (rs.getInt(3) == i) {
//                        noten[i] += 1;
//                    }
//                }
//            }

//            System.out.println("Durschschnittsnote: " + durchschnittsnote);

//            for (int i = 0; i < noten.length; i++) {
//                System.out.println("Häufigkeit Note " + i + ": " + noten[i]);
//            }


        } catch (Exception Fehler) {
            System.out.println("Fehler im Programm: ");
            System.out.println(Fehler.toString());
            System.exit(0);
        }
    }
}
