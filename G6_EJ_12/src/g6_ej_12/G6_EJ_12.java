/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g6_ej_12;

import java.util.Scanner;

/**
 *Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
* 
 * @author prueba
 */
public class G6_EJ_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String cadena;
        String primeraletra;
        String ultimaletra;
        Scanner leer = new Scanner(System.in);
        int i = 0;
        int j = 0;
        
        
        do {
        
            System.out.println("Por favor ingrese una cadena");

            cadena = leer.next();

            primeraletra = cadena.substring(0,1);
            ultimaletra = cadena.substring(4,5); 

            System.out.println(primeraletra);
            System.out.println(ultimaletra);

            if (  primeraletra.equals("x") && ultimaletra.equals("o") && cadena.length()==5 )  {

                System.out.println("La cadena ingresada es correcta");
                
                i = i + 1;
                
            }

            else {
                System.out.println("La cadena ingresada es incorrecta");
                
                j = j + 1;
                
            }
            
            
            
        } while (!"&&&&&".equals(cadena));
        
        
        System.out.println("El número de cadenas correctas ingresadas es: " + i);
        System.out.println("El número de cadenas incorrectas ingresadas es: " + (j-1));
        
    }
    
}

