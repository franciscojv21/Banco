/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.banco;

/**
 *
 * @author francisco62977666
 */
public class Banco {

    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Francisco");
        
        conta1.depositar(100);
        conta1.sacar(10);
        conta1.extratoBancario();
        
        System.out .println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        
        conta1.setTitular("Francisco Wallyson");
        
        System.out.println(conta1.getTitular());
    }
}
