/**
 * Calcula las notas del alumnado de Ciencias y lo imprime por pantalla.
 * @author 1DAMDAW
 * Esta clase implmeenta la interfaz Departamento.
 */
public class Ciencias implements Departamento{	
	/**
	 * Calcula la nota del departamento de Ciencias con la siguiente fórmula:
	 * 90% nota Experimentos + 10% nota Actitud. 
	 * @return Cadena con la nota del alumn@.
	 */
	public String calcularNota(int i){
		int notaExperimentos = (int)(Math.random()*10+1);
		int notaActitud = (int)(Math.random()*10+1);
		int notaFinal = (int)Math.round((notaExperimentos*0.9+notaActitud*0.1)); 
		String notaString = "" + "Alumn@ de Ciencias "+i+": ";
		notaString += "Nota experimentos: "+notaExperimentos+" ";
		notaString += "Nota actitud: "+notaActitud+" -> ";
		notaString += "Nota final: "+notaFinal;
		System.out.print("Alumn@ de Ciencias "+i+": ");
		System.out.print("Nota experimentos: "+notaExperimentos+" ");
		System.out.print("Nota actitud: "+notaActitud+" -> ");
		System.out.println("Nota final: "+notaFinal);
		return notaString;
	}
}
