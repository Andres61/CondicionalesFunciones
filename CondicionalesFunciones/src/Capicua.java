import java.util.Scanner;

/*
10. Dado un número de tres dígitos determinar si es un número CAPICUA o no; un
número capicúa es el que al leerlo de derecha a izquierda o de izquierda a
derecha es el mismo, Ejm: 525 es capicúa, mientras que 526 no es capicúa.
Validar las excepciones, para cuando NO es un numero de tres dígitos
 */
public class Capicua {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero de 3 digitos: ");//Solicito al usuario ingresar el numero de 3 digitos
        int numero = teclado.nextInt(); //Lee el numero ingresado por el usuario
        System.out.println("_____________________________________");

        if (numero >= 100 && numero <= 999){ //valida si el numero tiene exactamente 3 digitos
            int invertido = invertirNumero(numero); //Invierte el numero

            if (numero == invertido){ //Compra el numero original con el inverso
                System.out.println(numero + " es un numero COPICUA");
            }else {
                System.out.println(numero + " no es un numero COPICUA");
            }
        }else {
            System.out.println("El numero ingresado no tiene 3 digitos");
        }
        teclado.close();
    }

    public static int invertirNumero(int numero){
        int invertido = 0;
        while (numero != 0){
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        return invertido;
    }
}
