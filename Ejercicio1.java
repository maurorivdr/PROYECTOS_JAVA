/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
import java.util.Arrays;
/**
 *Crea un array de 10 posiciones de números con valores pedidos por teclado.
 * Muestra por consola el índice y el valor al que corresponde. 
 * @author IFC303_1
 */
public class Ejercicio1 {
    public static void main(String[] args) {
         Scanner teclado= new Scanner (System.in);
        int numeros[]= new int [10];
        int indice[]= new int [10];
        for (int i=0;i<numeros.length;i++){
        System.out.println("Dime un valor");
     numeros[i]= teclado.nextInt();}
        
        System.out.println(Arrays.toString(numeros));
        
    }
}
