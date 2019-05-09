/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probandoexcepciones;

/**
 *
 * @author Ruben
 */
public class ProbandoExcepciones {

    /******************
      @param args the command line arguments
     ***********/
    public static void main(String[] args) {

 

        try {
            Excepciones persona = new Excepciones();
            persona.setNumero(-5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
