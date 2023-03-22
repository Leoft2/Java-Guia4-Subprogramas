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
EJERCICIO MULTIPLO
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
usuario, validando que el primer número múltiplo del segundo e imprima si el
primer número es múltiplo del segundo, sino informe que no lo son
*/

public class teoriaEjercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese 2 numeros");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        
        EsMultiplo(num1,num2);
        
    }
    public static void EsMultiplo (int n1, int n2){
        if (n1%n2==0){
            System.out.println("es multiplo");}
        else{
            System.out.println("no es multiplo");
            
        }
    }
    
}
    
     

 