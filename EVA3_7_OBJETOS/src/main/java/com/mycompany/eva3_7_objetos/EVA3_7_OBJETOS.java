/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva3_7_objetos;

/**
 *
 * @author 981010435
 */
public class EVA3_7_OBJETOS {

    public static void main(String[] args) {
        Persona perso1 = new Persona();
        System.out.println(perso1);
        perso1.nombre = "Carlos";
        perso1.apellido = "Villalobos";
        perso1.edad = 18;
        
        Persona perso2 = new Persona();
        System.out.println(perso2);
        perso2.nombre = "Javier";
        perso2.apellido = "Gonzalez";
        perso2.edad = 20;
        
        imprimirPersonas(perso1);
        imprimirPersonas(perso2);
        
    }
    
    public static void imprimirPersonas(Persona perso){
        System.out.println("Direccion: " + perso);
        System.out.println("Nombre completo: " + perso.nombre + " " + perso.apellido);
        System.out.println("Edad: " + perso.edad);
    }
}

//Definen una plantilla para crear objetos
//crean un nuevo tipo de dato
class Persona{
    String nombre;
    String apellido;
    int edad;
}
