package ejerciciosvideod;

import java.util.Scanner;

/*

1. generaArrayInt: Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
máximo) se indica como parámetro./
2. minimoArrayInt: Devuelve el mínimo del array que se pasa como parámetro.
3. maximoArrayInt: Devuelve el máximo del array que se pasa como parámetro.
4. mediaArrayInt: Devuelve la media del array que se pasa como parámetro.
5. estaEnArrayInt: Dice si un número está o no dentro de un array.
6. posicionEnArray: Busca un número en un array y devuelve la posición (el índice) en la que se
encuentra.
7. volteaArrayInt: Le da la vuelta a un array.
8. rotaDerechaArrayInt: Rota n posiciones a la derecha los números de un array.
9. rotaIzquierdaArrayInt: Rota n posiciones a la izquierda los números de un array.
 */
//int aleatorio =    (int)(Math.random()*(max-min + 1)) + min; 
/**
 *
 * @author u20251235734 Marianna Cubillos Polania
 */
public class ejeArrays1 {

    public static void main(String[] args) {
        int[] generasArrayInt1 = generaArrayInt(); // generaArrayInt1/  generaArrayInt()/ metodo
        
        System.out.println("------------------");
        int minimoArraymin1 = minimoArrayInt(generasArrayInt1);
        // minimoArrayInt(generasArrayInt1); es lo mismo de 
        int maximoArraymin1 = maximoArrayInt(generasArrayInt1);
        double mediaArrayInt1 = mediaArrayInt(generasArrayInt1);
        System.out.println("El valor mínimo es: " + minimoArraymin1);
        System.out.println("El valor máximo es: " + maximoArraymin1);
        System.out.println("La media es: " + mediaArrayInt1);
        System.out.println("------------------");
        estaEnArrayInt(generasArrayInt1);
        System.out.println("------------------");
        posicionEnArray(generasArrayInt1);
        System.out.println("------------------");
        volteaArrayInt(generasArrayInt1);

    }

    public static int[] generaArrayInt() { // generaArrayInt(nombre metodo) int[] array1) =(argumento tipo entero llamado array1)
        Scanner in = new Scanner(System.in);
        int max, min;
        System.out.println("Escriba el tamaño del array: ");
        int n = in.nextInt();
        System.out.println("Escriba el valor maximo: ");
        max = in.nextInt();
        System.out.println("Escriba el valor minimo: ");
        min = in.nextInt();

        int[] aleatorio = new int[n];
        int i;

        for (i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        System.out.println("VALORES: ");
        for (i = 0; i < aleatorio.length; i++) {
            System.out.println(aleatorio[i]);
        }
        return aleatorio; // variable que devuelve el metodo
    }
  
    public static int minimoArrayInt(int[] generasArrayInt1) {
        int min = generasArrayInt1[0];
        for (int i = 0; i < generasArrayInt1.length; i++) {
            if (generasArrayInt1[i] < min) {
                min = generasArrayInt1[i];
            }
        }
        
        return min;
    }

    public static int maximoArrayInt(int[] generasArrayInt1) {

        int max = generasArrayInt1[0];
        for (int i = 0; i < generasArrayInt1.length; i++) {
            if (generasArrayInt1[i] > max) {
                max = generasArrayInt1[i];
            }
        }
        
        return max;
    }

    public static double mediaArrayInt(int[] generasArrayInt1) {
        double promedio;
        int suma = 0;
        for (int i = 0; i < generasArrayInt1.length; i++) {
            
            suma = suma + generasArrayInt1[i];
        }
        promedio = suma / generasArrayInt1.length;
        
        return promedio;
        // retunr suma/generasArrayInt1.length;
    }

    public static void estaEnArrayInt(int[] generasArrayInt1) {
        Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Escriba el numero que esta buscancando:");
        int buscar = in.nextInt();
        boolean encontrado = false;
        for (i = 0; i < generasArrayInt1.length; i++) {
            if (buscar == generasArrayInt1[i]) {
                System.out.println("el numero " + buscar + " esta en el indice: " + i);
                encontrado = true;

            }

        }
        if (!encontrado) {
            System.out.println("El número no está en el indice");
        }

    }
    public static void posicionEnArray(int[] generasArrayInt1){
         Scanner in = new Scanner(System.in);
        int i;
        System.out.println("Escriba un numero para decir la posicion en la cual se encuetra:");
        int numero = in.nextInt();
        
        for (i = 0; i < generasArrayInt1.length; i++) {
            if (numero == generasArrayInt1[i]){
                System.out.println("el numero " + numero+  " se encuentra en la posicion: "+i);
            }
        }
        
    }
    public static void volteaArrayInt(int[] generasArrayInt1){
        for (int i = generasArrayInt1.length-1; i>= 0 ; i--){
        System.out.println(generasArrayInt1[i]);
    }
        
    }

}
