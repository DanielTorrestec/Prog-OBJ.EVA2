/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_composicion;

/**
 *
 * @author chili
 */
public class EVA2_18_COMPOSICION {

    public static void main(String[] args) {
        Persona persona = new Persona("Daniel Arturo", "Torres Loya", 18, "AV. Paseo del real", "Jardines del sol", 18717, "Chihuahua", "31183");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellidos: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Calle: " + persona.getDireccion().getCalle());
        System.out.println("Numero: " + persona.getDireccion().getNumero());
        System.out.println("CP: " + persona.getDireccion().getCp());
        System.out.println("Ciudad: " + persona.getDireccion().getCiudad());
        //SE CAMBIA LA DIRECCION DE LA PERSONA:
        Direccion direccion = new Direccion("Tecnologico", "Santo niño", 100, "Chihuahua", "31100");
        persona.setDireccion(direccion);
    }
}
