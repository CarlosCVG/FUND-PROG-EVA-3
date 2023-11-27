/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_parametros_referencia;

/**
 *
 * @author 981010435
 */
public class EVA3_6_PARAMETROS_REFERENCIA {

    public static void main(String[] args) {
        int [] arreglo = new int [10];
        
        //Aqui recibe la direccion o referencia del arreglo
        llenarArreglo(arreglo);
        //Se imprimen los numeros raros
        System.out.println("La dirección de valores es " + arreglo);
        
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] +"]");
        }
    }
    
    public static void llenarArreglo(int[] valores){
        System.out.println("La dirección de valores es " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int)(Math.random()*100);
        }
    }
}
