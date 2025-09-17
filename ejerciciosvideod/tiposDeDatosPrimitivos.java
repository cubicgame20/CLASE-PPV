package ejerciciosvideod;

public class tiposDeDatosPrimitivos {
    public static void main (String[] Args){
        // TIPOS DE DATOS PRTIMITIVOS
        
        int myInt = 18;
        System.out.println(myInt); // datos sin decimales 
        
        
        double myDouble = 1.65;
        System.out.println(myDouble); // decimales
        // float, long, byte
        
        char myChar = 'a';
        System.out.println(myChar); // caracter con 1 sola comilla
        
        boolean myBoolean = true; // verdadero o falso
        myBoolean = false;
        System.out.println(myBoolean);
        
       String myString= "helo, java";
        System.out.println(myString);
        
        System.out.println(myString.getClass().getSimpleName());
        
                // EJERCICIOS//
                
        System.out.println("EJERCICIOS: ");
                
        String myName = "Marianna";
        System.out.println(myName);
        
        int myEdad = 18;
        System.out.println(myEdad);
        
        double altura = 1.66;
        System.out.println(altura);
        
        boolean meGustaProgramar = true;
        System.out.println(meGustaProgramar);
        
        final String tuEdad = "veinte";
        System.out.println(tuEdad);
        
        char tuInicial = 'M';
        System.out.println(tuInicial);
        
        String tuCiudad = "Neiva";
        System.out.println(tuCiudad);
        tuCiudad = "Bogota";
        System.out.println("correcion ahora es: "+ tuCiudad);
        
        int a = 2;
        int b = 6;
        int suma = a+b ;
        System.out.println("El resultado de la suma es: "+ suma);
        
        boolean meGustasTu;
        boolean meGustas = true;
        System.out.println(meGustas);
        
                
                
        }
        
    }
   
