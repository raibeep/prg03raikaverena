/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Circulo extends Forma2D {
    private double raio;
    
    public Circulo(double raio){//método construtor
        super("Círculo");
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){//herda método de Forma e coloca a lógica da fórmula
        return Math.PI * raio * raio;
    }
    
    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    @Override
    public String toString(){//sobrescreve o método toString da classe pai(Forma)
        //o método toString serve para representar o objeto como texto
        return super.toString() + "(Raio = " + raio + ")";
        //o super serve para acessar os dados da superclasse (métodos e construtores da classe mãe)
    }
    
}
