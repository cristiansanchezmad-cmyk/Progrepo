package org.example;

import java.util.Scanner;

public class Ej5 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double num = 0;
        double den = 0;
        double result = 0;
        boolean control = true;
        do {
            try {
                System.out.println("Introduce el numerador");
                num = teclado.nextInt();
                System.out.println("Introduce el denominador");
                den = teclado.nextInt();
                control = false;
            } catch (Exception e) {
                System.out.println("El formato no es correcto");
            }
            teclado.nextLine();
        } while (control);
    if (den != 0) {
        result= num /den;
        }else{
            System.out.println("No se puede dividir entre 0");
        }
        }


}


