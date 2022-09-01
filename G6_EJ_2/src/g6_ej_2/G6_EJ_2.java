/*
 */
package g6_ej_2;

import java.util.Scanner;

/**
 *Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 * @author prueba
 */
public class G6_EJ_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    Scanner leer = new Scanner(System.in);
    
    String nombre;
    
    System.out.println("Por favor ingrese su nombre");
    
    nombre = leer.next();
        
        System.out.println("Su nombre resgistrado es: " + nombre);
    }
    
}
