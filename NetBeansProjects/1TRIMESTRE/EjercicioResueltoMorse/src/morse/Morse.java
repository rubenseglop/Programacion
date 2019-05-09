package morse;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Clase que traduce las letras mayúsculas de una frase al alfabeto Morse 
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Morse {
    /**
     * Método de clase que utiliza un diccionario de tipo Hashtable para hacer 
     * la conversión de letra mayúscula a Morse.
     * @return Devuelve la tabla Hash con el conjunto de pares clave-valor.
     */
    public static Hashtable generaAlfabeto(){
        Hashtable h = new Hashtable();
        // Introduciendo valores. Se hace una vez y no se vuelve a ejecutar
        h.put('A', ".-");
        h.put('E', ".");
        h.put('I', "..");
        h.put('M', "--");
        h.put('Q', "--.-");
        h.put('U', "..-");
        h.put('Y', "-.--");
        h.put('B', "-...");
        h.put('F', "..-.");
        h.put('J', ".---");
        h.put('N', "-.");
        h.put('R', ".-.");
        h.put('V', "...-");
        h.put('Z', "--..");
        h.put('C', "-.-.");
        h.put('G', "--.");
        h.put('K', "-.-");
        h.put('O', "---");
        h.put('S', "...");
        h.put('W', ".--");
        h.put('D', "-..");
        h.put('H', "....");
        h.put('L', ".-..");
        h.put('P', ".--.");
        h.put('T', "-");
        h.put('X', "-..-");        
        
        return h;
    }
    
    /**
     * Método de clase que realiza la traducción de la frase a Morse.
     * @param h El diccionario en forma de tabla Hash.
     * @param frase La frase a traducir
     * @return La frase ya traducida a Morse
     */
    public static String aMorse(Hashtable h, String frase){
        String morse = "";
        String traducido = "";
        for(int i=0;i<frase.length();i++){
            traducido = (String) h.get(frase.charAt(i));
            if(traducido!=null)   morse+=traducido;
        }
        return morse;
    }
    
    /**
     * Método principal de la aplicación. Lee la frase a traducir y la separa
     * en palabras diferentes para hacer la conversión de cada palabra a Morse.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = "";
        Hashtable h = generaAlfabeto();
        System.out.println("Introduce la frase a traducir a Morse por favor: ");
        frase = scanner.nextLine();
        while(! frase.equals("salir")){
            String palabras [] = frase.split(" ");
            for(String palabra:palabras){
                System.out.print(aMorse(h, palabra)+" ");
            }                        
            System.out.println();
            System.out.println("Escriba \"salir\" para salir o cualquier otra frase para ser traducida: ");
            frase = scanner.nextLine();
        }
    }    
}
