/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deprueba;

/**
 *
 * @author Ruben
 */
import java.sql.*;
import org.sqlite.SQLiteException;

public class dePrueba {

    public static void main(String[] args) throws Exception {
        Ficheros fichero=new Ficheros("c:\\sqlite\\bd\\ejemplo.db");
        fichero.eliminaArchivo();
        Class.forName("org.sqlite.JDBC");
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:c:\\sqlite\\bd\\ejemplo.db")) {

            Statement st = conn.createStatement();
            st.executeUpdate("CREATE TABLE IF NOT EXISTS PEOPLE(NAME VARCHAR(20) PRIMARY KEY, OCCUPATION VARCHAR(20));");
            System.out.println("numero lineas afectadas: " + st.executeUpdate("INSERT INTO PEOPLE VALUES ('GANDHI', 'POLITICS');")); //stat.executeUpdate devuelve 0 si da error o +1 si es correcta
            st.executeUpdate("INSERT INTO PEOPLE VALUES ('TURING', 'COMPUTERS');");
            st.executeUpdate("INSERT INTO PEOPLE VALUES ('WITTGEN', 'SMARTYPANTS');");
            //stat.executeUpdate("DROP TABLE PEOPLE;");
            // aqui pueden ir insert update delete (create drop) alter

            try (ResultSet rs = st.executeQuery("SELECT * FROM PEOPLE;")) {

                System.out.println("NAME\tOCCUPATION\n------------------");
                while (rs.next()) {
                    System.out.println(rs.getString("NAME") + "\t"
                            + rs.getString("OCCUPATION"));
                }
            }
        } catch (SQLiteException ex) {
            System.out.println("Error: " + ex);

        }
        
    }
}
