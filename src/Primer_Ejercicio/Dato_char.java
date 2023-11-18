/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

/**
 *
 * @author rey
 */
public class Dato_char {
    public static void main(String[] args) {
        
        // A) Declarar un arreglo por cada uno de los tipos de datos primitivos
       //  B) Definir cada uno de los arreglos anteriores con tamaño de 5 elementos

        char[] letricas = new char[5];
        
        letricas[0] = 'R';
        letricas[1] = 'L';
        letricas[2] = 'W';
        letricas[3] = 'V';
        letricas[4] = 'T';
        
        for(char A=0; A<letricas.length; A++){
            System.out.println("Esta letra es: "+ letricas[A]);
        }
        System.out.println("\n");
        System.out.println("*********************************\n");
        
        Character[] vocal = new Character[5];
        
        vocal[0] = 'A';
        vocal[1] = 'E';
        vocal[2] = 'I';
        vocal[3] = 'O';
        vocal[4] = 'U';
        
        for(Character b=0; b<vocal.length; b++){
            System.out.println("Esta vocal es: "+ vocal[b]);
        }
    }
}
