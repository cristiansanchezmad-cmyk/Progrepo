package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Siglo_XIX {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int cant = 0;
        int billete[] = new int[4];
        int res[] = new int[3];
        boolean comprobar = true;
String billString=" ";
        cant = teclado.nextInt();



        do {
            for (int i = 0; i < billete.length; i++) {
                if (billete[0] == 1) {
                    res[1] = 1;
                }
                if (billete[1] == 1) {
                    res[2] = 9;
                }
                if (billete[2] == 1) {
                    res[1] = 1;
                    res[2] = 6;
                }
                if (billete[3] == 1) {
                    res[1] = 4;
                    res[2] = 3;
                }
                if (billete[0] == 1 && billete[1] == 1 && billete[2] == 1 & billete[3] == 1)
                    res[0] = 1;
                res[1] = 1;
                res[2] = 2;
                res[3] = 3;

            }
            System.out.println(Arrays.toString(res));

        } while (comprobar);
    }


}

