/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade09.view;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Raika
 */
public class PagamentoDinheiro implements Pagamento{
    private double valor;
    
    public PagamentoDinheiro(double Valor){
        this.valor = valor;
    }

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
        String textoRecibo = String.format(
        "Pagamento em Dinheiro\nValor total com desconto: R$ %.2f",
            this.valor);
        
        JFrame reciboFrame = new JFrame("Recibo Dinheiro");
        JTextArea textArea = new JTextArea(10, 30);
        
        textArea.setText(textoRecibo);
        textArea.setEditable(false);
        reciboFrame.add(new JScrollPane(textArea));
        reciboFrame.pack();
        reciboFrame.setLocationRelativeTo(null);
        reciboFrame.setVisible(true);
    }
}
