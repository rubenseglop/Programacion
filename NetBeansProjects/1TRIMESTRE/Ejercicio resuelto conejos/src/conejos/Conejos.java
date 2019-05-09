package conejos;
import java.util.Scanner;

public class Conejos {    
    // Función recursiva para el calculo de los conejos existentes en un mes dado
    // El crecimiento de la población de conejos viene dado por la sucesión de Fibonacci
    public static long parejasConejos(int mes){
        // Los casos base son los meses 0 y 1 
        long parejasConejos = mes;
        
        // La población de conejos crece de forma que los conejos en un mes son 
        // la suma de los conejos de los dos meses anteriores.
        if(mes!=0 && mes!=1){
            parejasConejos = parejasConejos(mes-2) + parejasConejos(mes-1);
        }
        return parejasConejos;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Introduzca el mes para el que se quiere consultar el número de parejas: ");
        int numMes = scanner.nextInt();
        System.out.println("Existen para el mes "+numMes+" el número de parejas siguiente: "+parejasConejos(numMes));        
    }
    
}