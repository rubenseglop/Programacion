/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoguerramarciana;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Armero extends Thread {

    private int id_armero;
    private int numArmas = 0;
    int[] armero_pos = new int[100];
    Cofre micofre;
    private int hueco_arma;

    public Armero(Cofre a) {
        this.hueco_arma = 0;
        micofre=a;

    }

    @Override
    public void run() {
        for (int i = 0; i < armero_pos.length; i++) {
            try {
                if(micofre.meterArmaCofre(numArmas++)) {
                    hueco_arma++;//pude meter un arma en el cofre
                    System.out.println("arma dentro"); 
                    micofre.capacidad--;
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Armero.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }

    }

    /**
     * @return the id_armero
     */
    public int getId_armero() {
        return id_armero;
    }

    /**
     * @param id_armero the id_armero to set
     */
    public void setId_armero(int id_armero) {
        this.id_armero = id_armero;
    }

    /**
     * @return the numArmas
     */
    public int getNumArmas() {
        return numArmas;
    }

    /**
     * @param numArmas the numArmas to set
     */
    public void setNumArmas(int numArmas) {
        this.numArmas = numArmas;
    }

    public void crearArmas() {
        for (int i = 0; i < 100; i++) { //se crean las 100 armas numeradas
            armero_pos[i] = i;
        }

        // desordenar las 100 armas en el armero
        int posicion_temporal;
        for (int i = 0; i < 500; i++) {
            int inicio_pos = (int) (Math.random() * 100);
            int final_pos = (int) (Math.random() * 100);

            posicion_temporal=armero_pos[inicio_pos];
            armero_pos[inicio_pos] = armero_pos[final_pos];
            armero_pos[final_pos] = posicion_temporal;
        }
    }
    public void recorrerArmas(){
        for (int i = 0; i < armero_pos.length; i++) {
            System.out.print(armero_pos[i]+"-");            
        }
        System.out.println();
    }

    /**
     * @return the hueco_arma
     */
    public int getHueco_arma() {
        return hueco_arma;
    }

    /**
     * @param hueco_arma the hueco_arma to set
     */
    public void setHueco_arma(int hueco_arma) {
        this.hueco_arma = hueco_arma;
    }
}
