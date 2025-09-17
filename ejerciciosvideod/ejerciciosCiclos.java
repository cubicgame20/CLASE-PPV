package ejerciciosvideod;

import java.util.ArrayList;
import java.util.Scanner;

public class ejerciciosCiclos {

    public static void main(String[] args) {

        // imprimir los num del 1 al 10 usando while
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
       
        // usa do-while para mostrar todos lo valores de array list
        ArrayList<Integer> valores = new ArrayList<>();
        valores.add(10);
        valores.add(20);
        valores.add(30);
        
        i = 0;

        do {
            System.out.println(valores.get(i));
            i++;
        } while (i < valores.size());
        
        //imprime los multiplos de 5 del 1 al 50 usando for
        
        System.out.println("multiplos:");
        
        for (i = 5; i <= 50; i+=5){
            System.out.print(i+ ",");
        }
        
        //recorre un array de 5 numeros e imprime la suma total
        
        System.out.println("\nsuma de numeros ya puestos: ");
        
        Scanner sc = new Scanner(System.in);
        
        int [] numeros = new int [5];
        numeros [0]= 2;
        numeros [1]= 4;
        numeros [2]= 6;
        numeros [3]= 8;
        numeros [4]= 10;
       
        int suma = 0;
        for (i=0;i<numeros.length;i++){
            suma= suma + numeros[i];
        }
        System.out.println("la suma de estos numero es: " + suma);
        
        
        System.out.println("\nsuma de numeros por poner: ");
        
        int [] numeros1 = new int [5];
        
       /* for (i=0;i<numeros1.length;i++){
            System.out.println("Escriba el numero "+ (i+1) + ":");
            numeros1[i]= sc.nextInt();
        }
        int suma1 = 0;
        for (i=0;i<numeros1.length;i++){
            suma1= suma1 + numeros1[i];
        }
        System.out.println("la suma de estos numero es: " + suma1);
*/
        
        // usa un for para recorrer un array y mostrar su valores
        
        String [] frutas = new String [4];
        String frutasName;
        for (i=0;i < frutas.length;i++){
            System.out.println("Escriba la fruta "+ (i+1) + ":");
            frutas[i]= sc.next();
        }
        
        System.out.println("\nLas frutas que ingresaste son:");
        for (i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
         // Otra forma más corta con for-each
        System.out.println("\nCon for-each:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        
        System.out.println("otro:");
        String [] frutasa = {"uva","mora","fresa","kiwi"};
        for (i=0; i < frutasa.length; i++){
            System.out.println(frutasa[i]);
        
    }
       

    }

}
