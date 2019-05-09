/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclaseincertidumbre;

/**
 *
 * @author ruben
 */
public class EjercicioClaseIncertidumbre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String val1,val2,resultado;
        BoolPlus entrada=new BoolPlus();
        System.out.println(entrada.conjuncion("talvez","falso"));
        System.out.println(entrada.disyuncion("talvez","talvez"));
    }
    
}
