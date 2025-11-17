package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2_tema3 {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        Random ale = new Random();
        Integer loto[] = new Integer[6];                        // Array donde se guardarán los 6 números principales del sorteo
        Integer comp[] = {ale.nextInt(49) + 1};                 // Genero el número complementario entre 1 y 49
        Integer rein[] = {ale.nextInt(10)};                     // Genero el reintegro entre 0 y 9
        Integer finlot[] = new Integer[8];                      // Array final donde guardo los 6 números + complementario + reintegro
        String lotpers[] = new String[7];                       // Array donde guardaré los números que introduce el usuario como texto
        Integer lotpers_fin[] = new Integer[7];                 // Array para convertir los valores a números enteros
        boolean check = false;
        String boleto_usuario = "";                             // Aquí guardo el boleto escrito por el usuario
        boolean compbol = true;                                 // Esta variable la uso para comprobar repetidos
        int aciertos = 0;                                       // Variable donde se sumarán los aciertos del usuario
        while (!check) {

            System.out.println("Introduce tu boleto separado por guiones...");

            boleto_usuario = teclado.next();
            check = boleto_usuario.matches("\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d{1}");  // Aquí compruebo que el formato del boleto sea correcto usando una expresión regular

            if (!check) {
                System.out.println("Formato incorrecto. Ejemplo válido: 2-3-4-12-43-6/7");  // Si el formato no coincide saldrá este error
                continue;
            }

            lotpers = boleto_usuario.split("[-/]");// Aquí separo los números usando los guiones y la barra

            try { // Compruebo que los valores introducidos sean números reales
                for (int i = 0; i < lotpers.length; i++) {
                    lotpers_fin[i] = Integer.parseInt(lotpers[i]);  // Convierto cada valor del usuario en número entero
                }
            } catch (Exception e) {
                System.out.println("Has introducido un valor no numérico"); // Si contiene letras saldrá este error
                check = false;
            }
        }
        for (int i = 0; i < loto.length; i++) {
            loto[i] = ale.nextInt(1, 50); // Genero cada número entre 1 y 49
        }
        Arrays.sort(loto); // Ordeno el array

        // Aquí compruebo que no existan números repetidos
        while (compbol) {
            compbol = false;
            for (int i = 0; i < loto.length; i++) { //Creo un bucle for que se repetirá hasta que no hayan numeros iguales
                if (i != loto.length - 1 && loto[i] == loto[i + 1]) {
                    loto[i] = ale.nextInt(1, 50);
                    compbol = true;
                }
            }
        }
        compbol = false;
        while (compbol) {
            compbol = false;

            for (int i = 0; i < loto.length; i++) {
                if (loto[i] == comp[0]) {                       // Si el complementario coincide con un número del sorteo
                    comp[0] = ale.nextInt(49) + 1;
                    compbol = true;
                    i = 0;
                }
            }
        }
        for (int i = 0; i < finlot.length; i++) {  //Asigno las posiciones de los numeros de la loteria, además delrientegro y complementario
            if (i < 6) finlot[i] = loto[i];
            else if (i == 6) finlot[i] = comp[0];
            else finlot[i] = rein[0];
        }


        for (int i = 0; i < lotpers.length - 1; i++) {      // Creo un bucle for que recorra las posiciones del numero para detectar si hay acierto o no
            for (int j = 0; j < finlot.length - 1; j++) {
                if (lotpers_fin[i].equals(finlot[j])) {
                    aciertos++;
                }
            }
        }
        System.out.println(Arrays.toString(lotpers));          //se muestran los resultados y acietos si los hubiera
        System.out.println(Arrays.toString(loto));
        System.out.println("Tu número complementario es: " + Arrays.toString(comp));
        System.out.println("Tu reintegro es: " + Arrays.toString(rein));
        System.out.println("Tu boleto final es: " + Arrays.toString(finlot));
        System.out.println("Tienes un total de " + aciertos + " aciertos");

        // Aquí se comprueba si el usuario obtiene reintegro
        if (rein.equals(finlot[7])) {
            System.out.println("Recibirás un reintegro.");
        } else {
            System.out.println("Lo sentimos, no recibirás un reintegro.");
        }
    }
}


