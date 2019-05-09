/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluador;

import java.text.DecimalFormat;

/**
 * Clase música que hereda de informática
 * @author Ruben
 */
public class Musica extends Informatica {

    private double nota_ejercicio;
    private double nota_examen;
    private double notafinal;
    private double nota_actitud;
    DecimalFormat df = new DecimalFormat("#.00");

    public Musica() {
        super();
    }

    /**
     * @return the nota_actitud
     */
    public double getNota_actitud() {
        return nota_actitud;
    }

    /**
     * @param nota_actitud the nota_actitud to set
     */
    public void setNota_actitud(double nota_actitud) {
        this.nota_actitud = nota_actitud;
    }

    @Override
    public String getFinal() {
        notafinal = (nota_ejercicio * 0.3) + (nota_examen * 0.4) + (nota_actitud * 0.3);
        return df.format(notafinal);
    }

}
