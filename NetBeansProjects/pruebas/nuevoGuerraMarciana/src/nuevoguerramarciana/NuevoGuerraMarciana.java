/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoguerramarciana;

/**
 *
 * @author ruben
 */
public class NuevoGuerraMarciana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Cofre micofre = new Cofre();
        Armero armero=new Armero(micofre);
        Soldado[] soldado = new Soldado[100];
        
        for (int i = 0; i < soldado.length; i++) {
            soldado[i]=new Soldado(micofre,i);
            
        }
        
        
        armero.crearArmas();
        System.out.println("Creando el armero al azar");
        armero.recorrerArmas();
        
        
        armero.start();
        
        for (Soldado soldado1 : soldado) {
            soldado1.start();
        }       
    }   
}
