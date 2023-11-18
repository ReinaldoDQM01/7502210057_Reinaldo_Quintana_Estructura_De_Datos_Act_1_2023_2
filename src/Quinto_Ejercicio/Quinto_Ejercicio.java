/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quinto_Ejercicio;


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author rey
 */
public class Quinto_Ejercicio {

    public static void infoLenguajes(Object[][] lenguajes){
        Scanner scar = new Scanner(System.in);
        System.out.println("Aqui escribiras los datos de las filas y columnas :\n");
        int leng = lenguajes.length;
        for(int p=1; p<lenguajes.length; p++){
            for(int j=0; j<lenguajes[p].length; j++){
                System.out.print("Este es la fila " + p + " de la columna " + j+ "\n");
               lenguajes[p][j]= scar.nextLine();
                System.out.println("************************************");
            }
        }
    }
    
    public static boolean nombreMatriz(String NOMBRE, Object[][] lenguajes){
        for(int u=1; u<lenguajes[0].length; u++){
            if(lenguajes[0] != null && lenguajes[0][u].equals(NOMBRE)){
             return true;
            }
        }
        return false;
    }
    
    public static int[] coordenadas(String NOMBRE, Object[][] lenguajes){
        for(int s=1; s<lenguajes.length; s++){
            if(lenguajes[0] != null && lenguajes[0][s].equals(NOMBRE)){
                return new int[]{s, 0};
            }
        }
        return null;
    }
    
    public static String[] getDatosFila( Object[][] lenguajes, int fila) throws Exception{
        if(fila >= lenguajes.length){
            throw new Exception("Esta fila permanece errada" +fila);
        }
        return (String []) lenguajes[fila];
    }
    
    public static Object[] getFilColumnas(Object[][] lenguajes, int columna)throws Exception{
        if(columna >= lenguajes.length){
            throw new Exception("Este numero de columna permanece errada" +columna);
        }
        Object[] colum = new Object[lenguajes.length];
        for(int d=1; d<lenguajes.length; d++){
            colum[d] = lenguajes[d][columna];
        }
        return colum;
    }
    
    public static Object[] getdata(Object[][] lenguajes, int fila, int columna)throws Exception{
        if(fila >= lenguajes.length || columna >= lenguajes[0].length){
            throw new Exception("Esta coordenada esta fuera de matriz");
        }
        Object[] data = new Object[2];
        data[0] = lenguajes[fila][columna];
        data[1] = lenguajes[fila];
        return data;
    }
    // Método para obtener las coordenadas de un valor específico en una matriz
public static String getcoordenadas(Object[][] lenguajes, String NOMBRE){
    
    // Recorrer la matriz
    for(int t=1; t<lenguajes.length; t++){
        for(int y=0; y<lenguajes.length; y++){
            // Si el valor buscado coincide con el valor en la posición actual de la matriz
            if(lenguajes[t][y]!= null && lenguajes[t][y].equals(NOMBRE)){
                // Devolver las coordenadas de la posición actual de la matriz donde se encuentra el valor buscado
                return t + ":" + y;
            }
        }
    }
    // Si no se encuentra el valor devuelve null
    return "null";
    }
}
