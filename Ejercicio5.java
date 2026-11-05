/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjerciciosArrays;
import java.util.Scanner;
import java.util.Arrays;
/**
 *gativos del array.
5. Programa Java para leer la altura de N personas y calcular la altura media.
* Calcular cuántas personas tienen una altura superior a la media
* y cuántas tienen una altura inferior a la media. 
* El valor de N se pide por teclado y debe ser entero positivo. 

 * @author IFC303_1
 */
public class Ejercicio5 {
    public static void main(String[] args) {
       Scanner teclado= new Scanner (System.in);
        System.out.println("Cuantas personas quieres medir");
        int n= teclado.nextInt();
        int personas[]= new int [n];
         int total=0;
         int superiorMedia=0;
         int inferiorMedia=0;
        for (int i=0;i<personas.length;i++){
            System.out.println("Dime la altura");
            int altura=teclado.nextInt();
        personas[i]=altura;
        total+=altura;
        }
        int media= total/n;
        for (int i=0;i<personas.length;i++){
        if (personas[i]>media){
        superiorMedia++;}
        else if (personas[i]<media){
        inferiorMedia++;}
       
        }
        System.out.println("La altura media es ="+ media);
        System.out.println("El numero de personas superior a la media= "+superiorMedia);
        System.out.println("El numero de personas inferior a la media= "+inferiorMedia);
        System.out.println(Arrays.toString(personas));
    }
  
}
