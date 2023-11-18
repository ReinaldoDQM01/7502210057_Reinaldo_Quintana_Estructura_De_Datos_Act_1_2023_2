/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quinto_Ejercicio;

import static Quinto_Ejercicio.Quinto_Ejercicio.getcoordenadas;
import static Quinto_Ejercicio.Quinto_Ejercicio.infoLenguajes;
import java.util.Scanner;

/**
 *
 * @author rey
 */
public class Principal {
    public static void main(String[] args) {
        Object[][] lenguajes = new Object[5][8];
        lenguajes[0] = new Object[]{"NOMBRE", "AÑO", "AUTOR", "DETALLES", "FRAMEWORKS"};
        
        infoLenguajes(lenguajes);
        
        for(int k=0; k<lenguajes.length; k++){
           for(int h=0; h<lenguajes[k].length; h++){
               System.out.print(lenguajes[k][h] + "\t");
           }
            System.out.println();
        } 
        
        System.out.println("Ingrese un valor para buscar :" );
        
        try (// Scanner para buscar un valor
        Scanner scar2 = new Scanner(System.in)) {
            // Declarar variables
            String nombreLenguaje = ""; // El valor que vamos a buscar
            String respuesta = ""; // Aqui se guarda el resultado del metodo
            // Leer la entrada del usuario y la guarda en la variables
            nombreLenguaje = scar2.nextLine();
            
            // LLama a getcoordenadas para buscar nombreLenguaje 
            respuesta = getcoordenadas(lenguajes, nombreLenguaje);
            
            // Imprimir el resultado en la consola
            if ( respuesta != "null"  ) { // si el valor NO ES IGUAL a Null 
                System.out.print("\nEl valor " + nombreLenguaje + " esta en la posicion " + respuesta );
            } else { // DE LO CONTRARIO si el valor es IGUAL a Null
                System.out.print("\nEl metodo regreso \"" + respuesta + "\"");
            }
        }
        
    }
}
