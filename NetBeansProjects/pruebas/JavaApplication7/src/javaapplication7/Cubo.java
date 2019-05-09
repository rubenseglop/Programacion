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
public class Cubo {
    
    int meterid;
    boolean haysacar;
    
    
    public Cubo(){
        this.haysacar = true;
        
    }
    
    public synchronized void meterE(int id) throws InterruptedException{
        while(haysacar){
            wait();
        }
        System.out.println("sigo metiendo");
        haysacar=false;
        notify();
    }
    public synchronized void sacarE(int id) throws InterruptedException{
        while(haysacar=false){
            wait();
        }
        System.out.println("Sigo sacando");
        notify();
    }
}
