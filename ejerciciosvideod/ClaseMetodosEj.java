package ejerciciosvideod;

/**
  @author cubillos polania
 */
public class ClaseMetodosEj {
    
    public static void main(String[] args) {
        
        int[] Vector=generarArrayInt (10,20,50);// primer numero es la cantidad, segundo valor minimo y tercero maximo
        muestraArray(Vector);
        
        
    }
    
    public static int [] generarArrayInt ( int n, int min,  int max){
    
        int [] Vector = new int [n];
        for (int i=0;i<Vector.length;i++){
            Vector[i]= (int)(Math.random()*(max-min)+min);// numero al azar con lo que pida
        }
        
        return Vector;    
    }
    
    public static void muestraArray ( int []Vector){
        for (int k=0;k<Vector.length;k++){
            System.out.println(Vector[k]);
        }
    }
    
    public static void minimoArray (int[]Vector[]){
        for ( int M=0;M<Vector.length;M++){
            
        }
            
    }
   
}
