/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectarbd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Ruben
 */
public class ConectarBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        conectar();

    }

    private static void conectar() {
        Connection conexion = null;
        //String url = "jdbc:oracle:thin:@localhost:1521:xe"; //Oracle
        String url = "jdbc:sqlite:c:\\sqlite\\bd\\ejemplo.db";

        try {
            //conexion = DriverManager.getConnection(url, "EXABD", "EXABD"); // Oracle
            conexion = DriverManager.getConnection(url);
            if (conexion != null) {
                System.out.println("Conectado");
                //return conexion;
            }
        } catch (SQLException ex) {
            System.out.println("Se ha producido un error:" + ex);
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

}
