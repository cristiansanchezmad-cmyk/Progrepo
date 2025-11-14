package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class formas_ordenar {
    static void main() {
       /*
        Integer vector[]={4,3,2,5,0};
        Integer vector2[]=vector.clone();

        Arrays.sort(vector2);
        System.out.println(Arrays.toString(vector));
        Arrays.sort(vector2, Collections.reverseOrder());
        System.out.println(Arrays.toString(vector2));
*/

        /*Forma2
        int vector[]={4,3,2,5,0};
       int vector2[]=vector.clone();
        Arrays.sort(vector2);
        System.out.println(Arrays.toString(vector2));
        System.out.println(Arrays.toString(vector2));
int posicion=Arrays.binarySearch(vector2, 5);
        System.out.println(posicion);
         */
        Random aleatorio=new Random();
        int numeros[]=new int[10];
        for (int i=0;i<numeros.length;i++){
            numeros[i]=aleatorio.nextInt(10)+1;
        }
        System.out.println(Arrays.toString(numeros));
        boolean comprobar=true;
        while (comprobar) {
            comprobar=false;
            Arrays.sort(numeros);
            System.out.println(Arrays.toString(numeros));
            for (int i = 0; i < numeros.length; i++) {
                if (i != numeros.length - 1 && numeros[i] == numeros[i + 1]) {
                    System.out.println("Duplicado: " + numeros[i]);
                    numeros[i] = aleatorio.nextInt(10) + 1;
                    comprobar=true;
                }
            }
        }
        System.out.println(Arrays.toString(numeros));
    }
}
