/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuarto_Ejercicio;

/**
 *
 * @author rey
 */
public class principal_ventas {
     public static void main(String[] args) {
        
        int[] Ventas = {900, 200, 630, 90, 33};
        int numeros = 5;
        
        ventas venta = new ventas(Ventas, numeros);
        
        venta.Descendente();
        System.out.println("Estas son las ventas que tienden a descender: ");
        for(int p=0; p<numeros; p++){
            System.out.println(venta.getVentas()[p]);
        }
        System.out.println("***********************************************");
        
        venta.Ascendente();
        System.out.println("Estas son las ventas que tienden a ascender: ");
        for(int v=0; v<numeros; v++){
            System.out.println(venta.getVentas()[v]);
        }
        System.out.println("***********************************************");
        
        venta.Desordenadas();
        System.out.println("Estas son las ventas desordenadas: ");
         for(int a=0; a<numeros; a++){
             System.out.println(venta.getVentas()[a]);
         }
         System.out.println("***********************************************");
         
         venta.paresImpares();
         System.out.println("Estos son los numeros impares y pares");
         for(int z=0; z<numeros; z++){
             System.out.println(venta.getVentas()[z]);
         }
    }
}
