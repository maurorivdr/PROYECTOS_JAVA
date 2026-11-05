/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Arrays;
/**Que rellene un array con los 100 primeros números enteros
 * y los muestre en pantalla en orden ascendente. 
 *
 * @author IFC303_1
 */
public class Ejercicio6 {
    public static void main(String[] args) {
          int numeros[]= new int[101];
    for (int i=0;i<101;i++){
numeros[i]=i;
        System.out.println(i);
    }
        System.out.println(Arrays.toString(numeros));
}
}
