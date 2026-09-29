/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.banco;

/**
 *
 * @author francisco62977666
 */
public class ContaBancaria {
    private double saldo;
    private String titular;
    
public ContaBancaria(String titular){    
    this.titular = titular; 
    this.saldo = 0.00;  
  }  

public  String getTitular(){
    return this.titular;
}

public double getSaldo(){
    return this.saldo;
}
public void setTitular(String Titular){
    this.titular = titular;
}

public void depositar(double valor){
    if(valor > 0){
        this.saldo = this.saldo + valor;
    }else{
        System.out.println("Valor de depósito inválido.");
    }
  }

public void sacar(double valor){
   if(valor > 0 && valor <= this.saldo){
       this.saldo = this.saldo - valor;
   }else{
       System.out.println("Saldo insuficiente.");
   }   
  }

public void extratoBancario(){
    System.out.println("Saldo: " + this.saldo);
  }

public void imprimir(){}

public void verificarSaldo(){
  if(this.saldo == 0.0){
      System.out.println("Conta sem saldo");
      
  }else if(this.saldo > 0 && this.saldo<= 500 ){
      System.out.println("Saldo baixo");
  }else if(this.saldo > 500 && this.saldo<= 2000){
      System.out.println("Saldo normal");
  }else if(this.saldo > 2000){
      System.out.println("Saldo elevado");
 }

 }

public void exibirExtratoSimples() {
 int quantidade = 0;
for(int i = 1; i <= quantidade; i++){
    System.out.println("Operação " + i);
}
}







}
