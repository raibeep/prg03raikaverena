/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Teste {
    public static void main(String args[]){
        Forma[] formas = new Forma[6];
        
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 5);
        formas[3] = new Cubo(6);
        formas[4] = new Esfera(7);
        formas[5] = new Piramide(4, 6);
        
        for (Forma f : formas){
            System.out.println(f.toString());
            
            if (f instanceof Forma2D){
                Forma2D fb = (Forma2D) f;
                System.out.println("-> Area: " + fb.obterArea());
            }
            
            if (f instanceof Forma3D){
                Forma3D ft = (Forma3D) f;
                System.out.println("-> Area: " + ft.obterArea());
                System.out.println("-> Volume: " + ft.obterVolume());
            }
            
            System.out.println("------------------------------------");
        }
    }
}
