/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoexcepciones;

/**
 *
 * @author Ruben
 */
public class miexcepcion extends Exception {

    public miexcepcion(String error) {
        super(error);

        if ("negativo".equals(error))
        System.err.println("La edad debe ser positiva");
    }
    public miexcepcion(){
        super();
        System.out.println("no enviaste nada");
    }
    
}
