package ejerciciosvideod;

import java.util.Scanner;

public class ejeVarios {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean contador = false; // no pase del numero permitodo
        double operacion = 0;

        while (contador == false) { // afirmacion tiene que ser verdadera

            System.out.println("Escriba un numero del 1 al 4 para elegir su operacion: "
                    + "\n 1 vamos a sumar."
                    + "\n 2 vamos a restar."
                    + "\n 3 vamos a multiplicar."
                    + "\n 4 vamos a dividir"); // elije la ope
            operacion = in.nextDouble();
            if (operacion > 4) {
                System.out.println("ese numero no esta permitido.");
            } else {
                contador = true;
            }
        } //cierre while

        System.out.println("Ahora escriba el primer valor: ");
        double numUno = in.nextInt();
        System.out.println("Ahora escriba el segundo valor");
        double numDos = in.nextInt();

        double result = 0;

        if (operacion == 1) {
            result = numUno + numDos;
            System.out.println("El resultado es: " + result);
        } else if (operacion == 2) {
            result = numUno - numDos;
            System.out.println("El resultado es: " + result);
        } else if (operacion == 3) {
            result = numUno * numDos;
            System.out.println("El resultado es: " + result);
        } else if (operacion == 4) {
            result = numUno / numDos;
            System.out.println("El resultado es: " + result);
        }
    }
}
