package org.example;

import java.util.Arrays;
import java.util.Random;

public class Ej_matrices {
    static void main() {

        Random ale = new Random();

        int filas = ale.nextInt(6) + 2;
        int matriz[][] = new int[filas][filas];
        /* EJ1: Imprimir diagonales
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= ale.nextInt(50)+2;
            }
        }
    for (int fila[]:matriz){
        System.out.println(Arrays.toString(fila));
    }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i==j){
                    System.out.print(matriz[i][j]+" ");
                }
            }
        }
Opcion dos del ej1

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i]+" ");
        }

        System.out.println();
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][i] + " ");
        }
        //diagonal invertido
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(matriz[i][matriz.length-1]+" ");
        }
    */
        int a[][]={{1,2,3,4},{5,4,6,7},{6,9,10,12}};
        int b[][]={{12,21,2,1},{50,1,2,3},{19,0,2,4}};
        int m[][]=new int [3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>b[i][j]){
                    m[i][j]=a[i][j];
                }else{
                    m[i][j]=b[i][j];
                }
            }
        }
        for (int fila[]:m) {
            System.out.println(Arrays.toString(fila));
        }
    }
}
