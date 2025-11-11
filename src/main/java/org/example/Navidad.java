package org.example;

import java.util.Scanner;

public class Navidad {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserta palabra a imprimir...");
        String palabra = teclado.next();
        String letras_vector [] = palabra.split("");

        System.out.println("Inserta la cantidad de letras a imprimir...");
        String cantidad = teclado.nextLine();
        String cantidad_vector[] = cantidad.split("");

        if (letras_vector.length ==cantidad_vector.length ){
            for (int i = 0; i < letras_vector.length; i++) {
                for (int j = 0; j < Integer.parseInt(cantidad_vector[i]); i++) {
                    System.out.println();
                }
            }
        }else{
            System.out.println("La palabra y las cifras introducidas no coinciden");
        }
    }
}
