package org.example;

import java.util.Scanner;

public class CosasHasNexIn {
    static void main() {
        /*
        Scanner teclado = new Scanner(System.in);
        if (teclado.hasNextInt()) {
            int numero = teclado.nextInt();
            System.out.println(numero);
        } else {
            System.out.println("Formato incorrectp. No es un número");
        }
        */
        int numero=2;
        char caracter='A';
        String palabra="Patricia";
        switch (palabra){
            case "Raul":
                System.out.println("El alumno no es Raul");
                break;
            case "Patricia":
                System.out.println("La profe es Patricia");
                break;
            default:
                System.out.println("No sé el nombre");
                break;
}
    }
    }

