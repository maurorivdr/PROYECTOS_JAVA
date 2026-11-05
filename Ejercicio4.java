/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
/**Programa java que llene un array con 10 números enteros que se leen por teclado.
 * A continuación calcula y muestra la media de los valores positivos y
 * la de los valores negativos del array. 
 *
 * @author IFC303_1
 */
public class Ejercicio4 {
    public static void main(String[] args) {
         Scanner teclado= new Scanner (System.in);
         int numeros[]= new int[5];
         int numPositivos=0;
         int numNegativos=0;
         int totalPositivos=0;
         int totalNegativos=0;
         for (int i=0;i<numeros.length;i++){
             System.out.println("Dime un valor");
             int valor= teclado.nextInt();
             numeros[i]=valor;
             if (valor>0){
             numPositivos++;
             totalPositivos+=valor;}
             else if (valor<0){
             numNegativos++;
             totalNegativos+=valor;
             }
         }
             System.out.println("La media de los numeros positivos es = "+  ((double) totalPositivos/numPositivos));
              System.out.println("La media de los numeros negativos es = "+ ( (double)totalNegativos/numNegativos));
        
         
         
    }
}
