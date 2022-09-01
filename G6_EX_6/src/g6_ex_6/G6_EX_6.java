/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_6;

import java.util.Scanner;

/**
 * Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 * @author prueba
 */
public class G6_EX_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double altura;
        double suma = 0;
        double promedio;
        Scanner leer = new Scanner(System.in);
        int n;
        
        System.out.println("Por favor ingresar el tamaño de la muestra");
        n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            
            System.out.println("Por favor ingresar altura en metros (Ingresar comas, no puntos para los decimales");
            altura = leer.nextDouble();
            
            suma = suma + altura;
                    
        }
                
        promedio = suma / n;
        
        System.out.println("El promedio de la muestra es: " + promedio + " m");
        
        
        
        
        
        
             


    }
    
}
