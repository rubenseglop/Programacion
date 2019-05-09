/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franciscorubenseguralopez_1;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class FranciscoRubenSeguraLopez_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int correcto = 0;
        int numero1, numero2;
        int calcula;

        do {
            System.out.println("Introduce tu primer número");
            numero1 = entrada.nextInt();
            System.out.println("Introduce tu segundo número");
            numero2 = entrada.nextInt();
            if (numero1 >= numero2) {
                System.out.println("El segundo número no puede ser igual o menor al primero");
            } else {
                correcto++;
            }

        } while (correcto == 0);

        // bucle que recorre de numero1 a numero2
        int totalcubos = 0;
        for (int i = 1; i <= numero2; i++) {

            // comprobación
            calcula = i * i * i;
            if (calcula >= numero1 && calcula <= numero2) {
                System.out.println("Cubos encontrados: " + calcula);
                totalcubos++;

            }

        }
        System.out.print("Hubo un total de " + totalcubos + " cubo");
        
        // ¿cubo o cubos?
        if (totalcubos>1) System.out.println("s");
        else System.out.println();

    }

}
