package incertidumbre;

/**
 * Clase que contiene las operaciones que involucran distintos tipos BoolPlus.
 * @date 24-nov-2017 @time 17:09:46
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class BoolWorld {   
    /**
     * Función que realiza las operaciones según la tabla de conjunción.
     * @param a primer dato a operar
     * @param b segundo dato a operar
     * @return Devuelve el valor lógico correspondiente a la tabla.
     */
    public static BoolPlus conjuncion(BoolPlus a, BoolPlus b){
        BoolPlus c = BoolPlus.FALSO;
        
        switch(a){
            case TALVEZ:
                switch(b){
                    case TALVEZ: case CIERTO:
                        c = BoolPlus.TALVEZ;
                }
                break;
            case CIERTO:
                switch(b){
                    case TALVEZ:
                        c = BoolPlus.TALVEZ;
                        break;
                    case CIERTO:
                        c = BoolPlus.CIERTO;                   
                }
        }
        return c;
    }
    
    /**
     * Función que realiza las operaciones correspondientes a la tabla de disyunción 
     * @param a Primer valor lógico a operar
     * @param b Segundo valor lógico a operar
     * @return Devuelve el valor lógico correspondiente a la tabla.
     */
    public static BoolPlus disyuncion(BoolPlus a, BoolPlus b){
        BoolPlus c = BoolPlus.CIERTO;
        
        switch(a){
            case TALVEZ:
                switch(b){
                    case FALSO: case TALVEZ:
                        c = BoolPlus.TALVEZ;
                }
                break;
            case FALSO:
                switch(b){
                    case FALSO:
                        c = BoolPlus.FALSO;
                        break;
                    case TALVEZ:
                        c = BoolPlus.TALVEZ;
                }
        }
        return c;
    }
    
    /**
     * Método que realiza la operación de negación según la tabla del enunciado.
     * @param a El valor lógico a negar.
     * @return El valor lógico resultante de realizar la negación según la tabla.
     */
    public static BoolPlus negacion(BoolPlus a){
        BoolPlus negacion = BoolPlus.FALSO;
        switch(a){
            case FALSO:
                negacion = BoolPlus.CIERTO;
                break;
            case TALVEZ:
                negacion = BoolPlus.TALVEZ;
        }
        return negacion;
    }
}