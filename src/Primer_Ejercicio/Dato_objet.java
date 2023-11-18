/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_objet {
    public static void main(String[] args) {

        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos
        
        Object[] Vehiculos = {"Bicicleta", "Moto", "Coche", "Tren", "Bus"};
        
        for(Object cosas:Vehiculos){
            System.out.println(cosas);
        }
    }
}
