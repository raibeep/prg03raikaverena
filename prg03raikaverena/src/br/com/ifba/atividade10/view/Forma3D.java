/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public abstract class Forma3D extends Forma {
    public Forma3D(String nome){//construtor
        super(nome);
    }
    
    public abstract double obterVolume();//método que as classes filhas irão herdar
}
