import java.util.Scanner;

/*
11. Dados tres números mostrarlos de menor a mayor; por ejemplo si se ingresan
20, 30, 10 mostrar 10, 20, 30
 */
public class OrdenDeNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Solicito al usuario que ingrese los numero
        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        int num3 = teclado.nextInt();

        //Ordenar los numeros utilizando una serie de condicionales
        if (num1 <= num2 && num1 <= num3){
            //num1 es el menor
            if (num2 <= num3){
                System.out.println("El orden de mayor a manor es: " + num1 + ", " + num2 + ", " + num3);
            }else {
                System.out.println("Orden ascendente : " + num1 + ", " + num3 + ", " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if (num1 <= num3) {
                System.out.println("Orden ascendente: " + num2 + ", " + num1 + ", " + num3);
            } else {
                System.out.println("Orden ascendente: " + num2 + ", " + num3 + ", " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println("Orden ascendente: " + num3 + ", " + num1 + ", " + num2);
            } else {
                System.out.println("Orden ascendente: " + num3 + ", " + num2 + ", " + num1);
            }
        }

        // Cerrar el objeto Scanner
        teclado.close();
    }
}