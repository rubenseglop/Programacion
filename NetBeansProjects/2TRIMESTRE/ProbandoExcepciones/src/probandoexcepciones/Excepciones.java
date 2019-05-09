/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoexcepciones;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Excepciones {
 
    private int edad;

 
    public void setNumero(int edad) {
        try {
            if (edad <= 0)
                throw new miexcepcion("negativo");
            this.edad = edad;
            if(edad >10)
                throw new miexcepcion();
        } catch (miexcepcion ex) {
            
        }
    }
 
}
