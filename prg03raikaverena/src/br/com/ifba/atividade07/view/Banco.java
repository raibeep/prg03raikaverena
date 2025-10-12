/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Raika
 */
public class Banco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public Banco(String dono, int numConta){//método construtor
        this.numConta = numConta;
        this.status = false;
        this.saldo = 0;
        this.dono = dono;
    }

    private int getNumConta() {
        return numConta;
    }

    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = tipo;
    }

    private String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    private double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String tipo){
        if (this.status){
            System.out.println("Essa conta já está aberta!");
            return;
        }
        
        if (!tipo.equalsIgnoreCase("cc")&& !tipo.equalsIgnoreCase("cp")){
            System.out.println("Tipo de conta inexistente. Digite cc (conta corrente) ou cp (conta poupança)");
            return;
        }
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if (tipo.equalsIgnoreCase("cc")){
            this.setSaldo (50);
            System.out.println("Conta corrente aberta com sucesso!");
            System.out.println("Você recebeu um presente de R$50,00");
        }else if (tipo.equalsIgnoreCase("cp")){
            this.setSaldo(150);
            System.out.println("Conta poupança aberta com sucesso!");
            System.out.println("Você recebeu um presente de R$ 150,00");
        }
    }
    
    public void fecharConta(){
        if (!status){
            System.out.println("A conta já está fechada!");
        }else if (this.saldo > 0){
            System.out.println("Ainda há dinheiro na conta! Retire o saldo antes de fechar.");
        }else if (this.saldo < 0){
            System.out.println("Conta em débito!! Quite suas dividas antes de fechar.");
        }else {
            this.status = false;
            System.out.println("Conta encerrada com sucesso");
        }
    }
    
    public void depositar(double valor){
        if (!this.status){
            System.out.println("Conta fechada! Indisponível para transações.");
            return;
        }
        
        this.saldo += valor;
        System.out.println("Déposito de R$" + valor + "feito com sucesso!");
    }
    
    public void sacar(double valor){
        if (!this.status){
            System.out.println("Conta fechada! Indisponível para transações.");
        }
        this.saldo -= valor;
        System.out.println("Saque de R$" + valor + "feito com sucesso");
    }
    
    public void pagarMensal(){
        int mensalidade = 0;
        
        if (this.tipo.equalsIgnoreCase("cc")){
            mensalidade = 12;
        }else if (this.tipo.equalsIgnoreCase("cp")){
            mensalidade = 20;
        }
        
        if (!this.status){
            System.out.println("Conta fechada!");
            return;
        }
        
        if (this.saldo < mensalidade){
            System.out.println("Saldo insuficiente para pagar mensalidade.");
        }else if (this.saldo > mensalidade){
            this.saldo -= mensalidade;
            System.out.println("Mensalidade:  R$" + mensalidade + "paga com sucesso!");
        }
    }
}
