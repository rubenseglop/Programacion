/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListinTelefonico;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author ruben
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private Button boton;
    @FXML
    private Button botonbus;
    @FXML
    private Button botoncorreos;
    

    @FXML
    private Text i100;
    @FXML
    private Text i101;
    @FXML
    private Text i102;
    @FXML
    private Text i103;
    @FXML
    private Text i104;
    private Text i105;
    private Text i106;
    @FXML
    private Text i107;
    @FXML
    private Text i108;
    @FXML
    private Text i109;
    @FXML
    private Text i460;
    @FXML
    private Text i461;
    @FXML
    private Text i462;
    @FXML
    private Text i463;
    @FXML
    private Text i464;
    @FXML
    private Text i465;
    @FXML
    private Text i466;
    @FXML
    private Text i467;
    @FXML
    private Text i468;
    @FXML
    private Text i469;
    @FXML
    private Text i300;
    @FXML
    private Text i301;
    @FXML
    private Text i302;
    @FXML
    private Text i303;
    @FXML
    private Text i304;
    @FXML
    private Text i305;
    @FXML
    private Text i306;
    @FXML
    private Text i307;
    @FXML
    private Text i308;
    @FXML
    private Text i309;
    @FXML
    private Text i310;
    @FXML
    private Text i200;
    @FXML
    private Text i201;
    @FXML
    private Text i202;
    @FXML
    private Text i203;
    @FXML
    private Text i204;
    @FXML
    private Text i205;
    @FXML
    private Text i206;
    private Text i207;
    @FXML
    private Text i208;
    @FXML
    private Text i209;
    private Text i210;
    private Text i211;
    private Text i212;
    private Text i213;
    @FXML
    private Text i214;
    @FXML
    private Text i215;
    @FXML
    private Text i216;
    @FXML
    private Text i333a;
    @FXML
    private Text i333b;
    @FXML
    private Text i418;
    @FXML
    private Text i110;
    @FXML
    private Text i111;
    @FXML
    private Text i400;
    @FXML
    private Text i401;
    @FXML
    private Text i402;
    @FXML
    private Text i403;
    @FXML
    private Text i404;
    @FXML
    private Text i405;
    @FXML
    private Text i406;
    private Text i407;
    @FXML
    private Text i408;
    @FXML
    private Text i409;
    @FXML
    private Text i410;
    @FXML
    private Text i411;
    private Text i412;
    @FXML
    private Text i413;
    @FXML
    private Text i414;
    @FXML
    private Text i415;
    @FXML
    private Text i416;
    @FXML
    private Text i450;
    @FXML
    private Text i451;
    @FXML
    private Text i452;
    @FXML
    private Text i453;
    @FXML
    private Text i454;
    private Text i455;
    private Text i456;
    @FXML
    private Text i457;
    @FXML
    private Text i458;
    @FXML
    private Text i459;
    @FXML
    private Text i500;
    @FXML
    private Text i501;
    @FXML
    private Text i502;
    @FXML
    private Text i503;
    @FXML
    private Text i504;
    @FXML
    private Text i512;
    @FXML
    private Text i550;
    @FXML
    private Text i551;
    @FXML
    private Text i552;
    @FXML
    private Text i553;
    @FXML
    private Text i554;
    @FXML
    private Text i555;
    @FXML
    private Text i580;
    @FXML
    private Text i581;
    @FXML
    private Text i582;
    @FXML
    private Text i540;
    @FXML
    private Text i541;
    @FXML
    private Text i542;
    @FXML
    private Text i82104;
    @FXML
    private Text i82101;
    @FXML
    private Text i560;
    @FXML
    private Text i561;
    @FXML
    private Text i562;
    @FXML
    private Text i563;
    @FXML
    private Text i564;
    @FXML
    private Text i565;
    @FXML
    private Text i570;
    @FXML
    private Text i571;
    @FXML
    private Text i572;
    @FXML
    private Text i573;
    @FXML
    private Text i574;

    @FXML
    private TextField texto;
 @FXML
 private Text uno2;
 @FXML
 private Text uno21;
 @FXML
 private Text uno211;
 @FXML
 private Text uno3112;
 @FXML
 private Text uno2111;
 @FXML
 private Text uno31;
 @FXML
 private Text uno21111;
 @FXML
 private Text uno21112;
 @FXML
 private Text uno21113;
 @FXML
 private Text uno21114;
 @FXML
 private Text uno31111111111;
 @FXML
 private Text uno211141;
 @FXML
 private Text uno2111411;
 @FXML
 private Text uno21114111;
 @FXML
 private Text uno211141111;
 @FXML
 private Text uno2111411111;
 @FXML
 private Text uno21114111111;
 @FXML
 private Text uno211141111111;
 @FXML
 private Text uno2111411111111;
 @FXML
 private Text uno21114111111111;
 @FXML
 private Text uno211141111111111;
 @FXML
 private Text uno31111111;
 @FXML
 private Text uno2111411111111111;
 @FXML
 private Text uno21114111111111111;
 @FXML
 private Text uno211141111111111111;
 @FXML
 private Text uno2111411111111111111;
 @FXML
 private Text uno21114111111111111111;
 @FXML
 private Text uno211141111111111111111;
 @FXML
 private Text uno22;
 @FXML
 private Text uno311;
 @FXML
 private Text uno222;
 @FXML
 private Text uno2221;
 @FXML
 private Text uno22211;
 @FXML
 private Text uno222111;
 @FXML
 private Text uno3111;
 @FXML
 private Text uno2221111;
 @FXML
 private Text uno22211111;
 @FXML
 private Text uno222111111;
 @FXML
 private Text uno2221111111;
 @FXML
 private Text uno22211111111;
 @FXML
 private Text uno222111111111;
 @FXML
 private Text uno2221111111111;
 @FXML
 private Text uno22211111111111;
 @FXML
 private Text uno222111111111111;
 @FXML
 private Text uno2221111111111111;
 @FXML
 private Text uno22211111111111111;
 @FXML
 private Text uno222111111111111111;
 @FXML
 private Text uno31111;
 @FXML
 private Text uno2221111111111111111;
 @FXML
 private Text uno22211111111111111111;
 @FXML
 private Text uno311111;
 @FXML
 private Text uno222111111111111111111;
 @FXML
 private Text uno3111111;
 @FXML
 private Text uno2221111111111111111111;
 @FXML
 private Text uno22211111111111111111111;
 @FXML
 private Text uno221;
 @FXML
 private Text uno3111111111;
 @FXML
 private Text uno2212;
 @FXML
 private Text uno22121;
 @FXML
 private Text uno221211;
 @FXML
 private Text uno2212111;
 @FXML
 private Text uno22121111;
 @FXML
 private Text uno221211111;
 @FXML
 private Text uno2212111111;
 @FXML
 private Text uno22121111111;
 @FXML
 private Text uno221211111111;
 @FXML
 private Text uno2212111111111;
 @FXML
 private Text uno22121111111111;
 @FXML
 private Text uno221211111111111;
 @FXML
 private Text uno2212111111111111;
 @FXML
 private Text uno22121111111111111;
 @FXML
 private Text uno22121111112;
 @FXML
 private Text uno221211111111111111;
 @FXML
 private Text uno2212111111111111111;
 @FXML
 private Text uno22121111111111111111;
 @FXML
 private Text uno221211111111111111111;
 @FXML
 private Text uno2212111111111111111111;
 @FXML
 private Text uno22121111111111111111111;
 @FXML
 private Text uno221211111111111111111111;
 @FXML
 private Text uno311111111;
 @FXML
 private Text uno22121111111111111112;
 @FXML
 private Text uno2211;
 @FXML
 private Text uno31111111112;
 @FXML
 private Text uno2212111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111;
 @FXML
 private Text uno221211111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111111;
 @FXML
 private Text uno311111111121;
 @FXML
 private Text uno221211111111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111111111;
 @FXML
 private Text uno221211111111111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111111111111;
 @FXML
 private Text uno221211111111111111111111111111111112;
 @FXML
 private Text uno3111111111211;
 @FXML
 private Text uno221211111111111111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111111111111111;
 @FXML
 private Text uno31111111112111;
 @FXML
 private Text uno221211111111111111111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111111111111111;
 @FXML
 private Text uno22121111111111111111111111111111111111111;
 @FXML
 private Text uno221211111111111111111111111111111111111111;
 @FXML
 private Text uno2212111111111111111111111111111111111111111;
 @FXML
 private Text uno311111111121111;
 @FXML
 private Text uno221211111111111111111111111111111111111112;
 @FXML
 private Text uno2212111111111111111111111111111111111111121;
 @FXML
 private Text uno22121111111111111111111111111111111111111211;
 @FXML
 private Text uno221211111111111111111111111111111111111112111;
 @FXML
 private Text uno2212111111111111111111111111111111111111121111;
 @FXML
 private Text uno22121111111111111111111111111111111111111211111;
 @FXML
 private Text uno3111111111211111;
 @FXML
 private Text uno221211111111111111111111111111111111111112111111;
 @FXML
 private Text uno2212111111111111111111111111111111111111121111111;
 @FXML
 private Text uno22121111111111111111111111111111111111111211111111;
 @FXML
 private Text uno31131;
 @FXML
 private Text uno3113;

    @FXML
    private void clickboton(ActionEvent evento) {
        try {

//Te lo comento para que  lo comprendamos tú y yo
//Léeme el source del archivo que te digo fxml y te pongo el path
            Parent root1 = FXMLLoader.load(getClass().getResource("FXMLListadoGeneral.fxml"));

//Creame un nuevo Stage o para que nos entendamos una nueva ventana windows vacía
            Stage stage = new Stage();

//Y ahora dentro del Stage me metes la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root1));

// Y ahora le digo que me muestres el stage
            stage.setResizable(false);
            stage.setTitle("Teléfonos interés general por Rubén");
            stage.getIcons().add(new Image(getClass().getResource("logo2.jpg").toExternalForm()));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    private void clickbotonbus(ActionEvent evento) {
        try {

//Te lo comento para que  lo comprendamos tú y yo
//Léeme el source del archivo que te digo fxml y te pongo el path
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLAutobuses.fxml"));

//Creame un nuevo Stage o para que nos entendamos una nueva ventana windows vacía
            Stage stage = new Stage();

//Y ahora dentro del Stage me metes la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root2));

// Y ahora le digo que me muestres el stage
            stage.setResizable(false);
            stage.setTitle("Líneas autobuses por Rubén");
            stage.getIcons().add(new Image(getClass().getResource("logo2.jpg").toExternalForm()));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @FXML
    private void clickbotoncorreo(ActionEvent evento) {
        try {

//Te lo comento para que  lo comprendamos tú y yo
//Léeme el source del archivo que te digo fxml y te pongo el path
            Parent root2 = FXMLLoader.load(getClass().getResource("FXMLCorreos.fxml"));

//Creame un nuevo Stage o para que nos entendamos una nueva ventana windows vacía
            Stage stage = new Stage();

//Y ahora dentro del Stage me metes la escena que anteriormente hemos leído y metido en root1
            stage.setScene(new Scene(root2));

// Y ahora le digo que me muestres el stage
            stage.setResizable(false);
            stage.setTitle("Correos por Rubén");
            stage.getIcons().add(new Image(getClass().getResource("logo2.jpg").toExternalForm()));
            stage.show();
        } catch (IOException ex) {
            Logger.getLogger(FXMLDocumentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    @FXML
    private void mirartexto(ActionEvent event) {
        if (texto.getText() == null || texto.getText() == "") {

        } else {
            buscaTexto(texto.getText(), i100.getText(), 100);
            buscaTexto(texto.getText(), i101.getText(), 101);
            buscaTexto(texto.getText(), i102.getText(), 102);
            buscaTexto(texto.getText(), i103.getText(), 103);
            buscaTexto(texto.getText(), i104.getText(), 104);
//        buscaTexto(texto.getText(), i105.getText(), 105);
//        buscaTexto(texto.getText(), i106.getText(), 106);
            buscaTexto(texto.getText(), i107.getText(), 107);
            buscaTexto(texto.getText(), i108.getText(), 108);
            buscaTexto(texto.getText(), i109.getText(), 109);
            buscaTexto(texto.getText(), i110.getText(), 110);
            buscaTexto(texto.getText(), i111.getText(), 111);
            buscaTexto(texto.getText(), i460.getText(), 460);
            buscaTexto(texto.getText(), i461.getText(), 461);
            buscaTexto(texto.getText(), i462.getText(), 462);
            buscaTexto(texto.getText(), i463.getText(), 463);
            buscaTexto(texto.getText(), i464.getText(), 464);
            buscaTexto(texto.getText(), i465.getText(), 465);
            buscaTexto(texto.getText(), i466.getText(), 466);
            buscaTexto(texto.getText(), i467.getText(), 467);
            buscaTexto(texto.getText(), i468.getText(), 468);
            buscaTexto(texto.getText(), i469.getText(), 469);
            buscaTexto(texto.getText(), i300.getText(), 300);
            buscaTexto(texto.getText(), i301.getText(), 301);
            buscaTexto(texto.getText(), i302.getText(), 302);
            buscaTexto(texto.getText(), i303.getText(), 303);
            buscaTexto(texto.getText(), i304.getText(), 304);
            buscaTexto(texto.getText(), i305.getText(), 305);
            buscaTexto(texto.getText(), i306.getText(), 306);
            buscaTexto(texto.getText(), i307.getText(), 307);
            buscaTexto(texto.getText(), i308.getText(), 308);
            buscaTexto(texto.getText(), i309.getText(), 309);
            buscaTexto(texto.getText(), i310.getText(), 310);
            buscaTexto(texto.getText(), i200.getText(), 200);
            buscaTexto(texto.getText(), i201.getText(), 201);
            buscaTexto(texto.getText(), i202.getText(), 202);
            buscaTexto(texto.getText(), i203.getText(), 203);
            buscaTexto(texto.getText(), i204.getText(), 204);
            buscaTexto(texto.getText(), i205.getText(), 205);
            buscaTexto(texto.getText(), i206.getText(), 206);
//        buscaTexto(texto.getText(), i207.getText(), 207);
            buscaTexto(texto.getText(), i208.getText(), 208);
            buscaTexto(texto.getText(), i209.getText(), 209);
//        buscaTexto(texto.getText(), i210.getText(), 210);
//        buscaTexto(texto.getText(), i211.getText(), 211);
//        buscaTexto(texto.getText(), i212.getText(), 212);
            buscaTexto(texto.getText(), i216.getText(), 216);
            buscaTexto(texto.getText(), i214.getText(), 214);
            buscaTexto(texto.getText(), i215.getText(), 215);
            buscaTexto(texto.getText(), i333a.getText(), 3331);
            buscaTexto(texto.getText(), i333b.getText(), 3332);
            buscaTexto(texto.getText(), i400.getText(), 400);
            buscaTexto(texto.getText(), i401.getText(), 401);
            buscaTexto(texto.getText(), i402.getText(), 402);
            buscaTexto(texto.getText(), i403.getText(), 403);
            buscaTexto(texto.getText(), i404.getText(), 404);
            buscaTexto(texto.getText(), i405.getText(), 405);
            buscaTexto(texto.getText(), i406.getText(), 406);
//        buscaTexto(texto.getText(), i407.getText(), 407);
            buscaTexto(texto.getText(), i408.getText(), 408);
            buscaTexto(texto.getText(), i409.getText(), 409);
            buscaTexto(texto.getText(), i410.getText(), 410);
            buscaTexto(texto.getText(), i411.getText(), 411);
//        buscaTexto(texto.getText(), i412.getText(), 412);
            buscaTexto(texto.getText(), i413.getText(), 413);
            buscaTexto(texto.getText(), i414.getText(), 414);
            buscaTexto(texto.getText(), i415.getText(), 415);
            buscaTexto(texto.getText(), i416.getText(), 416);
            buscaTexto(texto.getText(), i418.getText(), 418);
            buscaTexto(texto.getText(), i450.getText(), 450);
            buscaTexto(texto.getText(), i451.getText(), 451);
//        buscaTexto(texto.getText(), i451.getText(), 451);
            buscaTexto(texto.getText(), i452.getText(), 452);
            buscaTexto(texto.getText(), i453.getText(), 453);
            buscaTexto(texto.getText(), i454.getText(), 454);
//        buscaTexto(texto.getText(), i455.getText(), 455);
//        buscaTexto(texto.getText(), i456.getText(), 456);
            buscaTexto(texto.getText(), i457.getText(), 457);
            buscaTexto(texto.getText(), i458.getText(), 458);
            buscaTexto(texto.getText(), i459.getText(), 459);
            buscaTexto(texto.getText(), i500.getText(), 500);
            buscaTexto(texto.getText(), i501.getText(), 501);
            buscaTexto(texto.getText(), i502.getText(), 502);
            buscaTexto(texto.getText(), i503.getText(), 503);
            buscaTexto(texto.getText(), i504.getText(), 504);
            buscaTexto(texto.getText(), i512.getText(), 512);
            buscaTexto(texto.getText(), i550.getText(), 550);
            buscaTexto(texto.getText(), i551.getText(), 551);
            buscaTexto(texto.getText(), i552.getText(), 552);
            buscaTexto(texto.getText(), i553.getText(), 553);
            buscaTexto(texto.getText(), i554.getText(), 554);
            buscaTexto(texto.getText(), i555.getText(), 555);
            buscaTexto(texto.getText(), i580.getText(), 580);
            buscaTexto(texto.getText(), i581.getText(), 581);
            buscaTexto(texto.getText(), i582.getText(), 582);
            buscaTexto(texto.getText(), i540.getText(), 540);
            buscaTexto(texto.getText(), i541.getText(), 541);
            buscaTexto(texto.getText(), i542.getText(), 542);
            buscaTexto(texto.getText(), i82104.getText(), 82104);
            buscaTexto(texto.getText(), i82101.getText(), 82101);
            buscaTexto(texto.getText(), i560.getText(), 560);
            buscaTexto(texto.getText(), i561.getText(), 561);
            buscaTexto(texto.getText(), i562.getText(), 562);
            buscaTexto(texto.getText(), i563.getText(), 563);
            buscaTexto(texto.getText(), i564.getText(), 564);
            buscaTexto(texto.getText(), i565.getText(), 565);
            buscaTexto(texto.getText(), i570.getText(), 570);
            buscaTexto(texto.getText(), i571.getText(), 571);
            buscaTexto(texto.getText(), i572.getText(), 572);
            buscaTexto(texto.getText(), i573.getText(), 573);
            buscaTexto(texto.getText(), i574.getText(), 574);
        }

    }

    private void buscaTexto(String palabra, String buscoTexto, int ID) {

        boolean resultado = buscoTexto.contains(palabra.toUpperCase().toUpperCase());

        if (resultado) {  //palabra encontrada
            if (ID == 100) {
                i100.setFill(Color.RED);
            }
            if (ID == 101) {
                i101.setFill(Color.RED);
            }
            if (ID == 102) {
                i102.setFill(Color.RED);
            }
            if (ID == 103) {
                i103.setFill(Color.RED);
            }
            if (ID == 104) {
                i104.setFill(Color.RED);
            }
            if (ID == 105) {
                i105.setFill(Color.RED);
            }
            if (ID == 106) {
                i106.setFill(Color.RED);
            }
            if (ID == 107) {
                i107.setFill(Color.RED);
            }
            if (ID == 108) {
                i108.setFill(Color.RED);
            }
            if (ID == 109) {
                i109.setFill(Color.RED);
            }
            if (ID == 110) {
                i110.setFill(Color.RED);
            }
            if (ID == 111) {
                i111.setFill(Color.RED);
            }
            if (ID == 460) {
                i460.setFill(Color.RED);
            }
            if (ID == 461) {
                i461.setFill(Color.RED);
            }
            if (ID == 462) {
                i462.setFill(Color.RED);
            }
            if (ID == 463) {
                i463.setFill(Color.RED);
            }
            if (ID == 464) {
                i464.setFill(Color.RED);
            }
            if (ID == 465) {
                i465.setFill(Color.RED);
            }
            if (ID == 466) {
                i466.setFill(Color.RED);
            }
            if (ID == 467) {
                i467.setFill(Color.RED);
            }
            if (ID == 468) {
                i468.setFill(Color.RED);
            }
            if (ID == 469) {
                i469.setFill(Color.RED);
            }
            if (ID == 300) {
                i300.setFill(Color.RED);
            }
            if (ID == 301) {
                i301.setFill(Color.RED);
            }
            if (ID == 302) {
                i302.setFill(Color.RED);
            }
            if (ID == 303) {
                i303.setFill(Color.RED);
            }
            if (ID == 304) {
                i304.setFill(Color.RED);
            }
            if (ID == 305) {
                i305.setFill(Color.RED);
            }
            if (ID == 306) {
                i306.setFill(Color.RED);
            }
            if (ID == 307) {
                i307.setFill(Color.RED);
            }
            if (ID == 308) {
                i308.setFill(Color.RED);
            }
            if (ID == 309) {
                i309.setFill(Color.RED);
            }
            if (ID == 310) {
                i310.setFill(Color.RED);
            }
            if (ID == 200) {
                i200.setFill(Color.RED);
            }
            if (ID == 201) {
                i201.setFill(Color.RED);
            }
            if (ID == 202) {
                i202.setFill(Color.RED);
            }
            if (ID == 203) {
                i203.setFill(Color.RED);
            }
            if (ID == 204) {
                i204.setFill(Color.RED);
            }
            if (ID == 205) {
                i205.setFill(Color.RED);
            }
            if (ID == 206) {
                i206.setFill(Color.RED);
            }
            if (ID == 207) {
                i207.setFill(Color.RED);
            }
            if (ID == 208) {
                i208.setFill(Color.RED);
            }
            if (ID == 209) {
                i209.setFill(Color.RED);
            }
            if (ID == 210) {
                i210.setFill(Color.RED);
            }
            if (ID == 211) {
                i211.setFill(Color.RED);
            }
            if (ID == 212) {
                i212.setFill(Color.RED);
            }
            if (ID == 213) {
                i213.setFill(Color.RED);
            }
            if (ID == 214) {
                i214.setFill(Color.RED);
            }
            if (ID == 215) {
                i215.setFill(Color.RED);
            }
            if (ID == 216) {
                i216.setFill(Color.RED);
            }
            if (ID == 3331) {
                i333a.setFill(Color.RED);
            }
            if (ID == 3332) {
                i333b.setFill(Color.RED);
            }
            if (ID == 400) {
                i400.setFill(Color.RED);
            }
            if (ID == 401) {
                i401.setFill(Color.RED);
            }
            if (ID == 402) {
                i402.setFill(Color.RED);
            }
            if (ID == 403) {
                i403.setFill(Color.RED);
            }
            if (ID == 404) {
                i404.setFill(Color.RED);
            }
            if (ID == 405) {
                i405.setFill(Color.RED);
            }
            if (ID == 406) {
                i406.setFill(Color.RED);
            }
            if (ID == 407) {
                i407.setFill(Color.RED);
            }
            if (ID == 408) {
                i408.setFill(Color.RED);
            }
            if (ID == 409) {
                i409.setFill(Color.RED);
            }
            if (ID == 410) {
                i410.setFill(Color.RED);
            }
            if (ID == 411) {
                i411.setFill(Color.RED);
            }
            if (ID == 412) {
                i412.setFill(Color.RED);
            }
            if (ID == 413) {
                i413.setFill(Color.RED);
            }
            if (ID == 414) {
                i414.setFill(Color.RED);
            }
            if (ID == 415) {
                i415.setFill(Color.RED);
            }
            if (ID == 416) {
                i416.setFill(Color.RED);
            }
            if (ID == 418) {
                i418.setFill(Color.RED);
            }
            if (ID == 450) {
                i450.setFill(Color.RED);
            }
            if (ID == 451) {
                i451.setFill(Color.RED);
            }
            if (ID == 452) {
                i452.setFill(Color.RED);
            }
            if (ID == 453) {
                i453.setFill(Color.RED);
            }
            if (ID == 454) {
                i454.setFill(Color.RED);
            }
            if (ID == 455) {
                i455.setFill(Color.RED);
            }
            if (ID == 456) {
                i456.setFill(Color.RED);
            }
            if (ID == 457) {
                i457.setFill(Color.RED);
            }
            if (ID == 458) {
                i458.setFill(Color.RED);
            }
            if (ID == 459) {
                i459.setFill(Color.RED);
            }
            if (ID == 500) {
                i500.setFill(Color.RED);
            }
            if (ID == 501) {
                i501.setFill(Color.RED);
            }
            if (ID == 502) {
                i502.setFill(Color.RED);
            }
            if (ID == 503) {
                i503.setFill(Color.RED);
            }
            if (ID == 504) {
                i504.setFill(Color.RED);
            }
            if (ID == 512) {
                i512.setFill(Color.RED);
            }
            if (ID == 550) {
                i550.setFill(Color.RED);
            }
            if (ID == 551) {
                i551.setFill(Color.RED);
            }
            if (ID == 552) {
                i552.setFill(Color.RED);
            }
            if (ID == 553) {
                i553.setFill(Color.RED);
            }
            if (ID == 554) {
                i554.setFill(Color.RED);
            }
            if (ID == 555) {
                i555.setFill(Color.RED);
            }
            if (ID == 580) {
                i580.setFill(Color.RED);
            }
            if (ID == 581) {
                i581.setFill(Color.RED);
            }
            if (ID == 582) {
                i582.setFill(Color.RED);
            }
            if (ID == 540) {
                i540.setFill(Color.RED);
            }
            if (ID == 541) {
                i541.setFill(Color.RED);
            }
            if (ID == 542) {
                i542.setFill(Color.RED);
            }
            if (ID == 560) {
                i560.setFill(Color.RED);
            }
            if (ID == 561) {
                i561.setFill(Color.RED);
            }
            if (ID == 562) {
                i562.setFill(Color.RED);
            }
            if (ID == 563) {
                i563.setFill(Color.RED);
            }
            if (ID == 564) {
                i564.setFill(Color.RED);
            }
            if (ID == 565) {
                i565.setFill(Color.RED);
            }
            if (ID == 570) {
                i570.setFill(Color.RED);
            }
            if (ID == 571) {
                i571.setFill(Color.RED);
            }
            if (ID == 572) {
                i572.setFill(Color.RED);
            }
            if (ID == 573) {
                i573.setFill(Color.RED);
            }
            if (ID == 574) {
                i574.setFill(Color.RED);
            }

            if (ID == 82104) {
                i82104.setFill(Color.RED);
            }
            if (ID == 82101) {
                i82101.setFill(Color.RED);
            }

        } else {         //palabra no encontrada");
            if (ID == 100) {
                i100.setFill(Color.BLACK);
            }
            if (ID == 101) {
                i101.setFill(Color.BLACK);
            }
            if (ID == 102) {
                i102.setFill(Color.BLACK);
            }
            if (ID == 103) {
                i103.setFill(Color.BLACK);
            }
            if (ID == 104) {
                i104.setFill(Color.BLACK);
            }
            if (ID == 105) {
                i105.setFill(Color.BLACK);
            }
            if (ID == 106) {
                i106.setFill(Color.BLACK);
            }
            if (ID == 107) {
                i107.setFill(Color.BLACK);
            }
            if (ID == 108) {
                i108.setFill(Color.BLACK);
            }
            if (ID == 109) {
                i109.setFill(Color.BLACK);
            }
            if (ID == 110) {
                i110.setFill(Color.BLACK);
            }
            if (ID == 111) {
                i111.setFill(Color.BLACK);
            }
            if (ID == 460) {
                i460.setFill(Color.BLACK);
            }
            if (ID == 461) {
                i461.setFill(Color.BLACK);
            }
            if (ID == 462) {
                i462.setFill(Color.BLACK);
            }
            if (ID == 463) {
                i463.setFill(Color.BLACK);
            }
            if (ID == 464) {
                i464.setFill(Color.BLACK);
            }
            if (ID == 465) {
                i465.setFill(Color.BLACK);
            }
            if (ID == 466) {
                i466.setFill(Color.BLACK);
            }
            if (ID == 467) {
                i467.setFill(Color.BLACK);
            }
            if (ID == 468) {
                i468.setFill(Color.BLACK);
            }
            if (ID == 469) {
                i469.setFill(Color.BLACK);
            }
            if (ID == 300) {
                i300.setFill(Color.BLACK);
            }
            if (ID == 301) {
                i301.setFill(Color.BLACK);
            }
            if (ID == 302) {
                i302.setFill(Color.BLACK);
            }
            if (ID == 303) {
                i303.setFill(Color.BLACK);
            }
            if (ID == 304) {
                i304.setFill(Color.BLACK);
            }
            if (ID == 305) {
                i305.setFill(Color.BLACK);
            }
            if (ID == 306) {
                i306.setFill(Color.BLACK);
            }
            if (ID == 307) {
                i307.setFill(Color.BLACK);
            }
            if (ID == 308) {
                i308.setFill(Color.BLACK);
            }
            if (ID == 309) {
                i309.setFill(Color.BLACK);
            }
            if (ID == 310) {
                i310.setFill(Color.BLACK);
            }
            if (ID == 200) {
                i200.setFill(Color.BLACK);
            }
            if (ID == 201) {
                i201.setFill(Color.BLACK);
            }
            if (ID == 202) {
                i202.setFill(Color.BLACK);
            }
            if (ID == 203) {
                i203.setFill(Color.BLACK);
            }
            if (ID == 204) {
                i204.setFill(Color.BLACK);
            }
            if (ID == 205) {
                i205.setFill(Color.BLACK);
            }
            if (ID == 206) {
                i206.setFill(Color.BLACK);
            }
            if (ID == 207) {
                i207.setFill(Color.BLACK);
            }
            if (ID == 208) {
                i208.setFill(Color.BLACK);
            }
            if (ID == 209) {
                i209.setFill(Color.BLACK);
            }
            if (ID == 210) {
                i210.setFill(Color.BLACK);
            }
            if (ID == 211) {
                i211.setFill(Color.BLACK);
            }
            if (ID == 212) {
                i212.setFill(Color.BLACK);
            }
            if (ID == 213) {
                i213.setFill(Color.BLACK);
            }
            if (ID == 214) {
                i214.setFill(Color.BLACK);
            }
            if (ID == 215) {
                i215.setFill(Color.BLACK);
            }
            if (ID == 216) {
                i216.setFill(Color.BLACK);
            }
            if (ID == 3331) {
                i333a.setFill(Color.BLACK);
            }
            if (ID == 3332) {
                i333b.setFill(Color.BLACK);
            }
            if (ID == 400) {
                i400.setFill(Color.BLACK);
            }
            if (ID == 401) {
                i401.setFill(Color.BLACK);
            }
            if (ID == 402) {
                i402.setFill(Color.BLACK);
            }
            if (ID == 403) {
                i403.setFill(Color.BLACK);
            }
            if (ID == 404) {
                i404.setFill(Color.BLACK);
            }
            if (ID == 405) {
                i405.setFill(Color.BLACK);
            }
            if (ID == 406) {
                i406.setFill(Color.BLACK);
            }
            if (ID == 407) {
                i407.setFill(Color.BLACK);
            }
            if (ID == 408) {
                i408.setFill(Color.BLACK);
            }
            if (ID == 409) {
                i409.setFill(Color.BLACK);
            }
            if (ID == 410) {
                i410.setFill(Color.BLACK);
            }
            if (ID == 411) {
                i411.setFill(Color.BLACK);
            }
            if (ID == 412) {
                i412.setFill(Color.BLACK);
            }
            if (ID == 413) {
                i413.setFill(Color.BLACK);
            }
            if (ID == 414) {
                i414.setFill(Color.BLACK);
            }
            if (ID == 415) {
                i415.setFill(Color.BLACK);
            }
            if (ID == 416) {
                i416.setFill(Color.BLACK);
            }
            if (ID == 418) {
                i418.setFill(Color.BLACK);
            }
            if (ID == 450) {
                i450.setFill(Color.BLACK);
            }
            if (ID == 451) {
                i451.setFill(Color.BLACK);
            }
            if (ID == 452) {
                i452.setFill(Color.BLACK);
            }
            if (ID == 453) {
                i453.setFill(Color.BLACK);
            }
            if (ID == 454) {
                i454.setFill(Color.BLACK);
            }
            if (ID == 455) {
                i455.setFill(Color.BLACK);
            }
            if (ID == 456) {
                i456.setFill(Color.BLACK);
            }
            if (ID == 457) {
                i457.setFill(Color.BLACK);
            }
            if (ID == 458) {
                i458.setFill(Color.BLACK);
            }
            if (ID == 459) {
                i459.setFill(Color.BLACK);
            }
            if (ID == 500) {
                i500.setFill(Color.BLACK);
            }
            if (ID == 501) {
                i501.setFill(Color.BLACK);
            }
            if (ID == 502) {
                i502.setFill(Color.BLACK);
            }
            if (ID == 503) {
                i503.setFill(Color.BLACK);
            }
            if (ID == 504) {
                i504.setFill(Color.BLACK);
            }
            if (ID == 512) {
                i512.setFill(Color.BLACK);
            }
            if (ID == 550) {
                i550.setFill(Color.BLACK);
            }
            if (ID == 551) {
                i551.setFill(Color.BLACK);
            }
            if (ID == 552) {
                i552.setFill(Color.BLACK);
            }
            if (ID == 553) {
                i553.setFill(Color.BLACK);
            }
            if (ID == 554) {
                i554.setFill(Color.BLACK);
            }
            if (ID == 555) {
                i555.setFill(Color.BLACK);
            }
            if (ID == 580) {
                i580.setFill(Color.BLACK);
            }
            if (ID == 581) {
                i581.setFill(Color.BLACK);
            }
            if (ID == 582) {
                i582.setFill(Color.BLACK);
            }
            if (ID == 540) {
                i540.setFill(Color.BLACK);
            }
            if (ID == 541) {
                i541.setFill(Color.BLACK);
            }
            if (ID == 542) {
                i542.setFill(Color.BLACK);
            }

            if (ID == 560) {
                i560.setFill(Color.BLACK);
            }
            if (ID == 561) {
                i561.setFill(Color.BLACK);
            }
            if (ID == 562) {
                i562.setFill(Color.BLACK);
            }
            if (ID == 563) {
                i563.setFill(Color.BLACK);
            }
            if (ID == 564) {
                i564.setFill(Color.BLACK);
            }
            if (ID == 565) {
                i565.setFill(Color.BLACK);
            }
            if (ID == 570) {
                i570.setFill(Color.BLACK);
            }
            if (ID == 571) {
                i571.setFill(Color.BLACK);
            }
            if (ID == 572) {
                i572.setFill(Color.BLACK);
            }
            if (ID == 573) {
                i573.setFill(Color.BLACK);
            }
            if (ID == 574) {
                i574.setFill(Color.BLACK);
            }
            if (ID == 82104) {
                i82104.setFill(Color.BLACK);
            }
            if (ID == 82101) {
                i82101.setFill(Color.BLACK);
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO

    }
}
