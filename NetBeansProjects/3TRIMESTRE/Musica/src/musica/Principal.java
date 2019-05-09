package musica;

/**
 * Clase principal de la aplicación. Crea una partitura compartida, un músico que la toca y 
 * dos compositores encargados de generar las notas.
 * @author 1DAMDAW
 *
 */
public class Principal {

	/**
	 * Método principal de la aplicación que se encarga de crear los diferentes objetos y lanzar los
	 * hilos correspondientes para la correcta ejecución de la aplicación.
	 * @param args
	 */
	public static void main(String[] args) {	
		Partitura partitura = new Partitura();
                
		Musico musico = new Musico(partitura);
		Compositor c1 = new Compositor(0, partitura);
		Compositor c2 = new Compositor(1, partitura);
                
		c1.start();
		c2.start();
		musico.start();
	}
}
