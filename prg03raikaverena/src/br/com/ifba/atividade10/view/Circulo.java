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
    
    public Circulo(double raio){
        super("Círculo");
        this.raio = raio;
    }
    
    @Override
    public double obterArea(){
        return Math.PI * raio * raio;
    }
    
    public double getRaio(){
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
}
