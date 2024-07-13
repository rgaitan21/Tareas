/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author USUARIO
 */
public class Turismo extends Vehiculo implements Aseguranza {
    
    int numeroPuertas;
    
    Turismo(String marca, String modelo, int anio, double precioRenta, int numeroPuertas){
        super(marca, modelo, anio, precioRenta);
        this.numeroPuertas = numeroPuertas;
    }
    
    @Override
    double calcularCostoRenta(int dias){
        return precioRenta*dias;
    }
    
    private int getPuerta(){
        return this.numeroPuertas;
    }
    
    public void setPuerta(){
        System.out.println("Tiene "+getPuerta()+" puertas");
    }
    
    @Override
    public void calcularCostoAseguranza(){
        System.out.println("El costo aseguranza es: "+(calcularCostoRenta(7)*0.01)*precioRenta+" lempiras");
    }
}
