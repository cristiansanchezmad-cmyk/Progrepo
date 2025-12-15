package org.example;

import java.util.Scanner;

public class Abuela_juez {
        static Scanner teclado = new Scanner(System.in);


        public static void main(String[] args) {

            int numCasos = teclado.nextInt();
            teclado.nextLine(); // limpiar buffer

            for (int i = 0; i < numCasos; i++) {
                casoDePrueba();
            }
        }


        public static void casoDePrueba() {

            int[] arriba = leerDientes();
            int[] abajo = leerDientes();

            if (encajan(arriba, abajo)) {
                System.out.println("SI");
            } else {
                System.out.println("NO");
            }
        }


        public static int[] leerDientes() {

            int[] dientes = new int[6];
            boolean correcto = false;

            while (!correcto) {
                String[] entrada = teclado.nextLine().split(" ");

                if (entrada.length != 6) {
                    continue;
                }

                correcto = true;
                for (int i = 0; i < 6; i++) {
                    try {
                        dientes[i] = Integer.parseInt(entrada[i]);
                        if (dientes[i] < 0 || dientes[i] > 2000) {
                            correcto = false;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        correcto = false;
                        break;
                    }
                }
            }
            return dientes;
        }


        public static boolean encajan(int[] arriba, int[] abajo) {

            int referencia = arriba[0] + abajo[0];

            for (int i = 1; i < 6; i++) {
                if (arriba[i] + abajo[i] != referencia) {
                    return false;
                }
            }
            return true;
        }
    }

