package org.example;

import java.util.Scanner;

public class CosasHasNexIn {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        if (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            System.out.println(numero);
        } else {
            System.out.println("Formato incorrectp. No es un número");
        }

    }
    }