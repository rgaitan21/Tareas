/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author USUARIO
 */
public class Moto extends Vehiculo implements Aseguranza {
    
    double capacidadMotor;

    public Moto(String marca, String modelo, int anio, double precioRenta, double capacidadMotor) {
        super(marca, modelo, anio, precioRenta);
        this.capacidadMotor = capacidadMotor;
    }
    
    private double getMotor(){
        return this.capacidadMotor;
    }
    
    public void setMotor(){
        System.out.println("Capacidad de motor: "+getMotor()+" cc");
    }
    
    @Override
    double calcularCostoRenta(int dias){
        return ((precioRenta*dias) - (precioRenta*0.20));
    }
    
    @Override
    public void calcularCostoAseguranza(){
        System.out.println("El costo de aseguranza es: "+(calcularCostoRenta(7)*0.005)*precioRenta+" lempiras");
    }
    
}
