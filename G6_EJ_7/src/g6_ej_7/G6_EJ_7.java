/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_7;

import java.util.Scanner;

/**
 *Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 * @author prueba
 */
public class G6_EJ_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);   
String frase;

        System.out.println("por favor ingrese una frase");
        
        frase = leer.nextLine();
        
        
        
    
    if (frase.equals("eureka")) {
        
        System.out.println("Correcto");
    }
    
    else {
        System.out.println("Incorrecto");
    }
    
    }
    
}
