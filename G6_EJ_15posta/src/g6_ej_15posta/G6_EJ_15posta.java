/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_15posta;

import java.util.Random;


/**
 * Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 * @author prueba
 */
public class G6_EJ_15posta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       
        int x;
        boolean bandera = false;
        
        int vector [] = new int[100];
        Random rand = new Random();
        
        for (int i = 0; i < 100; i++) {
            
            vector [i] = i  + 1;
            
        }
    
        for (int i = 0; i < 100; i++) {  // Imprime el vector
            
            if (i==(99)) {
                    System.out.print(vector [i]);
            
            }
            else {
                    System.out.println(vector [i] + ", " );
            
            }
        }
    
      
        
     
}
}
