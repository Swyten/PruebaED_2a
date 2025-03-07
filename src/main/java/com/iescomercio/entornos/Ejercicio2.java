/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iescomercio.entornos;
public class Ejercicio2 {
    public static boolean ejercicio2(int n1, int n2){    
        if (n1 == n2 || 
            Ejer1pdf1.Ejercicio1(n1).equals("positivo") ||
            Ejer1pdf1.Ejercicio1(n2).equals("positivo")) {
                return true;
        }
        return false;        
    }    
        
}
