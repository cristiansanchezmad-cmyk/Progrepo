
package org.example;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Abuela {

    static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        // Leer número de casos
        int casos = leerCasos();

        for (int i = 0; i < casos; i++) {

            int[] dientesArriba = leerDientes();
            int[] dientesAbajo = leerDientes();


            if (encajan(dientesArriba, dientesAbajo)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }
    }

    /**
     * @author = Christian Sánchez Madueño
     * @version  1.0
     * @param =  canti - es el numero de casos, es decir el numero de veces que se repetirá lo que tenga que hacer el programa
     * @param = correcto - es un booleano que va a seguir preguntando si da error
     * @return - devuelve un int que han introducido por pantalla.
     */
    public static int leerCasos() {
        int canti = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                canti = teclado.nextInt();
                teclado.nextLine();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("Se necesita introducir un número entero");
                teclado.nextLine();
            }
        }
        return canti;
    }

    /**
     * @author = Christian Sánchez Madueño
     * @version  1.0
     * @param =  dientes - es un vector conformado por 6 numeros comprendidos entre el 0 y el 2000
     * @param =  dientesString - es un string que almacena lo introducir en el vector dientes para comprobar su longitud
     * @param = correcto - es un booleano que va a seguir preguntando si da error
     * @return - devuelve un vector que tienes los valores que el programa quiere
     */
    public static int[] leerDientes() {
        int[] dientes = new int[6];
        boolean correcto = false;

        while (!correcto) {
            String[] dientesString = teclado.nextLine().split(" ");

            if (dientesString.length != 6) {
                System.out.println("Error: deben introducirse 6 valores.");
                continue;
            }

            correcto = true; // asumimos que está bien hasta que falle
            for (int i = 0; i < 6; i++) {
                try {
                    dientes[i] = Integer.parseInt(dientesString[i]);

                    if (dientes[i] < 0 || dientes[i] > 2000) {
                        System.out.println("El numero debe estar entre 0 y 2000.");
                        correcto = false;
                        break;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Se necesita introducir un número entero");
                    correcto = false;
                    break;
                }
            }
        }
        return dientes;
    }

    /**
     * @author = Christian Sánchez Madueño
     * @version  1.0
     * @param =  comprobante -es el resultado entre la suma de las dos primeras posiciones, si las siguientes dan el mismo numero que esta devolverá true,sino devolerá false
     * @param =  arriba - es el primer vector que se ha introducido, correspondería a los dientes de arriba
     * @param =  abajo - es el segundo vector que se ha introducido, correspondería a los dientes de abajo
     * @param = correcto - es un booleano que va a seguir preguntando si da error
     * @return - devuelve un vector que tienes los valores que el programa quiere
     */
    public static boolean encajan(int[] arriba, int[] abajo) {
        int comprobante = arriba[0] + abajo[0];

        for (int i = 1; i < 6; i++) {
            if (arriba[i] + abajo[i] != comprobante) {
                return false;
            }
        }
        return true;
    }
}
