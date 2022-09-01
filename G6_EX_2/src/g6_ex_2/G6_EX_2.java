/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_2;

import java.util.Scanner;

/**
 * Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 * @author prueba
 */
public class G6_EX_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;
    int aux;
    Scanner leer = new Scanner(System.in);
    
    aux = b;
    b = c;
    
    c = a;
    
    a = d; // acá a toma el valor de d original
    
    d = aux; //(b) acá d toma el valor de b anterior
    
        System.out.println("Los nuevos valores son:");
        System.out.println("a: " +a);
        System.out.println("b: " +b);
        System.out.println("c: " +c);
        System.out.println("d: " +d);
    }
    
}
