/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_integer {
    public static void main(String[] args) {
        
        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos

        int[] Numbers = new int[5];
        
        Numbers[0] = 21;
        Numbers[1] = 44;
        Numbers[2] = 57;
        Numbers[3] = 89;
        Numbers[4] = 34;
        System.out.println("Los numeros enteros son:\n");
        for(int e=0; e<Numbers.length; e++){
            System.out.println("Entero " + (e+1) + " = " + Numbers[e]);
        }
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Integer[] Enteros = {47, 83, 9, 93, 12};
        
        for(int numeros: Enteros){
            System.out.println("Este numero entero es"+" = "+ numeros);
        }
    }
}
