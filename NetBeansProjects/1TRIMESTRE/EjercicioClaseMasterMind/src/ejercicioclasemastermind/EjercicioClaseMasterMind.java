/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclasemastermind;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class EjercicioClaseMasterMind {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeromaquina[] =
        {(int)Math.round(Math.random()*9),
         (int)Math.round(Math.random()*9),
         (int)Math.round(Math.random()*9),
         (int)Math.round(Math.random()*9)
        };
        int letra;
        int posicioncorrecta=0;
        int aciertos=0;
        Scanner entrada = new Scanner(System.in);
        int acierto=0,intentos=0;
        while (intentos==0) {
            System.out.println("Nivel de dificultad\ndificil (4 intentos)\nmedio (6 intentos)\nprincipiante (8 intentos)");
            String dificultad=entrada.nextLine();
            switch (dificultad) {
                case "dificil":
                    intentos=4;
                    break;
                case "medio":
                    intentos=6;
                    break;
                case "principiante":
                    intentos=8;
                    break;
                default:
                    break;
            }
        }
        
                
        
        int minumero[]={0,0,0,0};
        while (acierto==4 || intentos>0) {
            posicioncorrecta=0;
            System.out.println("Introduce tu número: " + numeromaquina[0] + numeromaquina[1] + numeromaquina[2] + numeromaquina[3]);
            int numero=entrada.nextInt();
            if (numero<=9999) {
                String num= String.valueOf(numero); //System.out.println("num = " + num);
                for (int i = 0; i <=3; i++) {
                minumero[i]=Integer.parseInt(num.substring(i,i+1)); 
                //System.out.println("i=" + i +" n=" + num.charAt(i) + "\n" +minumero[0] +" "+ minumero[1] + " "+ minumero[2] + " " +minumero[3] );                   
                }
                
                for (int i = 0; i<=3; i++) {
                    for (int j = 0;j<=3; j++) {
                        
                        if (minumero[i]==numeromaquina[j]) {
                            
                            if (i==j) {
                                posicioncorrecta++;
                                
                            } 
                            else {
                                acierto++;
                                
                            }
                            ;
                        }
                    }
                    
                }
                if (posicioncorrecta!=4) {
                    System.out.println("Intentos: "+ intentos +"\n" + "Aciertos " + aciertos + " Posiciones correctas " + posicioncorrecta);
                    
                }
                else {
                    System.out.println("ACERTASTE!!!! el número era: " + numero);
                    intentos=0;
                }
                intentos--;
                
            }
        }
    }
    
}
