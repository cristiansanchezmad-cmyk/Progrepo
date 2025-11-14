package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practica2_tema3 {
    static void main() {
        Random aleatorio=new Random();
        Scanner teclado = new Scanner(System.in);
        int numeros[]=new int[6];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=aleatorio.nextInt(49)+1;
        }
        System.out.println("Bienvenido al programa de validación de lotería:");
        System.out.println("Introduce tu boleto con - y deben ser 6 digtos ");
        String boleto= teclado.nextLine();
       boolean formato= boleto.matches("\\d-\\d-\\d-\\d-\\d-\\d");
        boolean comprobar=true;
        while (comprobar) {
            comprobar=false;
            Arrays.sort(numeros);
            for (int i = 0; i < numeros.length; i++) {
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    numeros[i] = aleatorio.nextInt(49) + 1;
                    comprobar=true;
                }
            }
        }
        for (int i = 0; i < boleto.length(); i++) {
            if (boleto.split(boleto)[i].contains(numeros)) {

            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}

