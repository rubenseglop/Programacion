/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListinTelefonico;

import java.util.Calendar;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author ruben
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Calendar c1 = Calendar.getInstance();
        String annio = Integer.toString(c1.get(Calendar.YEAR));
        String mes = Integer.toString(c1.get(Calendar.MONTH));

        if (annio.equals("2018") && (mes.equals("7") || mes.equals("8"))) {  // fecha de funcionamiento del programa (mes agosto, septiembre de 2018)
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.setTitle("Listado Teléfonico por Rubén");
            stage.getIcons().add(new Image(getClass().getResource("logo2.jpg").toExternalForm()));
            stage.show();
        }

    }

    public void cierra(Stage stage) {
        stage.close();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
