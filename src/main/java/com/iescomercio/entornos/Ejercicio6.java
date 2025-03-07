/*
Escribir una función que solicite reciba un parámetro de entrada con una nota al y
devuelva la cadena :
“insuficiente” si se encuentra entre 0 y 4
“aprobado” si es un 5
“bien” si es un 6
“notable” si es un 7 u 8
“sobresaliente” si es un 9 o 10
*/
package com.iescomercio.entornos;
public class Ejercicio6 {
    public static String ejercicio6(int n1){
        if (n1>=0 && n1<5) {
            return ("insuficiente");            
        }else{
            switch(n1){
                case 5:
                    return ("aprobado");
                case 6:
                    return ("bien");
                case 7, 8:
                    return ("notable");
                case 9, 10:
                    return ("sobresaliente");
                default:
                    return ("no es un número válido");
            }
        }
    }
    
}
