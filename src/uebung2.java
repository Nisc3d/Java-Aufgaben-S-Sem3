import java.sql.*;

public class uebung2 {

    public static void main(String[] args) {
        try {

            double durchschnittsnote = 0;
            int[] noten = new int[6];
            int lauf = 0;
            Student[] studenten = new Student[100];
            Connection Verbindung;
            Statement Abfrage;
            String db = "jdbc:mysql://localhost:3306/notenverwaltung";
            String user = "root";
            String pw = "";
//            String SQLString = "select * from klausurstudent";

            Verbindung = DriverManager.getConnection(db, user, pw);
            PreparedStatement statement = Verbindung.prepareStatement("SELECT note from klausurstudent where martikelnr = ?;");
            statement.setString(1, "12345");
            ResultSet rs = statement.executeQuery();
//            Abfrage = Verbindung.createStatement();
//            ResultSet rs = Abfrage.executeQuery(SQLString);
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

//            while (rs.next()) {
//                if (lauf == 0) {
//                    studenten[lauf] = new Student();
//                    studenten[lauf].martikelnr = (int) rs.getDouble(1);
//                    studenten[lauf] = new Student();
//                    studenten[lauf].durchschnittsnote = rs.getDouble(3) + studenten[lauf].durchschnittsnote;
//                    lauf += 1;
//                }
//                else {
//                    if (studenten[lauf - 1].martikelnr != rs.getDouble(1)) {
//                        studenten[lauf] = new Student();
//                        studenten[lauf].martikelnr = (int) rs.getDouble(1);
//                        studenten[lauf].durchschnittsnote = rs.getDouble(3) + studenten[lauf].durchschnittsnote;
//                        lauf += 1;
//                    }
//                    else{
//                        studenten[lauf-1].durchschnittsnote = rs.getDouble(3) + studenten[lauf].durchschnittsnote;
//                        lauf += 1;
//                    }
//                }
//            }
//            int alterlauf = lauf;
//            lauf = 0;
//            while (lauf <= studenten.length) {
//                studenten[lauf].durchschnittsnote = studenten[lauf].durchschnittsnote / alterlauf;
//                lauf += 1;
//            }
            while (rs.next()){
                durchschnittsnote = rs.getDouble(1) + durchschnittsnote;
                lauf += 1;
            }
            durchschnittsnote = durchschnittsnote / lauf;
            System.out.println("Durschschnittsnote: " + durchschnittsnote);

        } catch (Exception Fehler) {
            Fehler.printStackTrace();
            System.exit(0);
        }
    }
}
