/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_clase_cuadradro_magico;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Ejercicio_clase_Cuadradro_magico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        
        int[][] cuadrado={
//            {4, 9, 2},
//            {3, 5, 7},
//            {8, 1, 6}
//    };
//       
      {16,3,2,13},
        {5,10,11,8},
        {9,6,7,12},
        {4,15,14,1}
  };
        boolean esmagico=true;


        System.out.println("La matriz es de " + cuadrado.length);
        // Comprobaciones de que va guay to
        int lado=cuadrado.length;

        // Me creo una matriz para sumar por filas
        int[] sumas=new int[lado]; System.out.println("Lado es " + lado);
        // Compruebo filas si son iguales
        // Primeramente las sumo
        for (int i=0;i<lado;i++) {
            for (int k=0;k<lado;k++) {
                sumas[i]=sumas[i]+cuadrado[i][k];               
            }
        }
        
        // Las compruebo
        for (int i=0;i<lado;i++) {
        
        if (sumas[i]!=sumas[0]) {
            esmagico=false;
            System.out.println("No suma bien la fila " + i + " " + sumas[i]);
        }
        }
        
        // Compruebo coluimnas si son iguales
        // Primeramente las sumo
        for (int i=0;i<lado;i++) {
            for (int k=0;k<lado;k++) {
                sumas[i]=sumas[i]+cuadrado[k][i];               
            }
        }
        
        // Las compruebo
        for (int i=0;i<lado;i++) {
        
        if (sumas[i]!=sumas[0]) {
            esmagico=false;
            System.out.println("No suma bien la columna " + i + " " + sumas[i]);
        }
        }
                
        int diagonal1=0,diagonal2=0;
         // Compruebo diagonales si son iguales
        // Primeramente las sumo
        for (int i=0;i<lado;i++) {            
            diagonal1=diagonal1+cuadrado[i][i];   
        }
        int smadia=0;
        for (int j=lado-1;j>-1;j--) {
           
            diagonal2=diagonal2 + cuadrado[j][smadia]; 
            
            smadia++;
        }
        // Las compruebo
        if (diagonal1!=diagonal2) {
            esmagico=false;
        System.out.println("Las diagonales no suman igual" + diagonal1 + " y " + diagonal2);
        }
            
    
        
    if (esmagico) System.out.println("Es mágico");
    else System.out.println("No es magico");
    }
    
}
    

    
    
    

