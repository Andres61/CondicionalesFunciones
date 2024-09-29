import java.util.Scanner;

/*
9. Realizar un programa que permita realizar la preselección del integrante del
equipo de baloncesto, cuyo requisito es tener más de 1.80 mts. de estatura y
pesar menos de 100 Kg. Indicar si es APTO o no lo es.
 */
public class PreseleccionBaloncesto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Ingrese la altura del jugador (en metros): ");
        double altura = teclado.nextDouble();

        System.out.print("Ingrese el peso del jugador (en kilos): ");
        double peso = teclado.nextDouble();

        double alturaMaxima = 1.80;
        double pesoMaximo = 100.0;

        if (altura >= alturaMaxima && peso < pesoMaximo){
            System.out.println("El jugador es APTO para el equipo");
        }else{
            System.out.println("El jugador NO es APTO para el equipo");
        }
        teclado.close();
    }
}
