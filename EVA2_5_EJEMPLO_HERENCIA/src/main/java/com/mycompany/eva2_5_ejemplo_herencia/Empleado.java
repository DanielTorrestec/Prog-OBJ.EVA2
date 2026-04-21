/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author chili
 */
public class Empleado extends Persona{
    private String numeroEmpleado;
    private String puesto;
    private double salario;
    

    public Empleado(String numeroEmpleado, String puesto, double salario, String nombre, String ap_materno, String ap_paterno, String RFC, int edad, char genero) {
        super(nombre, ap_materno, ap_paterno, RFC, edad, genero);
        this.numeroEmpleado = numeroEmpleado;
        this.puesto = puesto;
        this.salario = salario;
    }

    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(String numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
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
    
    /*public void imprimirDatosEmpleado(){
        ImprimirDatos();
        System.out.println("NO de Empleado: " + numeroEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
        System.out.println("==========================================");
*/
// SOBREESCRITURA (SOBRECARGA) DE MÉTODOS
    @Override
    public void ImprimirDatos(){
        super.ImprimirDatos(); // incorporamos la funcionalidad del metodo
        System.out.println("NO de Empleado: " + numeroEmpleado);
        System.out.println("Puesto: " + puesto);
        System.out.println("Salario: " + salario);
    }
    
    @Override
    public String toString(){
        String resu = "==========Datos==========" + "\n" +
                "Nombre: " + generarNombreCom() + "\n" +
                "Edad: " + getEdad() + "\n" +
                "RFC: " + getRFC() + "\n" +
                "NO de Empleado: " + numeroEmpleado + "\n" +
                "Puesto: " + puesto+ "\n" +
                "Salario: " + salario+ "\n";
                return resu;
    }
    
}
