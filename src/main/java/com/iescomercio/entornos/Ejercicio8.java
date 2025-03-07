/*
Escribe una función que reciba como parámetro de entrada un número del 0 al 7 y
devuelva el nombre del día de la semana. (0 es lunes, 1 es martes, …) 
*/
package com.iescomercio.entornos;
public class Ejercicio8 {
    public static String ejercicio8(byte n1){
        if (n1==0) {
            return ("Lunes");
        }else if (n1==1) {
            return ("Martes");
        }else if(n1==2){
            return ("Miércoles");
        }else if(n1==3){
            return ("Jueves");
        }else if(n1==4){
            return ("Viernes");
        }else if(n1==5){
            return ("Sábado");
        }else if (n1==6){
            return ("Domingo");
        }else{
            return ("no es válido");
        }       
    }   
}
