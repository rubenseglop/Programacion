/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploordencmd;

import java.io.IOException;

/**
 *
 * @author Ruben
 */
public class EjemploOrdenCmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String cmd = "cmd.exe c:\\Windows\\copiar.bat"; 
            Runtime.getRuntime().exec(cmd);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

}
