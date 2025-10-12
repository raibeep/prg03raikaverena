/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade07.view;

/**
 *
 * @author Raika
 */
public class Banco { //classe banco e seus atributos
    public int numConta;
    protected String tipo; //cc ou cp
    private String dono;
    private double saldo;
    private boolean status; //verdadeiro ou falso
    
    public Banco(String dono, int numConta){//método construtor (meio que inicializa os atributos)
        this.numConta = numConta; //atribui um valor ao número da conta
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
        if (this.status){ //verifica se a conta já está aberta
            System.out.println("Essa conta já está aberta!");
            return;
        }
        
        if (!tipo.equalsIgnoreCase("cc")&& !tipo.equalsIgnoreCase("cp")){ //compara para ver se digitou algo válido
            System.out.println("Tipo de conta inexistente. Digite cc (conta corrente) ou cp (conta poupança)");
            return;
        }
        
        this.setTipo(tipo); //altera o tipo
        this.setStatus(true); //ativa a conta
        
        if (tipo.equalsIgnoreCase("cc")){//verifica se deu tudo certo e deposita um presente ao cliente
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
        if (!status){// verifica se a conta está inativa
            System.out.println("A conta já está fechada!");
        }else if (this.saldo > 0){//verifica se há dinheiro na conta
            System.out.println("Ainda há dinheiro na conta! Retire o saldo antes de fechar.");
        }else if (this.saldo < 0){//verfifica se tem dividas
            System.out.println("Conta em débito!! Quite suas dividas antes de fechar.");
        }else {//encerra a conta
            this.status = false;
            System.out.println("Conta encerrada com sucesso");
        }
    }
    
    public void depositar(double valor){
        if (!this.status){//verifica se a conta já foi fechada
            System.out.println("Conta fechada! Indisponível para transações.");
            return;
        }
        
        this.saldo += valor;//atribui o valor do depósito à conta
        System.out.println("Déposito de R$" + valor + "feito com sucesso!");
    }
    
    public void sacar(double valor){
        if (!this.status){//verifica se a conta está fechada
            System.out.println("Conta fechada! Indisponível para transações.");
        }
        this.saldo -= valor;//retira o valor que foi sacado da conta
        System.out.println("Saque de R$" + valor + "feito com sucesso");
    }
    
    public void pagarMensal(){
        int mensalidade = 0;//inicializa a variável mensalidade
        
        if (this.tipo.equalsIgnoreCase("cc")){// verifica qual é a conta para atribuir o valor de cada uma
            mensalidade = 12;
        }else if (this.tipo.equalsIgnoreCase("cp")){
            mensalidade = 20;
        }
        
        if (!this.status){//se a conta estiver fechada não precisa pagar mensalidade
            System.out.println("Conta fechada!");
            return;
        }
        
        if (this.saldo < mensalidade){// verifica se há dinheiro suficiente
            System.out.println("Saldo insuficiente para pagar mensalidade.");
        }else if (this.saldo > mensalidade){
            this.saldo -= mensalidade;
            System.out.println("Mensalidade:  R$" + mensalidade + "paga com sucesso!");
        }
    }
}
