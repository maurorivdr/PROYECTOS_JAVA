/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
import java.util.Arrays;


/**Que lea 10 números por teclado, los almacene en un array 
 * y muestre la suma y la multiplicación de todos. 
 *
 * @author IFC303_1
 */
public class Ejercicio8 {
    public static void main(String[] args) {
          Scanner teclado= new Scanner (System.in);
          int numeros[]= new int[5];
          int totalSuma=0;
          int totalMultiplicacion=1;
          for (int i=0;i<numeros.length;i++){
              System.out.println("Dime un numero");
              int numero=teclado.nextInt();
 
          numeros[i]=numero;
       
          totalSuma+=numero;
                totalMultiplicacion*= numero;
          
          }
          System.out.println("El total de la suma de los numeros= "+totalSuma);
        System.out.println("El total de la multiplicacion de los numeros= " +totalMultiplicacion);
    }
}
