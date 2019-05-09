/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplebasededatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author ruben
 */
public class SimpleBasedeDatos {

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here

        //1. crear conexion
        Connection miconexion = null;

        String url = "jdbc:sqlite:c:\\sqlite\\bd\\ejemplo.db";
        miconexion = DriverManager.getConnection(url);
        if (miconexion != null) {
            System.out.println("Conectado");
            //return conexion;
        }
        //2. crear statement
        Statement miStatement = miconexion.createStatement();

        //ejecutar sentencias sql
        PreparedStatement ps;
        ps = miconexion.prepareStatement("CREATE TABLE IF NOT EXISTS HOLA(ID NUMBER, NOMBRE VARCHAR2(20))");
        ps.executeUpdate();

        ps = miconexion.prepareStatement("INSERT INTO HOLA VALUES(1,'RUBEN')");
        ps.executeUpdate();

        ps = miconexion.prepareStatement("INSERT INTO HOLA VALUES(2,'ANTONIO')");
        ps.executeUpdate();

        ps = miconexion.prepareStatement("INSERT INTO HOLA VALUES(3,'LUIS')");
        ps.executeUpdate();

        ResultSet miResultSet = miStatement.executeQuery("SELECT * FROM HOLA");

        //recorrer la tabla
        while (miResultSet.next()) {
            System.out.println(miResultSet.getString("NOMBRE"));
        }
    }

}
