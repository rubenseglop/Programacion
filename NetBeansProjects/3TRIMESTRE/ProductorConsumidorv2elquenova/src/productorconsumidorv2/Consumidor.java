/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productorconsumidorv2;

/**
 *
 * @author Ruben
 */
public class Consumidor extends Thread {

    Compartido a;

    public Consumidor(Compartido a) {
        this.a = a;
    }

    @Override
    public void run() {
        a.insertarConsumidor();
    }
}