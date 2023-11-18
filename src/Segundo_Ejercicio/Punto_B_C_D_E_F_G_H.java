/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_Ejercicio;

import java.util.Random;

/**
 *
 * @author rey
 */
public class Punto_B_C_D_E_F_G_H {
    public static void main(String[] args) {
        
        int[] ventas = new int[10];
        
        Random rand = new Random();
        int venta = rand.nextInt(10);
        
        ventas = new int [venta];
        
        for(int valores=0; valores<venta; valores++){
            ventas[valores]=rand.nextInt(1000)+1;
        }
        System.out.println("La cantidad de ventas equivale a: " + venta);
        System.out.println("Aqui esta el numero de ventas :\n");
        for(int numeros=0; numeros<venta; numeros++){
            System.out.println("La venta #"+ (numeros+1) + " es = " + ventas[numeros]);
        }
        System.out.println("*********************************\n");
        double totalSales =0;
        for(int sales=0; sales<venta; sales++){
            totalSales += ventas[sales];
        }
        System.out.println("El numero de total de las ventas es ="+totalSales);
        System.out.println("*********************************\n");
        double Promedio =(double) totalSales/venta;
        System.out.println("EL promedio de todas las venta es = "+Promedio);
    }
}