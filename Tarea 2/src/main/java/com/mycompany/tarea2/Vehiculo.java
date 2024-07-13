/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea2;

/**
 *
 * @author USUARIO
 */
abstract class Vehiculo {
    
    String marca;
    String modelo; 
    int anio; 
    double precioRenta;
    
    Vehiculo(String marca, String modelo, int anio, double precioRenta){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precioRenta = precioRenta;
    }
    
    private String getmarca(){
        return this.marca;
    }
    
    public void setmarca(){
        System.out.println("Nombre del vehiculo: "+getmarca());
    }
    
    private String getmodelo(){
        return this.modelo;
    }
    
    public void setmodelo(){
        System.out.println("Modelo del vehiculo: "+getmodelo());
    }
    
    private int getanio(){
        return this.anio;
    }
    
    public void setanio(){
        System.out.println("Anio: "+getanio());
    }
    
    private double getprecioRenta(){
        return this.precioRenta;
    }
    
    public void setprecioRenta(){
        System.out.println("Precio de renta diario: "+getprecioRenta());
    }
        
    double calcularCostoRenta(int dias){
        return 0;
    }
    
}
