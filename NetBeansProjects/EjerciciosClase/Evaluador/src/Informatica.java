/**
 * Clase que representa al departamento de Inform�tica del IES.
 * @author 1DAMDAW
 * Esta clase implementa la interfaz Departamento.
 */
public class Informatica implements Departamento{
	/**
	 * Calcula la nota del alumn@ del departamento de Inform�tica. Para ello utiliza la siguiente f�rmula:
	 * 80% nota Examen + 20% nota Trabajos.	 
	 */
	public String calcularNota(int i){
		int notaExamen = (int)Math.round((Math.random()*10)+1);
		int notaTrabajos = (int)Math.round((Math.random()*10)+1);
		int notaFinal = (int)Math.round((notaExamen*0.8+notaTrabajos*0.2));
		String notaString = "" + "Alumn@ de Inform�tica "+i+": ";
		notaString += "Nota examen: "+notaExamen+" ";
		notaString += "Nota trabajos: "+notaTrabajos+" -> ";
		notaString += "Nota final: "+notaFinal;
		System.out.print("Alumn@ de Inform�tica "+i+": ");
		System.out.print("Nota examen: "+notaExamen+" ");
		System.out.print("Nota trabajos: "+notaTrabajos+" -> ");
		System.out.println("Nota final: "+notaFinal);
		return notaString;			
	}
}
