/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guerramarciana;

/**
 *
 * @author Ruben
 */
public class Soldado extends Thread{
    Cofre micofre;
    
    
    public Soldado(Cofre a){
        micofre=a;
    }
}
