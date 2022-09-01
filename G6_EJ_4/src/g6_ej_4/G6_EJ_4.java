/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_4;

import java.util.Scanner;

/**
 * Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 * @author prueba
 */
public class G6_EJ_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        Double temp;
        
        Double tempFa;
        
        System.out.println("Por favor ingrese la temperatura en grados centígrados");
        
        temp = leer.nextDouble();
        
        tempFa = 32 + (9 * temp / 5);
        
        System.out.println("La temperatura en grados Fahrenheit es: " + tempFa);
        
        
        
        
        
        
        
    }
    
}
