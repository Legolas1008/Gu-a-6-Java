/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_5plus;

import java.util.Scanner;

/**
 *
 * @author prueba
 */
public class G6_EX_5PLUS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    double monto;
    double costo = 0;
    Scanner leer = new Scanner(System.in);    
    String plan;
    boolean bandera = false;
    String letra = "b"; // cdo la condición del while se cumple, ni siquiera se ejecuta 1 sola vez?
  
   
   System.out.println("Por favor ingrese el monto del tratamiento");
   monto = leer.nextFloat();
   
   System.out.println("Por favor ingrese las letras A, B o C según el tipo de plan al cual se encuentra suscripto");
   plan = leer.nextLine(); 
   
   while ( !"a".equals(letra) ); { //!"&&&&&".equals(cadena) 
       
   System.out.println("Por favor ingrese las letras A, B o C según el tipo de plan al cual se encuentra suscripto");
   plan = leer.nextLine(); 
       
   switch (plan) {
       case "A": costo = monto * 0.5;
       letra = "a";
       break;
       case "a": costo = monto * 0.5;
       letra = "a";
       break;
       case "B": costo = monto * 0.35;
       letra = "a";
       break;
       case "b": costo = monto * 0.35;
       letra = "a";
       break;
       case "C": costo = monto;
       letra = "a";
       break;        
       case "c": costo = monto;
       letra = "a";
       break; 
       default: System.out.println("no se ha ingresado ninguna opción válida");
   }
   
   } 
   
    System.out.println("el costo del tratamiento es: " + costo);
   
    }
    
}

