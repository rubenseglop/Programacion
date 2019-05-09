/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_03ejerciciocola;

import java.util.LinkedList;

/**
 *
 * @author Ruben
 */
public class Colas {
    private final LinkedList cola;
    /**
     * Método constructor de la cola
     */
    public Colas() {
    this.cola = new LinkedList();
    }
    /**
     * Método ponerCola en el que indico que objeto poner al final
     * @param ob - objeto que será colocado al final de la cola
     */
    public void ponerCola(Object ob) {
        cola.push(ob);
    }
    public void quitarCola() {
        cola.pop();
    }
    public String estaVacia() {
        
        if (cola.isEmpty()==false){
            return ("Cola llena");
        }
        else return ("Cola vacía"); 
    }
    public Object verCima(){
        return ("Último objeto de la cola: " + cola.peek());
    }    
}