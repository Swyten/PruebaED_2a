/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iescomercio.entornos;
import java.text.SimpleDateFormat;
import java.util.Date;/**
 *
 * @author Vespertino
 */
public class junit1 {
    SimpleDateFormat formato;
    Date hoy;

    public junit1() {
        hoy = new Date();
    }
    
    public static void main(String[] args) {
        System.out.println(new junit1().devuelveFecha(2));
    }

    public String devuelveFecha(int tipo) {
        String cad = "";
        if (tipo == 1) {
            formato = new SimpleDateFormat("yyyy/MM");
            cad = formato.format(hoy);
        } else if (tipo == 2) {
            formato = new SimpleDateFormat("MM/yyyy");
            cad = formato.format(hoy);
        } else if (tipo == 3) {
            formato = new SimpleDateFormat("MM/yy");
            cad = formato.format(hoy);
        } else {
            cad = "ERROR";
        }
        return cad;
    }
}
