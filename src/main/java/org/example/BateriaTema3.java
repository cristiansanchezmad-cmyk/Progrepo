package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BateriaTema3 {
    static void main() {
        Scanner teclado = new Scanner(System.in);
      /*
       int matrizz[][]=new int[3][3];
        System.out.println("Introduce la matriz que quieras (Debe de ser 3x3)");
        for (int i = 0; i < matrizz.length; i++) {
            for (int j = 0; j < matrizz[i].length; j++) {

                matrizz[i][j]= teclado.nextInt();
            }
        }
    for ( int fila[]: matrizz){
        System.out.println(Arrays.toString(fila));
    }
        System.out.println("Introduce el numero a buscar");
    int numer= teclado.nextInt();
externo:
        for (int i = 0; i < matrizz.length; i++) {
            for (int j = 0; j < matrizz[i].length; j++) {


                if(matrizz[i][j]==numer){
                    System.out.println("El numer "+numer +" esta en la posicion ( " + i+","+j+" )");
               break externo;
                }
            }
        }


  Ej2
    Random ale=new Random();
    int matriz[][]=new int [ale.nextInt(5)+1][ale.nextInt(5)+1];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]= ale.nextInt(25)+10;
            }
        }
    for (int fila []:matriz){
        for (int num :fila){
            System.out.print(num +" ");
        }
        System.out.println();
    }
    int suma=0;
        for (int i = 0; i < matriz.length; i++) {
            suma=0;
            for (int j = 0; j < matriz[i].length; j++) {
                suma+=matriz[i][j];
            }
            System.out.println("Fila " + (i+1) +" : " +suma);
        }
        for (int i = 0; i < matriz[0].length; i++) {
          suma=0;
            for (int j = 0; j < matriz.length; j++) {
        suma+=matriz[j][i];
            }
            System.out.println("Columna "+(i*1)+" : "+suma);
        }
    suma=0;
        for (int i = 0; i < matriz[0].length; i++) {
            suma*=matriz [ale.nextInt(matriz.length-1)][i];
        }
        System.out.println("1 fila: "+suma);

          System.out.println("Cuantos estudiantes tienes");
        int alumnos = entrada.nextInt();
        System.out.println("Cuantas asignaturas tienes");
        int asignaturas = entrada.nextInt();
        String[][]matriz = new String[alumnos +1][asignaturas +1];

        matriz[0][0] = "Estudiantes";
        for (int i = 1; i < matriz.length; i++) {
            System.out.println("Introduce nombre del estudiante " + (i));
            matriz[i][0] = entrada.next();
        }

        for (int i = 1; i < matriz[0].length; i++) {
            System.out.println("Introduce nombre de la asignatura " + (i));
            matriz[0][i] = entrada.next();
        }

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[0].length; j++) {
                System.out.println("Inserta la nota de " + matriz[i][0] + " para la asignatura " + matriz[0][j]);
                if (entrada.hasNextInt()){
                    matriz[i][j] = entrada.next();
                }else{
                    System.out.println("No es una nota");
                    return;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        double media = 0;
        for (int i = 1; i < matriz.length; i++) {
            media = 0;
            for (int j = 1; j < matriz[0].length; j++) {
                media += Integer.parseInt(matriz[i][j]);
            }
            media = media / asignaturas;
            System.out.println("La nota media del alumno " + matriz[i][0] + " es " + media);
        }


        for (int i = 1; i < matriz[0].length; i++) {
            media = 0;
            for (int j = 1; j < matriz.length; j++) {
                media += Integer.parseInt(matriz[j][i]);
            }
            media = media / alumnos;
            System.out.println("La nota media de la asignatura " + matriz[0][i] + " es " + media);
        }
      */
        String nombres[][] = new String[2][3];
        for (int i = 0; i < nombres.length; i++) {
            String fila[] = teclado.next().split(";");
            if (fila.length == nombres[i].length) {
                for (int j = 0; j < nombres[i].length; j++) {
                    nombres[i][j] = fila[j];
                }
            } else {
                System.out.println("El tamaño no es el adecuado");
           i--;
            }
        }
for (String fila []:nombres){
    System.out.println(Arrays.toString(fila));

}

    }
}
