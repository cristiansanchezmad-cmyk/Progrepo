package org.example;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividadgeneraciones {
    static void main() {
        Scanner telcado = new Scanner(System.in);
        final int ANYO_MINIMO = 1900;
        int modo = 0;
        int anyo_actual = 0;
        int anyo_nacimiento_int = 0;
        System.out.println("Elige un modo...");
        System.out.println("[1] - Año de nacimiento");
        System.out.println("[2] - Edad");
        System.out.println("----------------------------");
        if (telcado.hasNext()) {
            modo = telcado.nextInt();
        } else {
            System.out.println("El valor del modo incorrecto");
        }
        switch (modo) {
            case 1:

                System.out.println("Introduce tu año de nacimiento:");
                String anyo_nacimiento = telcado.next();

                try {
                    anyo_nacimiento_int = Integer.parseInt((anyo_nacimiento));
                } catch (NumberFormatException e) {
                    System.out.println("El formato no es numérico.");

                }
                LocalDateTime fecha = LocalDateTime.now();
                anyo_actual = fecha.getYear();
                break;
            case 2:
                int edad = 0;

                if (telcado.hasNextInt()) {
                    edad = telcado.nextInt();
                } else {
                    System.out.println("La edad no tiene formato correcto (numérico)");

                }
                if (edad >= 0) {
                    anyo_nacimiento_int = (anyo_actual - edad);
                } else {
                    System.out.println("La edad no es corrrecta.");
                }
            default:
                System.out.println("El modo introducidp no es correcto");


        }
        if (anyo_nacimiento_int >= ANYO_MINIMO && anyo_nacimiento_int <= anyo_actual) {

                if (anyo_nacimiento_int <= 1927) {
                    System.out.println("Generación sin bautizar");
                } else if (anyo_nacimiento_int >= 1928 && anyo_nacimiento_int <= 1944) {
                    System.out.println("Generación silent");
                } else if (anyo_nacimiento_int >= 1945 && anyo_nacimiento_int <= 1964) {
                    System.out.println("Baby boomer");
                } else if (anyo_nacimiento_int >= 1965 && anyo_nacimiento_int <= 1982) {
                    System.out.println("Generacion X");
                } else if (anyo_nacimiento_int >= 1982 && anyo_nacimiento_int <= 1994) {
                    System.out.println("Millenials");
                } else {
                    System.out.println("Generación Z");
                }
            }
        }
    }






