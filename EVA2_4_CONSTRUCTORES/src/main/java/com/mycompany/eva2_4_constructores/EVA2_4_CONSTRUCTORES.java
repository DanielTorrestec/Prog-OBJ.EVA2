/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_constructores;

/**
 *
 * @author chili
 */
public class EVA2_4_CONSTRUCTORES {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("hola");
        
    }
    }
    class Persona{ // BASE, SUPERCLASE, PADRE
        public Persona(){
            System.out.println("CLASE PERSONA");
        }
        public Persona(String mensaje){
            System.out.println(mensaje);
        }
    }
    class Empleado extends Persona{ //DERIVADA, SUBCLASE, HIJO
        //super --> ACCESO A LO PUBLICO O PROTEGIDO DE LA SUPERCLASE
        public Empleado(){
            super();//CONSTRUCTOR DE LA SUPERCLASE
        }
        
        
        public Empleado(int Salario){
            super();
         System.out.println("EMPLEADO: CONSTRUCTOR CON ARGUMENTOS");
        }
        public Empleado(String mensaje){
            super(mensaje);
        }
    }


