/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_1_funciones;

import java.util.Scanner;

/**
 *
 * @author 981010435
 */
public class EVA3_1_FUNCIONES {

    public static void main(String[] args) {
        //Llamar a función o procedimiento
        imprimirMensaje("Hola mundo!!", 5);
        Scanner input = new Scanner(System.in);
    }
    
    public static void imprimirMensaje(String mensaje, int cant){
        for (int i = 0; i < cant; i++) {
            System.out.println(mensaje);
        }
    }
}
