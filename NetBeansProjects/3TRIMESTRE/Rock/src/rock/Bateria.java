/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rock;

/**
 *
 * @author Ruben
 */
public class Bateria implements EnComun {

    int id;
    String nombre;

    public Bateria(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void aporrear(int id) {
        System.out.println("Bateria " + id + " a aporrado");
    }

    @Override
    public void afinar(int id) {
        System.out.println("Bateria " + id + " a afinado");
    }

    @Override
    public void estirar(int id) {
        System.out.println("Bateria " + id + " a estirado");

    }
}
