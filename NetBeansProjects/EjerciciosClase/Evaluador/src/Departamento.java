/**
 * Interfaz que representa un departamento genérico del IES.
 * @author 1DAMDAW
 *
 */
public interface Departamento {
	/**
	 * Método que calcula la nota del alumn@ del departamento.
	 * @param i Identificador del alumn@.
	 * @return La nota en forma de cadena de caracteres.
	 */
	public String calcularNota(int i);
}
