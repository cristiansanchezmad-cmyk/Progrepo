

import java.util.Random;
import java.util.Scanner;


    static void main() {

        Random aleatorio = new Random();
        Scanner teclado = new Scanner(System.in);

        int num = 0;
        int numale = aleatorio.nextInt(100) + 1;
        System.out.println(numale);
        System.out.println("He pensado un numero random. A ver si puedes sacarlo!!");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce tu " + i + " numero");
            try {
                num = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("El valor introducido debe ser un numero");
            }
            if (num > 100) {
                System.out.println("EL numero no debde de sobrepasar 100");
                i--;
                continue;
            }

            if (num > numale) {
                System.out.println("El numero que elegí es menor que ese");

            } else if (num < numale) {
                System.out.println("El numero que elegí es mayor que ese");

            } else if (num == numale) {
                System.out.println("Lo has acertado, enhorabuena");
                return;
            }
        }
        System.out.println("Lo siento no lo acertaste, el numero era " + numale);

    }
        /*
        String comp = "";
        int contus = 0;
        int contbot = 0;
        System.out.println("Juguemos al piedra, papel o tijera... A ver quien gana!!");;

        do {
            int opale = aleatorio.nextInt(3) + 1;
            if (opale == 1) comp = "piedra";
            else if (opale == 2) comp = "papel";
            else comp = "tijera";
            System.out.println("Dime tu opción:");
            String resp = teclado.nextLine();
            if (resp.equals(comp)) {
                System.out.println("Hay empate");
            } else if (resp.equals("tijera") && comp.equals("papel") || resp.equals("piedra") && comp.equals("tijera") || resp.equals("papel") && comp.equals("piedra")) {
                contus++;
                System.out.println("Ganaste y el contador ahora es " + contus + " frente a " + contbot);
            }

         else {
                contbot++;
                System.out.println("Perdiste y el contador ahora es " + contus + " frente a " + contbot);
            }
        } while (contbot<3 &&contus<3);
        if (contbot==3 )
            System.out.println("Te gané");
        else if (contus==3)
            System.out.println("Ganaste, gg");{
*/









