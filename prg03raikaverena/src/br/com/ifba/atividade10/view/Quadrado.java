/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Quadrado extends Forma2D {
    private double lado;
    
    public Quadrado(double lado){//método construtor da classe
        super("Quadrado");
        this.lado = lado;
    }
    
    @Override 
    public double obterArea(){//sobrescreve o método da classe mãe, e acrescenta a fórmula
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String toString(){//sobrescreve o método toString da classe mãe
        return super.toString() + "(Lado = " + lado + ")";
    }
}
