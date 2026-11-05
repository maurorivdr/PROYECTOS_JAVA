/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
import java.util.Arrays;


/**Programa Java que guarda en un array 10 números enteros que se leen por teclado.
 * A continuación se recorre el array y calcula cuántos números son positivos,
 * cuántos negativos y cuántos ceros. 
 *
 * @author IFC303_1
 */
public class Ejercicio3 {
    public static void main(String[] args) {
         Scanner teclado= new Scanner (System.in);
         int numeros[]=new int [10];
         int numPositivos=0;
         int numNegativos=0;
         int cero=0;
         for (int i= 0; i<numeros.length;i++){
             System.out.println("Dime un valor");
             int valor= teclado.nextInt();
         numeros[i]=valor;
         if (valor>0){
         numPositivos++;
         }
         else if(valor<0){
         numNegativos++;        
                 }
         else if(valor==0){
         cero++;
         }
    
         }
         System.out.println(Arrays.toString(numeros));
         System.out.println("El total de numeros positivos= "+ numPositivos);
          System.out.println("El total de numeros negativos= "+ numNegativos);
           System.out.println("El total de ceros es= "+ cero);
    }
}
