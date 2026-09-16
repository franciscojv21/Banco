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
        System.out.println("Não é permitido depositar um valor negativo.");
    }
  }

public void sacar(double valor){
   if(valor > 0 && valor <= this.saldo){
       this.saldo = this.saldo - valor;
   }else{
       System.out.println("Saque não permitido.");
   }   
  }

public void extratoBancario(){
    System.out.println("Saldo: " + this.saldo);
  }
}
