/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

/**
 *
 * @author Raika
 */
public class PagamentoPix implements Pagamento{
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTotal(double valor) {
        setValor(valor * 0.98); //muda o valor com cashback
        return this.valor;
    }

    @Override
    public void imprimirRecibo() {
        double cashback = this.valor * 0.02/0.98; //calcula 2% do valor original
        System.out.printf("Pagamento via PIX de: R$ %.2f realizado! Cashback de: R$ %.2f%n", this.valor, cashback);
    }
}
