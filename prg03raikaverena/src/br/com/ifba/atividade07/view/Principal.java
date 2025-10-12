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
        
    }
}
