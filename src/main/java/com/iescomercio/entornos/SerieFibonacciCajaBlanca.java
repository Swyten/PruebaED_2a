/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iescomercio.entornos;
import java.util.Scanner;
public class SerieFibonacciCajaBlanca {
    public static void main(String[] args) {
        SerieFibonacciCajaBlanca misCal = new SerieFibonacciCajaBlanca();
        misCal.Fibonacci();
    }
    public void Fibonacci() {
        Scanner miScan = new Scanner(System.in);
        System.out.print("¿Quiere salir del programa?: ");
        String sSalir = miScan.nextLine();
        int iValor = 0;
        String sResultado;
        String sAux;
        while (!(sSalir.equals("S") || sSalir.equals("s"))) {
            sResultado = "";
            System.out.print("\n\t¿Cuantos numeros de la serie deseas mostrar?: ");
            sAux = miScan.nextLine();
            iValor = Integer.parseInt(sAux);
            switch (iValor) {
                case 3:
                    sResultado = " 1";
                case 2:
                    sResultado = " 1" + sResultado;
                case 1:
                    sResultado = "0" + sResultado;
                    System.out.println(sResultado);
                    break;
                default:
                    System.out.println("\t\tNúmero no permitido. Tiene que estar entre 1 y 3.");
            }
            System.out.print("\n¿Quiere salir del programa?: ");
            sSalir = miScan.nextLine();
        }
    }
}
