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

    boolean unclick = false;
    int operacion;

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
    private Button bt1;
    @FXML
    private Button bt2;
    @FXML
    private Button bt3;
    @FXML
    private Button bt4;
    @FXML
    private Button bt5;
    @FXML
    private Button bt6;
    @FXML
    private Button bt7;
    @FXML
    private Button bt8;
    @FXML
    private Button bt9;
    @FXML
    private Button bt0;

    @FXML
    private void botonmas(ActionEvent evento) {

        resultado.setText(tfuno.getText());
        tfuno.setText("0");
        operacion=1;
        if (unclick == true) {
            
            unclick = false;
        }
        unclick = true;
    }

    @FXML
    private void botonmenos(ActionEvent evento) {

        resultado.setText(tfuno.getText());
        tfuno.setText("0");
        operacion=2;
        if (unclick == true) {
            
            unclick = false;
        }
        unclick = true;
    }

    @FXML
    private void botonpor(ActionEvent evento) {

        resultado.setText(tfuno.getText());
        tfuno.setText("0");
        operacion=3;
        if (unclick == true) {
            
            unclick = false;
        }
        unclick = true;
    }

    @FXML
    private void botondiv(ActionEvent evento) {

        resultado.setText(tfuno.getText());
        tfuno.setText("0");
        operacion=4;
        if (unclick == true) {
            
            unclick = false;
        }
        unclick = true;
    }

    @FXML
    private void boton1(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("1");
        } else {
            tfuno.appendText(String.valueOf(1));
        }
    }

    @FXML
    private void boton2(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("2");
        } else {
            tfuno.appendText(String.valueOf(2));
        }
    }

    @FXML
    private void boton3(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("3");
        } else {
            tfuno.appendText(String.valueOf(3));
        }
    }

    @FXML
    private void boton4(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("4");
        } else {
            tfuno.appendText(String.valueOf(4));
        }
    }

    @FXML
    private void boton5(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("5");
        } else {
            tfuno.appendText(String.valueOf(5));
        }
    }

    @FXML
    private void boton6(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("6");
        } else {
            tfuno.appendText(String.valueOf(6));
        }
    }

    @FXML
    private void boton7(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("7");
        } else {
            tfuno.appendText(String.valueOf(7));
        }
    }

    @FXML
    private void boton8(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("8");
        } else {
            tfuno.appendText(String.valueOf(8));
        }
    }

    @FXML
    private void boton9(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("9");
        } else {
            tfuno.appendText(String.valueOf(9));
        }
    }

    @FXML
    private void boton0(ActionEvent evento) {
        if ("0".equals(tfuno.getText())) {
            tfuno.setText("0");
        } else {
            tfuno.appendText(String.valueOf(0));
        }
    }

    @FXML
    private void botonigual(ActionEvent evento) {

 
            if (operacion == 1) {
                double resul = Double.parseDouble(tfuno.getText()) + Double.parseDouble(resultado.getText());
                resultado.setText(String.valueOf(resul));
            }
            if (operacion == 2) {
                double resul = Double.parseDouble(resultado.getText()) - Double.parseDouble(tfuno.getText());
                resultado.setText(String.valueOf(resul));
            }
            if (operacion == 3) {
                double resul = Double.parseDouble(tfuno.getText()) * Double.parseDouble(resultado.getText());
                resultado.setText(String.valueOf(resul));
            }
            if (operacion == 4) {
                double result =  Double.parseDouble(resultado.getText()) / Double.parseDouble(tfuno.getText());
                resultado.setText(String.valueOf(result));
            }
            
            if (operacion !=0) tfuno.setText("0");
            else operacion=0;
        
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
