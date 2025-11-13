package org.example;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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
        int vector[]={4,3,2,5,0};
       int vector2[]=vector.clone();
        Arrays.sort(vector2);
        System.out.println(Arrays.toString(vector2));
        System.out.println(Arrays.toString(vector2));
int posicion=Arrays.binarySearch(vector2, 5);
        System.out.println(posicion);;
    }
}
