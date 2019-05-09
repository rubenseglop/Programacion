/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franciscorubenseguralopez_2;

/**
 *
 * @author ruben
 */
public class Yahoos {

    public Yahoos() {

    }

    public void suma(String valora, String valorb) {
        String respuesta = "";
        
           
        if ("cero".equals(valora)==true) {
            if ("cero".equals(valorb)==true) respuesta="cero";
            if ("uno".equals(valorb)==true) respuesta="uno";
            if ("dos".equals(valorb)==true) respuesta="dos";
            if ("tres".equals(valorb)==true) respuesta="tres";
            if ("cuatro".equals(valorb)==true) respuesta="cuatro"; 
            if ("desconocido".equals(valorb)==true) respuesta="desconocido"; 
            if ("muchos".equals(valorb)==true) respuesta="muchos"; 
        }
        
        if ("uno".equals(valora)==true) {
            if ("cero".equals(valorb)==true) respuesta="uno";
            if ("uno".equals(valorb)==true) respuesta="dos";
            if ("dos".equals(valorb)==true) respuesta="tres";
            if ("tres".equals(valorb)==true) respuesta="cuatro"; 
            if ("cuatro".equals(valorb)==true) respuesta="muchos"; 
            if ("desconocido".equals(valorb)==true) respuesta="desconocido"; 
            if ("muchos".equals(valorb)==true) respuesta="muchos"; 
        }
        if ("dos".equals(valora)==true) {
            if ("cero".equals(valorb)==true) respuesta="dos";
            if ("uno".equals(valorb)==true) respuesta="tres";
            if ("dos".equals(valorb)==true) respuesta="cuatro";
            if ("tres".equals(valorb)==true) respuesta="muchos";
            if ("cuatro".equals(valorb)==true) respuesta="muchos"; 
            if ("desconocido".equals(valorb)==true) respuesta="desconocido"; 
            if ("muchos".equals(valorb)==true) respuesta="muchos";             
        }
        if ("tres".equals(valora)==true) {
            if ("cero".equals(valorb)==true) respuesta="tres";
            if ("uno".equals(valorb)==true) respuesta="cuatro";
            if ("dos".equals(valorb)==true) respuesta="muchos";
            if ("tres".equals(valorb)==true) respuesta="muchos";
            if ("cuatro".equals(valorb)==true) respuesta="muchos"; 
            if ("desconocido".equals(valorb)==true) respuesta="desconocido"; 
            if ("muchos".equals(valorb)==true) respuesta="muchos"; 
            
        }
        if ("cuatro".equals(valora)==true) {
            if ("cero".equals(valorb)==true) respuesta="cuatro";
            if ("uno".equals(valorb)==true) respuesta="muchos";
            if ("dos".equals(valorb)==true) respuesta="muchos";
            if ("tres".equals(valorb)==true) respuesta="muchos"; 
            if ("cuatro".equals(valorb)==true) respuesta="muchos"; 
            if ("desconocido".equals(valorb)==true) respuesta="desconocido"; 
            if ("muchos".equals(valorb)==true) respuesta="muchos"; 
        }
        if ("muchos".equals(valora)==true) {
            if ("desconocido".equals(valorb)==true) respuesta="desconocido";
            else respuesta ="muchos";
            
        }
        if ("desconocido".equals(valora)==true) {
            if ("desconocido".equals(valorb)==true) respuesta="desconocido";
            else respuesta ="muchos";
        }
        if (respuesta!="") System.out.println("\nLa respuesta es: " + respuesta);
        else System.out.println("\nError de sintaxis");
        
        

    }

}
