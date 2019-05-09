/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerramarciana;

/**
 *
 * @author Ruben
 */
public class Cofre {

    private int capacidad;
    int[] huecos;

    public Cofre() {
        this.huecos = new int[10];
        capacidad = 10;
    }

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public synchronized boolean meterArmaCofre(int num_arma) {
        if (this.getCapacidad() < 10) {
            busqueda(num_arma); 
            return true;   // si pude meter un arma en un hueco, true
        }
        else return false; // si no pude meter un arma, false
    }

    private void busqueda(int num_arma) {
        //verificar que espacio esta vacio
        int localizado_hueco = 0;
        while (localizado_hueco == 0) {
            for (int i = 0; i < huecos.length; i++) {

                if (huecos[i] == 0) {
                    this.setCapacidad(capacidad++);
                    huecos[i] = num_arma;
                    localizado_hueco++;
                }
            }
        }
    }

    public synchronized void sacarArmaCofre(int num_sold) {

        while (this.getCapacidad() > 0) {

        }

    }
}
