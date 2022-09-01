/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_20;


import java.util.Scanner;

/**
 * Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 * @author prueba
 */
public class G6_EJ_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
 
        boolean bandera = true;
        int mat1 [][] = new int[3][3];
        int mat2 [][] = new int[3][3];
        int fila [] = new int [3];
        int col [] = new int [3];
        int diag1 = 0;
        int diag2 = 0;
        
        // Crea la matriz 1
        System.out.println("Por favor ingrese los 9 valores para los elementos de la matriz");
        
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {
                mat1 [i][j] = leer.nextInt(); 
            }
        }
        
        // Imprime mat1 
        for (int i = 0; i < 3; i++)  {  
             for (int j = 0; j < 3; j++) {  
                    System.out.print(mat1 [i][j] + " | " );
            }
            System.out.println(" ");
        }
        
        
        // Chequea que la suma de las filas sea igual
        int suma = 0;
         for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {
                suma = mat1 [i][j] +  suma; 
            }
            
            fila[i] = suma;
            suma = 0;
        }
        
        if (fila[0]==fila[1] && fila[1]==fila[2]) {
            System.out.println("la suma de las filas es igual");
        }
        else {
            bandera = false;
        }
        
        // Chequea que la suma de las columnas sea igual
        suma = 0;
         for (int j = 0; j < 3; j++) {  
            for (int i = 0; i < 3; i++) {
                suma = mat1 [i][j] +  suma; 
            }
            
            col[j] = suma;
            suma = 0;
        }
        
        if (col[0]==col[1] && col[1]==col[2] && col[2]==fila[1]) {
            System.out.println("la suma de las columnas es igual a las de las filas");
        }
        else {
            bandera = false;
        }
        
        // Chequea que la suma de la diagonal primaria sea igual a la suma de filas y columnas
         suma = 0;
         for (int j = 0; j < 3; j++) {  
            for (int i = 0; i < 3; i++) {
                if (i==j) {
                suma = mat1 [i][j] +  suma; 
                }
            }
            
            diag1 = suma;
        }
         
        if (diag1==col[1]) {
            System.out.println("la suma de la diagonal primaria es igual a la de las filas y columnas");
        }
        else {
            bandera = false;
        }
         
        
        // Chequea que la suma de la diagonal secundaria sea igual a la suma de filas, columnas y diagonal primaria
         suma = 0;
         for (int j = 0; j < 3; j++) {  
            for (int i = 0; i < 3; i++) {
                if (i+j==2) {
                suma = mat1 [i][j] +  suma; 
                }
            }
            
            diag2 = suma;
        }
         
        if (diag2==diag1) {
            System.out.println("la suma de la diagonal secundaria es igual a la de las filas, columnas y diagonal primaria");
        }
        else {
            bandera = false;
        }
        
        
        if (bandera=true) {
            System.out.println("la matriz es mágica");
        }
        
        else {
            System.out.println("la matriz no  es mágica");
        }
        
        
        
    }
    
}
