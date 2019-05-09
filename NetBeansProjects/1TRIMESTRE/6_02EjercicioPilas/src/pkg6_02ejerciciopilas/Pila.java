/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_02ejerciciopilas;
import java.util.*;


/**
 *
 * @author Ruben
 */
public class Pila {
    private final Stack pila;
    
    public Pila() {
    this.pila = new Stack();
    }
    public void ponerPila(Object ob) {
        pila.push(ob);
    }
    public void quitarPila() {
        pila.pop();
    }
    public String estaVacia() {
        if (pila.isEmpty()==false){
            return ("Pila llena");
        }
        else return ("Pila vacía"); 
    }

    public Object verCima(){
        return ("Primer objeto de arriba: " + pila.peek());
    }    
}
