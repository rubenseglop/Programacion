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
public class CuentaCorriente {

    private double saldoCuenta;
    private int id_cuenta;
    private final Ficheros fichero;
    private String imprimir;
    private CuentaCorriente[] cuentasBancarias;
    private CuentaCorriente cuenta;

    public CuentaCorriente(double saldoInicio, int numero_cliente) {

        this.fichero = new Ficheros("Cuenta_" + numero_cliente);
        this.fichero.eliminaArchivo();
        saldoCuenta = saldoInicio;
    }

    /*Estos clientes podrán, lógicamente, tratar de acceder a su cuenta en cualquier momento, ya
sea para consultar cuánto dinero tienen, hacer un ingreso, retirar efectivo o realizar una
transferencia a otra cuenta. Además, las cuentas podrán tener más de un cliente como titular.*/
    public double imprimeSaldoInicio(int cliente, int numero_cuenta) throws IOException {
        id_cuenta = numero_cuenta;
        imprimir = String.valueOf(Math.round(saldoCuenta * 100d) / 100d);
        fichero.escribeArchivo("El saldo de inicio del cliente " + cliente + " en su cuenta es de: " + imprimir);
        return Math.round(saldoCuenta * 100d) / 100d;
    }

    public double imprimeSaldo(int cliente) throws IOException {
        imprimir = String.valueOf(Math.round(saldoCuenta * 100d) / 100d);
        fichero.escribeArchivo("Cliente " + cliente + " pidió su saldo que es de: " + imprimir);
        return Math.round(saldoCuenta * 100d) / 100d;
    }

    public void imprimeSaldoFinal(int cliente) throws IOException {
        imprimir = String.valueOf(Math.round(saldoCuenta * 100d) / 100d);
        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            Logger.getLogger(CuentaCorriente.class.getName()).log(Level.SEVERE, null, ex);
        }
        fichero.escribeArchivo("===========================================================");
        //imprimo el saldo final de cada cuenta
        fichero.escribeArchivo("El saldo final de la cuenta " + id_cuenta + " es de: " + imprimir);
        
        return ;
    }

    public void ingresarSaldo(int cuenta, double saldo) {
        saldoCuenta += saldo;
        saldo = (Math.round(saldo * 100d) / 100d);
        imprimir = String.valueOf(Math.round(saldoCuenta * 100d) / 100d);
        fichero.escribeArchivo("Se ingresaron " + saldo + " en la cuenta " + cuenta + ". El saldo de la cuenta es de " + imprimir);
    }

    public boolean retirarSaldo(int cliente, double saldo) {
        if (saldoCuenta - saldo > 0) {  //si hay efectivo
            saldoCuenta -= saldo;
            saldo = (Math.round(saldo * 100d) / 100d);
            imprimir = String.valueOf(Math.round(saldoCuenta * 100d) / 100d);
            fichero.escribeArchivo("El cliente " + cliente + " ha retirado " + saldo + " en su cuenta. El saldo de la cuenta es de " + imprimir);
            return true;
        } else {
            saldo = (Math.round(saldo * 100d) / 100d);
            fichero.escribeArchivo("El cliente " + cliente + " intentó retirar " + saldo + " en su cuenta y no pudo. El saldo de la cuenta es de " + imprimir);
            return false;
        }
    }

    /**
     * Método para transferir de una cuenta (this) a una cuenta ajena (cargamos
     * el array de objetos cuentas)
     *
     * @param clienteOrigen es el número de cliente origen
     * @param clienteDestino es el número de cliente de destino
     * @param saldo dinero que se va a traspasar
     * @param cuenta Objeto cuenta actual
     * @param cuentasBancarias Array de todas las cuentas bancarias
     */
    public void transferenciaSaldo(int clienteOrigen, int clienteDestino, double saldo, CuentaCorriente cuenta, CuentaCorriente[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
        this.cuenta = cuenta;
        if (this.retirarSaldo(clienteOrigen, saldo) == true) {
            fichero.escribeArchivo("El cliente " + clienteOrigen + " a realizado un transpaso a cliente " + clienteDestino + " de " + (Math.round(saldo * 100d) / 100d));
            cuentasBancarias[clienteDestino].ingresarSaldo(clienteDestino, saldo);
        }
    }

    public void depositos() {
        //no puedan ser retirados antes de 12 meses de la creación 
        //sume 1.1% por cada mes
        saldoCuenta = saldoCuenta * 1.1;
        fichero.escribeArchivo("Hemos aplicado un incremento de 10% en la cuenta " + id_cuenta);
    }

    public void intereses() {
        //cada mes 1.25%
        saldoCuenta = saldoCuenta * 1.25;
        fichero.escribeArchivo("Hemos aplicado un incremento de 25% en la cuenta " + id_cuenta);
    }

    public void imprimeMes(int mes, int dia){
        fichero.escribeArchivo("============== Mes " + mes + " día " + dia + "===============");
    }
    
}
