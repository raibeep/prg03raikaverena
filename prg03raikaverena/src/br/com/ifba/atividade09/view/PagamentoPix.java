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
        // Fórmula: valor já com desconto/cashback dividido por 0.98 para encontrar o valor original do cashback
        double cashback = this.valor * 0.02/0.98; //calcula 2% do valor original
        // Cria o texto do recibo formatado, usando String.format para colocar valores com 2 casas decimais
        String textoRecibo = String.format(
                "Pagamento via PIX\nValor de: R$ %.2f\nCashBack: R$ %.2f ", 
                this.valor, cashback);
        
        // Cria uma nova janela JFrame para exibir o recibo
        JFrame reciboFrame = new JFrame("Recibo PIX");
        JTextArea textArea= new JTextArea(10,30); // Cria um JTextArea de 10 linhas e 30 colunas
        textArea.setText(textoRecibo);// Define o texto do JTextArea como o recibo que foi formatado acima
        textArea.setEditable(false);// Define o JTextArea como não editável, para que o usuário não consiga alterar o recibo
        // Adiciona o JTextArea dentro de um JScrollPane para permitir rolagem caso o texto seja maior que a área visível
        reciboFrame.add(new JScrollPane(textArea));
        reciboFrame.pack();// Ajusta automaticamente o tamanho da janela para caber todos os componentes
        reciboFrame.setLocationRelativeTo(null);// Centraliza a janela na tela, para que apareça no meio
        reciboFrame.setVisible(true);// Torna a janela visível, abrindo a telinha do recibo
    }
}
