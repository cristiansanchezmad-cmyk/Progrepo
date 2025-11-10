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
        Random ale = new Random(); //Introducimos las variables
        int equipo[] = new int[7];
        int equipo1[] = new int[7];
        int equipo2[] = new int[7];
        int potfin = 31;
        int numequip = 1;
        int conteq1 = 0;
        int conteq2 = 0;
        final int samtop = 30;
        do { //Hacemos un bucle donde el programa le pida el valor de los samaurais hasata que se completen los dos equipos
            potfin =0;
            System.out.println("Equipo " + numequip);
            System.out.println("Introduce potencia de los samurais: (Entre las cifras introduce ,)");
            String sam = teclado.next();
            String pot [] = sam.split(",");
            for (int i = 0; i < equipo1.length;i++) { //Aqui se comprueba que  el valo introducido sea meno de 24 y se guarda en su equipo correspondiente
                if (Integer.parseInt(pot[i])<=24){
                    equipo[i] = Integer.parseInt(pot[i]);
                    potfin += equipo[i];}
            }
            if (potfin <= samtop) { //Aqui se compara que la suma de los 7 valores (vector) no sea superior a 30
                if (numequip==1){
                    equipo1 = equipo.clone();
                    numequip=2;
                } else if (numequip==2) {
                    equipo2 = equipo.clone();
                    numequip=5;
                }
            } else {
                System.out.println("ERROR. La potencia total no suma 30"); //Aqui salta el error


            }
        }   while (numequip<=3); //Esta es la condicion necesaria para que el bucle finalize

        System.out.println("¿Empieza la batalla!"); //Aqui se comienza con los combate
        int samale = ale.nextInt(1,8);
        System.out.println("La batalla empieza con el Samurai " + samale); //Se crea una variable aleatoria a partir de la cual se empezará un bulce for pasando por todos los valores restantes
        for (int i = samale; i<7;i++){ //Creo un primer for donde paso por todos los valores del numero aleatorio eleigdo hasta el final
            if (equipo1[i]>equipo2[i]) {

                System.out.println("Samurai " + i + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
               conteq2++; //Sumo uno al equipo vencedor
            } else if (equipo1[i] < equipo2[i]){

                System.out.println("Samurai " + i + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
               conteq1++;
            }}
        for (int i = 0; i<samale;i++){ //En este swgundo for busco que se recorran los valores dese el primero hasta el numero aleatorio que alio, para así recorrer todos los valores

            if (equipo1[i]>equipo2[i]) {

                System.out.println("Samurai " + i + " Gana Equipo 1. " + equipo1[i] + " vs " + equipo2[i]);
                conteq2++;
            } else if (equipo1[i] < equipo2[i]){

                System.out.println("Samurai " + i + " Gana Equipo 2. " + equipo1[i] + " vs " + equipo2[i]);
               conteq1++; //El interior del bucle es el mismo solo cambia a lo que afecta el for
            }}
        if (conteq1<conteq2){ //Por ultimo creo tres sout cobn los 3 posibles resultados del combate
            System.out.println("¡Equipo 1 GANA! Equipo 2 ha tenido " + conteq2 + " bajas");
        } else if (conteq1>conteq2) {
            System.out.println("¡Equipo 2 GANA! Equipo 1 ha tenido " + conteq1 + " bajas");
        } else {
            System.out.println("¡EMPATE!");

        }




    }
      }