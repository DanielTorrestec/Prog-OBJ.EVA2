/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_herencia;

/**
 *
 * @author chili
 */
public class EVA2_3_HERENCIA {
    public static void main(String[] args) {
        System.out.println("======CLASE ANIMAL=====");
        Animal animal = new Animal();
        animal.comer();
        System.out.println("=====CLASE MAMIFERO=====");
        Mamifero mamifero = new Mamifero();
        mamifero.TenerPelo();
        System.out.println("=====CLASE PERSONA======");
        Persona persona = new Persona();
        persona.comer();
        persona.TenerPelo();
        persona.pensar();
    }

    }


class Animal{ // CLASE BASE, SUPERCLASE, CLASE PADRE
   public Animal(){
       System.out.println("Clase animal");
   } 
       public void comer(){
        System.out.println("Animal: comer!!");
       } 
}
class Mamifero extends Animal{ // CLASE DERIVADA, SUBCLASE, HIJO
    public Mamifero(){
        System.out.println("Clase Mamifero");
    }
    public void TenerPelo() {
            System.out.println("Tiene pelo!!");
    }
}

class Persona extends Mamifero{
    public Persona(){
        System.out.println("Clase Persona");
    }
    public void pensar(){
        System.out.println("Persona: piensa!!!");
    }
}