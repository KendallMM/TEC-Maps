/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 * @author  Kendall Marin, Carlos Contreras,Jose Vargas,Caroina Rodriguez
 */
public class Nodo {    
   private  int nombre ;
   private boolean visitado ;
   private boolean etiqueta;
   private double acumulado; // lleva el acoulado de cada nodo
   private Nodo Predecesor;
   
   public Nodo(){
       this.nombre =-1;
       this.visitado = false;
       this.etiqueta = false;
       this.Predecesor  = null;
       this.acumulado =0;       

   }
/**
 *Obtiene el nombre del nodo 
 * 
 */
     public int getNombre() {
        return nombre;
    }
/**
 *Indica que el nodo es visitado 
 * 
 */
    public boolean isVisitado() {
        return visitado;
    }
/**
 *Indica la etiqueta del nodo. 
 * 
 */
    public boolean isEtiqueta() {
        return etiqueta;
    }
/**
 *Indica los kilómetros . 
 * 
 */
    public double getKM() {
        return acumulado;
    }
/**
 *Indica el nodo predecesor  . 
 * 
 */
    public Nodo getPredecesor() {
        return Predecesor;
    }
/**
 *Indica el nombre del nodo . 
 * 
 */
    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
/**
 *Setea si el nodo fue visitado . 
 * 
 */
    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
/**
 *Setea la etiqueta del nodo. 
 * 
 */
    public void setEtiqueta(boolean etiqueta) {
        this.etiqueta = etiqueta;
    }
/**
 *Setea la distancia acomulada. 
 * 
 */
    public void setAcumulado(double acomulado) {
        this.acumulado = acomulado;
    }
/**
 *Setea el nodo predecesor. 
 * 
 */
    public void setPredecesor(Nodo Predecesor) {
        this.Predecesor = Predecesor;
    }

    
}
