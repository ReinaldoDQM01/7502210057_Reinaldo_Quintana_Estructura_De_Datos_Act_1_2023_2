/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tercer_Ejercicio;

/**
 *
 * @author rey
 */
public class Principal {
    public static void main(String[] args) {
        int[] venta ={590, 122, 150, 30, 288};
        int valor = venta.length;
        
        venta cantidad = new venta(venta, valor);
        System.out.println("Las ventas son: \n");
        for(int t=0; t<venta.length; t++){
            System.out.println("Ventas "+ t + " es: "+venta[t]);
        }
        System.out.println("El numero de ventas mas Alta fue: "+ venta[0]);
        System.out.println("EL numero de ventas mas Baja fue: "+ venta[3]);
        System.out.println("********************");
        System.out.println("El Total de todas las ventas es: "+ cantidad.getTotal());
        System.out.println("EL promedio de todas las ventas es: "+ cantidad.getPromedios());
        System.out.println("El promedio aproximado que se acerca a la cantidad del promedio de la venta es: "+cantidad.Aproximado());
    }
}
