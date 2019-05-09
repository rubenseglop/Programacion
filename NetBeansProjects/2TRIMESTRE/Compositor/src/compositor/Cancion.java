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
public class Cancion {

    private String nota;
    private boolean hayReproductores;
    private boolean hayComponiendo;
    private int numero_nota;
    private int id_compositor;
    private int compas;

    private String MiCancion;

    public Cancion() {
        this.hayReproductores = true;
        this.hayComponiendo = false;
        this.numero_nota = 0;
        this.compas = 0;
    }

    /**
     * Componer música
     *
     * @param nota
     */
    public synchronized void abrirComponer(int id_compositor, String nota) {
        while (hayReproductores == true) {
            this.nota = nota;
            this.id_compositor = id_compositor;

            System.out.println("El compositor " + id_compositor + " a escrito " + nota);

            numero_nota++;
            MiCancion = MiCancion + nota + " ";
        
            if (numero_nota > 3) {
                hayComponiendo = false;
                this.eReproducir();

                System.out.println(numero_nota);
                numero_nota = 0;
                MiCancion = "";
            }
            hayComponiendo = true;
        }
        hayReproductores=false;
    }

    /**
     * Reproducir música
     */
    public synchronized void eReproducir() {
        while (hayComponiendo == false) {
            System.out.println("Toca el compas: " + MiCancion);
            compas++;

            hayComponiendo = true;
        }
    }
}
