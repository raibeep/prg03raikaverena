/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public abstract class Forma {
    private String nome;
    
    public Forma(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //método abstrato que todas as formas irão implementar
    public abstract double obterArea();
    
    @Override
    public String toString(){
        return "Forma " + nome;
    }
}
