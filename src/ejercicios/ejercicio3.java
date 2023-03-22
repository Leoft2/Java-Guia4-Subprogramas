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
EJERCICIO CONVERSION MONEDA ***SIN HACER***
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 $ es un 1 €
iii. * 129.852 yenes es un 1 €
 */
public class ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una cantidad en Euro");
        double num1 = leer.nextDouble();

        calcular(num1);

    }

    public static void calcular(double n1) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Elija una moneda a convertir");
        System.out.println("Ingresar opcion de 1 a 4:\n"
                + "1. dolar\n"
                + "2. yen\n"
                + "3. pesos\n"
                + "4. libras");
        int fun = leer.nextInt();

        switch (fun) {
            case 1:
                double suma = (n1 * 1.2);
                System.out.println("");
                break;
            case 2:
                double resta = (n1 * 0.8);

                break;
            case 3:
                double mult = (n1 * 2.2);
                System.out.println("");
                break;
            case 4:
                double div = (1 * 3.2);

                break;
               // System.out.println("");
            default:
                System.out.println("");
        }

    }
}

   