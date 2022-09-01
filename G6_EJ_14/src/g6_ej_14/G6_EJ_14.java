/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_14;

import java.util.Scanner;

/**
 * Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
* 
 * @author prueba
 */
public class G6_EJ_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double euros = 0;
        double monto = 0;
        String moneda;
       
        
        
        System.out.println("Por favor ingrese el monto");
        monto = leer.nextDouble();
        
        System.out.println("Por favor ingrese el tipo de moneda al cual desea convertir los euros (dolar, yen, libra)");
        moneda = leer.next();
        
        
        conversor(monto, moneda);

    }

       public static void conversor(double x, String y) {
        
           if (y.equals("dolar") ){
               double dolar;
               dolar = x * 1.28611;
               
               System.out.println("Los " +  x + " euros ingresados equivalen a " + dolar +  " dólares"); 
           }
           
           else {
               if (y.equals("yen") ){
               double yen;
               yen = x * 129.852;
               
               System.out.println("Los " +  x + " euros ingresados equivalen a " + yen +  " yenes");
               }
               
               else {
                   if (y.equals("libra") ){
                   double libra;
                   libra = x / 0.86;

                   System.out.println("Los " +  x + " euros ingresados equivalen a " + libra +  " libras");
                   }
               }
           }
        
    }      


    }
    


   
        
        
      /*  public static void main(String moneda, Double monto) {
        
            System.out.println("El valor ingresado es " + monto + moneda);
        
        
        
      */  