import java.util.Scanner;

//2. Determinar si un número es par o impar
public class ParImpar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = teclado.nextInt();

        if (numero %2 == 0){
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
        teclado.close();
    }
}
