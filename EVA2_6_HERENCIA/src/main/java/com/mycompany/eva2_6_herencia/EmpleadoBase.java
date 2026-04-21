/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_6_herencia;

/**
 *
 * @author chili
 */
public class EmpleadoBase extends Empleado {
    private int annioIngreso;

    public EmpleadoBase(){
    super("Sin nombre", "Sin apellido", "000", 0.0);
    this.annioIngreso = 0; 
    }

    public int getAnnioIngreso() {
        return annioIngreso;
    }

    public void setAnnioIngreso(int annioIngreso) {
        this.annioIngreso = annioIngreso;
    }
        
    
    public int antiguedad(){
        int anti = 2026 - annioIngreso;
        //calcular quinquenios
        int quin = anti / 5;
        return anti;
    }
    @Override
    public double calcularSalario() {
        //POR CADA QUINQUENIO, AUMENTAMOS UN 10%
        return getSalario() * (1+(antiguedad() * 0.1));
    }
    
    public EmpleadoBase(String nombre, String apellidos, String claveEmpleado, double salario) {
        super(nombre, apellidos, claveEmpleado, salario);
    }
    
}
