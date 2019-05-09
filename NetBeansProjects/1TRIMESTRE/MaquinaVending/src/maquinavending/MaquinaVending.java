package maquinavending;
import java.util.Scanner;

public class MaquinaVending {

    public static int[] devuelveCambio(double importeIntroducido, double precio){
        double cambio = importeIntroducido - precio;        
                    System.out.println("Primer Cambio: "+cambio);

        // Cada posición del array representa una moneda distinta dentro del sistema monetario del euro.
        int tipoMonedas [];
        tipoMonedas = new int[8];
        
        // Inicializamos las monedas a 0 de cada tipo
        for(int i=0; i<8; i++)  tipoMonedas[i]=0;
        
        while(cambio > 0){
            if(cambio>=2){
                cambio = cambio - 2.00;
                tipoMonedas[0]++;
            }
            else if(cambio>=1){
                cambio = cambio - 1.00;
                tipoMonedas[1]++;
            }
            else if(cambio>=0.50){
                cambio = cambio - 0.50;
                tipoMonedas[2]++;
            }
            else if(cambio>=0.20){
                cambio = cambio - 0.20;
                tipoMonedas[3]++;
            }
            else if(cambio>=0.10){
                cambio = cambio - 0.10;
                tipoMonedas[4]++;
            }
            else if(cambio>=0.05){
                cambio = cambio - 0.05;
                tipoMonedas[5]++;
            }
            else if(cambio>=0.02){
                cambio = cambio - 0.02;
                tipoMonedas[6]++;
            }
            else if(cambio>=0.01){
                cambio = cambio - 0.01;
                tipoMonedas[7]++;
            }
            else{
                cambio = 0;
            }
        }
        return tipoMonedas;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variable lógica utilizada para especificar cuando el usuario desea salir del menú
        boolean salir = false;

        double precio = 0;
        double importeIntroducido = 0;
        
        while(salir==false){
            int monedas[] = null;
            System.out.println("Opciones disponibles: refresco, agua, salir. ");
            System.out.println("Por favor, indique la opción que desea: ");
            
            Scanner entradaEscaner = new Scanner (System.in);
            String entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner                                                                
            
            if(null==entradaTeclado){
                System.out.println("Se ha equivocado. Introduzca por favor la opción correcta. ");
                System.out.println("Opciones correctas: refresco, agua, salir.");
            }
            else switch (entradaTeclado) {
                case "refresco":
                    System.out.println("Por favor, introduzca la cantidad en la máquina: ");
                    importeIntroducido = entradaEscaner.nextDouble();
                    precio = 1.20;
                    monedas = devuelveCambio(importeIntroducido, precio);
                    break;
                case "agua":
                    System.out.println("Por favor, introduzca la cantidad en la máquina: ");
                    importeIntroducido = entradaEscaner.nextDouble();
                    precio = 0.70;
                    monedas = devuelveCambio(importeIntroducido, precio);
                    break;
                case "salir":
                    System.out.println("Gracias por utilizar nuestro programa. ");
                    salir = true;
                    break;
                default:
                    System.out.println("Se ha equivocado. Introduzca por favor la opción correcta. ");
                    System.out.println("Opciones correctas: refresco, agua, salir.");
                    break;
            }
            
            // Ahora imprimos el cambio:
            if(monedas!=null){
                System.out.println("Su cambio es de: "+(importeIntroducido-precio));
                System.out.println("Monedas de 2 euros: " + monedas[0]);
                System.out.println("Monedas de 1 euro: " + monedas[1]);
                System.out.println("Monedas de 50 céntimos: " + monedas[2]);
                System.out.println("Monedas de 20 céntimos: " + monedas[3]);
                System.out.println("Monedas de 10 céntimos: " + monedas[4]);
                System.out.println("Monedas de 5 céntimos: " + monedas[5]);
                System.out.println("Monedas de 2 céntimos: " + monedas[6]);
                System.out.println("Monedas de 1 céntimo: " + monedas[7]);                
            }
        }        
    }
    
}