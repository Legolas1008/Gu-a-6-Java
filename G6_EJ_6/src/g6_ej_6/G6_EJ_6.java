
package g6_ej_6;

import java.util.Scanner;

/**
 *Crear un programa que dado un numero determine si es par o impar.
 * @author prueba
 */
public class G6_EJ_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

Scanner leer = new Scanner(System.in);

Double n;

Double resto;

        System.out.println("Por favor ingrese un número");
        
        n = leer.nextDouble();
        
        resto = n % 2;

        System.out.println("el resto de n es: " + resto );
        
        if (resto >0) {
            System.out.println("El número es impar");
            
         }    else {
            System.out.println("El número es par");}
       
                



    }
    
}
