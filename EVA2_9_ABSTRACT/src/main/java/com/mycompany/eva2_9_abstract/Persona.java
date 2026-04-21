/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_9_abstract;

/**
 *
 * @author chili
 */
    public abstract class Persona {
        protected String nombre;
        protected String apellidos;
        protected int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
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
        
        public abstract int calcularAntiguedad();
        
    }

