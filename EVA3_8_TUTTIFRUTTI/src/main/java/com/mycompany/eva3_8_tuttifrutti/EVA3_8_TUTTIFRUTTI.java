/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_8_tuttifrutti;

import java.util.Scanner;

/**
 *
 * @author 981010435
 */
public class EVA3_8_TUTTIFRUTTI {
    final static String USUARIO = "TUTTI";
    final static String PWD = "FRUTTI";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario, pwd;
        
        do{
            
        usuario = capturarDatos("Usuario:");
        pwd = capturarDatos("Contraseña:");
        int valor = capturarDatos("Captura un entero: ", 1);
        
        } while (!validarUsuario(usuario, pwd));
        //Si la contraseña es falsa, se regresa un FALSE,...
        //...que se niega y se hace verdadero y hace que se ejecute el ciclo de nuevo
        //
        //De lo contrario, regresa TRUE, se hace FALSE y entonces sale del ciclo
        System.out.println("Bienvenido al sistema");
        
    }
    
    public static boolean validarUsuario(String usuario, String pwd){
        if(usuario.equals(USUARIO) && pwd.equals(PWD))
            return true;
        else
            return false;
    }
    
    public static String capturarDatos(String mensaje){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextLine();
    }
    
    public static int capturarDatos(String mensaje, int valor){
        Scanner input = new Scanner(System.in);
        System.out.println(mensaje);
        return input.nextInt();
    }
}
