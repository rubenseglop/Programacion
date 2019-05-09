/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositor;

/**
 *
 * @author Ruben
 */
public class Compositor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cancion cancion = new Cancion();
        
        Componer compositor1 = new Componer(cancion,1);
        Componer compositor2 = new Componer(cancion,2);
        
        Reproducir reproductor = new Reproducir(cancion);
        
        
        compositor1.start();
        compositor2.start();
    }
    
}
