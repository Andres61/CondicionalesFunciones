import java.util.Scanner;

/*5. Leer una letra, determinar si es vocal, consonante o digito numérico, ayuda ver
tabla del código ASCII*/

public class ClasificacionDeCaracteres {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        System.out.print("Ingrese un caracter: ");
        char caracter = teclado.next().charAt(0);//Leemos el primer caracter ingresado

        int valorASCII = (int) caracter; //Convertimos el caracter a su valor ASCII

        if (valorASCII >= 65 && valorASCII  <= 90 || valorASCII >= 97 && valorASCII <= 122 ){ //Utilizamos la tabla ASCCI para clasificar el caracter
            if (valorASCII == 'a' || valorASCII == 'e' || valorASCII == 'i' || valorASCII == 'o' || valorASCII == 'u' ||
                    valorASCII == 'A' || valorASCII == 'E' || valorASCII == 'I' || valorASCII == 'O' || valorASCII == 'U'){
                System.out.println("El caracter es una vocal");
            }else{
                System.out.println("El caracter es una consonate");
            }
        } else if (valorASCII >= 48 && valorASCII <= 57) {
            System.out.println("El caracter es un numero");
        }
    }
}
