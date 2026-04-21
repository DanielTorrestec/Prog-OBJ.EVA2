/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_composicion_2;

/**
 *
 * @author chili
 */
public class EVA2_20_COMPOSICION_2 {

    public static void main(String[] args) {
    Motor motor = new Motor(5, 'G', 1.5);
     Vehiculo vehiculo = new Vehiculo("Ford", "Mustang", 1970, "Azul", motor);
        System.out.println(vehiculo);
    }
}
