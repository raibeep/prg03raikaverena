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
public class PagamentoPix implements Pagamento{
    private double valor;
    
    public PagamentoPix(double Valor){
        this.valor = valor;
    }

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
        
        String textoRecibo = String.format(
                "Pagamento via PIX\nValor de: R$ %.2f\nCashBack: R$ %.2f ", 
                this.valor, cashback);
        
        JFrame reciboFrame = new JFrame("Recibo PIX");
        JTextArea textArea= new JTextArea(10,30);
        textArea.setText(textoRecibo);
        textArea.setEditable(false);
        reciboFrame.add(new JScrollPane(textArea));
        reciboFrame.pack();
        reciboFrame.setLocationRelativeTo(null);
        reciboFrame.setVisible(true);
    }
}
