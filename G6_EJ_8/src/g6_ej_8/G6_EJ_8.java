/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_8;

import java.util.Scanner;

/**
 *  Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.

 * @author prueba
 */
public class G6_EJ_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        String frase;
        int largo;

        System.out.println("por favor ingrese una frase");
        
        frase = leer.nextLine();
        
        largo = frase.length();
            
    if (largo == 8) {
        
        System.out.println("Correcto");
    }
    
    else {
        System.out.println("Incorrecto");
    }
    
    }
    
}