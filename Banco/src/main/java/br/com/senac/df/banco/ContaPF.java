/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.banco;

/**
 *
 * @author francisco62977666
 */
public class ContaPF extends ContaBancaria{
    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public ContaPF(String CPF, String titular) {
        super(titular);
        this.CPF = CPF;
    }
    
    @Override
   public void imprimir(){
      System.out.println("Titular: " + this.getTitular());
      System.out.println("Saldo: " + this.getSaldo());
      System.out.println("CPF: " + this.getCPF());
   }
   
        
    
}
