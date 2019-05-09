/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibasededatos;

import java.net.URL;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
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
    private TextField tid;
    @FXML
    private TextField tnombre;
    @FXML
    private TextField ttlf;
    @FXML
    private TextField treal;
    @FXML
    private TextArea logs;
    @FXML
    private Button conectar;
    @FXML
    private Button desconectar;
    @FXML
    private Button ctabla;
    @FXML
    private Button btabla;
    @FXML
    private Button insert;
    @FXML
    private Button delete;
    @FXML
    private Button consulta;
    @FXML
    private TableView<misDatos> tablonazo;
    @FXML
    private TableColumn id;
    @FXML
    private TableColumn nombre;
    @FXML
    private TableColumn numero;
    @FXML
    private TableColumn otronumero;

    ObservableList<misDatos> personas;
    misDatos misdatos = new misDatos("1", "2", "3", "4");

    @FXML
    private void conectar(ActionEvent event) {

        logs.appendText("\nConectando a base de datos...");
        //String url = "C:\\sqlite\\bd\\ejemplo.db";
        String url = "ejemplo.db";
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

            String creaTabla = "CREATE TABLE IF NOT EXISTS " + cadena + " (\n"
                    + "	ID VARCHAR2(2) PRIMARY KEY,\n"
                    + "	NOMBRE VARCHAR2(20),\n"
                    + "	TLF NUMERIC,\n"
                    + "	NUMEROS REAL\n"
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

        String values = " VALUES('" + tid.getText() + "','" + tnombre.getText() + "'," + ttlf.getText() + "," + treal.getText() + ");";
        String insertaTabla = "INSERT INTO " + tTabla.getText() + values;

        if (conexion != null) {

            logs.appendText("\n" + insertaTabla);
            insertar(conexion, insertaTabla);

        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }
    }

    @FXML
    private void delete(ActionEvent event) {
        String borraEnTabla = "DELETE FROM " + tTabla.getText() + " WHERE id = '" + tid.getText() + "'";

        if (conexion != null) {

            logs.appendText("\n" + borraEnTabla);
            insertar(conexion, borraEnTabla);
        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }
    }

    @FXML
    private void consulta(ActionEvent event) {
        String consultaTabla = "SELECT * FROM " + tTabla.getText();
        if (conexion != null) {

            logs.appendText("\n" + consultaTabla);

            try {
//                int rowcount = 0;
//                Base.consulta(conexion, consultaTabla).last();
//                rowcount = Base.consulta(conexion, consultaTabla).getRow();
//
//                System.out.println(rowcount);
              Base.consulta(conexion, consultaTabla).first(); 


                    logs.appendText(Base.consulta(conexion, consultaTabla).getString("ID"));
                    logs.appendText(Base.consulta(conexion, consultaTabla).getString("NOMBRE"));
                    logs.appendText(String.valueOf(Base.consulta(conexion, consultaTabla).getInt("TLF")));
                    logs.appendText(String.valueOf(Base.consulta(conexion, consultaTabla).getInt("NUMEROS")));
             

            } catch (SQLException ex) {
                Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            logs.appendText("\nNo hay conexión. Dale a conectar");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        personas = FXCollections.observableArrayList();
        tablonazo.setItems(personas);
    }

}
