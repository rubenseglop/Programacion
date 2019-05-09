/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrencialectores;

/**
 *
 * @author ruben
 */
public class ConcurrenciaLectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GestorBD gestor=new GestorBD();
        Escritor[] esc=new Escritor[2];
        Lector[] lector=new Lector[10];
        
        for (int i = 0; i < esc.length; i++) {
            esc[i]=new Escritor(gestor,i);            
        }
        
        for (int i = 0; i < lector.length; i++) {
            lector[i]=new Lector(gestor,i);
            
        }
        
        for (int i = 0; i < esc.length; i++) {
            esc[i].start();            
        }
        for (int i = 0; i < lector.length; i++) {
            lector[i].start();
            
        }
    }
    
}
