/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_Byte {
    public static void main(String[] args) {
        
        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos

        byte[] nBYTES = new byte[5];
        
        nBYTES[0] = 45;
        nBYTES[1] = 56;
        nBYTES[2] = 66;
        nBYTES[3] = 120;
        nBYTES[4] = 16;
        
        for(byte C=0; C<nBYTES.length; C++){
            System.out.println("El valor de este indice bytes " + C + " es: " + nBYTES[C]);
        }
        
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Byte[] nBits = new Byte[5];
        
        nBits[0] = 8;
        nBits[1] = 64;
        nBits[2] = 123;
        nBits[3] = 71;
        nBits[4] = 90;
        
        for(byte B=0; B<nBits.length; B++){
            System.out.println("Este es el numero :" + nBits[B]);
        }
    }
}
