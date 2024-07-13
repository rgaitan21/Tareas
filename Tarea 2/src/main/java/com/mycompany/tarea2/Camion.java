/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author USUARIO
 */
public class Camion extends Vehiculo implements Aseguranza {
    
    double capacidadCarga;
    
    Camion(String marca, String modelo, int anio, double precioRenta, double capacidadCarga){
        super(marca, modelo, anio, precioRenta);
        this.capacidadCarga = capacidadCarga;
    }
    
    private double getCarga(){
        return this.capacidadCarga;
    }
    
    public void setCarga(){
        System.out.println("Capacidad de carga: "+getCarga()+" kilos");
    }
    
    @Override
    double calcularCostoRenta(int dias){
        return ((precioRenta*dias) + (precioRenta*0.20));
    }
    
    @Override
    public void calcularCostoAseguranza(){
        System.out.println("El costo de aseguranza es: "+(calcularCostoRenta(7)*0.015)*precioRenta+" lempiras");
    }
    
}
