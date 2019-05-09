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
public class Componer extends Thread {

    private int id_compositor;
    private Cancion cancion;
    private int notas;

    public Componer(Cancion cancion, int id) {
        this.cancion = cancion;
        id_compositor = id;

    }

    @Override
    public void run() {
        while (true) {
            notas = (int) (Math.random() * 7);
            switch (notas) {
                case 0:
                    cancion.abrirComponer(id_compositor, "do");
                    break;
                case 1:
                    cancion.abrirComponer(id_compositor, "re");
                    break;
                case 2:
                    cancion.abrirComponer(id_compositor, "mi");
                    break;
                case 3:
                    cancion.abrirComponer(id_compositor, "fa");
                    break;
                case 5:
                    cancion.abrirComponer(id_compositor, "sol");
                    break;
                case 6:
                    cancion.abrirComponer(id_compositor, "la");
                    break;
            }
        }

    }
}
