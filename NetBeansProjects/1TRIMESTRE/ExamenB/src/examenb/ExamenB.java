/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenb;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class ExamenB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introducir los datos");
        int numero = 0, edad;
        LinkedList lista = new LinkedList();

    

    
        do {
            numero++;
        System.out.println("Introduce edad del votante número " + numero);
        edad = entrada.nextInt();
        elecciones votacion = lista.add(new elecciones(numero, edad));
        if (edad == 0) {

        } else {
            System.out.println("Introduce los 5 números de votos");
            int ca = entrada.nextInt();
            int ce = entrada.nextInt();
            int ci = entrada.nextInt();
            int co = entrada.nextInt();
            int cu = entrada.nextInt();
            votacion.votos(ca * edad, ce * edad, ci * edad, co * edad, cu * edad);
        }

    }
    while (edad

    != 0);
    System.out.println (
    "Resultados votaciones");
    for (int i = 0;
    i< numero ;
    i

    
    

++) {
            
            
        }

    }

}
