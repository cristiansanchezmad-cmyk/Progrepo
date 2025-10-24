package org.example;

import java.util.Scanner;

public class Ejercicio_bucles {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        String buena = "admin1234";
        do {
            System.out.println("Introduce tu contraseña");
            String contrasenya = teclado.next();
            if (contrasenya.equals(buena)) {
                break;
            }
        } while (true);

        System.out.println("Introduce un numero");
        int num = teclado.nextInt();

        for (int i=num;i>=1;i--) {
            System.out.println(i);
        }
        System.out.println("divisores");
    for (int i=1;i<=50;i++) {
        if (i % 3 != 0){
        continue;
    }
        System.out.println(i);
    }
        System.out.println("Introduce una palabra");
    String palabra= teclado.next();
    int letras = palabra.length();
    for (int i=0;i<letras;i++) {
        System.out.println((palabra.charAt(i)));

    }
    int resultado=0;
  int i=0;
        System.out.println("Introduce un numero");
    int numero = teclado.nextInt();
    for ( i=0;i<=10;i++)
        System.out.println(numero + "x"+ i + "=" + numero*i);
    }
    }

