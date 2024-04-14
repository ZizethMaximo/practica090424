package com.mycompany.transportes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL 7490
 */
public class VehiculoAereo extends Vehiculo{
    
    private int Alas;
    
    public VehiculoAereo(String marca, String modelo, int Alas){
        super(marca,modelo);
        this.Alas=Alas;
        
    }
     public void mostrarInfo(){
         super.MostrarInfo();
         System.out.println("Numero de alas "+Alas);
     }
    
}
