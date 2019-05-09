/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectoresyescritores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo Escritor
 * @author Ruben
 */
public class Escritor extends Thread {

    int escritor;
    Libro milibro;
    boolean bucleinfinito = false;

    /**
     * Método constructor de Escritor
     * @param escritor número de escritor
     * @param milibro Objeto Libro 
     */
    public Escritor(int escritor, Libro milibro) {

        this.escritor = escritor;
        this.milibro = milibro;
    }

    /**
     * Método run del hilo escritor
     */
    @Override
    public void run() {

        while (!milibro.esfinallibro()) {
            try {
                sleep((int) (Math.random() * 4000 + 1000));  // Reloj pausa entre 1 y 5 seg. 
                milibro.escribir(escritor);
            } catch (InterruptedException ex) {
                Logger.getLogger(Escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
