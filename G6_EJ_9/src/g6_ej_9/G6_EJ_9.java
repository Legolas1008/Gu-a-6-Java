/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_9;

import java.util.Scanner;

/**
 * Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.

* palabra.substring(2,4)
 * @author prueba
 */
public class G6_EJ_9 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);   
        String frase;
        String primeraletra;

        System.out.println("por favor ingrese una frase");
        
        frase = leer.nextLine();
        
        primeraletra = frase.substring(0,1);
        
        System.out.println(primeraletra);
        
            
    if (primeraletra.equals("a")) {
        
        System.out.println("Correcto");
    }
    
    else {
        System.out.println("Incorrecto");
    }
    
    }
    
}