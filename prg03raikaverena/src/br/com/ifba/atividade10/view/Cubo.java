/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Cubo extends Forma3D {
    private double lado;
    
    public Cubo(double lado){
        super("Cubo");
        this.lado = lado;
    }
    
    @Override 
    public double obterArea(){
        return 6 * lado * lado;
    }
    
    @Override 
    public double obterVolume(){
        return lado * lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public String toString(){
        return super.toString() + "(Lado = " + lado + ")";
    }
}
