/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_10;

import java.util.Scanner;

/**
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 * @author prueba
 */
public class G6_EJ_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);   
        double lim;
        double suma = 0;
        double n = 0;
        
        System.out.println("Por favor ingrese el valor límite");
        
        lim = leer.nextInt();
        
        while (suma < lim) {
            
            System.out.println("por favor ingrese un número"); 
            
            n = leer.nextDouble();
            
        suma = n + suma;
        
        }

        System.out.println("la suma es: " + suma);
        
    }
    
}
