/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.transportes;

/**
 *
 * @author DELL 7490
 */
public class Transportes {

    public static void main(String[] args) {
       //crear un vehiculo terrestre
       
       VehiculoTerrestre vehiculoTerrestre= new VehiculoTerrestre("Toyota","corolla",4);
       VehiculoAcuatico vehiculoAcuatico= new VehiculoAcuatico("Lancha","Yamaha","Motor prr");
       VehiculoAereo vehiculoAereo= new VehiculoAereo("simon","aI",2);
       VehiculoEspacial vehiculoEspacial= new VehiculoEspacial ("neh","mxo",4);
       
       //Mostrar info de los vehiculos
        System.out.println("Informacion del vehiculo Terrestre ");
        vehiculoTerrestre.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Acuatico");
        vehiculoAcuatico.mostrarInfo();
        
        System.out.println("Informacion del vehiculo Aereo");
        vehiculoAereo.mostrarInfo();
        
        System.out.println("Informacion del vehiculo espacial");
        vehiculoEspacial.MostrarInfo();
    }
}
