/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apcompiladorrecursivoatributoel;

/**
 *
 * @author SistemaInvestigacion
 */
public class Elemento {
 //atributos
    private char tipo;
    private double  valor;
    private int indice;
    
    //Métodos
    
    public Elemento(){ }
    public Elemento(char tip,double val,int ind){
        tipo=tip;
        valor=val;
        indice=ind;
        
    }
    
    public char darTipo(){
        return tipo;
    }
    public double darValor(){
        return valor;
    }
    public int darIndice(){
        return indice;
    }
    public void asignarTipo(char tip){
        tipo=tip;
    }
    public void asignarValor(int val){
        valor=val;
    }
    public void asignarIndice(int ind){
        
        indice=ind;
    }    
}
