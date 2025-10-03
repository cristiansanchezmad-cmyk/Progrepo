package org.example;

import java.util.Scanner;

public class Multiplicacion {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        //Introduzco las variables
        boolean estado = true;
        int num1 = 0;
        int num2 = 0;
//Establezco que si el numero no es de 3 cifras te vuelva a preguntar por el multiplicando
        do {
            try {
                do {
                    System.out.println("ESCRIBE EL MULTIPLICANDO (DEBE DE SER DE 3 CIFRAS)");
                    num1 = teclado.nextInt();
                } while (num1 > 999 || num1 < 100);
            } catch (Exception e) {
                //Aqui estabezco que si pones letras el programa escriba lo siguiente
                System.out.println("ESTE NO ES EL FORMATO CORRECTO, REVISA BIEN QUE NO SEA NEGATIVO NI MAYOR DE 3 CIFRAS");
                estado = false;
                teclado.nextLine();
            }
        } while (!estado);
//Establezco que si el numero no es de 3 cifras te vuelva a preguntar por el multiplicador
        do {
            try {
                do {
                    System.out.println("ESCRiBE EL MULTIPLICADOR (DEBE DE SER DE 3 CIFRAS)");
                    num2 = teclado.nextInt();
                } while (num2 > 999 || num2 < 100);
            } catch (Exception z) {
                //Aqui estabezco que si pones letras el programa escriba lo siguiente
                System.out.println("ESTE FORMATO NO ES CORRECTO, REVISA BIEN QUE NO SEA NEGATIVO NI MAYOR DE 3 CIFRAS");
                estado = false;
                teclado.nextLine();
            }
        } while (!estado);
//Aqui creo los strings para hacer el proceso de la multiplicación
int result = num1 * num2;
    String numero_string = Integer.toString(num2);
    //Establezco sus posicionnes
        String numero1 = numero_string.substring(2,3);
        String numero2 = numero_string.substring(1,2);
        String numero3 = numero_string.substring(0,1);
        //Creo la variable de los String
        int num1In = Integer.parseInt(numero1);
        int num2In = Integer.parseInt(numero2);
        int num3In = Integer.parseInt(numero3);
        //Creo el proceso de la multpilación
        System.out.println("El resultado sería el siguiente:");
        System.out.println("      " + num1);
        System.out.println("     x" +num2);
        System.out.println("____________");
        System.out.println("      "+ num1In*num1);
        System.out.println("  +  "+ num2In*num1 );
        System.out.println("    "+ num3In*num1);
        System.out.println("_____________");
        System.out.println("    "+ result);
            }
    }



