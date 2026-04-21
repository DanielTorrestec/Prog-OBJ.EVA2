/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_polimorfismo;

/**
 *
 * @author chili
 */
public class EVA2_17_POLIMORFISMO {

    
    
    public static void main(String[] args) {
        Cliente cliente = new Cliente("ASDF31545", 10000, "Daniel Torres", "Torres Loya", 18);
        System.out.println("CLIENTE");
        System.out.println(cliente.generarDatos());
        System.out.println("EMPLEADO");
        Empleado empleado = new Empleado("Gerente", 100000, "Sarah Daniel", "Torres Loya", 18);
        System.out.println(empleado.generarDatos());
        //CLIENTE Y EMPLEADO SON PERSONAS (SE DERIVAN DE LA CLASE PERSONA)
        Persona persona;
        persona = cliente; //son tipos de datos distintos
        System.out.println("CLIENTE EN UNA VARIABLE DE TIPO PERSONA");
        System.out.println(persona.generarDatos());
        Persona persona2;
        persona2 = empleado;
        System.out.println("EMPLEADO EN UNA VARIABLE DE TIPO PERSONA");
        System.out.println(persona2.generarDatos());
        //Por herencia, los clientes derivan de persona
        //int x ="hola";
        System.out.println("USAR POLIMORFISMO PARA IMPRIMIR LOS DATOS");
        imprimirDatos(cliente);
        imprimirDatos(empleado);
        // NO SE PUEDE PONER UN OBJETO PERSONA EN UN CLIENTE O EMPLEADO
        Persona perso = new Persona("Kyoko", "Hana", 18);
        //Cliente cl = perso //NO SE PUEDE PORQUE PERSONA NO HEREDA DE CLIENTE
        imprimirDatos(perso);
        //CASTING: 
        //Regresar las variables de tipo persona s u clase original
        Cliente clienteOriginal;
        clienteOriginal = (Cliente)persona;
        //usar instanceof para evitar convertir objetos incompatibles
    }
    public static void imprimirDatos(Persona perso){
        System.out.println(perso.generarDatos());
        if(perso instanceof Cliente)
            System.out.println("Cliente");
        else if(perso instanceof Empleado)
            System.out.println("Empleado");
        else if(perso instanceof Persona)
            System.out.println("Persona");
    }
}