/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_4;

import java.util.Scanner;

/**
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 * @author prueba
 */
public class G6_EX_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n;
        Scanner leer = new Scanner(System.in);    
        String letra;
    
   System.out.println("Por favor ingrese un número del 1 al 10");
   n = leer.nextInt();
        
   switch (n) {
       case 1: System.out.println("I");
       break;
       case 2: System.out.println("II");
       break;
       case 3: System.out.println("III");
       break;
       case 4: System.out.println("IV");
       break;
       case 5: System.out.println("V");
       break;
       case 6: System.out.println("VI");
       break;
       case 7: System.out.println("VII");
       break;
       case 8: System.out.println("VIII");
       break;
       case 9: System.out.println("IX");
       break;
       case 10: System.out.println("X");
       break;
    }
       
    }
    
}
