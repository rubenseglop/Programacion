/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectoresyescritores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hilo Lector 
 * @author Ruben
 */
public class Lector extends Thread {

    int lector;
    Libro milibro;
    boolean bucleinfinito = false;

    /**
     * Método constructor del hilo lector
     * @param lector número de lector
     * @param milibro objeto libro
     */
    public Lector(int lector, Libro milibro) {
        super();
        this.lector = lector;
        this.milibro = milibro;
    }

    /**
     * Método run del hilo Lector
     */
    @Override
    public void run() {

        while (!milibro.esfinallibro()) {
            try {
                sleep((int) (Math.random() * 4000 + 1000));  // Reloj pausa entre 1 y 5 seg.
                milibro.leer(lector); //Escribe
            } catch (InterruptedException ex) {
                Logger.getLogger(Lector.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
