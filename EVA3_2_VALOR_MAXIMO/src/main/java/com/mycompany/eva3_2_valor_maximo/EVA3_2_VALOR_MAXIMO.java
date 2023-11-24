/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_2_valor_maximo;

/**
 *
 * @author 981010435
 */
public class EVA3_2_VALOR_MAXIMO {

    public static void main(String[] args) {
        //Llamar a funcion (invocar función)
        //Utilizar el valor directamente de la función
        System.out.println(calcularMayor(100,200));
        
        //Guardar el valor para usarlo despues
        int valor = calcularMayor(150,300);
        System.out.println(valor);
        
        //Llamar a la función e ignorar el resultado
        calcularMayor(100,200);
    }
    
    public static int calcularMayor(int num1, int num2){
        if (num1>num2)
            return num1;
        else
            return num2;
        
        /*
        int resultado;
        if (num1>num2)
            resultado = num1;
        else
            resultado = num1;
        return resultado;
        */
    }
}
