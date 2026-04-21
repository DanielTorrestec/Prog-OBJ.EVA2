/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_final;

/**
 *
 * @author chili
 */
public class EVA2_14_FINAL {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}






class Persona{
    private String nombre;
    
    public Persona(){
        nombre = "";
    }
    
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}


final class Empleado extends Persona {// ya no se puede heredar de Empleado
    private String puesto;

    public Empleado(String puesto) {
        puesto = "";
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
}

class CEO extends empleado {// final limita la herencia
    
}