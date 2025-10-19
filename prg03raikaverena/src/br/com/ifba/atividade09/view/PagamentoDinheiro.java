/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Raika
 */
public class PagamentoDinheiro implements Pagamento{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor <= 0){
            //cria uma exceção com essa mensagem personalizada, que será exibida quando o erro acontecer.
            throw new IllegalArgumentException("O valor deve ser maior que zero."); 
        }
        this.valor = valor;
    }

    @Override
    public double calcularTotal(double valor) {
        setValor (valor * 0.90);
        return this.valor;
    }

    @Override
    public void imprimirRecibo() {
        System.out.printf("Pagamento de R$ %.2f feito com sucesso!%n", this.valor);
    }
}
