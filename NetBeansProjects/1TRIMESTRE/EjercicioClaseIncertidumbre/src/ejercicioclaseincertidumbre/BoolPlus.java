/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclaseincertidumbre;

/**
 *
 * @author ruben
 */
public class BoolPlus {
    int vala,valb;
    String[][] arrayAND={  { "falso", "falso", "falso"},
                    {"falso", "talvez", "talvez"},
                    {"falso", "talvez", "cierto"}
    };
    String[][] arrayOR={  { "falso", "talvez", "cierto"},
                {"talvez", "talvez", "cierto"},
                {"cierto", "cierto", "cierto"}
    };
    String[] arrayA={"cierto","talvez","falso"};
   

    public String conjuncion(String valora,String valorb) {
        if (valora=="falso") vala=1;
        if (valora=="true") vala=2;
        if (valora=="talvez") vala=3;
        if (valorb=="falso") valb=1;
        if (valorb=="true") valb=2;
        if (valorb=="talvez") valb=3;
        return arrayAND[vala-1][valb-1];  
        
    
    }
    public String disyuncion(String valora,String valorb) {
            if (valora=="falso") vala=1;
            if (valora=="true") vala=2;
            if (valora=="talvez") vala=3;
            if (valorb=="falso") valb=1;
            if (valorb=="true") valb=2;
            if (valorb=="talvez") valb=3;
            return arrayOR[vala-1][valb-1];  
        
    
    }
    public String negacion(String valora) {
            if (valora=="falso") vala=1;
            if (valora=="true") vala=3;
            if (valora=="talvez") vala=2;
            
            return arrayA[vala-1];  

    
    }

}
