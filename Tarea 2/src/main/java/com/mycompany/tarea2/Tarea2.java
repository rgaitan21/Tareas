/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2;

/**
 *
 * @author USUARIO
 */

//Raul Arturo Gaitan Valle  
//20172000472

public class Tarea2 {

    public static void main(String[] args) {
        
        Turismo t1 = new Turismo("Nissan","Skyline",2024,650,2);
        Camion c1 = new Camion("Paccar","Peterbilt 389",1987,1250,26000);
        Moto m1 = new Moto("Softail","Harley Davidson",1969,450,1250);
        System.out.println("================TURISMO=============");
        t1.setmarca();
        t1.setmodelo();
        t1.setanio();
        t1.setprecioRenta();
        t1.setPuerta();
        System.out.println("Total del costo de renta: "+t1.calcularCostoRenta(7)+" lempiras");
        t1.calcularCostoAseguranza();
        System.out.println("");
        
        System.out.println("================CAMION=============");
        c1.setmarca();
        c1.setmodelo();
        c1.setanio();
        c1.setprecioRenta();
        c1.setCarga();
        System.out.println("Total del costo de renta: "+c1.calcularCostoRenta(7)+" lempiras");
        c1.calcularCostoAseguranza();
        System.out.println("");
        
        System.out.println("================MOTO=============");
        m1.setmarca();
        m1.setmodelo();
        m1.setanio();
        m1.setprecioRenta();
        m1.setMotor();
        System.out.println("Total del costo de renta: "+m1.calcularCostoRenta(7)+" lempiras");
        m1.calcularCostoAseguranza();
        
        
    }
}
