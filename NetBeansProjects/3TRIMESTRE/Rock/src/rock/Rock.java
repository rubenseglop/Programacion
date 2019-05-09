/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock;

import java.util.Random;

/**
 *
 * @author Ruben
 */
public class Rock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();

        /*
        Creamos a los componentes del grupo.
         */
        Cantante cantante = new Cantante(1, "Michael Jackson"); //que en paz descanse
        Bajista bajista = new Bajista(2, "Steve Harris");
        Guitarrista guitarrista = new Guitarrista(3, "Angus Young");
        Bateria bateria = new Bateria(4, "Paquirrin");

        /*
        Comienza el concierto
         */
        int turnos = 0;

        while (turnos < 300) {

            int valorDado = r.nextInt(13)+1;
            turnos++;

            switch (valorDado) {
                case 1:
                    cantante.afinar(1);
                    break;

                case 2:
                    cantante.beber_agua(1);
                    break;
                case 3:
                    cantante.escoger_pua(1);
                    break;
                case 4:
                    cantante.estirar(1);
                    break;
                case 5:
                    bajista.afinar(2);
                    break;
                case 6:
                    bajista.cambiar_cuerdas(2);
                    break;
                case 7:
                    bajista.estirar(2);
                    break;
                case 8:
                    guitarrista.afinar(3);
                    break;
                case 9:
                    guitarrista.escoger_pua(3);
                    break;
                case 10:
                    guitarrista.estirar(3);
                    break;
                case 11:
                    bateria.afinar(4);
                    break;
                case 12:
                    bateria.aporrear(4);
                    break;
                case 13:
                    bateria.estirar(4);
                    break;
            }

        }
    }
}
