package ajedrez;

/**
 * Clase principal de la aplicación que cuenta las piezas del tablero
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Ajedrez {

    /**
     * Método principal: crea tablero y cuenta las piezas; tanto blancas como negras.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        System.out.println("Piezas blancas en el tablero: ");
        tablero.cuentaPiezas(true);
        System.out.println("Piezas negras en el tablero: ");
        tablero.cuentaPiezas(false);
    }
    
}
