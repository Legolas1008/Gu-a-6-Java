/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ex_5;

import java.util.Scanner;

/**
 * Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 * @author prueba
 */
public class G6_EX_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    double monto;
    double costo = 0;
    Scanner leer = new Scanner(System.in);    
    String plan;
    boolean a = true;
    String letra = "b";
  
   
   System.out.println("Por favor ingrese el monto del tratamiento");
   monto = leer.nextFloat();
   
   
   
   
   
   do { //hacer que evite decir por defecto "no se ha ingresado ninguna opción válida" SOLUCIONADO: USAR leer.next() en vez de leer. nextString().
       
   System.out.println("Por favor ingrese las letras A, B o C según el tipo de plan al cual se encuentra suscripto");
   plan = leer.next(); 
       
   switch (plan) {
       case "A": costo = monto * 0.5;
       a = false;
       break;
       case "a": costo = monto * 0.5;
       a = false;
       break;
       case "B": costo = monto * 0.35;
       a = false;
       break;
       case "b": costo = monto * 0.35;
       a = false;
       break;
       case "C": costo = monto;
       a = false;
       break;        
       case "c": costo = monto;
       a = false;
       break; 
       
       default: System.out.println("no se ha ingresado ninguna opción válida");
   }
   
   } while ( a == true ); //!"&&&&&".equals(cadena)
   
    System.out.println("el costo del tratamiento es: " + costo);
   
    }
    
}
