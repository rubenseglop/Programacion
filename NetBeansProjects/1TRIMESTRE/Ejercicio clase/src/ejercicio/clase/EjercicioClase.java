/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.clase;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class EjercicioClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner entradaEscaner;
        entradaEscaner = new Scanner (System.in);
        System.out.print("Introduzca una cadena de palabras\n");
        String cadena = entradaEscaner.nextLine();
        System.out.print("Introduzca una subcadena de palabras\n");
        String subcadena = entradaEscaner.nextLine();
 
        
        if (cadena.length()<subcadena.length()) {
            String cadenaintermedia;
            cadenaintermedia=subcadena;
            subcadena=cadena;
            cadena=cadenaintermedia;        
                 
        }
        if (cadena.length()>=subcadena.length()) {
            int comprobante = 0; // esta variable la usare para ver cadenas de caracteres que son identicas
            for(int i=0; i<subcadena.length(); i++) {
                for (int a=0; a<cadena.length();a++) {
                    if (subcadena.charAt(i)==cadena.charAt(a)) {
                        comprobante++; // System.out.println("c" + comprobante + "a" + a + "i" +i );
                        if (comprobante==subcadena.length()) {
                            System.out.println("Esta contenido");
                        }
                    }    
                }
            }                
        }          
    }
}
