/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_11_interfaces;

/**
 *
 * @author chili
 */

public class Empleado extends Persona implements Mensaje {
    private String puesto;
    private double salario;

    public Empleado() {
        super();
        this.puesto = "";
        this.salario = 0;
    }
    public Empleado(String puesto, double salario, String nombre, String apellidos, int edad) {
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }  

    @Override
    public void mostrarMensaje() {
        System.out.println("Nombres: " + getNombre());
        System.out.println("Apellidos: " + getApellidos());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + getSalario());
        System.out.println("Puesto: " + getPuesto());
    }
}