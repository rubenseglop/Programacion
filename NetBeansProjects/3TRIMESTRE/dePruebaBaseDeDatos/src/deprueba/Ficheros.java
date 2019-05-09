/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deprueba;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Ficheros {

    private final File fichero;
    private final BufferedWriter bw;
    private final FileWriter fw;
    private final String nombreArchivo;

    public Ficheros(String nombre) {
        this.fw = null;
        this.bw = null;
        nombreArchivo = nombre;
        fichero = new File(nombreArchivo);
        // Si el archivo no existe, se crea!

    }

    public void escribeArchivo(String contenido) {
        FileWriter TextOut = null;
        try {

            TextOut = new FileWriter(fichero, true);
            TextOut.write(contenido);
            TextOut.write(13);TextOut.write(10);
            TextOut.close();
        } catch (IOException ex) {
            Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                TextOut.close();
            } catch (IOException ex) {
                Logger.getLogger(Ficheros.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }


    public void eliminaArchivo() {
        if (!fichero.exists()) {
            System.out.println(nombreArchivo + " no existe.");
        } else {
            fichero.delete();
            System.out.println(nombreArchivo + " fue eliminado.");
        }
    }
}
