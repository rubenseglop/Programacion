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
public class Bajista implements EnComun {

    int id;
    String nombre;

    public Bajista(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public void cambiar_cuerdas(int id) {
        System.out.println("Componente " + id + " a cambiado las cuerdas estropeadas");

    }

    @Override
    public void afinar(int id) {
        System.out.println("Bajista " + id + " a afinado");
    }

    @Override
    public void estirar(int id) {
        System.out.println("Bajista " + id + " a estirado");
    }
}
