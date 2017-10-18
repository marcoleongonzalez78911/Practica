/* x
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author mark
 */
public class ModelCalcu {
     private int numero1 = 5;
    private int numero2 = 10;
    private int resultado = 15;
    
    public int getNumero1(){
        return numero1;
    }
     public int getNumero2(){
        return numero2;
    }
     public int getResultado(){
        return resultado;
    }
    public void setNumero1(int numero1){
        this.numero1 = numero1;
    }
    public void setNumero2(int numero2){
        this.numero2 = numero2;
    }
      public void setResultado(int resultado){
        this.resultado = resultado;
    }
    public void Suma(){
        resultado = numero1 + numero2;
        
    }
    public void division(){
        resultado = numero1 / numero2;
    }
    public void por(){
        resultado = numero1 * numero2;
    }
    public void residuo(){
        resultado = numero1 % numero2;
    }
    public void menos(){
        resultado = numero2 - numero2; 
    }
    
}
