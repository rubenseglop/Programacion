/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mibasededatos;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author ruben
 */
public class misDatos {
    private final SimpleStringProperty id;
    private final SimpleStringProperty nombre;
    private final SimpleStringProperty numero;
    private final SimpleStringProperty otronumero;
 
    public misDatos(String id, String nombre, String numero,String otronumero) {
        this.id = new SimpleStringProperty(id);
        this.nombre = new SimpleStringProperty(nombre);
        this.numero = new SimpleStringProperty(numero);
        this.otronumero = new SimpleStringProperty(otronumero);
    }
 
    public String getId() {
        return id.get();
    }
    public void setNombre(String fName) {
        nombre.set(fName);
    }
        
    public String getNumero() {
        return numero.get();
    }
    public void setOtroNumero(String fName) {
        otronumero.set(fName);
    }    
}
