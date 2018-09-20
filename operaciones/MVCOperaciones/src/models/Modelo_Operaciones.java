/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;


public class Modelo_Operaciones {
  float numero1;
  float  numero2;
  float resultado;

    public float getNumero1() {
        return numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
  
  public int suma (){
    this.resultado = this.numero1 + this.numero2;
    return (int) this.resultado;    
  }
   public int resta (){
    this.resultado = this.numero1 - this.numero2;
    return (int) this.resultado;    
  }
   public int multiplicacion (){
    this.resultado = this.numero1 * this.numero2;
    return (int) this.resultado;    
  }
   public int divicion (){
    this.resultado = this.numero1 / this.numero2;
    return (int) this.resultado;    
  }
   public int porcentaje (){
    this.resultado = this.numero1 % this.numero2;
    return (int) this.resultado;    
  }
}
