/**
 * Clase principal de la aplicaci�n. Crea una partitura compartida, un m�sico que la toca y 
 * dos compositores encargados de generar las notas.
 * @author 1DAMDAW
 *
 */
public class Principal {

	/**
	 * M�todo principal de la aplicaci�n que se encarga de crear los diferentes objetos y lanzar los
	 * hilos correspondientes para la correcta ejecuci�n de la aplicaci�n.
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
