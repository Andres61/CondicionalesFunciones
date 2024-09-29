import java.util.Scanner;

/*
8. Leer dos números y un operador ( +, -, *, / ), realizar la operación indicada,
indicar con un mensaje si NO reconoce el operador y cuando sea el caso indicar
que la división por cero es “ERROR” y no permitir realizar las operaciones;
recomendación crear una función que retorne el resultado de la operación.
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que ingrese los dos números y el operador
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        //Pedimos al usuario que ingrese el operador
        System.out.print("Ingrese el operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        // Llamamos a la función calcular y mostramos el resultado o un mensaje de error
        double resultado = calcular(num1, num2, operador);
        if (resultado == Double.NaN) {
            System.out.println("Operador no reconocido o división por cero");
        } else {
            System.out.println("El resultado es: " + resultado);
        }

        scanner.close();
    }

    // Función para realizar la operación matemática
    public static double calcular(double num1, double num2, char operador) {
        switch (operador) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 == 0) {
                    return Double.NaN; // Representa un resultado no válido
                } else {
                    return num1 / num2;
                }
            default:
                return Double.NaN; // Operador no reconocido
        }
    }
}