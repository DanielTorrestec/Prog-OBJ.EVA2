/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_12_herencia_interfaces;

/**
 *
 * @author chili
 */
public class EVA2_12_Herencia_Interfaces {

    public static void main(String[] args) {
        
    }
}



interface Prueba{
    void mostrarMensaje();
}

interface OtraPrueba extends Prueba{
    void mostrarSaludo(String mensaje);
}

class Demostracion implements OtraPrueba{

    @Override
    public void mostrarSaludo(String mensaje) {
        System.out.println(mensaje);
    }

    @Override
    public void mostrarMensaje() {
        System.out.println("Hola Mundo Cruel!!");
    }
    
}