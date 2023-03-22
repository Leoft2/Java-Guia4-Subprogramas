/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author Leonel
 */

/*
EJERCICIO FUNCION MAYOR EDAD - ERROR DO WHILE
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
*/

public class ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("ingrese el nombre");
        String nom = leer.nextLine();
        System.out.println("ingrese la edad");
        int edad = leer.nextInt();
        comparar(nom, edad);

    }

    public static void comparar(String n, int ed) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String resp = "s";
        do {

            if (ed < 18) {

                System.out.println("es menor de edad");
            } else {
                System.out.println("es mayor de edad");

            }
            System.out.println("quiere seguir ingresando personas? n/s");
            resp = leer.nextLine();
            
            System.out.println("ingrese el nombre");
            n = leer.nextLine();
            System.out.println("ingrese la edad");
            ed = leer.nextInt();
        } while (resp.equalsIgnoreCase("s"));
        {

        }

    }

}
    
    

 