import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class rule {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        Random aleatorio = new Random();
        final String COLORES[] = {"rojo", "negro"};
        if (Arrays.asList(COLORES).contains("rojo")) {
            System.out.println("ESTÁ");
        } else {
            System.out.println("NO ESTÁ");
        }
        Integer numeros[] = new Integer[37];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i;
        }
        final String PAR_IMPAR[] = {"par", "impar"};
        System.out.println("Introduce tu numero de apuesta (0-36)");
        int numero_apuesta = teclado.nextInt();

        if (!Arrays.asList(numeros).contains(numero_apuesta)) {
            System.out.println("ERROR. El numero no es válido (0-36)");
            return;
        }
        String par_impar_apuesta="";
        String color_apuesta="";
        if (numero_apuesta != 0) {
            System.out.println("Introduce el colo rde tu apuesta (rojo-negro)");
            color_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(COLORES).contains(color_apuesta)) {
                System.out.println("ERROR. El colo rno es válido (rojo-negro)");
                return;
            }

            System.out.println("Introduce tu apuesta (par-impar)");
            par_impar_apuesta = teclado.next().toLowerCase();

            if (!Arrays.asList(PAR_IMPAR).contains(par_impar_apuesta)) {
                System.out.println("ERROR.La apuesta no es válida (par-impar)");
                return;
            }
        }
        String color_sorteo= COLORES[aleatorio.nextInt(2)];//colores[0] o colores[1]
        int numer_sorteo =numeros[aleatorio.nextInt(37)];

        String par_impar_sorteo =numer_sorteo%2==0? "par":"impar";
        System.out.println("Ha salido " + numer_sorteo+" " +color_sorteo+" "+par_impar_sorteo+" ");
        if (numer_sorteo==numero_apuesta &&color_sorteo.equals(color_apuesta)&& par_impar_sorteo.equals(par_impar_apuesta)) {
            System.out.println("HAS GANADO!!");

        } else if ( numer_sorteo==numero_apuesta) {
            System.out.println("Has acertado el número");
        } else if (color_sorteo.equals(color_apuesta)) {
            System.out.println("Has acerado el color " + color_sorteo);

        } else if (par_impar_apuesta.equals(par_impar_sorteo)) {
            System.out.println("Has acerado " + par_impar_apuesta);
        }else{
            System.out.println("Has perdido");
        }
    }
}