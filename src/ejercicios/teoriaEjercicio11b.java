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
public class teoriaEjercicio11b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer=new Scanner(System.in);
        
        
        String frase="";
        System.out.println("Ingrese una palabra");
        String pala=Leer.nextLine();
        pala=pala.toUpperCase();
        reemplazo(pala);
}
    public static String reemplazo(String pala){
       pala=pala.replaceAll("A", "@");
       pala=pala.replaceAll("E", "#");
       pala=pala.replaceAll("I", "&");
       pala=pala.replaceAll("O", "%");
       pala=pala.replaceAll("U", "*");
        System.out.println(pala);
        return pala;
    }
}

    
   

