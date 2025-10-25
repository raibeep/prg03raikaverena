/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.atividade10.view;

/**
 *
 * @author raiii
 */
public class Piramide extends Forma3D {
    private double areaBase;
    private double areaLateral;
    private double altura;
    //construtor usado quando o usuário sabe as areas da base e da lateral
    public Piramide(double areaBase, double areaLateral, double altura){
        super("Pirâmide");
        this.areaBase = areaBase;
        this.areaLateral = areaLateral;
        this.altura = altura;
    }
    //construtor para pirâmide de base quadrada 
    public Piramide(double ladoBase, double altura){
        super("Piramide de Base Quadrada");
        this.areaBase = ladoBase * ladoBase;
        //calcula o valor aproximado do apotema
        double apotema = altura * 0.8;
        this.areaLateral = 4 * (ladoBase * apotema) / 2;
        this.altura = altura;
    } 
    //construtor para piramide de base triangular
    public Piramide(double baseTriangulo, double alturaTriangulo, double alturaPiramide, double apotema){
        super("Pirâmide de Base Triangular");
        this.areaBase = (baseTriangulo * alturaTriangulo) / 2;
        this.areaLateral = 3 * (baseTriangulo * apotema) / 2;
        this.altura = alturaPiramide;
    }
    
    @Override 
    public double obterArea(){
        return areaBase + areaLateral;
    }
    
    @Override 
    public double obterVolume(){
        return (areaBase * altura) / 3;
    }

    public double getAreaBase() {
        return areaBase;
    }

    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    public double getAreaLateral() {
        return areaLateral;
    }

    public void setAreaLateral(double areaLateral) {
        this.areaLateral = areaLateral;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    @Override
    public String toString(){
        return super.toString() + "Area Lateral= " + areaLateral + 
                ", Area Base = " + areaBase + 
                ", Altura = " + altura + ")";
    }
}
