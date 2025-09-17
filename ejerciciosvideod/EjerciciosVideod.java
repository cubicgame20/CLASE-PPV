package ejerciciosvideod;

import java.util.Scanner;

public class EjerciciosVideod {
   public static void main (String[] args) {
       
                //  VARIABLE //
       
       String colorr = "rosa";
       System.out.println(colorr);
       colorr = "morado";
       System.out.println(colorr);
        // int colorr = 27; no se puede cambiar la variable
        
                // CONSTANTE // 
                
        final String EMAIL = "cubipol@gmail.com"; // buena practica constante va en MAYUSCULA
        //EMAIL = "cubipol20@gmail.com"; ahora la de arriba es constante no cambia
        System.out.println(EMAIL);
       
        var year = 2025;// Var es otras forma de definir 
        var gusto = "grandes";          
       
       
                // EJEMPLOS // 
                
       System.out.println("cual es tu nombre? "); // mostrar la pregunta
        Scanner in = new Scanner (System.in); // entren los datos
        String nombre = in.next(); // nombrar los datos
        System.out.println("hola " + nombre + ",como estas?. ");
        String pregunta = in.next();
        System.out.println("me alegro mucho " + nombre);
        
            System.out.println("Y cual es tu edad? ");
            String edad = in.next();
            System.out.println("Y cual es tu color favorito? ");
            String color = in.next();
            System.out.println("Por ultimo, puedo saber donde vives? ");
            String ciudad= in.next();
            System.out.println("Vaya osea que tienes " + edad + " y tu color favorito es el " + color + ", ademas que vives en " + ciudad );
            // imprime toda la info pedida :)
            
                  // EJ 2 //
            
            String codigoAscii = "  |-|_|-| \n "
               + " < .w. > \n"
               + "./  v - v \\. \n";

       System.out.println(codigoAscii);
         
    } 
}