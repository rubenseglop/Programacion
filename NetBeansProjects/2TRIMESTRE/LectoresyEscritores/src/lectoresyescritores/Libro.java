/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectoresyescritores;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase Libro que simula la escritura de un libro
 * @author Ruben
 */
public class Libro {

    private String texto;
    private char char_aleatorio;
    private int escribiendo, leyendo;
    private final boolean[] escritores = new boolean[10];
    private final boolean[] lectores = new boolean[20];
    private boolean finlibro;
    private int lector;

    /**
     * Método constructor con el texto que inicialmente comenzará el libro
     */
    public Libro() {
        texto = "En un lugar de la Mancha, ";
        finlibro = false;
    }

    /**
     * Método sincronizado por el que acceden los escritores
     * @param escritor número de escritor
     * @throws InterruptedException 
     */
    public synchronized void escribir(int escritor) throws InterruptedException {
        
        while (!finlibro) {
            System.out.println((char) 27 + "[34m" + "Escritor " + escritor + " va a esperar a escribir");

            // Al ser un método sincronizado, solo un escritor puede escribir
            // Miro si hay lectores leyendo
            leyendo = 0;
            for (int i = 0; i < 20; i++) {
                if (lectores[i] == true) {
                    leyendo++;
                    if(!esfinallibro()) wait(); //Si encuentro a un lector, me detengo
                }
            }

            if (leyendo == 0) {  //Si nadie esta leyendo...
                //Verifico si está acabado el libro

                if (texto.length() > 500 && finlibro == false) {
                    finlibro(); //Detener hilos
                    System.out.println((char) 27 + "[35m" + "El libro está completado");
                    System.out.println(this.mostrarLibro());
                    notifyAll();
                } else {
                    // Añado una letra al azar en caso de no estar acabado
                    escritores[escritor] = true;
                    notifyAll();
                    char_aleatorio = (char) (int) (Math.random() * 25 + 65);
                    if(!esfinallibro()) System.out.println((char) 27 + "[34m" + "==>Escritor " + escritor + " escribe una: " + char_aleatorio);
                    texto += char_aleatorio;
                    escritores[escritor] = false;
                    if(!esfinallibro()) wait();

                }
            } else {
                if(!esfinallibro()) System.out.println((char) 27 + "[34m" + "Escritor " + escritor + " no puede escribir, ya que hay " + leyendo + " lectores");
            }
        } 

    }
    
    /**
     * Los lectores necesitan se sincronizados a la espera de lectura
     * @param lector número de escritor a ser parado su proceso para simular lectura
     */
    private synchronized void esperaLectura(int lector) {

        this.lector = lector;

        try {
            if (finlibro == false) {
                System.out.println((char) 27 + "[32m" + "Lector " + lector + " va a esperar a leer");
                wait();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Libro.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    /**
     * Método por el cual acceden todos los lectores
     * @param lector número de lector que accede al libro
     * @throws InterruptedException 
     */
    public void leer(int lector) throws InterruptedException {
        while (!finlibro) {

            this.esperaLectura(lector);

            //Verificamos si hay escritores
            escribiendo = 0;
            for (int i = 0; i < 10; i++) {
                if (escritores[i] == true) {
                    escribiendo++;
                    try {
                        wait();
                    } catch (Exception e) {

                        System.out.println("Lector " + lector + " no puede leer (hay escritores escribiendo)");
                    }

                }
            }

            if (escribiendo == 0) {        // Si nadie esta escribiendo

                if (lectores[lector] == false) {
                    lectores[lector] = true;
                    System.out.println((char) 27 + "[32m" + "==>Lector " + lector + " está leyendo: " + texto );
                    lectores[lector] = true;

                    lectores[lector] = false;
                   

                }
            }
        } 
    }

    /**
     * Método Getter de la clase Libro
     * @return devuelve el texto del libro
     */
    public String mostrarLibro() {
        return texto;
    }

    /**
     * Método Getter de la clase Libro
     * @return devuelvo el valor true si libro está acabado
     */
    public boolean esfinallibro() {
        return finlibro;
    }

    /**
     * Método Setter de la clase Libro. Esta variable indica que el libro a finalizado
     */
    public void finlibro() {
        // Método para parar escritores y lectores
        finlibro = true;

    }
}
