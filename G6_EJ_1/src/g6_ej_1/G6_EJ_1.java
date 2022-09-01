package g6_ej_1;

import java.util.Scanner;

/**
 * @author prueba */
public class G6_EJ_1 {

    /**
     * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner leernum = new Scanner(System.in);
    
    double n1 = 2;
    double n2 = 3;
    
    double suma;
    
        System.out.println("por favor ingrese 2 números");
        
        n1 = leernum.nextDouble();
        
        n2 = leernum.nextDouble();
        
        suma = n1 + n2;
        
        System.out.println("La suma de los números ingresados es: " + suma);
                
                
            
            
    
            
            
            
            
            }
    
}
