/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nuevoguerramarciana;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Soldado extends Thread{
    Cofre micofre;
    int id;
    
    
    public Soldado(Cofre a,int id){
        micofre=a;
        this.id=id;
        
    }
    
    @Override
    public void run(){
        try {

            micofre.sacarArmaCofre(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(Soldado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
