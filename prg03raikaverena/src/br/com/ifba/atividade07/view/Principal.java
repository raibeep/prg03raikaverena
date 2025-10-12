/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;
import java.util.Scanner;
/**
 *
 * @author Raika
 */
public class Principal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("== ABERTURA DE CONTA ==");
        System.out.println("Nome do cliente: ");
        String nome = entrada.nextLine();//lê o que foi digitado
        
        System.out.println("Número da conta");
        int numConta = entrada.nextInt();// lê o que foi digitado
        entrada.nextLine(); //limpa buffer
        
        Banco conta = new Banco(nome, numConta);//inicializa a conta
        
        System.out.println("Tipo da conta (cc ou cp): ");
        String tipo = entrada.nextLine();//lê o que foi digitado
        
        conta.abrirConta(tipo);//abre a conta
        
        int opcao;
        do{//repetição para o menu
            System.out.println("==MENU==");
            System.out.println("1- Depositar");
            System.out.println("2- Sacar");
            System.out.println("3- Pagar Mensalidade");
            System.out.println("4- Fechar Conta");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();
            
            switch (opcao){
                case 1:
                    System.out.println("Valor do depósito: ");
                    double valorDeposito = entrada.nextDouble();
                    conta.depositar(valorDeposito);//pega o valor digitado e realiza o depósito
                    break;
                case 2:
                    System.out.println("Valor do saque: ");
                    double valorSaque = entrada.nextDouble();
                    conta.sacar(valorSaque);//pega o valor e faz o saque desejado
                    break;
                case 3:
                    conta.pagarMensal();//paga a mensalidade
                    break;
                case 4:
                    conta.fecharConta();//fecha a conta
                    break;
                case 0:
                    System.out.println("Saindo...");
            }
        }while(opcao != 0);  
    }
}
