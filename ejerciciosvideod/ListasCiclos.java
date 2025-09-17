package ejerciciosvideod;
import java.util.Scanner;
/**
 *
 * @author cubip
 */
public class ListasCiclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int var2 = in.nextInt();//define el tamaño
        int [] lista = new int [var2];
        lista[3] = in.nextInt();//[] significan definir la posisicion
        System.out.println("lista 3 ="+lista[3]);
    }
    
}
