/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.transportes;

/**
 *
 * @author DELL 7490
 */
public class VehiculoEspacial extends Vehiculo{
    
    private int turbinas;
    
    public VehiculoEspacial(String marca, String modelo, int turbinas){
        super(marca,modelo);
        this.turbinas=turbinas;
        
    }
     public void mostrarInfo(){
         super.MostrarInfo();
         System.out.println("Numero de turbinas "+turbinas);
     }
}
