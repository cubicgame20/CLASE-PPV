
package ejerciciosvideod;

import java.util.Scanner;

/**
 *
 * @author cubip
 */
public class ciclos {
    public static void main(String[] args) {
        int posi;
        int [] lista1 = new int [5];
        Scanner in = new Scanner(System.in);
        int contador = 0;//bloques de codigo se defien con {}
       /** while (contador<5){
            System.out.print("ingrese numero = ");
            lista1[contador] = in.nextInt();
            contador=contador+1;// definir para que aumente y no se vaya infinito/dejar el contador de ultimo
            System.out.println("intento numero = "+contador);
            
        } */
       
       int ii=1;
        for (int i=0;i<5;i=i+1){
            
            System.out.print("ingrese numero"+ii+": ");
            ii=ii+1;// se pq se seguria sumando con el ii=1
            lista1[i] = in.nextInt();
            
            
        }
        System.out.print("que posicion desea conocer: ");
        posi = in.nextInt();
        System.out.println("el numero es: "+lista1[posi]);
    } 
    
}
