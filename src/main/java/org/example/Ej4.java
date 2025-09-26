package org.example;



import javax.swing.*;
import java.util.Scanner;

public class Ej4 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num1 = teclado.nextInt();
        System.out.println("Escribe otro numero");
        int num2 = teclado.nextInt();
        System.out.println("Introduce el último número");
        int num3 = teclado.nextInt();
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.println("ERROR: hay números introducidos que son iguales");
        }
        if (num1 < num2 && num2 < num3) {
            System.out.println("El " + num1 + " Es el número más pequeño");
        }else if (num2 < num1 && num1 < num3) {
            System.out.println("El " + num2 + " Es el número más pequeño");
        } else {
            System.out.println("El " + num3 + " Es el número más pequeño");
        }
    }
}




