/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.df.banco;

import java.util.Scanner;

/**
 *
 * @author francisco62977666
 */
public class Banco {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        String nome;
        String cpf;
        
        System.out.println("Nome do titular: ");
        nome = entrada.nextLine();
        
        System.out.println("CPF do titular: ");
        cpf = entrada.nextLine();
        
        ContaBancaria conta1 = new ContaBancaria(nome);
        
        conta1.depositar(100);
        conta1.sacar(10);
        conta1.extratoBancario();
        
        System.out .println(conta1.getTitular());
        System.out.println(conta1.getSaldo());
        
        
        System.out.println(conta1.getTitular());
        
        System.out.println("-----------------------------------");
        
        ContaPF contapf1 = new ContaPF("7658945659","Mateus");
        ContaPJ contapj1 = new ContaPJ("33886770019","Pedro");
        
        contapf1.imprimir();
        
        System.out.println("---------------------------");
        
        contapj1.imprimir();
    int opcao = 0;
    while (opcao != 5) {
        
    System.out.println("=====CONTA BANCÁRIA=====");
    System.out.println("");
    System.out.println("(1)-Depositar");
    System.out.println("(2)-Sacar");
    System.out.println("(3)-Consultar saldo");
    System.out.println("(4)-Verificar situação da conta");
    System.out.println("(5)-Sair");
    System.out.println("");
    
    System.out.println("Digite a opção desejada: ");
     opcao = entrada.nextInt();
    
    switch(opcao){
     case 1:
         System.out.println("Digite o valor a ser depositado ");
         double valorDeposito = entrada.nextDouble();
        contapj1.depositar(valorDeposito);
        break;
        
     case 2:
       System.out.println("Digite o valor a ser sacado ");
         double valorSaque = entrada.nextDouble();
         
         contapj1.sacar(valorSaque);
        break;
     case 3:
         contapj1.verificarSaldo();
         break;
     case 4:
         contapj1.extratoBancario();
         break;
     case 5:
         System.out.println("Sistema sendo encerrado...");
         break;
         
       
         
}
    
   
           
    
    }
   }
}
