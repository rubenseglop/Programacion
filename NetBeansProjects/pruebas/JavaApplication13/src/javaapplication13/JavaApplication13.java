/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication13;

/**
 *
 * @author ruben
 */
public class JavaApplication13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        

        Agaponi aga = new Agaponi(1);
        System.out.println(aga.getId());
        long a= System.currentTimeMillis()/1000/1000/1000;
        System.out.println(a);
        
    }
    
}
class Agaponi extends Animal {
    private int id;
    private int color;

    public Agaponi(int id) {
        this.id = id;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the color
     */
    public int getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(int color) {
        this.color = color;
        hola();
        
        
    }

    @Override
    public void hola() {
        System.out.println("hola");
        System.out.println("hola");
        System.out.println("hola");
        System.out.println("hola");
        System.out.println("hola");
    }

    
}