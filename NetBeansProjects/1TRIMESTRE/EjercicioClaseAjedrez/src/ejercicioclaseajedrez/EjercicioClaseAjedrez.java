/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclaseajedrez;

/**
 *
 * @author ruben
 */
public class EjercicioClaseAjedrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*Blancas King 1, Queen 2, Alfin 3, Torre 4, Caballo 5, Peon 6
          Negras King 7, Queen 8, Alfin 9, Torre 10, Caballo 11, Peon 12 
        */ 
        int blancas=0,negras=0;
        int[][] tablero={
            {3,0,0,0,             0,0,2,4},
            {0,10,0,0,            0,0,0,3},
            {0,0,0,0,             0,0,4,0},
            {0,6,9,0,             12,0,12,0},
            {0,0,6,0,             8,0,0,0},
            {0,12,0,0,            6,0,0,12},
            {0,0,0,0,             1,0,0,6},
            {0,0,0,5,             0,5,0,0}            
        
        };
        int[] pieza= new int[12];
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               if (tablero[i][j]>=7) {
                   if (tablero[i][j]==7) pieza[6]++;
                   if (tablero[i][j]==8) pieza[7]++;
                   if (tablero[i][j]==9) pieza[8]++;
                   if (tablero[i][j]==10) pieza[9]++;
                   if (tablero[i][j]==11) pieza[10]++;
                   if (tablero[i][j]==12) pieza[11]++;
             
                   
                   negras++;
               }
               else {
                   if (tablero[i][j]==1) pieza[0]++;
                   if (tablero[i][j]==2) pieza[1]++;
                   if (tablero[i][j]==3) pieza[2]++;
                   if (tablero[i][j]==4) pieza[3]++;
                   if (tablero[i][j]==5) pieza[4]++;
                   if (tablero[i][j]==6) pieza[5]++;
                   
                   
                   if (tablero[i][j]!=0) blancas++;
               
               
            }
        }
        // Imprimir el resultado
        
        /*Blancas King 1, Queen 2, Alfin 3, Torre 4, Caballo 5, Peon 6
          Negras King 7, Queen 8, Alfin 9, Torre 10, Caballo 11, Peon 12 
        */ 
        System.out.println("Blancas\n=====");    
        System.out.println("Rey: " + pieza[0]);
        System.out.println("Queen: " + pieza[1]);
        System.out.println("Alfin: " + pieza[2]);
        System.out.println("Torre: " + pieza[3]);
        System.out.println("Caballo: " + pieza[4]);
        System.out.println("Peón: " + pieza[5]);
        System.out.println("Total Blancas:" + blancas);
        
        System.out.println("\nNegras\n=====");
        System.out.println("Rey: " + pieza[6]);
        System.out.println("Queen: " + pieza[7]);
        System.out.println("Alfin: " + pieza[8]);
        System.out.println("Torre: " + pieza[9]);
        System.out.println("Caballo: " + pieza[10]);
        System.out.println("Peón: " + pieza[11]);
        System.out.println("Total Negras:" + negras);    

        }

    }
}


