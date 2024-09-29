import java.util.Scanner;
//3. Determinar si un número es divisible exactamente por 3 y 5 al mismo tiempo,
//por ejemplo 15 cumple, 10 no cumple porque NO es divisible por 3
public class DivisiblePor3Y5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if (numero %3 == 0 && numero % 5 == 0  ){
            System.out.println("El numero es divisible por 3 y 5");
        }else {
            System.out.println("El numero no es divible por 3 y 5");
        }
    }
}
