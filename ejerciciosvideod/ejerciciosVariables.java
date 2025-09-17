package ejerciciosvideod;

import java.util.Scanner;

public class ejerciciosVariables {

    public static void main(String[] Args) {
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        /* 
        // OPERADORES ARITMETICOS //
    
        float a = 5;
        float b = 3;
        
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        
        // ASIGNACION //
        
        a = b;
        System.out.println(a);
        
        a = b*2;
        System.out.println(a);
        
        a += 1; // a = a + 1
        System.out.println(a);
        
        a -= 1; // a = a - 1
        System.out.println(a);
        
        a *= 1; // a = a * 1
        System.out.println(a);
        
        a /= 1; // a = a / 1
        System.out.println(a);
        
        // OPERADORES DE COMPARACION ( RELACIONALES ) //
        // == IGUALES
        System.out.println(a == b);
        System.out.println(a == 6);
        // != DESIGUALES
        System.out.println(a != b);
        System.out.println(a != 6);
        

        
        // LOGICOS //
         // Y (AND)
        System.out.println("valor logigo ( & )");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
        
        System.out.println (3>1 && 8==16/2 );
        //0 (OR)
        System.out.println("valor logigo ( || )");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);
        System.out.println (3>1 || !(8==16/2) );
        
        // NO (NOT)
        System.out.println(!true);
        System.out.println(!false);
        System.out.println (!(3>1) || !(8==16/2) );

        
        // UNRIOS
        
        //int b = 1;
            
        System.out.println(+b);
        System.out.println(-b);
        System.out.println(++b);// incrementa antes de imprimirlo
        System.out.println(b++);// imprime la b y luego se incrementa
        
        System.out.println("hola, me llamo mari");
        String name = "hola, me llamo mari";
        System.out.println(name.replace("mari", "cubo"));

        
        // Ejercicios String
        
        String nombre = "Marianna";
        String nombre1 = "  marianna  ";
        String apellido = "Cubillos";
        int edad = 18;
        
        System.out.println(nombre + " " + apellido); // concatenar 2 strings
        
        System.out.println(nombre.length()); // longitud de la cadena
        
        System.out.println(nombre.charAt(0)); // muestra primer numero de la cadena
        
        System.out.println(nombre.charAt(7)); // /// muestra ultimo numero de la cadena
        
        System.out.println(nombre.toUpperCase());// todo en mayusculas
        
        System.out.println(nombre.toLowerCase()); // todo en minucula
        
        System.out.println(nombre.contains("ari")); // contiene eso en el nomre
        
        System.out.println(String.format("hola %s %s, tu edad es de %d", nombre, apellido, edad)); // pasar a format
        
        System.out.println(nombre1);
        System.out.println(nombre1.trim()); // quitar espacios en blanco
        
        System.out.println(nombre1.replace(" ", "-"));// quite espacios en blanco por guiones
        
        System.out.println(nombre.equalsIgnoreCase(apellido)); // compara si 2 stings son iguales
        
        System.out.println(nombre.length()== apellido.length()); // compara si el largo de las palbras son iguales
         
        
        System.out.println("hola, ingresa tu edad para saber si eres apto para votar");
        int edad = in.nextInt();

        if (edad > 18) {
            System.out.println("usted tiene permitido votar");
        } else if (edad == 18) {
            System.out.println("usted ha recien cumplido los 18, ahora es apto para votar");
        } else {
            System.out.println("usted no tiene permitido votar");
        }

        System.out.println("ingrese dato 1:");
        int num1 = in.nextInt();
        System.out.println("ingrse dato 2:");
        int num2 = in.nextInt();
        if (num1 > num2) {
            System.out.println("el dato 1 es mayor que el 2");
        } else if (num1 < num2) {
            System.out.println("el dato 1 es menor que el 2");
        } else {
            System.out.println("los datos son iguales son iguales");
        }

        System.out.println("ingrese un numero");
        int numero = in.nextInt();
        if (numero > 0) {
            System.out.println("el numero es positivo");
        } else if (numero < 0) {
            System.out.println("el numero es negativo");
        } else {
            System.out.println("el numero es 0");
        }

        System.out.println("ingrese un numero para saber si es par o impar");
        int numPoI = in.nextInt();

        if (numPoI % 2 == 0) {
            System.out.println("es par");
        } else {
            System.out.println("es impar");
        }
        
        System.out.println("escriba un numero para ver si esta dentro del rango");
        int rango = in.nextInt();

        if (rango>=1 && rango<=100) {
            System.out.println("esta dentro del rango de 1-100");
        } else {
            System.out.println("esta fuera del rango 1 -100");
        }
         
        System.out.println("ingrese dia de la semana: ");
        var dia = in.nextInt();
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

            default:
                System.out.println("no es correcto con los dias de la semana");

        }

        // sobresaliente aprobado o suspendido
        int nota;
        do {
            System.out.println("ingrese la nota obtenida: ");
            nota = in.nextInt();

            if (nota >= 80 && nota <= 100) {
                System.out.println("usted obtuvo una nota sobresaliente");
            } else if (nota >= 60 && nota < 80) {
                System.out.println("usted aprobo");
            } else if (nota >= 0 && nota < 60) {
                System.out.println("usted reprobo");
            } else {
                System.out.println("la nota escrita no corresponde al rango de calificacion");
            }
            
        }
        while (nota < 0 || nota > 100); 
         
        // escribir un programa para determinar si puede entrar al cine, debes tener al menos 15 o ir acompañado
        System.out.println("ingresa tu edad; ");
        int edad = in.nextInt();
        System.out.println("va acompañado?: ");
        String respuesta = in.next();
        boolean acompañado = respuesta.equalsIgnoreCase("si");

        if (edad >= 15 || acompañado) {
            System.out.println("usted puede entrar al cine");
        } else {
            System.out.println("usted no puede entrar al cine");
        }
         
        // ver si es variable o consonante
        System.out.println("escriba la vocal:");
        char vocal = sc.next().charAt(0);

        if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
            System.out.println("es una vocal");
        } else if (vocal == 'y') {
            System.out.println("es una vocal aunque depende el caso");
        } else {
            System.out.println("es una consonate");
        }
        */
        
        // a,b,c cual es mayor
        
        int a,b,c;
        System.out.println("escriba la variable a: ");
        a = in.nextInt();
        System.out.println("escriba la variable b: ");
        b = in.nextInt();
        System.out.println("escriba la variable c: ");
        c = in.nextInt();
        
        if (a>b && a>c){
            System.out.println("La variable a es la mayor");
        }else if (b>a && b>c){
            System.out.println("La variable b es la mayor");
        }else if (c>a && c>b){ 
            System.out.println("La variable c es la mayor");
        }else { 
            System.out.println("hay al menos 2 variables iguales");
        }

    }

}
