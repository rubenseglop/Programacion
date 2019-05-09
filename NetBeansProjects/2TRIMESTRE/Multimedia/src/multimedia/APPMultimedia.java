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
public class APPMultimedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Multimedia peliculas = new Multimedia("Lo que el viento se llevó", "Spielberg", Formato.WAV, 90);
        Multimedia discos = new Multimedia("Grandes éxitos de la Pantoja", "Isabel Pantoja", Formato.MP3, 90);
        Multimedia mp3 = new Multimedia("One.mp3", "Metallica", Formato.MP3, 90);
        Multimedia mp4 = new Multimedia("Apocalypse Now.avi", "Spielberg", Formato.AVI, 90);
        
        Multimedia repetida = new Multimedia("Lo que el viento se llevó", "Spielberg", Formato.WAV, 90);
        
        // peliculas
        System.out.println(peliculas.getTitulo());
        System.out.println(peliculas.getAutor());
        System.out.println(peliculas.getFormato());
        System.out.println(peliculas.getDuracion());
        System.out.println("");
        System.out.println(peliculas.toString());

        System.out.println("");
        System.out.println(peliculas.equals(repetida));
    }

}
