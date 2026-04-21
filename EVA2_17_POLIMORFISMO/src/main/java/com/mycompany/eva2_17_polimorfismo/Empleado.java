/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_polimorfismo;

/**
 *
 * @author chili
 */
           // Empleado es una persona
public class Empleado extends Persona {
    private String puesto;
    private int salario;

    public Empleado() {
        super();
        this.puesto = "";
        this.salario = 0;
    }

    public Empleado(String puesto, int salario) {
        this.puesto = puesto;
        this.salario = salario;
    }

    public Empleado(String puesto, int salario, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String generarDatos() {
        return super.generarDatos() + // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        "Puesto: " + puesto + "\n" +
        "Salario: " + salario;
    }
}
