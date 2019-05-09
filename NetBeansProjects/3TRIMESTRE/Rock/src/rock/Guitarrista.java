/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock;

import java.util.Random;

/**
 *
 * @author Ruben
 */
public class Guitarrista implements EnComun {

    Random r = new Random();
    int id;
    String nombre;

    public Guitarrista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void escoger_pua(int id) {

        int valorDado = r.nextInt(3)+1;
        System.out.print("Guitarrista/cantante " + id + " a escogido púa de su colección. ");
        if (valorDado==1) System.out.println( "Hoy está contento");
        if (valorDado==2) System.out.println( "Hoy está enfadado");
        if (valorDado==3) System.out.println( "Hoy está deprimido");

    }

    @Override
    public void afinar(int id) {
        System.out.println("Guitarrista " + id + " a afinado");    }

    @Override
    public void estirar(int id) {
        System.out.println("Guistarrita " + id + " a estirado");    }
}
