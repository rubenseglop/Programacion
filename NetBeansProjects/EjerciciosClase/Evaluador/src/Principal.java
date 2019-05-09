import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 * Clase principal de la aplicación. Calcula las notas de diferentes alumn@s de distintos depratamentos,
 * las carga en un fichero y posteriormente las lee del mismo y las imprime por pantalla.
 * @author 1DAMDAW
 */
public class Principal {
	/**
	 * Lee un fichero de texto y devuelve un String con el contenido del mismo.
	 * @param rutaFichero
	 * @param mensajeExcepcion
	 * @return
	 */
    public static String leeFichero(String rutaFichero, String mensajeExcepcion){        
        Scanner lecturaScanner = null;                        
        Scanner rutaScanner = null;
        while(lecturaScanner==null){
            try{            
                lecturaScanner = new Scanner(new FileInputStream(rutaFichero));
            }
            catch(FileNotFoundException ex){
                System.out.println(mensajeExcepcion);
                rutaScanner = new Scanner(System.in);
                rutaFichero = rutaScanner.nextLine();
            }       
        }
        
        String linea = "";
        while(lecturaScanner.hasNext()){
            linea += lecturaScanner.nextLine();
            linea += "\n";
        }
        lecturaScanner.close();  
        if(rutaScanner!=null)   rutaScanner.close();
        return linea;
    }

	/**
	 * Método principal de la aplicación. Crea un array de departamentos diferentes entre sí,
	 * y posteriormente calcula las notas del alumnado, las imprime, las escribe en un fichero,
	 * y después las lee y las vuelve a imprime. 
	 * @param args
	 */
	public static void main(String[] args) {		
		Departamento departamentos [] = new Departamento [3];
		departamentos[0] = new  Ciencias();
		departamentos[1] = new  Informatica();
		departamentos[2] = new  Musica();		

		System.out.println("Lectura del fichero generado: ");
		// Crear y escribir en fichero nuevo
        String rutaFichero = "src/Departamentos.txt";
        String mensajeExcepcion = "Ruta incorrecta, introduzca ruta correcta: ";
		FileWriter fw = null;
		PrintWriter pw = null;

        while(fw==null || pw==null){
            try{
                // Creamos fichero de caracteres
                fw = new FileWriter(rutaFichero);
                // Creamos flujo de texto
                pw = new PrintWriter(fw);
                // Imprimimos lo leído en el flujo de texto
        		for(int i=0; i<10; i++)	pw.write(departamentos[0].calcularNota(i));
        		for(int i=0; i<10; i++)	pw.write(departamentos[1].calcularNota(i));
        		for(int i=0; i<10; i++)	pw.write(departamentos[2].calcularNota(i));
            }
            catch(IOException io){
                System.out.println(io.getMessage());
                System.out.println("No se puede utilizar ese nombre de archivo,"
                        + " por favor, indica otro: ");
                Scanner rutaCopia = new Scanner(System.in);
                rutaFichero = rutaCopia.nextLine();
            }
        }    
        
        // Cerrar flujos utilizados para el fichero de copia
        try{
            fw.close();
        }
        catch(IOException io){
            System.out.println("Problemas al cerrar fichero.");
            System.out.println(io.getMessage());
        }
        pw.close();
		
		// Leer de fichero
        String linea = leeFichero(rutaFichero, "Problemas con la ruta del fichero"
                + ". Revise la ruta y escríbala de nuevo");
	
        // Mostrar fichero copiado
        System.out.println("Contenido del fichero importante: ");
        System.out.println(linea);    
	}

}
