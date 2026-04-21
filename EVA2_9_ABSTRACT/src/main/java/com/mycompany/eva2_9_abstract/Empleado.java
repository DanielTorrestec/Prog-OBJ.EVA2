/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_abstract;

/**
 *
 * @author chili
 */
public class Empleado extends Persona {
    private String claveempleado;
    private String puesto;
    private double salario;
    private int annioIngreso;

    public Empleado() {
        super("", "", 0);
        claveempleado = "";
        puesto = "";
        salario = 0;
        annioIngreso = 0;
    }

    public Empleado(String claveempleado, String puesto, double salario, int annioIngreso, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.claveempleado = claveempleado;
        this.puesto = puesto;
        this.salario = salario;
        this.annioIngreso = annioIngreso;
    }


    public String getClaveempleado() {
        return claveempleado;
    }

    public void setClaveempleado(String claveempleado) {
        this.claveempleado = claveempleado;
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

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }

    @Override
    public int calcularAntiguedad() {
        return 2026 - annioIngreso;
    }


        public void imprimirDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellidos: " + apellidos);
            System.out.println("Edad: " + edad);
            System.out.println("Clave de empleado: " + claveempleado);
            System.out.println("Salario: " + salario);
            System.out.println("Antiguedad: " + calcularAntiguedad());
            

        }
}
