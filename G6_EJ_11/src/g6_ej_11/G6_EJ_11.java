/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_11;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 * @author prueba
 */
public class G6_EJ_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in); 
      
        double n1;
        double n2;
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        int opcion = 0;
        boolean a = true;
        String sino;
        
        System.out.println("Por favor ingrese 2 números");
        
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija Opción");
        
        opcion = leer.nextInt();
        
                
     
    do  {
        
        
        
        System.out.println("MENU");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("Elija Opción");
        
        opcion = leer.nextInt(); 
        
        
        switch (opcion) {
            
                      
          
            case 1: 
                 System.out.println(  (n1+n2) );
                 break;
            case 2:
                 System.out.println(  (n1-n2) );
                 break;
            case 3:
                 System.out.println(  (n1*n2) );
                 break;
            case 4:
                 System.out.println(  (n1/n2) );
                 break;
            case 5:
                
                System.out.println("está seguro de que desea salir del menú? (S/N)");
                
                sino = leer.next();
                        
                if (sino.equals("s")) {
                 
                
                 a = false;
                 break;}
                
                else {
                    break;
                }
                 
                      
      
       
      
         
        }    
       
    } while (a==true);
    }
}
