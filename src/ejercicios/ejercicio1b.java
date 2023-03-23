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
public class ejercicio1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos números");
        double num1 = leer.nextDouble(), num2 = leer.nextDouble();
        boolean login = true;
        int opc;
        do{
            System.out.println("BIENVENIDO. Los números ingresados son " + num1 + " y " + num2);
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            System.out.println("5 - Salir");
            System.out.println("INGRESE UNA OPCIÓN");
            opc = leer.nextInt();
            switch(opc){
                case 1: 
                        System.out.println("El resultado de la suma es " + sumar(num1,num2));
                        break;
                case 2: 
                        System.out.println("El resultado de la resta es " + restar(num1,num2));
                        break;
                case 3: 
                        System.out.println("El resultado de la división es " + dividir(num1,num2));
                        break;
                case 4: 
                        System.out.println("El resultado de la multiplicación es " + multiplicar(num1,num2));
                        break;
                
                case 5: 
                        System.out.println("Hasta lueguito");
                        login = false;
                        break;
                default:
                    System.out.println("Opción no válida");
            }
            System.out.println("");
        }while(login);
    }
    
    public static double sumar(double n1, double n2){
        return n1+n2;
    }
    
    public static double restar(double n1, double n2){
        return n1-n2;
    }

    public static double dividir(double n1, double n2){
        if(n2==0){
            System.out.println("Division por cero, no se puede calcular");
            return 0;
        } else{
        return n1/n2;
        }
    }
    
    public static double multiplicar(double n1, double n2){
        return n1*n2;
    }
}
    
    

