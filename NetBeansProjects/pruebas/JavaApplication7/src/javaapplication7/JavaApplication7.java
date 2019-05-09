/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author ruben
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cubo cubo= new Cubo();
        Meter[] meter= new Meter[5];
        
        for (int i = 0; i < meter.length; i++) {
            meter[i]=new Meter(cubo,i);            
        }
        for (int i = 0; i < meter.length; i++) {
            meter[i].start();
            
        }
        
        Sacar sacar=new Sacar(cubo,1);
        sacar.start();
        
    }
    
}
