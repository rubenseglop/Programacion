/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocodigomorse;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class EjercicioCodigoMorse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int imprime;
        String[] matriz = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
                "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                "-.--", "--..","--.."};
  
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres");
        String cadena = entrada.nextLine();
             
        for (int i=0;i<cadena.length();i++) {
            //System.out.println("i" + i);
            if (cadena.charAt(i)>=65 && cadena.charAt(i)<=90) {
                //System.out.println(cadena.codePointAt(i));

                imprime = cadena.charAt(i)-65;
                System.out.print(matriz[imprime]);
                }
            if (cadena.codePointAt(i)==32) System.out.print(" ");
        }
        System.out.println();
    }
}
