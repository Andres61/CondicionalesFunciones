import java.util.Scanner;

/*
13. Dadas las notas de las tres misiones, calcular el promedio e indicar si aprueba o
reprueba el bootcamp; tener presento:
• Aprueba si el promedio es mayor a 3.0
• Reprueba si el promedio es menor igual a 2.0
• Puede habilitar si su nota está entre 2.0 y 2.9
 */
public class CalculadoraBootcamp {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Solicitar las notas de las tres misiones
        System.out.print("Ingrese la nota de la primera misión: ");
        double nota1 = teclado.nextDouble();

        System.out.print("Ingrese la nota de la segunda misión: ");
        double nota2 = teclado.nextDouble();

        System.out.print("Ingrese la nota de la tercera misión: ");
        double nota3 = teclado.nextDouble();

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Evaluar el resultado y mostrar el mensaje correspondiente
        if (promedio >= 3.0) {
            System.out.println("¡Felicitaciones! Has aprobado el bootcamp con un promedio de " + promedio);
        } else if (promedio >= 2.0 && promedio < 3.0) {
            System.out.println("Puedes habilitar si mejoras tu desempeño. Tu promedio actual es de " + promedio);
        } else {
            System.out.println("Lo sentimos, has reprobado el bootcamp. Tu promedio es de " + promedio);
        }

        teclado.close();
    }
}
