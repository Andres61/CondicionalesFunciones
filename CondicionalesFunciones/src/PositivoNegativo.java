import java.util.Scanner;

//1. Determinar si un número es positivo o negativo

public class PositivoNegativo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);//Se crea el Scanner para leer la entrada del usuario desde la consola
        System.out.print("Ingrese un numero: "); // Imprimer un mensaje en la consola solicitando un numero al usuaria
        int numero = teclado.nextInt(); // Se lee el numero ingresado por el usuario y se almacena en la variable numero

        //Comienza una estructura condicional para determinar si el numero es positivo o negativo
        if (numero > 0) {
            System.out.println("El numero es positivo");//Si el numero es mayor que cero imprime un mensaje diciendo que es positivo
        } else if (numero < 0) {
            System.out.println("El numero es negativo");//Si el numero es menor que cero imprime un mensaje diciendo que es negativo
        }else {
            System.out.println("El numero es cero");//Si el numero no es mayor ni menor que cero imprime el mensaje diciendo que es cero
        }
        //Cerramos Scanner para liberar los recursos
        teclado.close();
    }
}
