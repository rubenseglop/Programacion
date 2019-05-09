package incertidumbre;

import static incertidumbre.BoolWorld.*;
import java.util.Scanner;

/**
 * Clase principal del programa que utiliza el nuevo tipo de datos: BoolPlus.
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Incertidumbre {
    /**
     * Función que convierte una cadena de texto introducida por teclado en un tipo válido BoolPlus.
     * @param token Recibe una cadena de texto que representa el tipo BoolPlus introducido.
     * @return el tipo BoolPlus correspondiente
     */
    public static BoolPlus transforma(String token){
        BoolPlus valor = BoolPlus.FALSO;
        switch(token){
            case "CIERTO": case "cierto":
                valor = BoolPlus.CIERTO;
                break;
            case "TALVEZ": case "talvez":
                valor = BoolPlus.TALVEZ;
        }
        return valor;
    }
    
    /**
     * Método principal, realiza la entrada y la salida del programa.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Sigue leyendo mientras queden tokens por introducir.
        while(scanner.hasNext()){
            // Con el primer token sabremos si es negación u otra de las dos operaciones.
            String token1 = scanner.next();
            
            if(token1.equals("!")){
                String token = scanner.next();
                System.out.println(negacion(transforma(token)));
            }
            else{
                String operador = scanner.next();
                String token2 = scanner.next();

                switch(operador){
                    case "&&":
                        System.out.println(conjuncion(transforma(token1), transforma(token2)));
                        break;
                    case "||":
                        System.out.println(disyuncion(transforma(token1), transforma(token2)));
                }
                
            }
        }
    }
}