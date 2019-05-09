/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franciscorubenseguralopez_2;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class FranciscoRubenSeguraLopez_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Yahoos yahoos = new Yahoos();
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Valores permitidos: uno, dos, tres, cuatro, muchos, desconocido");
        System.out.println("Introduce el primer valor");
        String primer = entrada.nextLine();
        
        System.out.println("Introduce el segundo valor");
        String segundo = entrada.nextLine();
            
        yahoos.suma(primer, segundo);
        
        
    }
    
}
