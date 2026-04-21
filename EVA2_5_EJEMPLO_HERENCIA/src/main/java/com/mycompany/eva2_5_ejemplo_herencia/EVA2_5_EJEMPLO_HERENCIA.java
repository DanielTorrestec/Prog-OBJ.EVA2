/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_ejemplo_herencia;

/**
 *
 * @author chili
 */
public class EVA2_5_EJEMPLO_HERENCIA {

    public static void main(String[] args) {
        Persona persona = new Persona ("Daniel Arturo", "Loya", "Torres", "TOLD071024", 18,'H');
                persona.ImprimirDatos();
        Empleado empleado = new Empleado ("1", "Gerente", 50000, "Sarah Daniela", "Loya", "Torres", "TOLS071024", 18,'M');
                System.out.println(empleado);
// CUANDO UNA SUBCLASE TIENE UN METODO QUE SE LLAMA IGUAL QUE UN METODO DE LA SUPERCLASE, SE SOBREESCRIBE/SOBRECARGA,
// ES DECIR, LO OCULTA (TIENE PRIORIDAD EL METODO DE LA SUBCLASE). 
//DEBEMOS DECIDIR SI: 
//+ OCULTAMOS EL METODO DE LA SUPER CLASE 
//+ INCORPORAMOS EL METODO DE LA SUPERCLASE 
//+ CAMBIAMOS POR COMPLETO LO QUE HACE LE METODO DE LA SUPERCLASE
//+ INCORPORAMOS Y AMPLIAMOS EL METODO DE LA SUPERCLASE (RECOMENDADADO)
    }
}
