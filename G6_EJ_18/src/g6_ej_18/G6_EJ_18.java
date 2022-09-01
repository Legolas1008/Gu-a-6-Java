/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_18;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 * @author prueba
 */
public class G6_EJ_18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           
        Scanner leer = new Scanner(System.in);
        int filas;
        int col;
        int x;
        boolean bandera = false;
        
        System.out.println("Por favor ingrese la cantidad de filas de la matriz");
        filas = leer.nextInt(); 
        
        System.out.println("Por favor ingrese la cantidad de columnas de la matriz");
        col = leer.nextInt(); 
        
        int vector [][] = new int[filas][col];
        Random rand = new Random();
        
        for (int i = 0; i < filas; i++) { //crea la matriz
            for (int j = 0; j < col; j++) {
                vector [i][j] = rand.nextInt(9); 
            }
        }
    
        for (int i = 0; i < filas; i++)  {  // Imprime  
             for (int j = 0; j < col; j++) {  
                    System.out.print(vector [i][j] + " | " );
            }
            System.out.println(" ");
        }
    
        
        System.out.println(" ");
        
          for (int j = 0; j < col; j++) {  // Imprime la transpuesta 
            for (int i = 0; i < filas; i++) {  
                    System.out.print(vector [i][j] + " | " );
            }
            System.out.println(" ");
        }
        
        
        
      
}
}
