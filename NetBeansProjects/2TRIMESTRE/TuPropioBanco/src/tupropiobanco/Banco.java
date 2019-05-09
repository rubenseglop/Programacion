/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tupropiobanco;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ruben
 */
public class Banco {

    public Banco() {

        Ficheros fichero = new Ficheros("Banco");
        // elimino archivo de contabilidad y lo genero de cero
        fichero.eliminaArchivo();

        //tenemos 8 clientes y 5 cuentas
        Cliente[] cliente = new Cliente[8];
        CuentaCorriente[] cuentasBancarias = new CuentaCorriente[5];
        // inicio las cuentas con dinero al azar entre 3.000 y 10.000
        for (int i = 0; i < cuentasBancarias.length; i++) {
            cuentasBancarias[i] = new CuentaCorriente(Math.random() * 7000 + 3000, i);
        }
        // inicio los clientes con sus cuentas
        cliente[0] = new Cliente(0, 0, cuentasBancarias[0], cuentasBancarias);
        cliente[1] = new Cliente(1, 0, cuentasBancarias[0], cuentasBancarias);
        cliente[2] = new Cliente(2, 1, cuentasBancarias[1], cuentasBancarias);
        cliente[3] = new Cliente(3, 1, cuentasBancarias[1], cuentasBancarias);
        cliente[4] = new Cliente(4, 2, cuentasBancarias[2], cuentasBancarias);
        cliente[5] = new Cliente(5, 3, cuentasBancarias[3], cuentasBancarias);
        cliente[6] = new Cliente(6, 4, cuentasBancarias[4], cuentasBancarias);
        cliente[7] = new Cliente(7, 4, cuentasBancarias[4], cuentasBancarias);

        for (int i = 0; i < cliente.length; i++) {
            cliente[i].start();
        }
        for (int i = 0; i < cliente.length; i++) {
            try {
                cliente[i].join();
            } catch (InterruptedException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        for (int i = 0; i < cuentasBancarias.length; i++) {
            
            try {
                cuentasBancarias[i].imprimeSaldoFinal(i);
            } catch (IOException ex) {
                Logger.getLogger(Banco.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        
        // Abro explorer en la carpeta de archivos
        
        try {
            Process p = Runtime.getRuntime().exec("explorer .");
        } catch (IOException e) {
            System.out.println("No encuentro el explorer de Windows, ¿cómo es posible eso?");
        }
        System.out.println("\n" + (char)27 + "[35mEn la carpeta abierta, están los detalles de cada cuenta\nCuenta_0.txt"
                + "\nCuenta_1.txt\nCuenta_2.txt\nCuenta_3.txt\nCuenta_4.txt");
        
        
    }
}
