/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.de.clase.pkg2;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class EjercicioDeClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int fin=0;
        int max=0;
        while (fin==0){
            System.out.println("Introduce un par de numeros de n (0) (0) para finalizar");
            
            int valora = entrada.nextInt();
            int valorb = entrada.nextInt();
            
            {
                if (valorb>valora) {
                for (double i=valora;i<valorb;i++) {
                    if (valora==0 || valorb==0) fin++;
                    if (valora>0) {
                        int resultado = operacion(i);
                        resultado++;    
                        if (resultado>max) max=resultado;
                    }    
                }
            //System.out.println("Resultado final: " + max );
            fin++;
            }
            else {
                System.out.println("El bucle es incorrecto");
                fin++;
            }
            
            System.out.println(valora + " " + valorb + " " + max);
                
            }
               
            
            
             
        }
        //System.out.println("El maximo de ciclos fue de:" + max);
    }
    private static int operacion(double numero){
            int ciclo=0,repeticion=0;
            if (numero>0 && numero<10000) {
                while (repeticion==0) {
                    if ((numero%2)!=0) {
                        numero=(3*numero)+1;
                        ciclo++;
                        //System.out.println(numero);
                    } 
                    else {
                        numero=numero/2;
                        ciclo++;
                        //System.out.println(numero);
                    }
                    if (numero==1) repeticion++;
                }    
            }
            else System.out.println("Error (n debe ser entre 0 y 10000");
            
        return ciclo;
    } 
}
