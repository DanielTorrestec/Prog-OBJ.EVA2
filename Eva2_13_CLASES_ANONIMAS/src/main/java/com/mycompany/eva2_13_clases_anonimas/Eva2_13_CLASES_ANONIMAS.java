/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_13_clases_anonimas;

/**
 *
 * @author chili
 */

public class Eva2_13_CLASES_ANONIMAS {

    public static void main(String[] args) {
        //Prueba prueba = new Prueba();
        //CLASE ANONIMA --> CLASE SIN NOMBRE
        //POLIMORFISMO --> HACER QUE ALGO SE COMPORTE COMO ALGO DISTINTO
        Prueba prueba = new Prueba() {
            @Override
            public void mostrarMensaje() {
                System.out.println("Hola mundo!!");
            }
        };
        prueba.mostrarMensaje();
    }
}






/*class UsarPrueba implements Prueba {
    
}*/
interface Prueba{
    public void mostrarMensaje();
}