package ejerciciosvideod;

import java.util.Scanner;

/**
 *
 * @author U20251235734
 */
public class MetodosJava {

    public static void main(String[] args) {
        int a,b,c,total;
        a = pedir ();
        b = pedir ();
        c = pedir ();
        total = a+b+c;      
        System.out.println("El totalel: "+ total);
    }
    public static int sumar ( int x, int y ){
        int suma = x+y;
        return suma;
    }
    public static int pedir() {
        Scanner entrada = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Dime un numero: ");
            num = entrada.nextInt();
            if (num<0) {
            System.out.println("No puede ser Negativo: ");
            }
        } while (num<0);
        return num;
    }
    
}
