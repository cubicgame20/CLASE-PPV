package ejerciciosvideod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ejerciciosArrays {
    
    public static void main(String[] args) {
        // crea un array con 5 valores e imprime su longitud
        int[] number = new int[5];
        System.out.println(number.length);
        
        number [0]= 1;
        number [1]= 2;
        number [2]= 3;
        number [3]= 4;
        number [4]= 5;
        
        System.out.println("posicion antes:" + number[4]);
       
        
        number [4]= 6;
        System.out.println("posicion ahora:" + number[4]);
        
        // crea un arrayList vacio
        
        ArrayList <String> nombres = new ArrayList <>();
        System.out.println(nombres.size());
        
        // añadir 4 valores al arraylist
        
        nombres.add("mari");
        nombres.add("cubo");
        nombres.add("pola");
        nombres.add("maricupo");
        
        System.out.println(nombres.size());
        
        nombres.remove("mari");
        System.out.println(nombres.size());
        
        // crear un hashset
        
        HashSet <Integer> num = new HashSet<>();
        num.add(10);
        num.add(20);
        num.add(20);
        num.add(30);
        
        System.out.println(num);
        System.out.println(num.size());
        
        num.remove(20);
        System.out.println(num);
        
        // crear un HashMap
        
        HashMap <String,Integer> nombreYcorreos = new HashMap <> ();
        
        nombreYcorreos.put("marianna", 320870605);
        nombreYcorreos.put("eric", 350870605);
        nombreYcorreos.put("karen", 390870605);
        
        System.out.println(nombreYcorreos);
        
        nombreYcorreos.put("marianna", 312345678);
        System.out.println(nombreYcorreos);
        nombreYcorreos.remove("karen");
        
        System.out.println(nombreYcorreos);
        
        //pasar de un array a un arraylist a un hashset y por ultimo a un hashMap
        
        String [] frutas = {"uva", "mora", "fresa", "lulo" };
        System.out.println("Array: ");
        System.out.println(frutas [0]);
        System.out.println(frutas [1]);
        System.out.println(frutas [2]);
        System.out.println(frutas [3]);
        // pasar a array list
        ArrayList <String> frutasList = new ArrayList<>(Arrays.asList(frutas));
        frutasList.add("mora");
        System.out.println("ArrayList: ");
        System.out.println(frutasList);
        // pasar a HashSet
        HashSet <String> frutaSet = new HashSet <> (frutasList);
        System.out.println("HashSet: ");
        System.out.println(frutaSet);
        //
        // pasar a HashMap
        HashMap <Integer, String> frutasMap = new HashMap<>();
        int F = 0;
        for (String Fruta:frutasList){
           frutasMap.put(F, Fruta);
           F++;
        }
        System.out.println("HashMap: ");
        System.out.println(frutasMap); 
    }
    
}
