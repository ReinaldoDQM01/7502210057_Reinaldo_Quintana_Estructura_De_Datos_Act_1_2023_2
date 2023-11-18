/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Primer_Ejercicio;

import java.util.Scanner;

/**
 *
 * @author rey
 */
public class Punto_FyG_Ejercicio1 {
    public static void main(String[] args) {
        
        String[] caracteristica = new String[5];
        
        try (Scanner sc = new Scanner(System.in)) {
            caracteristica[0] = "Simples, Circulares y Enlazadas";
            caracteristica[1] = "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir";
            caracteristica[2] = "Primero en entrar, Último en salir";
            caracteristica[3] = "Parejas de clave y valor";
            caracteristica[4] = "Elementos no repetidos";
            System.out.println("Escribe los datos de la caracteristicas\n");
            
            System.out.println("Escribe caracteristica 1: ");
            caracteristica[0] = sc.nextLine();
            
            System.out.println("Escribe caracteristica 2: ");
            caracteristica[1] = sc.nextLine();
            
            System.out.println("Escribe caracteristica 3: ");
            caracteristica[2] = sc.nextLine();
            
            System.out.println("Escribe caracteristica 4: ");
            caracteristica[3] = sc.nextLine();
            
            System.out.println("Escribe caracteristica 5: ");
            caracteristica[4] = sc.nextLine();
        }
        
        for(int u=0; u<caracteristica.length; u++){
            System.out.println("la caracteristica "+ u + " = " +caracteristica[u]);
        }
    }
}
