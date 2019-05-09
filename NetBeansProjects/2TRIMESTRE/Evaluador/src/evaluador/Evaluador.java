/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluador;

/**
 * Clase main principal
 *
 * @author Ruben
 */
public class Evaluador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  


        String contenido;
        int totalalumnos = 10;

        Ficheros fichero = new Ficheros("Evaluador");
        fichero.eliminaArchivo();        // elimino archivo y lo genero de cero

        //Genero los objetos de cada clase
        Informatica[] informatica = new Informatica[10];
        Musica[] musica = new Musica[10];
        Ciencias[] ciencias = new Ciencias[10];

        // Creo 10 objetos de cada departamento        
        for (int i = 0; i < 10; i++) {
            informatica[i] = new Informatica();
            musica[i] = new Musica();
            ciencias[i] = new Ciencias();

        }
        // Creo una matriz de [totalalumnos] alumnos
        int[] alumnos = new int[totalalumnos];

        System.out.println("Departamento de infórmatica");
        fichero.escribeArchivo("Departamento de informática");
        for (int i = 0; i < alumnos.length; i++) {

            informatica[i].setNota_ejercicio((int) (Math.random() * 9 + 1));
            informatica[i].setNota_examen((int) (Math.random() * 9 + 1));
            contenido = ("Alumno " + i + " Nota de examen: " + informatica[i].getNota_examen() + ""
                    + " - Nota ejercicios: " + informatica[i].getNota_ejercicio() + ""
                    + " - Nota final: " + informatica[i].getFinal());

            System.out.println(contenido);
            fichero.escribeArchivo(contenido);
        }

        System.out.println("Departamento de música");
        fichero.escribeArchivo("Departamento de música");
        for (int i = 0; i < alumnos.length; i++) {
            musica[i].setNota_ejercicio((int) (Math.random() * 9 + 1));
            musica[i].setNota_examen((int) (Math.random() * 9 + 1));
            musica[i].setNota_actitud((int) (Math.random() * 9 + 1));

            contenido = ("Alumno " + i + " Nota de examen: " + musica[i].getNota_examen() + ""
                    + " - Nota ejercicios: " + musica[i].getNota_ejercicio() + ""
                    + " - Nota actitud " + musica[i].getNota_actitud() + ""
                    + " - Nota final: " + musica[i].getFinal());

            System.out.println(contenido);
            fichero.escribeArchivo(contenido);

        }

        System.out.println("Departamento de ciencias");
        fichero.escribeArchivo("Departamento de ciencias");
        for (int i = 0; i < alumnos.length; i++) {

            ciencias[i].setNota_experimentos((int) (Math.random() * 9 + 1));
            ciencias[i].setNota_actitud((int) (Math.random() * 9 + 1));

            contenido = ("Alumno " + i + " Nota de experimentos: " + ciencias[i].getNota_experimentos() + ""
                    + " - Nota actitud " + ciencias[i].getNota_actitud() + ""
                    + " - Nota final: " + ciencias[i].getFinal());

            System.out.println(contenido);
            fichero.escribeArchivo(contenido);

        }

    }
}
