/**
 * Clase que representa el músico que toca los compases producidos por los compositores.
 * @author 1DAMDAW
 */
public class Musico extends Thread{
	Partitura partitura;
	
	/**
	 * Constructor que almacena la partitura compartida en el atributo correspondiente.
	 * @param partitura
	 */
	public Musico(Partitura partitura){
		this.partitura = partitura;
		
	}
	
	/**
	 * Método de ejecución del hilo, que se encarga de imprimir los compases conforme son generados.
	 */
	public void run(){
		while(! partitura.estaTerminada()){
			System.out.println("El compás número "+partitura.getCompases()+" es: "+partitura.cantar());
		}
	}
}
