package ajedrez;

import ajedrez.Pieza.TipoPieza;

/**
 * Clase que representa un tablero de ajedrez.
 * @date 28-nov-2017 @time 17:39:42
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Tablero {
    // Array de casillas correspondiente al tablero (8x8)
    private final Casilla tablero[][];
    
    /**
     * Constructor que inicializa el tablero con casillas vacías y después rellena
     * las casillas que sí tienen piezas con las correspondientes.
     */
    public Tablero(){
        tablero = new Casilla[8][8];
        
        // Inicializamos el tablero con casillas vacías. 
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                tablero[i][j] = new Casilla();
            }
        }
        
        /**
         * En esta parte rellenamos el tablero con las piezas del enunciado
         * Sería ideal poder introducirla desde fuera de la aplicación para albergar
         * más ejemplos.
        **/         
        tablero[0][0].setPieza(new Pieza(TipoPieza.ALFIL, true));
        tablero[0][6].setPieza(new Pieza(TipoPieza.REINA, true));
        tablero[0][7].setPieza(new Pieza(TipoPieza.TORRE, true));
        tablero[1][1].setPieza(new Pieza(TipoPieza.TORRE, false));
        tablero[1][7].setPieza(new Pieza(TipoPieza.ALFIL, true));
        tablero[2][6].setPieza(new Pieza(TipoPieza.TORRE, true));
        tablero[3][1].setPieza(new Pieza(TipoPieza.PEON, true));
        tablero[3][2].setPieza(new Pieza(TipoPieza.ALFIL, false));
        tablero[3][4].setPieza(new Pieza(TipoPieza.PEON, false));
        tablero[3][6].setPieza(new Pieza(TipoPieza.PEON, false));
        tablero[4][2].setPieza(new Pieza(TipoPieza.PEON, true));
        tablero[4][4].setPieza(new Pieza(TipoPieza.REINA, false));
        tablero[5][1].setPieza(new Pieza(TipoPieza.PEON, false));
        tablero[5][4].setPieza(new Pieza(TipoPieza.PEON, true));
        tablero[5][6].setPieza(new Pieza(TipoPieza.PEON, false));
        tablero[6][4].setPieza(new Pieza(TipoPieza.REY, true));
        tablero[6][7].setPieza(new Pieza(TipoPieza.PEON, true));
        tablero[7][3].setPieza(new Pieza(TipoPieza.CABALLO, true));
        tablero[7][5].setPieza(new Pieza(TipoPieza.CABALLO, true));
    }
    
    /**
     * Método que cuenta el número de piezas y el total de las mismas del color 
     * que se le pasa como parámetro, imprimiéndolo después por pantalla.
     * @param color 
     */
    public void cuentaPiezas(boolean color){
        int rey=0, reina=0, alfil=0, torre=0, caballo=0, peon=0;
        int totalColor = 0;
        for(int i=0; i<8; i++){
            for(int j=0; j<8; j++){
                if(tablero[i][j].estaOcupada() && tablero[i][j].getPieza().getColor()==color){
                    switch(tablero[i][j].getPieza().getTipo()){
                        case REY:
                            rey++;
                            break;
                        case REINA:
                            reina++;
                            break;
                        case ALFIL:
                            alfil++;
                            break;
                        case TORRE:
                            torre++;
                            break;
                        case CABALLO:
                            caballo++;
                            break;
                        case PEON:
                            peon++;                            
                    }
                    totalColor++;
                }
            }
        }        
        
        System.out.println("Rey: "+rey);
        System.out.println("Reina: "+reina);
        System.out.println("Alfil: "+alfil);
        System.out.println("Torre: "+torre);
        System.out.println("Caballo: "+caballo);
        System.out.println("Peón: "+peon);
        
        if(color==false)    System.out.println("Total negras: "+totalColor);
        else                System.out.println("Total blancas: "+totalColor);        
    }
}
