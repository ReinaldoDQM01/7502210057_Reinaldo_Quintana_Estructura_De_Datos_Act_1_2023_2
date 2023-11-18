/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cuarto_Ejercicio;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author rey
 */
public class ventas {
    
    private int[] Ventas;
    private int numeros;
    
    public ventas(int[] negocio, int cifras){
        Ventas = negocio;
        numeros = cifras;
    }
    
    public void Descendente(){
        Arrays.sort(Ventas);
        for(int cliente=0; cliente<numeros/2; cliente++){
            int sale = Ventas[cliente];
            Ventas[cliente] = Ventas[numeros -1 -cliente];
            Ventas[numeros -1 -cliente]= sale;   
        }
    }
    
    public void Ascendente(){
        Arrays.sort(Ventas);
    }
    
    public void Desordenadas(){
        Random rnd = new Random();
        int dx = Ventas.length;
        for(int k=0; k<dx; k++){
            int RandomIndexToSwap = rnd.nextInt(dx);
            int P = Ventas[RandomIndexToSwap];
            Ventas[RandomIndexToSwap] = Ventas[k];
            Ventas[k] = P;
        }
    }
    
     public void paresImpares(){
        Arrays.sort(Ventas); 
        int[] pare = new int [Ventas.length];
        int[] imp = new int [Ventas.length];
        int  par =0, impar=0;
        for(int h=0; h<Ventas.length; h++){
            if(h % 2==0){
                pare[par++]= h;
            }else{
               imp[impar++]= h;
            }
        }
    }

    public int[] getVentas() {
        return Ventas;
    }

    public int getNumeros() {
        return numeros;
    }
}
