/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author antonio
 */
@Named(value = "ctrlPersonal")
@RequestScoped
public class ctrlPersonal {
 private String nombre;
 private String Apellido;
 private int edad;
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
   /** Devuelve el valor de Apellido.
   * @return el valor de Apellido */
    public String getApellido() {
        return Apellido;
    }
   
   /** Asigna el valor de Apellido.
   @param Apellido el valor de nombre. */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
    
  /** Devuelve el valor de nombre.
   * @return el valor de nombre */     
  public String getNombre() {
    return nombre;
  }
  /** Asigna el valor de nombre.
   * @param nombre el valor de nombre. */
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }  
  
  public void saluda(){      
        final int Resultado = 2019 - getEdad(); 
    final String saludo = "Hola " + getNombre() + " " + getApellido() + " su edad es de " + Resultado + " años ";
    
    FacesContext.getCurrentInstance()
        .addMessage(null, new FacesMessage(saludo));
  }  
}