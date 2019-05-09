package comparadorcadenas;

import java.util.Scanner;

public class ComparadorCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer ambas cadenas de entrada estándar  
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca la primera cadena para comparar: ");                      
        String cadena1 = scanner.nextLine();
        
        System.out.println("Introduzca la segunda cadena para comparar: ");                      
        String cadena2 = scanner.nextLine();
        
        // Variable para cortar el bucle en caso de que las cadenas sean de igual tamaño y haya algún caracter diferente
        boolean exito = true;
        
        // Cadena concordante
        String concordante = "";
        
        // Comprobar caracter a caracter 
        int i=0,j=0;
        while(exito==true && i<cadena1.length() && j<cadena2.length()){
            if(cadena1.charAt(i)==cadena2.charAt(j)){                
                concordante += cadena1.charAt(i);
                i++; j++;
            }
            else if(cadena1.length()<cadena2.length()){
                j++;
                concordante="";
            }
            else if(cadena1.length()>cadena2.length()){
                i++;
                concordante="";
            }
            else
                exito=false;
        }
        
        // Imprimir resultado
        if(exito==true && concordante.equals(cadena1)){
            System.out.println("La cadena "+cadena1+" es una subcadena de la cadena "+cadena2);
        }
        else if(exito==true && concordante.equals(cadena2)){
                System.out.println("La cadena "+cadena2+" es una subcadena de la cadena "+cadena1);
        }
        else{
            System.out.println("Ninguna cadena es subcadena de la otra");
        }
    }
    
}