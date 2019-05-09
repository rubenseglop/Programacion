/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidorv2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Compartido {

    int compartido[];

    private boolean fin = true;
    private boolean turno = true;
    private int pos;

    public Compartido() {
        this.pos = 0;
        this.compartido = new int[4];
    }

    private int libre() {

        for (int i = 0; i < compartido.length; i++) {
            if (compartido[i] == 0) {
                compartido[i] = 1;
                return i;
            }
        }
        return -1;
    }


    public synchronized void insertarConsumidor() {
        while (fin && turno) {
            if (this.libre() > -1) {
                try {
                    wait();
                } catch (InterruptedException ex) {
                    System.out.println("No he posido sacar: " + ex);                    
                }
            }
        }
        turno=false;
    }

    public synchronized void sacarProductor() {
        while (fin && turno == false) {
            compartido[pos] = 0;
        }
    }
}
