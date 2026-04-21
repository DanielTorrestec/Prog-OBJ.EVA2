/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_17_polimorfismo;

/**
 *
 * @author chili
 */
public class Persona {

    private String nombre;
    private String apellidos;
    private int edad;

    public Persona() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
    }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String generarDatos() {
        return "Nombre: " + nombre + "\n"
                + "Apellidos: " + apellidos + "\n"
                + "Edad: " + edad;
    }
}
