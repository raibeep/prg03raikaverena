/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Triangulo extends Forma2D {
    private double base;
    private double altura;
    
    public Triangulo(double base, double altura){//método construtor da classe
        super("Triângulo");
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double obterArea(){//sobrescreve o método da classe mãe, e acrescenta a fórmula 
        return (base * altura) / 2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public String toString(){//sobrescreve o método toString da classe mãe
        return super.toString() + "(Base = " + base + ", Altura = " + altura + ")";
    }
}
