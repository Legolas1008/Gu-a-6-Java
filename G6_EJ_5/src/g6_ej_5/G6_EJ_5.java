/*
 */
package g6_ej_5;

import java.util.Scanner;

/**
 *Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 * @author prueba
 */
public class G6_EJ_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    
    Double n;
    
    Double doble;
    
    Double triple;
    
    Double raiz;
    
    
    System.out.println("Por favor ingrese un número");
    
    n = leer.nextDouble();
    
    doble = 2 * n;
    
    triple = 3 * n;
    
    raiz = Math.sqrt(n);
            
        System.out.println("el doble del número ingresado es: " + doble + " el triple es: " + triple + " y la raiz cuadrada es: " + raiz);
    }
    
}
