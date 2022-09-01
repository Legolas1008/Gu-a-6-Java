/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_21;

import java.util.Random;
import java.util.Scanner;

/**
 *Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3 que
se pueden formar en la matriz M, desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author prueba
 */
public class G6_EJ_21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //el código aún tiene errores

        Scanner leer = new Scanner(System.in);
        boolean bandera = true;
        int matM [][] = new int[10][10];
        int matP [][] = new int[3][3];
        Random rand = new Random();
        int posx = 0;
        int posy = 0;
        
        // Crea matM 
        for (int i = 0; i < 10; i++) {  
            for (int j = 0; j < 10; j++) {
                matM [i][j] = rand.nextInt(9); 
            }
        }
        
        // Imprime matM
        for (int i = 0; i < 10; i++)  {  
             for (int j = 0; j < 10; j++) {  
                    System.out.print(matM [i][j] + " | " );
            }
            System.out.println(" ");
        }
        
         // Crea matP
        for (int i = 0; i < 3; i++) {  
            for (int j = 0; j < 3; j++) {
                matP [i][j] = rand.nextInt(9); 
            }
        }
        
        // Imprime matP
        for (int i = 0; i < 3; i++)  {  
             for (int j = 0; j < 3; j++) {  
                    System.out.print(matP [i][j] + " | " );
            }
            System.out.println(" ");
        }
        
        
        // busca desde los subíndices 0 y 0 (primer elemento) si el elemento es igual al primer elemento de la matrizP
        
        
        for (int i = 0; i < 10; i++) {  
            for (int j = 0; j < 10; j++) {
                if (matM [i][j] == matP [0][0]) {
                    posx = i;
                    posy = j;
                    
                    if ( (posx < 7) && (posy < 7)) {
                        for (int k = posx; k < (posx + 2); k++) {
                            for (int l = posy; l < (posy + 2); l++) {
                                if (matM [k][l] == matP [(k - posx)][ (l-posy) ]) {
                                 bandera = true;
                                }  
                                else {
                                    bandera = false;
                                    k = posx + 1;
                                    l = posy + 1;
                                }
                            }
                        }
                    }

                    if (bandera == true) {
                         i = 9;
                         j = 9;
                
                    }
                }
            }
        }
            
        if (bandera == true){
            System.out.println("la fila es: " + posx + " la columna es: " + posy);
        }
        else {
            System.out.println("no se encontró la matriz P dentro de la matriz M");
        } 
        
        
    }
    
}
