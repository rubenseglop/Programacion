/**
 * Clase que representa la partitura, cuya instancia almacenar� los compases tocados por el m�sico.
 * @author 1DAMDAW
 */
public class Partitura {
	private String compas;
	private int numCompases;
	private int contador;
	private int turno;
	
	/**
	 * Constructor que inicializa los atributos a sus valores por defecto y establece un turno aleatorio para comenzar.
	 */
	public Partitura(){
		compas = "";
		if(Math.random()>0.5)	turno = 1;
		else					turno = 0;
		contador = 0;
		numCompases = 0;
	}
	
	/**
	 * M�todo encargado de almacenar una nota en el comp�s correspondiente. Est� sujeto a sincronizaci�n.
	 * @param notaReal La nota a guardar en el comp�s, en formato de cadena de caracteres.
	 * @param id Identificador del hilo que intenta guardar la nota en el comp�s correspondiente.
	 */
	public synchronized void tocarNota(String notaReal, int id){
		// Nos bloqueamos si el comp�s est� lleno o si no nos toca a nosotros		
		while(contador>3 || turno!=id){
			try{
				wait();
			}
			catch(InterruptedException ex)
			{
				System.err.println("Algo interrumpi� el bloqueo del hilo. ");
			};			
		}
		// metemos nota en comp�s
			compas = compas + notaReal;
			if(contador<3)	compas += " - ";
			System.out.println("Hilo "+id+ " toca la nota: "+notaReal);			
				
		// modificamos las condiciones
		contador++;
		if(contador==4){
			turno=2;
			numCompases++;
		}
		// Calculamos el resto para asegurarnos de que la ejecuci�n la realiza o bien el compositor 0 o el compositor 1.
		else	turno = (turno+1)%2;
		
		notifyAll();
	}
	
	/**
	 * Comprueba si se han alcanzado el n�mero de compases total.
	 * @return Valor l�gico indicando verdadero si el n�mero de compases alcanz� 63 y falso en caso contrario.
	 */
	public boolean estaTerminada(){
		return numCompases>63;
	}
	
	/**
	 * M�todo que obtiene el n�mero de compases que han sido compuestos hasta ahora.
	 * @return N�mero de compases compuestos hasta ahora.
	 */
	public int getCompases(){
		return numCompases;
	}
	
	/**
	 * M�todo que devuelve el comp�s cuando este ha sido generado correctamente.
	 * @return El comp�s en forma de cadena de caracteres.
	 * Este m�todo est� sincronizado.
	 */
	public synchronized String cantar(){
		// Cuando el turno vale dos representa que el comp�s ya ha sido completado satisfactoriamente.
		while(turno!=2){
			try{
				wait();
			}
			catch(InterruptedException ie){
				System.out.println("Algo interrumpi� la ejecuci�n mientras estaba bloqueado el hilo");
			}
		}
		String c = compas;
		compas = "";
		contador = 0;
		
		if(Math.random()>=0.5)	turno = 1;
		else					turno = 0;
		
		notifyAll();
		return c;
	}
}
