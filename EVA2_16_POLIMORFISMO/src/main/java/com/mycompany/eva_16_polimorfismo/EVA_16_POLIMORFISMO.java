/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva_16_polimorfismo;

/**
 *
 * @author chili
 */
public class EVA_16_POLIMORFISMO {

    public static void main(String[] args) {
        System.out.println("CIRCULO:");
        Circulo circulo = new Circulo(50);
        imprimir(circulo);        
        System.out.println("RECTANGULO:");
        Rectangulo rectangulo = new Rectangulo(20, 30);
        imprimir(rectangulo);
        //ARREGLO DE FIGURAS
        Figuras[] figuras = new Figuras[10];
        Figuras[0] figuras = new Circulo(10);
        Figuras[1] figuras = new Rectangulo(10,20);
        Figuras[2] figuras = new Circulo(30);
        Figuras[3] figuras = new Rectangulo(10, 20);
        Figuras[4] figuras = new Rectangulo(10, 20);
    }
    
    public static void imprimir(Figuras figura){
        System.out.println("Area = " + figura.calcularArea());
        System.out.println("Perimetro = " + figura.calcularPerimetro());
    }
}