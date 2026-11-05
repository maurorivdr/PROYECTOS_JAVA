/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to changea this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

/**Crea un array de números donde le
 * indicamos por teclado el tamaño del array,
rellenaremos el array con números aleatorios entre 0 y 9,
* al final muestra por pantalla
*el valor de cada posición y la suma de todos los valores
 *
 * @author IFC303_1
 */
public class Ejercicio2 {
    public static void main(String[] args) {
         Scanner teclado= new Scanner (System.in);
         System.out.println("Dime el tamaño del array");
         int tamaño=teclado.nextInt();
         int numeros[]=new int [tamaño];
          ;
          int numeroAleatorio=0;
          int total=0;
         for (int i=0;i<numeros.length;i++){
             Random rand=new Random();
        numeroAleatorio=rand.nextInt(0,11);
        total+=numeroAleatorio;
         numeros[i]= numeroAleatorio;
         
         }
         System.out.println("El valor de cada posicion= "+Arrays.toString(numeros));
         System.out.println("La suma de todos los valores es= "+total);
    }
}
