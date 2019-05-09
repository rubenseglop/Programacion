/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibasededatos;

import java.net.URL;
import java.sql.Connection;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import static mibasededatos.Base.*;

/**
 *
 * @author ruben
 */
public class FXMLDocumentController implements Initializable {

    Connection conexion;
    @FXML
    private Label label;

    @FXML
    private TextField tTabla;

    @FXML
    private TextField tTupla;
    @FXML
    private TextField tTupla1;

    @FXML
    private Button consulta;

    @FXML
    private TextArea logs;

    @FXML
    private TextArea tablas;

    @FXML
    private void conectar(ActionEvent event) {

        logs.appendText("\nConectando a base de datos...");
        //String url = "C:\\sqlite\\bd\\ejemplo.db";
        String url = "";
        conexion = Base.conectar(url);
        if (conexion != null) {
            label.setText("Conectado");
            logs.appendText("\nConectado correctamente");

        } else {
            label.setText("Error");
            logs.appendText("\nUps, hubo un error al conectarse");
        }

    }

    @FXML
    private void desconectar(ActionEvent event) {
        label.setText("Desconectado");
        Base.cerrarConexion(conexion);
        logs.appendText("\nSe a desconectado de la base de datos.");
        conexion = null;
    }

    @FXML
    private void ctabla(ActionEvent event) {
        String cadena = tTabla.getText();
        if (cadena != "") {

            // SQL statement for creating a new table
            /*String creaTabla = "CREATE TABLE IF NOT EXISTS " + cadena + " (\n"
                    + "	id integer PRIMARY KEY,\n"
                    + "	name text NOT NULL,\n"
                    + "	capacity real\n"
                    + ");";*/
            String creaTabla = "CREATE TABLE IF NOT EXISTS " + cadena + " (\n"
                    + "	id integer PRIMARY KEY,\n"
                    + "	name text NOT NULL\n"
                    + ");";

            if (conexion != null) {

                logs.appendText("\n" + creaTabla);
                crearTabla(conexion, creaTabla);
            } else {
                logs.appendText("\nNo hay conexión. Dale a conectar");
            }
        } else {
            logs.appendText("Error: debes introducir un nombre de tabla en el campo tabla");
        }
    }

    @FXML
    private void btabla(ActionEvent event) {

        String eliminaTabla = "DROP TABLE IF EXISTS " + tTabla.getText();

        if (conexion != null) {

            logs.appendText("\n" + eliminaTabla);
            crearTabla(conexion, eliminaTabla);
        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }
    }

    @FXML
    private void insert(ActionEvent event) {

        String insertaTabla = "INSERT INTO " + tTabla.getText() + " VALUES(?,?)";
        
        

        System.out.println(insertaTabla);

        if (conexion != null) {

            logs.appendText("\n" + insertaTabla);
            insertar(conexion, insertaTabla, tTupla.getText(), tTupla1.getText());
            
            //insertar(conexion, insertaTabla, tTupla.getText(), tTupla1.getText());
        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }
    }

    @FXML
    private void delete(ActionEvent event) {
        String borraEnTabla = "DELETE FROM "+tTabla.getText()+" WHERE id = ?";
        

        if (conexion != null) {

            logs.appendText("\n" + borraEnTabla);
            borrar(conexion, borraEnTabla, tTupla.getText());
        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }
    }

    @FXML
    private void consulta(ActionEvent event) {
        String consultaTabla = "SELECT * FROM " + tTabla.getText();
        if (conexion != null) {

            logs.appendText("\n" + consultaTabla);

            System.out.println(consultaTabla);
            //String imprimirConsulta = imprimirConsulta(consulta(conexion, consultaTabla));
             
           
        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
