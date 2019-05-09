/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluador;

import java.text.DecimalFormat;

/**
 * Clase de ciencias que hereda de múisica
 * @author Ruben
 */
public class Ciencias extends Musica{
    private double nota_ejercicio;
    private double nota_examen;
    private double notafinal;
    private double nota_actitud;
    private double nota_experimentos;
    DecimalFormat df = new DecimalFormat("#.00");
    
    
    public Ciencias() {
        super();
    }

    /**
     * @return the nota_experimentos
     */
    public double getNota_experimentos() {
        return nota_experimentos;
    }

    /**
     * @param nota_experimentos the nota_experimentos to set
     */
    public void setNota_experimentos(double nota_experimentos) {
        this.nota_experimentos = nota_experimentos;
    }
    
    
    @Override
    public String getFinal() {
        notafinal = (nota_experimentos * 0.9) + (nota_actitud * 0.3);
        return df.format(notafinal);
    }
}
