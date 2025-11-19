package org.example;

import java.util.Scanner;

public class BuclesAnidados {
    static void main() {
        /*
        externo:
    for (int i=0;i<9;i++){
        System.out.println("Soy el externo con i = " + i);
        interno:
        for (int j = 10; j >=0 ; j--) {
            System.out.println("Sou el interno con j = "+j);
            if (j==5){
                continue externo;
            }
            System.out.println("Hola" + (j+i));
        }
    }

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la altura...");
        int altura= teclado.nextInt();
        for (int i =1;i<=altura;i++){
            for (int j = 1; j <=i ; j++) {

                System.out.print("*");
            }
            System.out.println();
        }

        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero maximo...");
        int maximo = teclado.nextInt();
        tabla:
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.println(i+" x " + j + " = " + (i*j));
                if(maximo<(i*j)){
                    break tabla;
                }

            }

       */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero maximo de m :");
        int m =  teclado.nextInt();
        primos:
        for (int i = 2; i <=m ; i++) {
            for (int j = 2; j < i ; j++) {
                if (i%j ==0){
                    continue primos;
                }
            }
            System.out.print(i + " ");
        }
        }
    }

