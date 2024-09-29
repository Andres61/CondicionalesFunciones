import java.util.Scanner;

//4. Dado un carácter, determinar si es una vocal; utilizar la estructura condicional switch()
public class Vocal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el caracter: ");
        char caracter = teclado.next().charAt(0);

        switch (caracter){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("El caracter es una vocal");
                break;
            default:
                System.out.println("El caracter no es una vocal");
        }
        teclado.close();
    }
}
