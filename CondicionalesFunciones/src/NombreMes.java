import java.util.Scanner;

/*
7. Leer el número del mes, indicar el nombre del mes. Ejm: el mes 1 es ENERO, 12
es DICIEMBRE, sin no cumple mostrar un mensaje por ejemplo “EL MES 25 NO
EXISTE” utilizar la estructura condicional switch()
 */
public class NombreMes {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese el numero del mes (1-12): ");
        int mes = teclado.nextInt();

        switch (mes){
            case 1:
                System.out.println("El mes 1 es ENERO");
                break;
            case 2:
                System.out.println("El mes 2 es FEBRERO");
                break;
            case 3:
                System.out.println("El mes 3 es MARZO");
                break;
            case 4:
                System.out.println("El mes 4 es ABRIL");
                break;
            case 5:
                System.out.println("El mes 5 es MAYO");
                break;
            case 6:
                System.out.println("El mes 6 es JUNIO");
                break;
            case 7:
                System.out.println("El mes 7 es JULIO");
                break;
            case 8:
                System.out.println("El mes 8 es AGOSTO");
                break;
            case 9:
                System.out.println("El mes 9 es SEPTIEMBRE");
                break;
            case 10:
                System.out.println("El mes 10 es OCTUBRE");
                break;
            case 11:
                System.out.println("El mes 11 es NOVIEMBRE");
                break;
            case 12:
                System.out.println("El mes 12 es DICIEMBRE");
                break;
            default:
                System.out.println("El mes " + mes + " no existe");
        }
        teclado.close();
    }
}
