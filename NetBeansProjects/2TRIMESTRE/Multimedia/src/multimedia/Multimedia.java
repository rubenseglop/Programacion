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
public class Multimedia {

    String titulo, autor;
    Formato formato;
    int duracion;

    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;

    }

    public String getTitulo() {
        return ("Título: " + titulo);
    }

    public String getAutor() {
        return ("Autor: " + autor);
    }

    public String getFormato() {
        return ("Formato: " + formato);
    }

    public String getDuracion() {
        return ("Duración: " + duracion);
    }

    @Override
    public String toString() {
        String resultado = this.getAutor() + "\n";
        resultado = resultado + this.getDuracion() + "\n";
        resultado = resultado + this.getFormato() + "\n";
        resultado = resultado + this.getDuracion() + "\n";
        return resultado;
    }

    public boolean equals(Multimedia objeto) {
        if (objeto == this) {
            return true;
        } else {
            return false;
        }
    }

}
