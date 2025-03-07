/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.iescomercio.entornos;

import java.util.NoSuchElementException;

/**
 *
 * @author ProfDiurno
 */
public class junit3 {

    private Integer[] tabla;

    public junit3(Integer[] tabla) {
        if (tabla == null || tabla.length == 0) {
            throw new IllegalArgumentException("No hay elementos");
        }
        this.tabla = tabla;
    }

    public int sumaTabla() {
        int suma = 0;
        for (int i = 0; i < tabla.length; i++) {
            suma += tabla[i];
        }
        return suma;
    }

    public int mayorTabla() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] > max) {
                max = tabla[i];
            }
        }
        return max;
    }

    public int posicionTabla(int n) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == n) {
                return i;
            }
        }
        throw new NoSuchElementException("No existe");
    }
}
