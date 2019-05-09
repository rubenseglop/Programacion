/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multimedia;

/**
 *
 * @author ruben
 */
public class Pelicula extends Multimedia{
    String actor,actriz;

    public Pelicula(String titulo, String autor, Formato formato, int duracion,String actor, String actriz) {
        super(titulo, autor, formato, duracion);
    }
   
}
