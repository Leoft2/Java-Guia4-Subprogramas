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
EJERCICIO FUNCIONES MENU OPERACIONES
Crea una aplicación que le pida dos números al usuario y este pueda
elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main.

*/

public class ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        int resultado = calcular(num1, num2);
        System.out.println("el resultado es: " + resultado );
    }

    public static int calcular(int n1, int n2) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija una funcion");
        System.out.println("Ingresar opcion de 1 a 4:\n"
                + "1. Sumar\n"
                + "2. Restar\n"
                + "3. Multiplicar\n"
                + "4. Dividir");
        int fun = leer.nextInt();
        int x = 0;
        switch (fun) {
            case 1:
                int suma = n1 + n2;
                x = suma;
                break;
            case 2:
                int resta = n1 - n2;
                x = resta;

                break;
            case 3:
                int mult = n1 * n2;
                x = mult;
                break;
            case 4:
                int div = n1 / n2;
                x = div;
                break;

            default:
                System.out.println("esa operacion es incorrecta");
        }

        return x;
    }
}

    
    
 
