package org.example;

import java.util.Random;

public class Ejrandom {
    static void main() {
        Random aleatorio = new Random();
       /*
        int numero1 = aleatorio.nextInt(1,7);
        int numero2 = aleatorio.nextInt(1,7);
        System.out.println(numero1);
        System.out.println(numero2);
        int resultado= numero1+numero2;
        System.out.println("La suma de " +numero1 + " y " + numero2 + " es " + resultado )
        */

        /*Ejercicio 2
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        String contrasenya = "";
        for (int i = 0; i < 12; i++) {
            contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length()-1));
        }
        System.out.println(contrasenya);
         */

        /*Ejericio 3
        int numaleatorio =aleatorio.nextInt(15, 100+ 1) +15;
        System.out.println(numaleatorio);
        */
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int cont = 5;
        String contrasenya = "";
        String mayus = caracteres.substring(0, 26);
        String minus = caracteres.substring(27, 52);
        String num = caracteres.substring(53, 62);
        int tamanyo = aleatorio.nextInt(8, 12);
        for (int i = 0; i < tamanyo; i++) {
            if (i == 5) {
                contrasenya += mayus.charAt(aleatorio.nextInt(mayus.length() - 1));
                cont = 6;
            } else if (i == 6) {
                contrasenya += minus.charAt(aleatorio.nextInt(minus.length() - 1));
                cont = 7;
            } else if (i == 7) {
                contrasenya += num.charAt(aleatorio.nextInt(num.length() - 1));
                cont = 8;
            } else {
                contrasenya += caracteres.charAt(aleatorio.nextInt(caracteres.length() - 1));
            }

        }
        System.out.println(contrasenya);
    }
}