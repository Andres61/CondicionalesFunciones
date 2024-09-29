import java.util.Scanner;

/*
12. Dados cuatro números indicar cuál es el mayor de todos, o si son iguales
 */
public class NumeroMayorOIgual {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Pedimos al usuario que ingrese los 4 numeros
        System.out.print("Ingrese el primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("_______________________________________________");
        System.out.print("Ingrese el segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println("_______________________________________________");
        System.out.print("Ingrese el tercero numero: ");
        int num3 = teclado.nextInt();
        System.out.println("_______________________________________________");
        System.out.print("Ingrese el cuarto numero: ");
        int num4 = teclado.nextInt();
        System.out.println("_______________________________________________");

        //Inicializamos una variable para almacenar el numero mayor
        int mayor = num1;

        //Comparamos el primer numero de los demas
        if (num2 > mayor){
            mayor = num2;
        }
        if (num3 > mayor){
            mayor = num3;
        }
        if (num4 > mayor){
            mayor = num4;
        }

        System.out.println("_______________________________________________");
        //
        if (num1 == num2 && num2 == num3 && num3 == num4){
            System.out.println("Todos los numeros son iguales");
        }else {
            System.out.println("El numero mayor es: " + mayor);
        }
    }
}
