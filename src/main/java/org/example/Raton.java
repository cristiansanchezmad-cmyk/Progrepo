package org.example;

import java.util.Scanner;

public class Raton {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        final int pesomax = 120;
        final int altmax = 230;
        int altura = 0;
        int peso = 0;
        final int altmin = 140;
        boolean estado = true;
        System.out.println("BIENVENIDO AL RATÓN JUGUETÓN");
        System.out.println("Introduce tu altura en cm");
        altura = teclado.nextInt();
        // creo una variable para la diferencia de altura
        double difcm = 140 - altura;
        if (altura < 0 || altura > altmax) {
            // Aquí resuelvo los errores de altura negativa y de altura que supere la maxima
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
        } else if (altura < altmin) {
            // detecto la diferencia de cm que haya
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN POR " + difcm + "cm");
        } else {
            System.out.println("Escribe tu peso en kg");
            peso = teclado.nextInt();
            double pesominimo = altura * 2 / 8;
            // creo la variable de peso mínimo
            double difpes = 120 - peso;
           if (peso<0) {
               System.out.println("VUELVA A SUBIR, LA MÁQUINA TUVO UN ERROR");
           } else if ( peso > 120) {
                System.out.println("DISCULPE PERO PESA MAS DE LO PERMITIDO, BAJE DE LA BÁSCULA POR FAVOR");
                //escribo los erroes de peso negativo y de peso superior al permitido
            } else if (peso < pesominimo) {
                System.out.println("LO SIENTO PERO NO PUEDES MONTAR A LA ATRACCIÓN POR " + difpes);
                // escribo la diferencia de peso
            } else {
                System.out.println("¡¡SUBE A LA ATRACCIÓN!!");
            }
        }
    }
}



