/*

 */
package com.iescomercio.entornos;

import java.util.LinkedList;
import java.util.List;

public class ClasePruebas {

    private double suma;
    private List<Double> lista;

    public ClasePruebas() {
        System.out.println("construyendo clase");
    }

    public double echaCuentas() {
        lista = new LinkedList<Double>();
        for (int i = 0; i < 100; i++) {
            lista.add((double) i);
        }
        suma = 0.0;
        for (Double valor : lista) {
            suma += valor;
        }
        return suma;
    }
}
