package ajedrez;

/**
 * Clase que representa una pieza de ajedrez. Está representada por un color,
 * blanco o negro, y el tipo de la pieza; una de las 6 posibles.
 * @date 28-nov-2017 @time 17:33:26
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Pieza {
    // true para blancas, false para negras
    private final boolean color;
    
    public enum TipoPieza{
        REY, REINA, TORRE, CABALLO, ALFIL, PEON;
    }
    private final TipoPieza tipoPieza;
    
    /**
     * Constructor que asigna el color de la pieza y su tipo.
     * @param tipoPieza El tipo de la pieza será una de las seis posibles.
     * @param color El color será true para las blancas y false en caso contrario.
     */
    public Pieza(TipoPieza tipoPieza, boolean color){
        this.color = color;
        this.tipoPieza = tipoPieza;
    }
    
    /**
     * Método que obtiene el color de una pieza de ajedrez.
     * @return Devuelve verdadero para las blancas y falso en caso contrario.
     */
    public boolean getColor(){
        return color;
    }
    
    /**
     * Método que obtiene el tipo de una pieza.
     * @return El tipo de la pieza: peón, alfil, caballo, torre, rey o reina.
     */    
    public TipoPieza getTipo(){
        return tipoPieza;
    }
}
