package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class VECTOR {
    static void main() {
        Scanner teclado = new Scanner(System.in);
     int vector[]={1,3,4,6,10};
        System.out.println(Arrays.toString(vector));
        System.out.println(vector.length);
       int vector2[]=new int[8];
        System.out.println(Arrays.toString(vector2));
        System.out.println(vector.length);
        vector2=vector.clone();
        System.out.println(Arrays.toString(vector2));
        for (int i =vector.length -1;i>=0;i--) {
            System.out.println(vector[i]);

        }
    }
}
