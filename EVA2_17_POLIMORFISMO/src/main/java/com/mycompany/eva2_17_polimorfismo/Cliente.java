/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_polimorfismo;

/**
 *
 * @author chili
 */
             //Cliente es una persona
public class Cliente extends Persona{
    private String rfc;
    private double credito;

    public Cliente(String rfc, double credito) {
        this.rfc = rfc;
        this.credito = credito;
    }

    public Cliente(String rfc, double credito, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.rfc = rfc;
        this.credito = credito;
    }

    
    @Override
    public String generarDatos() {
        return super.generarDatos() + "\n" + // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        "RFC: " + rfc + "\n" +
        "credito: " + credito;
    }
    
    
    
}
