/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionumerosromanos;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class EjercicioNumerosRomanos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        System.out.println("Introduce un número decimal o romano");
        String cadena=entrada.nextLine();
                
        String resultado = "";
        //Determinar si es decimal o romana
        if (Character.isDigit(cadena.charAt(0))==true) {
            
            //decimal
            if (cadena.length()>=5 || Integer.parseInt(cadena)>=4000) {
                System.out.println("Demasiada larga. Limite 1-3999");
            }
            else {
                
                    int numero = Integer.parseInt(cadena);
                    if (numero>=1000) {
                       
                        
                        if (Integer.parseInt("" + cadena.charAt(0))==1) {
                            System.out.print("M");
                            numero=numero-1000;
                        } 
                        if (Integer.parseInt("" + cadena.charAt(0))==2) {
                            System.out.print("MM");
                            numero=numero-2000;
                        }
                        if (Integer.parseInt("" + cadena.charAt(0))==3) {
                            numero=numero-3000;
                            System.out.print("MMM");
                        }
                    }
                    if (numero<=100 && numero<=999) {
                       
                        if (Integer.parseInt("" + cadena.charAt(0))==1) System.out.print("C");
                        if (Integer.parseInt("" + cadena.charAt(0))==2) System.out.print("CC");
                        if (Integer.parseInt("" + cadena.charAt(0))==3) System.out.print("CCC");
                        if (Integer.parseInt("" + cadena.charAt(0))==4) System.out.print("CD");
                        if (Integer.parseInt("" + cadena.charAt(0))==5) System.out.print("D");
                        if (Integer.parseInt("" + cadena.charAt(0))==6) System.out.print("DC");
                        if (Integer.parseInt("" + cadena.charAt(0))==7) System.out.print("DCC");
                        if (Integer.parseInt("" + cadena.charAt(0))==8) System.out.print("DCCC");
                        if (Integer.parseInt("" + cadena.charAt(0))==9) System.out.print("CM");
                    }
                    
                     if (numero>=10 && numero<=99) {
                        if (Integer.parseInt("" + cadena.charAt(1))==1) System.out.print("X");
                        if (Integer.parseInt("" + cadena.charAt(1))==2) System.out.print("XX");
                        if (Integer.parseInt("" + cadena.charAt(1))==3) System.out.print("XXX");
                        if (Integer.parseInt("" + cadena.charAt(1))==4) System.out.print("XL");
                        if (Integer.parseInt("" + cadena.charAt(1))==5) System.out.print("L");
                        if (Integer.parseInt("" + cadena.charAt(1))==6) System.out.print("LX");
                        if (Integer.parseInt("" + cadena.charAt(1))==7) System.out.print("LXX");
                        if (Integer.parseInt("" + cadena.charAt(1))==8) System.out.print("LXXX");
                        if (Integer.parseInt("" + cadena.charAt(1))==9) System.out.print("XC");
                        
                     }
                     
                     if (numero>=1 && numero<=9) {
                        if (Integer.parseInt("" + cadena.charAt(0))==1) System.out.print("I");
                        if (Integer.parseInt("" + cadena.charAt(0))==2) System.out.print("II");
                        if (Integer.parseInt("" + cadena.charAt(0))==3) System.out.print("III");
                        if (Integer.parseInt("" + cadena.charAt(0))==4) System.out.print("IV");
                        if (Integer.parseInt("" + cadena.charAt(0))==5) System.out.print("V");
                        if (Integer.parseInt("" + cadena.charAt(0))==6) System.out.print("VI");
                        if (Integer.parseInt("" + cadena.charAt(0))==7) System.out.print("VII");
                        if (Integer.parseInt("" + cadena.charAt(0))==8) System.out.print("VIII");
                        if (Integer.parseInt("" + cadena.charAt(0))==9) System.out.print("IX");
                     }
                   
                 
                 
            
              
                   
            }
              

            
        }

        
    }
    
}
