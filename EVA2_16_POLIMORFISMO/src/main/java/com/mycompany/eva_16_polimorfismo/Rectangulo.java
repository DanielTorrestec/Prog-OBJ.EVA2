/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva_16_polimorfismo;

/**
 *
 * @author chili
 */
// rectangulo es una figura
public class Rectangulo implements Figuras{
    public double Base;
    public double altura;

    public Rectangulo() {
        this.Base = 0;
        this.altura = 0;
    }
        public Rectangulo(double Base, double altura) {
        this.Base = Base;
        this.altura = altura;
    }

    public double getBase() {
        return Base;
    }

    public void setBase(double Base) {
        this.Base = Base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return Base * altura;
    }

    @Override
    public double calcularPerimetro() {
       return Base + Base + altura + altura;
    }
    
}

