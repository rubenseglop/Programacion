/**
 * Clase que representa al departamento de Música.
 * @author 1DAMDAW
 * Implementa la interfaz Departamento.
 */
public class Musica implements Departamento{
	/**
	 * Método que calcula la nota del alumn@ del departamento de Música. Para ello usa la siguiente fórmula:
	 * 40% nota Examen + 30% nota Trabajos + 30% nota Actitud.	 
	 */
	public String calcularNota(int i){
		int notaExamen = (int)(Math.random()*10+1);
		int notaTrabajos = (int)(Math.random()*10+1);
		int notaActitud = (int)(Math.random()*10+1);
		int notaFinal = (int)Math.round((notaExamen*0.4+notaTrabajos*0.3+notaActitud*0.3));
		String notaString = "Alumn@ de Música "+i+": ";
		notaString += "Nota examen: "+notaExamen+" ";
		notaString += "Nota actitud: "+notaActitud+" ";
		notaString += "Nota trabajos: "+notaTrabajos+" -> ";
		System.out.print("Alumn@ de Música "+i+": ");
		System.out.print("Nota examen: "+notaExamen+" ");
		System.out.print("Nota actitud: "+notaActitud+" ");
		System.out.print("Nota trabajos: "+notaTrabajos+" -> ");
		
		System.out.println("Nota final: "+notaFinal);		return notaString;
	}
}
