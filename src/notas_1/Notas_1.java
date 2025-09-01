/*
ENTRADAS:
nota1,nota2, double, valores [0,5]
Salida:
nota trimestre: numero, double
procesos
notaTrimestre= ( nota1+nota2)/2
mensaje
    aprobradi si notaTrimetre>=2
    Si notaTrimestre<3:
        si recuperacion=
            apto:   Aprobado y notaTrimestre = 3
                no apto: reprobado y notaTrimestre no cambia
// anfjkasnf
 */
package notas_1;

import java.util.Scanner;

/**
 *
 * @author Marianna Cubillos Polania u20251235735
 */
public class Notas_1 {
    public static void main(String[] args) {
        double nota1, nota2;
        double notaTrimestre;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese nota 1: ");
        nota1 = in.nextDouble();
        System.out.println("Ingrese nota 2: ");
        nota2 = in.nextDouble();
        notaTrimestre = ((nota1 + nota2) / 2);
        in.nextLine();
        if (notaTrimestre >= 3) {
            System.out.println("Aprovado");
            System.out.println("Nota trimestre:" + notaTrimestre);
        } else {
            System.out.println("Cual ha sido el resultado de la recuperacion? (apto / no apto): ");
        }
        String resultadoRec = in.nextLine();
        if (resultadoRec.equals("apto")) {
            System.out.println("Aprobado");
        } else if (resultadoRec.equals("no apto")) {
            System.out.println("Reprobado");
            System.out.println("Nota Trimestre: "+notaTrimestre);
        }
        else{
            System.out.println("Escribio mal");
        }
    }

}
