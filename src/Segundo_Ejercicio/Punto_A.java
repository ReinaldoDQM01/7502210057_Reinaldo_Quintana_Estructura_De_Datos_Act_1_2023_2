/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Segundo_Ejercicio;

/**
 *
 * @author rey
 */
public class Punto_A {
    public static void main(String[] args) {
        
        String[] características = {
            "Simples, Circulares y Enlazadas",
            "Primero en entrar, Primero en Salir. Último en entrar, Primero en salir",
            "Primero en entrar, Último en salir",
            "Parejas de clave y valor",
            "Elementos no repetidos"};

        String[] dataStructs ={"Listas", "Colas", "Pilas", "Mapas", "Conjuntos"};
        
        for(int i=0; i<dataStructs.length; i++){
            System.out.println(dataStructs[i] + " - " + características[i]);
        }
    }
}
