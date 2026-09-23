/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senac.df.banco;

/**
 *
 * @author francisco62977666
 */
public class ContaPJ extends ContaBancaria{
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public ContaPJ(String CNPJ, String titular) {
        super(titular);
        this.CNPJ = CNPJ;
    }
    
     @Override
    public void imprimir(){
        System.out.println("Titular: " + this.getTitular());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("CNPJ: " + this.getCNPJ());
    }
    
    
}
