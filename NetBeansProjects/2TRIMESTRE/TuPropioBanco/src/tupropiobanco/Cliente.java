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
public class Cliente extends Thread {

    private int numero_cliente;
    private int mi_cuenta_corriente;
    private final CuentaCorriente cuenta;
    private final CuentaCorriente[] cuentasBancarias;
    private boolean finalizar = false;
    private boolean turno;
    private int dia;
    private int mes;

    /**
     * Constructor del método cliente
     *
     * @param numero_cliente es la id del número de cliente
     * @param numero_cuenta_corriente es el número de cuenta
     * @param cuenta
     */
    public Cliente(int numero_cliente, int numero_cuenta_corriente, CuentaCorriente cuenta, CuentaCorriente[] cuentasBancarias) {
        this.mes = 0;
        this.dia = 0;
        this.turno = true;
        this.numero_cliente = numero_cliente;
        this.mi_cuenta_corriente = numero_cuenta_corriente;
        this.cuenta = cuenta;
        this.cuentasBancarias = cuentasBancarias;
    }

    /**
     * Método que devuelve el número de Cliente
     *
     * @return devuelve número de cliente
     */
    public int numeroCliente() {
        return numero_cliente;
    }

    /**
     * Metodo que da fin al proceso cliente
     */
    public void finalizar() {
        finalizar = true;
    }

    @Override
    public void run() {

        while (mes < 24) {
            System.out.println("Cliente " + this.numero_cliente + " está realizando operaciones...");

            //Meter acciones que realizaran los clientes (aleatoriamente)
            int aleatorio = (int) (Math.random() * 7);

            dia++;
            switch (aleatorio) {
                case 0: //ver mi saldo
                    try {
                        cuenta.imprimeSaldo(mi_cuenta_corriente);
                    } catch (IOException ex) {
                        Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;

                case 1: // ingresar saldo en mi cuenta
                    cuenta.ingresarSaldo(mi_cuenta_corriente, Math.random() * 500);
                    break;
                case 2: // retirar saldo en mi cuenta
                    cuenta.retirarSaldo(mi_cuenta_corriente, Math.random() * 500);
                case 3: { // traspasar saldo de mi cuenta a otra diferente
                    boolean c_azar = true;
                    int clienteDestino = 0;
                    while (c_azar == true) {
                        clienteDestino = (int) (Math.random() * 4);
                        if (clienteDestino != mi_cuenta_corriente) { // compruebo que no sea la mia (un traspaso a mi mismo)
                            c_azar = false;
                        }
                    }
                    cuenta.transferenciaSaldo(this.numero_cliente, clienteDestino, Math.random() * 500, cuenta, cuentasBancarias);
                    break;
                }
            }

            if (dia > 31) {
                mes++;
                dia = 1;
                {
                    // aplico depositos/intereses al mes
                    this.cuenta.depositos();
                    this.cuenta.intereses();
                }
            }

            cuenta.imprimeMes(mes, dia);

        }

        //final
    }

    public void final_cliente() {
        try {
            cuenta.imprimeSaldoFinal(numero_cliente);
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
