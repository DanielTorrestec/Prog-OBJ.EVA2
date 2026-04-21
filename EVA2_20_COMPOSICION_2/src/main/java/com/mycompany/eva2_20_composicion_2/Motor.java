/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_20_composicion_2;

/**
 *
 * @author chili
 */
public class Motor {
    private int cilindros;
    private char combustible;
    private double capacidad;

    public Motor(int cilindros, char combustible, double capacidad) {
        this.cilindros = cilindros;
        this.combustible = combustible;
        this.capacidad = capacidad;
    }

        public Motor() {
        this.cilindros = 0;
        this.combustible = 0;
        this.capacidad = 0;
    }
    
    public int getCilindros() {
        return cilindros;
    }

    public void setCilindros(int cilindros) {
        this.cilindros = cilindros;
    }

    public char getCombustible() {
        return combustible;
    }

    public void setCombustible(char combustible) {
        this.combustible = combustible;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Motor{" + "cilindros=" + cilindros + ", combustible=" + combustible + ", capacidad=" + capacidad + '}';
    }
    
    
    
}
