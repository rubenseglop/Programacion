/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.de.clase.pkg3;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class EjercicioDeClase3 {
    private int parejitas = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el número de meses");
        int meses = entrada.nextInt();
        
       // System.out.print(conejitos(meses,parejitas) + "Tenemos " + "conejitos");
    }
    private static int conejitos(int meses,int parejitas) {
        if (meses==1) {
            
            if (meses==3) {
               // conejitos (meses-1);
                parejitas++;
            }
        }
        return parejitas;
    }
} 

 


    

