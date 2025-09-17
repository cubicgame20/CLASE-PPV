/*
 Ejercicio:
crear un array y meter valores random luego
construir un programa que copie miarray en otro array llamado copiaDeDatos, pero sumando 2 a cada
elemento, y que escriba el array copiaDeDatos por pantalla, esto es, que salga :
"el elemento 1 de copiadedatos es 10”
"el elemento 2 de copiadedatos es 4"
"el elemento 3 de copiadedatos es 7"
"el elemento 4 de copiadedatos es 6"
 */

package ejerciciosvideod;

/**
 *
 * @author u20251235734 Marianna Cubillos Polania
 */
public class EjeArrayas {

    public static void main(String[] args) {
        int[] lista = new int[4];
        int[] listaCopia = new int[4];
        int i = 0;

        for (i=0; i < lista.length; i++){           //genera el numero random en la primera lista
            lista [i] = (int)(Math.random()*10);
        }
        
        System.out.println("Elementos de lista original: ");   
        
        for (i = 0; i < listaCopia.length ; i++){   //imrprime el numero random en la lista 1
            System.out.println(lista[i]);
        }
        
        for (i=0; i < lista.length; i ++){          //copia la lista 1 y pone los datos en la lista 2
            listaCopia [ i]= lista[i]+2;
        }
        /*System.out.println("Elementos de la lista copiada: ");  // imprime los datos de la lista 2, los cuales son de la 1 + 2
        for (i = 0; i < listaCopia.length ; i++){
            System.out.println(listaCopia[i]+2);
        }*/
        System.out.println("\nListaCopia:");
        
        for (i = 0; i< listaCopia.length; i++){
            System.out.println("\nEl elemento "+(i+1)+" de listaCopia es "+ (listaCopia[i]));
        }
        
    }
}
