package org.example;

import java.util.Random;

public class Random_pruebas {
    static void main() {
        Random aleatorio = new Random();

    int numero = aleatorio.nextInt(5)+5;
        int numero2 = aleatorio.nextInt(9,10);
        System.out.println(numero2);

        double numero3 = aleatorio.nextDouble()*100 +1;
        System.out.println(numero3);
       double nummero4 = Math.random()*10+1;
        System.out.println(nummero4);
    }
}
