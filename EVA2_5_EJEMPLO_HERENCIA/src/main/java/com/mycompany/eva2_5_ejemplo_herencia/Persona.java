/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author chili
 */
public class Persona {
    private String nombre;
    private String ap_materno;
    private String ap_paterno;
    private String RFC;
    private int edad;
    private char genero;

    public Persona(String nombre, String ap_materno, String ap_paterno, String RFC, int edad, char genero) {
        this.nombre = nombre;
        this.ap_materno = ap_materno;
        this.ap_paterno = ap_paterno;
        this.RFC = RFC;
        this.edad = edad;
        this.genero = genero;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp_materno() {
        return ap_materno;
    }

    public void setAp_materno(String ap_materno) {
        this.ap_materno = ap_materno;
    }

    public String getAp_paterno() {
        return ap_paterno;
    }

    public void setAp_paterno(String ap_paterno) {
        this.ap_paterno = ap_paterno;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
    public String generarNombreCom(){
        return nombre + " " + ap_paterno + " " + ap_materno;
    }
    
    public String regresarGenero(){
        switch(genero){
            case 'H':
                return "Hombre;";
            case 'M':
                return "mujer";
            case 'O':
                return "otro";
            default: 
                return "No definido";
            
        }
    }
    
    public void ImprimirDatos(){
        System.out.println("Nombre completo: " + generarNombreCom());
        System.out.println("Edad: " + edad);
        System.out.println("RFC: " + RFC);
        System.out.println("Genero: " + genero);
    }
    
}