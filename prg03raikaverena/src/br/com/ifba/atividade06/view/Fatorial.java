/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade06.view;

/**
 *
 * @author Raika
 */
public class Fatorial {
    //guarda o número cujo fatorial será calculado (inicializado com 0)
    private int num = 0;
    //guarda o resultado do fatorial (inicializado com 1, pois 0! = 1)
    private int fat = 1;
    //guarda a representação em texto da multiplicação
    private String formula = "";
    
    public void setValor(int n){// método público que define o valor a ser usado e calcula fatorial e fórmula
        num = n;
        int f = 1;
        String s = "";
        
        for (int c = n; c > 1; c--){// laço que inicia c com n e decrementa até c ser maior que 1 
            // multiplica o acumulador f pelo valor atual c
            f *= c;
            // concatena a parte "c x " à string s
            s += c + " x ";
        }
        s += "1 = ";
         //atualiza o campo fat com o resultado calculado
        fat = f;
        
        formula = s;
    }
    
    public int getFatorial(){// método público que retorna o fatorial calculado
        return fat;
    }
    
    public String getFormula(){// método público que retorna a fórmula em forma de string
        return formula;
    }
    
}
