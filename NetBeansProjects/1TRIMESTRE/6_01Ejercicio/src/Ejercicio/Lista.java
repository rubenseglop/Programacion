/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;
import java.util.*;
/**
 *
 * @author Ruben
 */
public class Lista {
    private Vector lista; 
    
    /**
     * Constructor vacío
     */
    public Lista() {
    this.lista = new Vector();
    }
    
    public void ponPrimero(Object ob) {
        lista.insertElementAt(ob,0);
    }
    public void ponUltimo(Object ob) {
        //lista.insertElementAt(ob,lista.lastIndexOf(ob)+1); 
        lista.insertElementAt(ob,lista.size());
    
    }
    public String estaVacia() {
        //return lista.isEmpty()==true;
        
        if (lista.isEmpty()==false){
            return ("Lista llena");
        }
        else return ("Lista vacía");        
    }
    public Object extraePrimero(){
        return lista.firstElement();
    }
    public Object extraeUltimo(){
        return lista.lastElement();
    }
    public void visualizaElementos(){
        for (int i = 0; i < lista.size(); i++) {
           System.out.println("Posición " + i + " - " +lista.elementAt(i));
        }
    }

}

