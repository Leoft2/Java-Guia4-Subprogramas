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
public class ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        System.out.println("Ingrese un numero a verificar:");
       // System.out.println("En caso de ser primo se devolvera true,caso contrario false");
        int num=Leer.nextInt();
        int D=0,c=0;
        // boolean compr=true;
        comprobacion(num,D,c);
}
    public static void comprobacion(int num,int D,int c){
        for(D=1;D<num+1;D++){
            if(num%D==0){
                c++;
            }
        }
        if(c>2){
          //  compr=false;
            System.out.println("el numero no es primo");
        }else{
         //   compr=true;
            System.out.println("el numero es primo");
        }
        // return null;
  }
    }
    


