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
        Forma[] formas = new Forma[6]; // cria um vetor (array) de referências do tipo Forma com 6 posições
        
        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Triangulo(3, 5);
        formas[3] = new Cubo(6);
        formas[4] = new Esfera(7);
        formas[5] = new Piramide(4, 6);
        
        for (Forma f : formas){// laço for-each: itera por cada elemento do array 'formas', atribuindo à variável 'f'
            System.out.println(f.toString());
            
            if (f instanceof Forma2D){// verifica se o objeto referenciado por 'f' é uma instância de Forma2D (forma bidimensional)
                Forma2D fb = (Forma2D) f;// faz o cast: trata 'f' como Forma2D e armazena na referência 'fb'
                System.out.println("-> Area: " + fb.obterArea());// chama obterArea() de Forma2D e imprime o resultado
            }
            
            if (f instanceof Forma3D){// verifica se o objeto referenciado por 'f' é uma instância de Forma3D (forma tridimensional)
                Forma3D ft = (Forma3D) f; // faz o cast: trata 'f' como Forma3D e armazena na referência 'ft'
                System.out.println("-> Area: " + ft.obterArea());// chama obterArea() de Forma3D e imprime a área (ex.: área superficial)
                System.out.println("-> Volume: " + ft.obterVolume());// chama obterVolume() e imprime o volume
            }
            
            System.out.println("------------------------------------");
        }
    }
}
