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

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
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
}
