/*
15. Plantear de acuerdo a su experiencia o trabajo un ejercicio de su autoría, que
contengan estructuras condicionales y resuélvalo 
 */
import java.util.Scanner;

public class CalculadoraImpuestos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese sus ingresos anuales
        System.out.print("Ingrese sus ingresos anuales: ");
        double ingresosAnuales = scanner.nextDouble();

        // Calcular el impuesto según los rangos establecidos
        double impuesto = 0;
        if (ingresosAnuales <= 10000) {
            // Sin impuestos para ingresos menores o iguales a 10,000
            impuesto = 0;
        } else if (ingresosAnuales <= 30000) {
            // 15% de impuesto para ingresos entre 10,001 y 30,000
            impuesto = ingresosAnuales * 0.15;
        } else {
            // 25% de impuesto para ingresos mayores a 30,000
            impuesto = ingresosAnuales * 0.25;
        }

        // Mostrar el resultado
        System.out.println("El impuesto a pagar es: $" + impuesto);

        scanner.close();
    }
}
