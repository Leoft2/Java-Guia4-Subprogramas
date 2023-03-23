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
public class ejercicio2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nom = "";
        int edad = 0;
        String op = "";
         do { 
             System.out.println("Ingresar nombre");
             nom = leer.nextLine();
             System.out.println("Ingrsar edad");
             edad = leer.nextInt();
             leer.nextLine();
             datos(nom,edad);
             System.out.println("Desea cargar otra persona? Ingrese no para finalizar ");
             op = leer.nextLine().toLowerCase();
         } while (!"no".equals(op));
   }  
  public static void datos(String a, int b) {
      String verificacion = "";
      if (b > 17) {
          verificacion = "mayor de edad";
      } else
          verificacion = "menor de edad";
      System.out.println("El nombre es " + a + " ,la edad es " + b + " , el usuario es " + verificacion);
 }
    }
    

