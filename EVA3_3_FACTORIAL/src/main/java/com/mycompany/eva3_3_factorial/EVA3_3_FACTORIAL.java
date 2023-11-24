/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_3_factorial;

/**
 *
 * @author 981010435
 */
public class EVA3_3_FACTORIAL {

    public static void main(String[] args) {
        int valor = 5;
        int factorial = calcularFactorial(valor);
        System.out.println("El factorial de " + valor + " es igual a " + factorial);
        
        //CREAR MÉTODO calcularPotencia ->
        
        int potencia = calcularPotencia(3,3);
        System.out.println("La potencia de los valores (3^3) es: " + potencia);
    }
    
    public static int calcularFactorial(int valor){
        int guardar = 1;
        
        for (int i = 1; i <= valor; i++) {
            guardar*=i; //guardar = guardar * i;
        }
        return guardar;
    }
    
    public static int calcularPotencia(int num1, int num2){
        int acumulador = 1;
        for (int i = 1; i <= num2; i++) {
            acumulador = acumulador * num1;
        }
        return acumulador;
    }
}
