package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class samurais {
    static void main() {


        /*
        String cadena="patri liber silvia dabian angel manuela vero";
        String profesores  []= cadena.split("");
        System.out.println(Arrays.toString(profesores));
        int vector [] = new int[profesores.length];
        for (int i = 0; i < profesores.length; i++) {
            vector[i]=Integer.parseInt(profesores[i]);

        }
    */
        Scanner teclado = new Scanner(System.in);
        Random ale =new Random();
        int equipo[] = new int[7];
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int potfin = 0;
        int numequip = 1;
        do {
            potfin = 0;
            System.out.println("Equipo " + numequip);
            System.out.println("Introduce la potencia de los samurais");
            String sam = teclado.next();
            String pot[] = sam.split(",");
            for (int i = 0; i < pot.length; i++) {
                if (equipo[i] > 1 && equipo[i] < 24) {

                    equipo[i] = Integer.parseInt(pot[i]);
                    potfin += Integer.parseInt(pot[i]);

                } else {

                }
            }
                if (potfin <= 30) {
                    if (numequip == 1) {
                        equipo1 = equipo.clone();
                        numequip = 2;
                    } else if (numequip == 2) {
                        equipo2 = equipo.clone();
                        numequip = 4;
                    }
                } else {
                    System.out.println("Error. La potencia total suma 30");
                }

        }while (numequip < 3);
        System.out.println("Empieza la batalla");
       int  bat = ale.nextInt(1,8);
        System.out.println("La batalla empieza con el samurai " + bat );
        for (int i = bat; i <bat  ; i++) {

        }
    }
}