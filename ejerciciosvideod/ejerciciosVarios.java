package ejerciciosvideod;

import java.util.Scanner;

public class ejerciciosVarios {
   
    public static void main ( String [] Args){
        
        
         // EJ 1 //
        int matematicas = 5;
        int biologia = 5;
        int quimica = 7;
        int promedio = (matematicas +biologia + quimica)/3 ;
        System.out.println("Su promedio es de: "+ promedio+ ".");
        if (promedio >= 6){
            System.out.println("El estudiante aprobo. ");
        }
        else {
            System.out.println("El estudiante reprobo. ");
        }
       
 
    }
}
