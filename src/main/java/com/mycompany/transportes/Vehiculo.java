package com.mycompany.transportes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL 7490
 */
public class Vehiculo {
    
    protected String marca;
    protected String modelo;
    
    public Vehiculo(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;  
    }
    
    public void MostrarInfo(){
            System.out.println("Marca "+marca);
            System.out.println("Modelo "+modelo);
    }
    
}
