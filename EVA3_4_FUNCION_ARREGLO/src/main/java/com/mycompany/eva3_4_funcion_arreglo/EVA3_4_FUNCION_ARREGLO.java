/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_4_funcion_arreglo;

/**
 *
 * @author 981010435
 */
public class EVA3_4_FUNCION_ARREGLO {

    public static void main(String[] args) {
        int [] arreglo = crearArreglo(10);
        System.out.println("El arreglo generado es:");
        for (int valor : arreglo) {
            System.out.print("[" + valor + "]");
        }
    }
    
    public static int[] crearArreglo(int tama){
        int[] arreglo = new int [tama];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = (int)(Math.random() * 100);
        }
        return arreglo;
    }
}
