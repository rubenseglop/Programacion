/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio;


/**
 *
 * @author Ruben
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista();
       
        
        /**
         * Ejercicio 6.01
         */  
        System.out.println("Listas\n======\n");
        System.out.println(lista.estaVacia()); // Al inicio debe estar vacía
        lista.ponPrimero(50); // Meto al inicio de lista un entero       
        System.out.println(lista.estaVacia()); // Ahora la lista da llena
        lista.ponPrimero(25); // Meto al inicio de lista un entero (el que fuera primero, pasa ahora a ser segundo)
        lista.ponUltimo("Objeto"); // Meto al final de la lista un String
        lista.ponUltimo("Objeto2"); // Meto al final de la lista un String
        lista.visualizaElementos();
        System.out.println(lista.extraePrimero()); //saco el primer objeto
        System.out.println(lista.extraeUltimo()); //saco el último objeto
    }
}
