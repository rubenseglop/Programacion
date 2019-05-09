/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencialectores;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Escritor extends Thread {

    private static Random r = new Random();

    private GestorBD gestor;
    private int id;

    public Escritor(GestorBD gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }

    @Override
    public void run() {
        while (true) {
            try {
                gestor.openE(id);
                //escribir lo que sea
                Thread.sleep(r.nextInt(200));

                gestor.closeE(id);
                Thread.sleep(r.nextInt(300));

            } catch (InterruptedException ex) {
                Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
