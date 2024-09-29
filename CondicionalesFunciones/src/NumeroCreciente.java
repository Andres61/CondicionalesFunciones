import java.util.Scanner;
/*
6. Leer 3 números, mostrarlos y deducir si se han introducido en orden creciente.
 */
public class NumeroCreciente {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();

        System.out.print("Ingrese el tercer numero: ");
        int num3 = teclado.nextInt();
        System.out.println("____________________________________________________________________________________________");

        System.out.println("Los numeros ingresados son: " + num1 + ", " + num2 +  ", " + num3);
        System.out.println("____________________________________________________________________________________________");

        if (num1 <= num2 && num2 <= num3){
            System.out.println("Los numeros estan en orden creciente");
            System.out.println("____________________________________________________________________________________________");
        }else {
            System.out.println("Los numeros no estan en orden creciente");
            System.out.println("____________________________________________________________________________________________");
        }
        teclado.close();
    }
}
