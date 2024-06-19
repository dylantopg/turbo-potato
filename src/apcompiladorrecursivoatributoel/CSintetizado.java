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
public class CSintetizado {
    //Atributos
    
    //atributos
    private double valor;
    private boolean valorLogico;
    
    public CSintetizado(){ }
    
    public CSintetizado(double val){
        valor=val;
        if (val>0) valorLogico=true;
        else valorLogico=false;
    }
    
    public double darValor(){
        return valor;
    }
    
    public void asignarValor(double val){
        valor=val;
    }
    public boolean darValorLogico(){
        return valorLogico;
    }
    
    public void asignarValorLogico(boolean vallog){
        valorLogico=vallog;
    }
}
