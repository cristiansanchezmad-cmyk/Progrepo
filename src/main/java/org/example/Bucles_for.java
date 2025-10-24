package org.example;

import java.util.Scanner;

public class Bucles_for {
    static void main() {
        //  for (;;){
        //    System.out.println("Hola");
        //}
        Scanner teclado = new Scanner(System.in);

        System.out.println("Hola");


        while (true) {
            String palabra = teclado.next();
            if (palabra.equals("hola")) {
                continue;
            }
            System.out.println("Dime hola");
            for (int i = 0; i < 10; i++) {
                System.out.println(i + 1);
            }

        }
    }
}
