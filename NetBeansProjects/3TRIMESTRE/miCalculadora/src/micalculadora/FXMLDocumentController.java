/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package micalculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author ruben
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button btmas;
    @FXML
    private Button btmenos;
    @FXML
    private Button btpor;
    @FXML
    private Button btdiv;
    @FXML
    private Button btigual;
    @FXML
    private TextField tfuno;
    @FXML
    private TextField tfdos;
    @FXML
    private Label resultado;

    @FXML
    private void botonmas(ActionEvent evento) {
        int resul = Integer.parseInt(tfuno.getText()) + Integer.parseInt(tfdos.getText());

        resultado.setText(String.valueOf(resul));

    }

    @FXML
    private void botonmenos(ActionEvent evento) {
        int resul = Integer.parseInt(tfuno.getText()) - Integer.parseInt(tfdos.getText());

        resultado.setText(String.valueOf(resul));

    }

    @FXML
    private void botonpor(ActionEvent evento) {
        int resul = Integer.parseInt(tfuno.getText()) * Integer.parseInt(tfdos.getText());

        resultado.setText(String.valueOf(resul));

    }

    @FXML
    private void botondiv(ActionEvent evento) {
        int dividendo = Integer.parseInt(tfdos.getText());
        if (dividendo > 0) {
            
            

            int resul = Integer.parseInt(tfuno.getText()) / Integer.parseInt(tfdos.getText());
            resultado.setText(String.valueOf(resul)); //no me hace decimales
        } else {
            resultado.setText("Error");
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
