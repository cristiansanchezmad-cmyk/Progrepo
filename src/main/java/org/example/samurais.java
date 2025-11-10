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
        Random ale = new Random();
        int equipo[] = new int[7];
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int potfin = 31;
        int numequip = 1;
        int conteq1 = 0;
        int conteq2 = 0;
        final int samtop = 30;
        do {
            potfin =0;
            System.out.println("Equipo " + numequip);
            System.out.println("Introduce potencia de los samurais: (Entre las cifras introduce ,)");
            String sam = teclado.next();
            String pot [] = sam.split(",");
            for (int i = 0; i < equipo1.length;i++) {
                if (Integer.parseInt(pot[i])<=24){
                    equipo[i] = Integer.parseInt(pot[i]);
                    potfin += equipo[i];}
            }
            if (potfin <= samtop) {
                if (numequip==1){
                    equipo1 = equipo.clone();
                    numequip=2;
                } else if (numequip==2) {
                    equipo2 = equipo.clone();
                    numequip=5;
                }
            } else {
                System.out.println("ERROR. La potencia total no suma 30");


            }
        }   while (numequip<=3);

        System.out.println("¿Empieza la batalla!");
        int samale = ale.nextInt(1,8);
        System.out.println("La batalla empieza con el Samurai " + samale);
        for (int i = samale; i<7;i++){
            if (equipo1[i]>equipo2[i]) {

                System.out.println("Samurai " + i + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
               conteq2++;
            } else if (equipo1[i] < equipo2[i]){

                System.out.println("Samurai " + i + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
               conteq1++;
            }}
        for (int i = 0; i<samale;i++){

            if (equipo1[i]>equipo2[i]) {

                System.out.println("Samurai " + i + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                conteq2++;
            } else if (equipo1[i] < equipo2[i]){

                System.out.println("Samurai " + i + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
               conteq1++;
            }}
        if (conteq1<conteq2){
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + conteq2 + " bajas");
        } else if (conteq1>conteq2) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + conteq1 + " bajas");
        } else {
            System.out.println("¡EMPATE!");

        }

        


    }
      }