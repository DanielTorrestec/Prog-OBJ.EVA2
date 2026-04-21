/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva2_18_composicion;

/**
 *
 * @author chili
 */
public class Direccion {
    private String calle;
    private String colonia;
    private int numero;
    private String ciudad;
    private String cp;

    public Direccion() {
        this.calle = "";
        this.colonia = "";
        this.numero = 0;
        this.ciudad = "";
        this.cp = "";
    }
        public Direccion(String calle, String colonia, int numero, String ciudad, String cp) {
        this.calle = calle;
        this.colonia = colonia;
        this.numero = numero;
        this.ciudad = ciudad;
        this.cp = cp;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }
    
        
}
