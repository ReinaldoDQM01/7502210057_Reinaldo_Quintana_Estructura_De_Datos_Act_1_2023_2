/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_double {
    public static void main(String[] args) {
        
        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos

        double[] Ndecimal = new double[5];
        
        Ndecimal[0] = 14.3;
        Ndecimal[1] = 76.14;
        Ndecimal[2] = 7.325;
        Ndecimal[3] = 87.90;
        Ndecimal[4] = 123.89;
        
        System.out.println("Los numeros Decimales son:\n");
        
        for(int D=0; D<Ndecimal.length; D++){
            System.out.println("El numero decimal es: "+Ndecimal[D]);
        }
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Double[] puntosDecimales = {2.106, 88.5, 97.4, 90.5, 30.7};
        
        for(Double h : puntosDecimales){
            System.out.println("El Valor de este decimal es: "+h);
        }
    }
}
