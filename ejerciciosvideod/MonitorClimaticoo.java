package ejerciciosvideod;

// u20251235734 Marianna Cubillos Polania

import java.util.Scanner;

public class MonitorClimaticoo {

    public static void main(String[] args) {
        double[] temperaturasSemana = generarTemperaturasAleatorias(15, 30);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Temperaturas registradas en la semana");
        mostrarTemperaturas(temperaturasSemana);

        System.out.println("Temperatura minima " + obtenerTemperaturaMinima(temperaturasSemana));
        System.out.println("Temperatura maxima " + obtenerTemperaturaMaxima(temperaturasSemana));
        System.out.println("Temperatura media " + calcularMediaTemperaturas(temperaturasSemana));
        System.out.println("Desviacion estandar " + calcularDesviacionEstandar(temperaturasSemana));

        System.out.print("Ingrese la temperatura que desea buscar entero ");
        int temperaturaBuscada = entrada.nextInt();

        while (!existeTemperatura(temperaturasSemana, temperaturaBuscada)) {
            System.out.println("La temperatura " + temperaturaBuscada + " no esta registrada");
            System.out.print("Ingrese otra temperatura ");
            temperaturaBuscada = entrada.nextInt();
        }

        System.out.println("La temperatura " + temperaturaBuscada + " si esta registrada");
        System.out.println(obtenerDiaTemperatura(temperaturasSemana, temperaturaBuscada));

        System.out.println("Temperaturas en orden invertido");
        mostrarTemperaturasInvertidas(temperaturasSemana);

        System.out.println("Rotacion de temperaturas hacia la derecha");
        rotarTemperaturasDerecha(temperaturasSemana);

        System.out.println("Rotacion de temperaturas hacia la izquierda");
        rotarTemperaturasIzquierda(temperaturasSemana);

        System.out.println("Clasificacion de temperaturas");
        String[] clasificaciones = clasificarTemperaturas(temperaturasSemana);
        String[] diasSemana = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        for (int i = 0; i < clasificaciones.length; i++) {
            System.out.println(diasSemana[i] + " " + clasificaciones[i]);
        }

        System.out.println("Dias con anomalias de temperatura");
        detectarAnomalias(temperaturasSemana);
    }

    public static double[] generarTemperaturasAleatorias(double minimo, double maximo) {
        double[] temperaturas = new double[7];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturas[i] = Math.random() * (maximo - minimo) + minimo;
        }
        return temperaturas;
    }

    public static void mostrarTemperaturas(double[] temperaturas) {
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < temperaturas.length; i++) {
            System.out.printf("%s %.2f C\n", dias[i], temperaturas[i]);
        }
    }

    public static double obtenerTemperaturaMinima(double[] temperaturas) {
        double minima = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp < minima) {
                minima = temp;
            }
        }
        return minima;
    }

    public static double obtenerTemperaturaMaxima(double[] temperaturas) {
        double maxima = temperaturas[0];
        for (double temp : temperaturas) {
            if (temp > maxima) {
                maxima = temp;
            }
        }
        return maxima;
    }

    public static double calcularMediaTemperaturas(double[] temperaturas) {
        
        double suma = 0;
    for (int i = 0; i < temperaturas.length; i++) {   // recorre desde 0 hasta el último índice
        suma += temperaturas[i];  // aquí accedemos al elemento en la posición i
    }
        return suma / temperaturas.length;
    }

    public static double calcularDesviacionEstandar(double[] temperaturas) {
        double media = calcularMediaTemperaturas(temperaturas);
        double sumaCuadrados = 0;
        for (double temp : temperaturas) {
            double diferencia = temp - media;
            sumaCuadrados += diferencia * diferencia;
        }
        double varianza = sumaCuadrados / temperaturas.length;
        return Math.sqrt(varianza);
    }

    public static boolean existeTemperatura(double[] temperaturas, int valor) {
        for (double temp : temperaturas) {
            if ((int) temp == valor) {
                return true;
            }
        }
        return false;
    }

    public static String obtenerDiaTemperatura(double[] temperaturas, int valor) {
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < temperaturas.length; i++) {
            if ((int) temperaturas[i] == valor) {
                return "La temperatura fue registrada el dia " + dias[i] + " indice " + i;
            }
        }
        return "La temperatura no fue registrada en ningun dia";
    }

    public static void mostrarTemperaturasInvertidas(double[] temperaturas) {
        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = temperaturas.length - 1; i >= 0; i--) {
            System.out.println(dias[i] + " " + temperaturas[i]);
        }
    }

    public static void rotarTemperaturasDerecha(double[] temperaturas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos indices deseas rotar a la derecha ");
        int cantidad = entrada.nextInt();

        double[] resultado = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            int nuevoIndice = (i + cantidad) % temperaturas.length;
            resultado[nuevoIndice] = temperaturas[i];
        }

        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(dias[i] + " " + resultado[i]);
        }
    }

    public static void rotarTemperaturasIzquierda(double[] temperaturas) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuantos indices deseas rotar a la izquierda ");
        int cantidad = entrada.nextInt();

        double[] resultado = new double[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            int nuevoIndice = (i - cantidad + temperaturas.length) % temperaturas.length;
            resultado[nuevoIndice] = temperaturas[i];
        }

        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(dias[i] + " " + resultado[i]);
        }
    }

    public static String[] clasificarTemperaturas(double[] temperaturas) {
        String[] clasificaciones = new String[temperaturas.length];
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] < 18) {
                clasificaciones[i] = "Frio";
            } else if (temperaturas[i] <= 25) {
                clasificaciones[i] = "Templado";
            } else {
                clasificaciones[i] = "Caliente";
            }
        }
        return clasificaciones;
    }

    public static void detectarAnomalias(double[] temperaturas) {
        double media = calcularMediaTemperaturas(temperaturas);
        double desviacion = calcularDesviacionEstandar(temperaturas);
        double umbral = desviacion * 1.5;

        String[] dias = {"lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"};

        for (int i = 0; i < temperaturas.length; i++) {
            if (Math.abs(temperaturas[i] - media) > umbral) {
                System.out.println(dias[i] + " " + temperaturas[i] + " C");
            }
        }
    }
}