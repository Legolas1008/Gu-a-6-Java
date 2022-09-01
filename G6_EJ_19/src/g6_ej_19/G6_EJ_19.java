/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_19;

import java.util.Random;
import java.util.Scanner;

/**
 * Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author prueba
 */
public class G6_EJ_19 {

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
        
        int mat1 [][] = new int[filas][col];
        int mat2 [][] = new int[col][filas];
        int mat1t [][] = new int[col][filas];
        
        Random rand = new Random();
        
        
        
        
        for (int i = 0; i < filas; i++) {  // Crea la matriz 1
            for (int j = 0; j < col; j++) {
                mat1 [i][j] = rand.nextInt(9); 
            }
        }
    
    
        
        for (int i = 0; i < filas; i++)  {  // Imprime mat1 
             for (int j = 0; j < col; j++) {  
                    System.out.print(mat1 [i][j] + " | " );
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
        
        for (int j = 0; j < col; j++)  {  // Imprime mat1 transpuesta y crea mat1t
             for (int i = 0; i < filas; i++) {  
                    System.out.print(mat1 [i][j] + " | " );
                    mat1t [j][i] = mat1 [i][j];
            }
            System.out.println(" ");
        }
        
        System.out.println("impresión de mat1t ");
        
        
        //for (int j = 0; j < col; j++)  {  // Imprime mat1 transpuesta. tiene error
        //     for (int i = 0; i < filas; i++) {  
        //            System.out.print(mat1t [i][j] + " | " );
              
        //    }
        //    System.out.println(" ");
        //}
        
        
        
        
            
        System.out.println("por favor ingrese los valores de los elementos de la matriz 2");
        
        for (int i = 0; i < col; i++) {  // Crea la matriz 2
            for (int j = 0; j < filas; j++) {
                
                mat2 [i][j] = leer.nextInt();
            }
        }
        
        for (int i = 0; i < col; i++)  {  // Imprime mat2
             for (int j = 0; j < filas; j++) {  
                    System.out.print(mat2 [i][j] + " | " );
                    
            }
            System.out.println(" ");
        }
        
        System.out.println(" ");
            
        for (int i = 0; i < col; i++)  {  // compara si las matrices son antisimétricas
             for (int j = 0; j < filas; j++) {  
                    if (mat2 [i][j] != -mat1 [j][i]) {
                        bandera = true;
                    }
            }
            System.out.println(" ");
        }
        
    if (bandera == false) {
        System.out.println("Las matrices son antisimétricas");
        
    }
    
}
}