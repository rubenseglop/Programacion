package ajedrez;

/**
 * Clase que representa una casilla del tablero de ajedrez. Está representada por
 * un valor lógico indicando si dicha casilla está o no ocupada y por una pieza en
 * caso de que la casilla no esté vacía.
 * @date 28-nov-2017 @time 17:41:35
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Casilla {
    private boolean ocupada;
    private Pieza pieza;
    
    /**
     * Constructor de la clase. En principio, las casillas estarán vacías.
     */
    public Casilla(){
        ocupada = false;
        pieza = null;
    }
    
    /**
     * Método que introduce una pieza en una casilla y la marca como ocupada.
     * @param pieza Pieza que introducimos en la casilla.
     */
    public void setPieza(Pieza pieza){
        this.pieza = pieza;
        ocupada = true;
    }
    
    /**
     * Método que obtiene la pieza alojada en la casilla.
     * @return Devuelve dicha pieza.
     */
    public Pieza getPieza(){
        return pieza;
    }
    
    /**
     * Método que consulta si la casilla está o no ocupada por una pieza.
     * @return Verdadero si está ocupada, falso en caso contrario.
     */
    public boolean estaOcupada(){
        return ocupada;
    }
}
