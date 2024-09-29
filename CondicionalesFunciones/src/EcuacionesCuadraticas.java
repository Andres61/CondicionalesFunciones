/*
. Validar en la ecuación cuadrática que NO se calculen las raíces si la Ecuación no
tendrá raíces reales.
La ecuación de segundo grado se define algebraicamente como:
La solución general viene dada por la expresión algebraica:
Como toda raíz tiene dos resultados uno con positivo y otro con negativo, hallar
x1 y x2 respectivamente (NO tener en cuenta los números complejos de una raíz
negativa)
 */
import java.util.Scanner;

public class EcuacionesCuadraticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los coeficientes de la ecuación cuadrática
        System.out.print("Ingrese el valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        double c = scanner.nextDouble();

        // Calcular el discriminante
        double discriminante = b * b - 4 * a * c;

        // Evaluar el discriminante y calcular las raíces si existen
        if (discriminante > 0) {
            // Dos raíces reales distintas
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("La ecuación tiene dos raíces reales distintas:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Dos raíces reales iguales
            double x = -b / (2 * a);
            System.out.println("La ecuación tiene dos raíces reales iguales:");
            System.out.println("x1 = x2 = " + x);
        } else {
            // No hay raíces reales
            System.out.println("La ecuación no tiene raíces reales.");
        }

        scanner.close();
    }
}

