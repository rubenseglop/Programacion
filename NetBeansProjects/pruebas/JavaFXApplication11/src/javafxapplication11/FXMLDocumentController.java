/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication11;

import java.awt.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

/**
 *
 * @author ruben
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private GridPane Tabla;

    @FXML
    private TextField texto;

    @FXML
    private Text uno;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }

//    public void cambio() {
//        for (int i = 0; i < 31; i++) {
//            if (Tabla.getAccessibleText() == texto.getText()) {
//                System.out.println("hola");
//            }
//
//        }
//    }
}
