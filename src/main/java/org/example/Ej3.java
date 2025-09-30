package org.example;

import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double num1 = 0;
        System.out.println("Escribe un número");

        try {
            num1 = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("El formato no es correcto");
        }
;
        if (num1==0) System.out.println("El número debe ser diferente a 0");
        else
        if (num1<0) System.out.println("El " + num1 + " es negativo");
        if (num1>0) System.out.println("El " + num1 + " es positivo");


    }

}
