/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_6_paso_parametros;

/**
 *
 * @author 981010435
 */
public class EVA3_6_PASO_PARAMETROS {

    public static void main(String[] args) {
        int x =5;
        System.out.println("El valor de x en el main() es de " + x);
        pasoPorValor(x);
        System.out.println("El valor de x después de la llamada es de " + x);
    }
    
    //EN EL PASO POR VALOR DE ARGUMENTOS, SE ENVÍA UNA COPIA AL MÉTODO
    public static void pasoPorValor(int valor){
        System.out.println("El valor que recibo en el método es de " + valor);
        //ese 5 es una copia del 5 del Main, son dos 5s diferentes
        valor++;
        System.out.println("El valor modificado en el método es de " + valor);
    }
}
