/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoguerramarciana;

/**
 *
 * @author Ruben
 */
public class Cofre {

    int capacidad;
    int[] huecos;
    boolean turno;

    public Cofre() {
        this.huecos = new int[10];
        capacidad = 10;
        turno = true;

        for (int i = 0; i < huecos.length; i++) {
            huecos[i] = 0;

        }
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

    public synchronized boolean meterArmaCofre(int num_arma) throws InterruptedException {
        while (turno) {
            System.out.println("capacidad" + capacidad);
            if (this.getCapacidad() <= 10) {
                System.out.println("hueco libre, meto el arma: " + num_arma);
                busqueda(num_arma);
                return true;   // si pude meter un arma en un hueco, true
            }
            wait();

        }
        turno = false;
        notify();
        return false;
    }

    private synchronized void busqueda(int num_arma) {
        //verificar que espacio esta vacio
        int localizado_hueco = 0;
        while (localizado_hueco == 0) {
            System.out.print("buscando espacio :");
            for (int i = 0; i < huecos.length; i++) {
                System.out.print(localizado_hueco);
                if (i < 9) {
                    System.out.print("-");
                }

                if (huecos[i] == 0) {
                    this.setCapacidad(capacidad--);
                    huecos[i] = num_arma;
                    localizado_hueco++;
                }
            }
            System.out.println();
        }
    }

    public synchronized void sacarArmaCofre(int num_sold) throws InterruptedException {

        while (this.getCapacidad() > 0 && turno == false) {
            //wait();

            turno = true;
            notify();

        }

    }
}
