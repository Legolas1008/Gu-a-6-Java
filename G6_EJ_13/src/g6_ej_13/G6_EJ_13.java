/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_13;

import java.util.Scanner;

/**
 *Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 * @author prueba
 */
public class G6_EJ_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int largo;
        
        
        System.out.println("Por favor ingrese el tamaño de los lados del cuadrado");
        largo = leer.nextInt();
        
            for (int i = 0; i < (largo); i++) {

                if ( (i == 0) || (i==(largo-1) ) ) {
                                        
                    for (int j = 0; j < (largo); j++) {

                        System.out.print("*  ");
                    }
                }
                
                else {
                    
                     for (int j = 0; j < (largo); j++) {

                         if ( (j==0) || (j==(largo-1)) ) {
                            System.out.print("*  ");
                         }
                         
                         else {
                            System.out.print("   ");
                        }
                     }
                }
                    
                    
                System.out.println(" ");
            }

           



    }
    
}
