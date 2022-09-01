/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_1;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 * @author prueba
 */
public class G6_EX_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int min;
    float horas;
    float dias;
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Por favor ingresar la cantidad de minutos");
        min = leer.nextInt();
        
        horas = min / 60;
        dias = horas /24;

        System.out.println("El equivalente en horas es: " + horas + " Y el equivalente en días es: " +  dias);

    }
    
}
