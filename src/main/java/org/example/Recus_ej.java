package org.example;

import java.util.Scanner;

public class Recus_ej {
    static int limite=10;
    static void main(String[] args ) {
        Scanner teclado= new Scanner(System.in);
    imprimir(1);
    }
public static void imprimir (int inicio){
    if (inicio>limite){
        return;
    }else {
        System.out.println(inicio);
        imprimir(inicio+1);
    }

    }

}
