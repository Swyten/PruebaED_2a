/*
Escribe una función que reciba como parámetro un número y que devuelva “par” si
dicho número es par e “impar” si el número es impar. 
*/
package com.iescomercio.entornos;

public class Ejercicio3 {
    public static String ejercicio3 (int n1){       
        byte resto;
        resto = (byte)(n1 % 2);
        if (resto==0) {
            return ("par");
        }else{
            return ("impar");
        }
    }
    
}
