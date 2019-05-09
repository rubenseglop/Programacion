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
public class Cantante extends Guitarrista implements EnComun{

    public Cantante(int id, String nombre) {
        super(id, nombre);
    }

    public void beber_agua(int id) {
        System.out.println("Cantante " + id + " a bebido agua y tiene la voz preparada");
    }
    
}
