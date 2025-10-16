package org.example;

import java.util.Scanner;

public class BateriaT2 {
    static void main() {
      /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de caracteres");
        String frase =  teclado.nextLine();
        System.out.println(frase);
        System.out.println(frase.length());
        String frase_sin_espacios = frase.replace(" ", "_");
        System.out.println(frase_sin_espacios);
        String trozo = frase.substring(0,frase.length()/2);
        String trozo2 = frase.substring(frase.length()/2);
        System.out.println("La primera mitad del texto es " + trozo + " y la segunda mitad del texto es "+ trozo2);
        String frase_mayus = frase.toUpperCase();
        System.out.println(frase_mayus);

       */
        /*
  Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba una cadena de caracteres");
        String frase1 = teclado.nextLine();
        System.out.println("Escriba una segunda cadena de caracteres");
        String frase2 = teclado.nextLine();
        System.out.println(frase1.length());
        System.out.println(frase2.length());


*/


        /*
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta un número...");
        int numero = teclado.nextInt();
        System.out.println("¿Cuantás cifras quieres eliminar?");
        int quitar = teclado.nextInt();

        String numero_string = Integer. toString(numero);
        int tamanyo = numero_string.length();
        int nuevo_tamanyo = tamanyo - quitar;

        String resultado = numero_string.substring(0,nuevo_tamanyo);
        System.out.println("El resultado es" + resultado);
        */

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto...");
        String frase = teclado.nextLine();
        System.out.println("¿Que palabra quieres contar?");
        String palabra = teclado.nextLine();

        int frase_tamanyo = frase.length();
        int palabra_tamanyo = palabra.length();

        String frase_sin= palabra.replace(palabra, "");
        int conteo =frase_sin.length();
        int resto = frase_tamanyo - conteo;
        int resultado = resto /palabra_tamanyo;
        System.out.println(resultado);




    }
}
