/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencialectores;

/**
 *
 * @author ruben
 */
public class GestorBD {

    private int nLectores = 0;
    private boolean hayEscritor = false;
    private int nEscritor=0;

    public synchronized void openL(int id) throws InterruptedException {
        //puede entrar siempre que no haya un escritor
        while (hayEscritor || nEscritor>0) {
            wait();
        }
        nLectores++;
        System.out.println("Lector " + id + " entra");
    }

    public synchronized void closeL(int id) {
        System.out.println("Lector " + id + " sale");
        nLectores--;
        if (nLectores == 0) {
            notifyAll(); //despierto a escritores      
        }
    }

    public synchronized void openE(int id) throws InterruptedException {
        nEscritor++;
        while (hayEscritor || nLectores > 0) {
            wait();
        }
        hayEscritor=true;
        System.out.println("Escritor " + id + " entra");
    }
    public synchronized void closeE(int id){
        nEscritor--;
        System.out.println("Escritor "+id+" sale");
        hayEscritor=false;
        notifyAll();
    }
}
