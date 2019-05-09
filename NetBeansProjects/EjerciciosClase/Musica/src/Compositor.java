/**
 * Clase que representa un compositor de m�sica. Se encarga de la generaci�n de las notas y de 
 * enviarlas a la partitura para que se toquen all�.
 * @author 1DAMDAW
 */
public class Compositor extends Thread{

	private int id;
	private String notaReal;
	private Partitura partitura;
	
	/**
	 * Constructor de la clase. Almacena el identificador y la partitura en sus atributos correspondientes.
	 * @param id Identificador del hilo: puede ser 0 o 1.
	 * @param partitura Objeto compartido que almacena los compases musicales.
	 */
	public Compositor(int id, Partitura partitura){
		this.id = id;
		this.partitura = partitura;
	}
	
	/**
	 * M�todo de ejecuci�n del hilo. Genera notas y las env�a a la partitura para que sean tocadas,
	 * mientras no se alcance el n�mero de compases definitivo.
	 */
	public void run(){		
		int nota;

		while(! partitura.estaTerminada()){
			nota = (int)(Math.random()*7);		
			
			notaReal = "";
			switch(nota){
			case 0:
				notaReal = "DO";
				break;
			case 1:
				notaReal = "RE";
				break;
			case 2:
				notaReal = "MI";
				break;
			case 3:
				notaReal = "FA";
				break;
			case 4:
				notaReal = "SOL";
				break;
			case 5:
				notaReal = "LA";
				break;
			default:
				notaReal = "S�";			
			}
			partitura.tocarNota(notaReal, id);			
		}
	}
}
