package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayBateria {
    static void main() {
 /* Ej1
        Random ale=new Random();

        int resultado=0;
        int[]array=new int [8];
        for (int i=0;i<array.length;i++){
            array[i]=ale.nextInt(0,500)+1;
            System.out.println(array[i]);
          resultado +=array[i];
        }
        System.out.println("El resultado es " +resultado);
         */
        /*Ej2
        int vector[]={1,3,4,6,10};
        int aux=0;
        for (int i=0;i< vector.length;i++){
            aux=vector[i];
            vector[i]= vector[vector.length-1-i];
            vector[vector.length-1-i]=aux;
        }

       System.out.println(Arrays.toString(vector));
      */
        /*Ej3
        Random ale=new Random();
        Scanner teclado = new Scanner(System.in);
        int resultado=0;
        int num=0;
        int cont=0;
        int[]array=new int [25];
        System.out.println("Dime un numero del 1 al 100");
        num = teclado.nextInt();
        for (int i=0;i<array.length;i++) {
            array[i] = ale.nextInt(0, 100) + 1;
            if(array[i]==num) {
                cont++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("El numero " + num + " se repite " +cont + " veces");
   */
        /*Ej 4
        Scanner teclado = new Scanner(System.in);
        int vector[] = {3, 4, 5, 6, 7};
        int vector2[] = new int[vector.length - 1];
        int pos = 0;
        System.out.println("Ingresa una posición:");
        pos = teclado.nextInt();
        for (int i = 0; i < vector2.length; i++) {
            if (i == pos) {
                vector2[i] = vector[i + 1];
            } else {
                vector2[i] = vector[i];
            }

        }
        System.out.println(Arrays.toString(vector2));
         */
        /*
        int vector [] = {3, 4, 5, 6, 7};
        int aux = 0;
        aux = vector[vector.length-1];
        System.out.println(Arrays.toString(vector));

        for (int i = vector.length-1; i >=1; i--) {
            if (i == vector.length - 1) {
                aux=vector[i];
                vector[i] = vector[i - 1];
            } else {
                vector[i] = vector [i-1];
            }
        }
        vector[0]=aux;
        System.out.println(Arrays.toString(vector));
*/
        /*
        int vector[] = {1, 2, 3, 2, 1};
        boolean es_o_no = true;
        for (int i = 0; i < vector.length / 2; i++) {
            vector[i] = vector[vector.length - 1 - i];
            if (vector[i] != vector[vector.length - 1 - i]) {
                System.out.println("No es");
                es_o_no = false;
            }
        }
        if (es_o_no) System.out.println("Es palíndromo");
    */
        /*
        String palabra[]={"mandarina","jacobo","melacotóm","melón"};
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una letra...");
        char letra =teclado.next().charAt(0);
        for (int i = 0; i < palabra.length; i++) {
            if (letra == palabra[i].charAt(0)){
                System.out.println(palabra[i]);
            }
        }
            */

        }
    }
