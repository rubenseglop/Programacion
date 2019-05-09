package mariocastle;
import java.util.Scanner;

/**
 * Clase principal, realiza todos los cálculos de los saltos en ella.
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class MarioCastle {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        // T son los casos de prueba
        int t = scanner.nextInt();
        for(int i=1; i<=t; i++){
            // N son la cantidad de muros existentes.
            int n = scanner.nextInt();
            
            int saltosAbajo=0, saltosArriba=0;
            // Excepto en el caso de 0, en los demás el primer elemento será con el que comparemos
            int anterior = 0;
            if(n>0) anterior=scanner.nextInt();
            for(int j=1; j<n; j++){
                // Actual guarda el que estamos leyendo ahora mismo para compararlo con el anterior
                int actual = scanner.nextInt();
                if(actual>anterior)         saltosArriba++;
                else if(actual<anterior)    saltosAbajo++;
                
                // Después de actualizar los saltos, actualizamos el anterior para seguir comparando.
                anterior = actual;
            }
            
            // Por último imprimimos los saltos.
            System.out.println("Case "+i+": "+saltosArriba+" "+saltosAbajo);
        }
    }    
}