/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluador;

import java.text.DecimalFormat;

/**
 * Clase Informática
 *
 * @author Ruben
 */
public class Informatica {

    private double nota_ejercicio;
    private double nota_examen;
    private double notafinal;
    DecimalFormat df = new DecimalFormat("#.00");

    public Informatica() {
        this.nota_examen = 0;
        this.nota_ejercicio = 0;

    }

    public String getFinal() {
        notafinal = (nota_ejercicio * 0.2) + (nota_examen * 0.8);
        return df.format(notafinal);
    }

    /**
     * @return the nota_ejercicio
     */
    public double getNota_ejercicio() {
        return nota_ejercicio;
    }

    /**
     * @param Nota_ejercicio the nota_ejercicio to set
     */
    public void setNota_ejercicio(int Nota_ejercicio) {
        this.nota_ejercicio = Nota_ejercicio;
    }

    /**
     * @return the nota_examen
     */
    public double getNota_examen() {
        return nota_examen;
    }

    /**
     * @param nota_examen the nota_examen to set
     */
    public void setNota_examen(int nota_examen) {
        this.nota_examen = nota_examen;
    }
}
