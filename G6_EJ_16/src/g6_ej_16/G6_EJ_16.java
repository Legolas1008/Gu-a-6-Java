/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_16; //en realidad es el 17

import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author prueba
 */
public class G6_EJ_16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n = 0;
        int x;
        String largo;
        boolean bandera = false;
        int undig = 0;
        int dosdig = 0;
        int tresdig = 0;
        int cuatrodig = 0;
        int cincodig = 0;
        
        
        
        System.out.println("Por favor ingrese el tamaño del vector");
        n = leer.nextInt(); //tamaño vector
        
        
        int vector [] = new int[n];
        Random rand = new Random();
        
        for (int i = 0; i < n; i++) {   //crea el vector con elementos aleatorios
            
            vector [i] = rand.nextInt(10000); // Obtain a random number between [0 - 100].
            
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
        
        for (int i = 0; i < n; i++) {  // cuántos números son de 1, 2, 3, 4, 5 dígitos

            int length = (int) Math.log10(vector[i]) + 1; //esta fórmula sirve para obtener la cantidad de dígitos del número
            //System.out.println(length);
            switch (length) {
                case 1: undig = undig + 1;
                        break; 
                case 2: dosdig = dosdig + 1;
                        break;
                case 3: tresdig = tresdig + 1;
                        break;
                case 4: cuatrodig = cuatrodig + 1;
                        break;
                case 5: cincodig = cincodig + 1;
                        break;    
                  
                    
            }
                
        }
        
        System.out.println("La cantidad de números con: " );
        System.out.println("1 dígito es: " +undig );
        System.out.println("2 dígito es: " +dosdig );
        System.out.println("3 dígito es: " +tresdig );
        System.out.println("4 dígito es: " +cuatrodig );
        System.out.println("5 dígito es: " +cincodig );
        
            
}    
        
        //if (bandera==false) {
            //System.out.println("El número ingresado no se encuentra dentro del vector");
}


