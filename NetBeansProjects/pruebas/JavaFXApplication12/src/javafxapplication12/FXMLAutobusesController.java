/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication12;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author ruben
 */
public class FXMLAutobusesController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private Button botonurbano;

    @FXML
    private ImageView unaimagen;
    @FXML
    private ImageView dosimagen;

    @FXML
    private void clickurbano(ActionEvent evento) {
        Image imagen1 = new Image("javafxapplication12/bus/urbano.jpg");
        Image imagen2 = new Image("javafxapplication12/bus/urbano-horario.jpg");
        unaimagen.setImage(imagen1);
        dosimagen.setImage(imagen2);

    }

    @FXML
    private void clickctm(ActionEvent evento) {
        Image imagen1 = new Image("javafxapplication12/bus/ctm.jpg");
        Image imagen2 = new Image("javafxapplication12/bus/ctm-horario.jpg");
        unaimagen.setImage(imagen1);
        dosimagen.setImage(imagen2);

    }

    @FXML
    private void clickrober(ActionEvent evento) {
        Image imagen1 = new Image("javafxapplication12/bus/rober.jpg");
        Image imagen2 = new Image("javafxapplication12/bus/rober-horario.jpg");
        unaimagen.setImage(imagen1);
        dosimagen.setImage(imagen2);

    }

    @FXML
    private void clickmetro(ActionEvent evento) {
        Image imagen1 = new Image("javafxapplication12/bus/metro.jpg");
        Image imagen2 = new Image("javafxapplication12/bus/metro-horario.jpg");
        unaimagen.setImage(imagen1);
        dosimagen.setImage(imagen2);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
