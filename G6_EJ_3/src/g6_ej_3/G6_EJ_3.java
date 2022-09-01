/*
 */
package g6_ej_3;

import java.util.Scanner;

/**
 *Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * @author prueba
 */
public class G6_EJ_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner leer = new Scanner(System.in);

String frase;

String fraseMay;

String fraseMin;


        System.out.println("Por favor ingrese una frase");
        
        frase = leer.next();
        
        fraseMay = frase.toLowerCase();
        
        System.out.println(fraseMay);
        
        fraseMin = frase.toUpperCase();
        
        System.out.println(fraseMin);
    }
    
}
