package romanos;

import java.util.Scanner;

/**
 * Programa que convierte números arábigos a romanos y viceversa.
 * @author Silvestre Martínez Jiménez de Cisneros
 */
public class Romanos {
    /**
     * Este método convierte a número romano. Como la entrada que nos piden está
     * entre 1 y 3.999, convierto todos los números a cadenas de cuatro dígitos
     * para facilitar la lectura posterior. Después simplemente hago un análisis
     * de casos con cada una de las cifras, teniendo en cuenta su posición.
     * @param entrada Cadena con un número arábigo
     * @return cadena con el número romano convertido
     */
    public static String aRomano(String entrada){
        String salida = "";        
        switch(entrada.length()){
            case 3:
                entrada = " " + entrada;
                break;
            case 2:
                entrada = "  " + entrada;
                break;
            case 1:
                entrada = "   " + entrada;
        }

        switch(entrada.charAt(0)){
            case '1':
                salida += "M";
                break;
            case '2':
                salida += "MM";
                break;
            case '3':
                salida += "MMM";
        }

        switch(entrada.charAt(1)){
            case '1':
                salida += "C";
                break;
            case '2':
                salida += "CC";
                break;
            case '3':
                salida += "CCC";
                break;
            case '4':
                salida += "CD";
                break;
            case '5':
                salida += "D";
                break;
            case '6':
                salida += "DC";
                break;
            case '7':
                salida += "DCC";
                break;
            case '8':
                salida += "DCCC";
                break;
            case '9':
                salida += "CM";                   
        }
        switch(entrada.charAt(2)){
            case '1':
                salida += "X";
                break;
            case '2':
                salida += "XX";
                break;
            case '3':
                salida += "XXX";
                break;
            case '4':
                salida += "XL";
                break;
            case '5':
                salida += "L";
                break;
            case '6':
                salida += "LX";
                break;
            case '7':
                salida += "LXX";
                break;
            case '8':
                salida += "LXXX";
                break;
            case '9':
                salida += "XC";                    
        }
        switch(entrada.charAt(3)){
            case '1':
                salida += "I";
                break;
            case '2':
                salida += "II";
                break;
            case '3':
                salida += "III";
                break;
            case '4':
                salida += "IV";
                break;
            case '5':
                salida += "V";
                break;
            case '6':
                salida += "VI";
                break;
            case '7':
                salida += "VII";
                break;
            case '8':
                salida += "VIII";
                break;
            case '9':
                salida += "IX";
        }                
                
        return salida;
    }
    
    /**
     * Este método convierte a número arábigo. Va leyendo carácter a carácter,
     * aunque en los casos susceptibles de influenciar o ser influenciado por el
     * carácter posterior, realizo la lectura directamente para tratar el caso en
     * el momento sin tener que deshacer cálculos hechos previamente.
     * @param entrada Cadena con un número romano a convertir
     * @return Cadena con el número arábigo convertido
     */
    public static String aArabigo(String entrada){
        int salida = 0;
        
        int longitud = entrada.length();
        for(int i=0;i<longitud;i++){
            switch(entrada.charAt(i)){
                case 'M':
                    int emes = 1000;
                    if(longitud>1 && entrada.charAt(1)=='M'){
                        emes = 2000;
                        i++;
                        if(longitud>2 && entrada.charAt(2)=='M'){
                            emes = 3000;
                            i++;
                        }
                    }
                    salida += emes;
                    break;
                case 'D':
                    int des = 500;
                    if(longitud>(i+1) && entrada.charAt(i+1)=='C'){
                        des = 600;
                        i++;
                        if(longitud>(i+1) && entrada.charAt(i+1)=='C'){
                            des = 700;
                            i++;
                            if(longitud>(i+1) && entrada.charAt(i+1)=='C'){
                                des = 800;
                                i++;
                            }
                        }
                    }
                    salida += des;
                    break;
                case 'L':
                    int eles = 50;
                    if(longitud>(i+1) && entrada.charAt(i+1)=='X'){
                        eles = 60;
                        i++;
                        if(longitud>(i+1) && entrada.charAt(i+1)=='X'){
                            eles = 70;
                            i++;
                            if(longitud>(i+1) && entrada.charAt(i+1)=='X'){
                                eles = 80;
                                i++;
                            }
                        }                            
                    }                    
                    salida += eles;
                    break;
                case 'C':
                    int ces = 100;
                    if(longitud>(i+1)){
                        switch (entrada.charAt(i+1)) {
                            case 'D':
                                ces = 400;
                                i++;
                                break;
                            case 'C':
                                ces = 200;
                                i++;
                                break;
                            case 'M':
                                ces = 900;
                                i++;
                        }
                    }
                    if(longitud>(i+1) && entrada.charAt(i+1)=='C'){                      
                        ces = 300;
                        i++;
                    }
                    salida += ces;
                    break;
                case 'X':
                    int equis = 10;
                    if(longitud>(i+1)){
                        switch (entrada.charAt(i+1)) {
                            case 'L':
                                equis = 40;
                                i++;
                                break;
                            case 'C':
                                equis = 90;
                                i++;
                                break;
                            case 'X':
                                equis = 20;
                                i++;
                                break;
                            case 'V': 
                                equis = 15;
                                i++;
                        }                        
                    }
                    if(longitud>(i+1) && entrada.charAt(i+1)=='X'){
                        equis = 30;
                        i++;        
                    }
                    salida += equis;
                    break;
                case 'V':
                    int uves = 5;
                    if(longitud>(i+1) && entrada.charAt(i+1)=='I'){
                        uves++;
                        i++;                        
                        if(longitud>(i+1) && entrada.charAt(i+1)=='I'){
                            uves++;
                            i++;
                            if(longitud>(i+1) && entrada.charAt(i+1)=='I'){
                                uves++;
                                i++;
                            }
                        }
                    }               
                    salida += uves;
                    break;
                case 'I':
                    int unos = 1;
                    if(longitud>(i+1)){                        
                        switch (entrada.charAt(i+1)) {
                            case 'I':
                                unos++;
                                i++;
                                if(longitud>(i+1) && entrada.charAt(i+1)=='I'){
                                    unos++;
                                    i++;
                                }
                                break;
                            case 'V':
                                unos = 4;
                                i++;
                                break;
                            case 'X':
                                unos = 9;
                                i++;
                                break;
                        }
                    }
                    salida += unos;
            }    
        }
                
        return String.valueOf(salida);
    }
    
    /**
     * Método principal de la aplicación. Lee cadenas de la entrada estándar y 
     * en función de si el primer carácter es un dígito o no realiza la llamada 
     * a un procedimiento u otro; pues es precisamente la información que hace 
     * falta para saber si es un número romano o arábigo. Sale cuando recibe la
     * palabra "salir" de la entrada.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String entrada = scanner.next();
        
        String salida = "";        
        
        // Este bucle fue utilizado para generar el caso de prueba completo.
//         for(int i=1;i<4000;i++) System.out.println(i);
        
        while(!entrada.equals("salir")){
            if(Character.isDigit(entrada.charAt(0))){
                salida = aRomano(entrada);
            }
            else{
                salida = aArabigo(entrada);
            }            
            System.out.println(salida);
            entrada = scanner.next();
        }        
    }    
}