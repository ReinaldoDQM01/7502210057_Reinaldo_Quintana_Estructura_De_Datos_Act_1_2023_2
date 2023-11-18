/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_float {
    public static void main(String[] args) {
        
        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos

        float[] fdecimals = {31.2f, 55.2f, 49.0f, 66.7f, 71.3f};
        
        System.out.println("Los numeros del dato primitivo float son:\n");
        for(float f: fdecimals){
            System.out.println("Este numero float decimal es: "+f);
        }
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Float[] FdecimalesPunto = {11.200f, 3.33f, 56.5f, 88.0f, 76.9f};
        
        for(Float i:FdecimalesPunto){
            System.out.println("El numero de este Float es; "+i);
        }
    }
}
