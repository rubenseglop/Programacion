/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ruben
 */
public class Sacar extends Thread{
    
    
    private int id;
    private Cubo cubo;

    public Sacar(Cubo cubo,int id) {
        this.id = id;
        this.cubo = cubo;
    }

    @Override
    public void run() {
        while (true) {
            try {
                cubo.sacarE(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Meter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    /**
     * @return the id
     */
    public int gettId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    
}
