/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_15;  //en realidad es el 16

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 * @author prueba
 */
public class G6_EJ_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int n = 0;
        double x;
        boolean bandera = false;
        
        System.out.println("Por favor ingrese el tamaño del vector");
        n = leer.nextInt(); //tamaño vector
        
        
        double vector [] = new double[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {
            
            vector [i] = rand.nextInt(100); // Obtain a random number between [0 - 100].
            
        }
    
        for (int i = 0; i < n; i++) {  // Imprime el vector
            
            if (i==(n-1)) {
                    System.out.print(vector [i]);
            
            }
            else {
                    System.out.print(vector [i] + ", " );
            
            }
        }
    
        System.out.println(" ");
        
        System.out.println("Por favor ingrese el número que desea buscar dentro del vector");
        x = leer.nextDouble();
        
        for (int i = 0; i < n; i++) {  // Busca el elemento en el vector
            
            if (vector [i]==x) {
                    System.out.println("la posición en dónde se encuentra " + x + " es: " + i );
                    bandera = true;
            }
            
        }    
        
        if (bandera==false) {
            System.out.println("El número ingresado no se encuentra dentro del vector");
        }
}
}
