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
public class ejercicio3b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros");
        double euros = leer.nextDouble();
        leer.nextLine();
        System.out.println("Ingrese a que moneda desea convertir. (dolares/yenes/libras)");
        String moneda = leer.nextLine();
        conversor(euros, moneda);
    }

    public static void conversor(double euros, String moneda) {
        if (moneda.equals("dolares")) {
            System.out.println(euros + " euros es equivalente a " + (euros * 1.28611) + " dolares.");
        } else if (moneda.equals("libras")) {
            System.out.println(euros + " euros es equivalente a " + (euros * 0.86) + " libras.");
        } else if (moneda.equals("yenes")) {
            System.out.println(euros + " euros es equivalente a " + (euros * 129.852) + " yeles.");
        } else {
            System.out.println("No existe la moneda ingresada.");
        }
    }
}
