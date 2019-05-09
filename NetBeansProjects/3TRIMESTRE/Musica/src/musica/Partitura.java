package musica;

/**
 * Clase que representa la partitura, cuya instancia almacenará los compases
 * tocados por el músico.
 *
 * @author 1DAMDAW
 */
public class Partitura {

    private String compas;
    private int numCompases;
    private int contador;
    private int turno;

    /**
     * Constructor que inicializa los atributos a sus valores por defecto y
     * establece un turno aleatorio para comenzar.
     */
    public Partitura() {
        compas = "";
        if (Math.random() > 0.5) {
            turno = 1;
        } 
        else {
            turno = 0;
        }
        contador = 0;
        numCompases = 0;
    }

    /**
     * Método encargado de almacenar una nota en el comp�s correspondiente. Está
     * sujeto a sincronización.
     *
     * @param notaReal La nota a guardar en el compás, en formato de cadena de
     * caracteres.
     * @param id Identificador del hilo que intenta guardar la nota en el compás
     * correspondiente.
     */
    @SuppressWarnings("empty-statement")
    public synchronized void tocarNota(String notaReal, int id) {
        // Nos bloqueamos si el comp�s est� lleno o si no nos toca a nosotros		
        while (contador > 3 || turno != id) {
            try {
                wait();
            } catch (InterruptedException ex) {
                System.err.println("Algo interrumpió el bloqueo del hilo. ");
            };
        }
        // metemos nota en compás
        compas = compas + notaReal;
        if (contador < 3) {
            compas += " - ";
        }
        System.out.println("Hilo " + id + " toca la nota: " + notaReal);

        // modificamos las condiciones
        contador++;
        if (contador == 4) {
            turno = 2;
            numCompases++;
        } // Calculamos el resto para asegurarnos de que la ejecución la realiza o bien el compositor 0 o el compositor 1.
        else {
            turno = (turno + 1) % 2; //dos compositores
        }

        notifyAll();
    }

    /**
     * Comprueba si se han alcanzado el número de compases total.
     *
     * @return Valor lógico indicando verdadero si el número de compases alcanzó
     * 63 y falso en caso contrario.
     */
    public boolean estaTerminada() {
        return numCompases > 63;
    }

    /**
     * Método que obtiene el número de compases que han sido compuestos hasta
     * ahora.
     *
     * @return Número de compases compuestos hasta ahora.
     */
    public int getCompases() {
        return numCompases;
    }

    /**
     * Método que devuelve el compás cuando este ha sido generado correctamente.
     *
     * @return El compás en forma de cadena de caracteres. Este método está
     * sincronizado.
     */
    public synchronized String cantar() {
        // Cuando el turno vale dos representa que el compás ya ha sido completado satisfactoriamente.
        while (turno != 2) {
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println("Algo interrumpió la ejecución mientras estaba bloqueado el hilo");
            }
        }
        String c = compas;
        compas = "";
        contador = 0;

        if (Math.random() >= 0.5) {
            turno = 1;
        } else {
            turno = 0;
        }

        notifyAll();
        return c;
    }
}
