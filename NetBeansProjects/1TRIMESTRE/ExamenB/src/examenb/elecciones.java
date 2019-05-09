/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenb;

/**
 *
 * @author ruben
 */
public class elecciones {

    int numero, edad, ca, ce, ci, co, cu;

    public elecciones(int numero, int edad) { // Constructor
        this.numero = numero;
        this.edad = edad;

    }

    public void votos(int ca, int ce, int ci, int co, int cu) {
        if ((ca + ce + ci + co + cu) == 100) {
            this.ca = ca;
            this.ce = ce;
            this.ci = ci;
            this.co = co;
            this.cu = cu;

        } else {
            System.out.println("Error no suman 100 (no introducido)");
            numero--;
        }

    }

    public int leerca() {
        return ca;
    }

    public int leerce() {
        return ce;
    }

    public int leerci() {
        return ci;
    }

    public int leerco() {
        return co;
    }

    public int leercu() {
        return cu;
    }

}
