/*
Escribe una función que reciba como parámetro de entrada un número entero y
que devuelva como salida la cadena “positivo” si se positivo o “negativo” si es
negativo
 */
package com.iescomercio.entornos;
import java.util.Scanner;
public class Ejer1pdf1 {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);   
        System.out.print("introduzca el número: ");
        System.out.println(Ejercicio2.ejercicio2(t.nextInt(), t.nextInt()));        
    }   
    public static String Ejercicio1(int entrada){       
    
        if (entrada >= 0) {
            return("positivo");
        }else{
            return("negativo");
        }
    }
}
