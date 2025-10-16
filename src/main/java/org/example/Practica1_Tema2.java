package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Practica1_Tema2 {
    static void main() {
        int dia2 = 0; //Introduzco las variables
        int mes2 = 0;
        int anyo2 = 0;
        int anyo_total = 0;
        boolean let = false;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento de la siguiente forma: dd/mm/aaaa");
        String fecha = teclado.nextLine(); //El usuario escribe su fecha en el formato adecuado
        if (fecha.length() != 10 || fecha.charAt(2) != '/' || fecha.charAt(5) != '/') { //Aqui especifico los casos donde dará error (fecha mayor que 10 caraceres)
            System.out.println("Error de formato. Revisa bien lo que se pide"); //Aqui sale el mensaje si se da un error

        } else {

            String dia = fecha.substring(0, 2); //Creo un string para separar de la fecha introducida el día, mes y año
            String mes = fecha.substring(3, 5);
            String anyo = fecha.substring(6, 10);
            try { //Compruebo si lo introducido es un numero
                dia2 = Integer.parseInt(dia); //Pasar los valores del String a numeros
                mes2 = Integer.parseInt(mes);
                anyo2 = Integer.parseInt(anyo);
                anyo_total = dia2 + mes2 + anyo2; //Creo una variable que sume el dia, mes y año
                let = true;
            } catch (Exception e) {
                System.out.println("EL formato no es correcto"); //Si lo introducido no fuera un numero saltará este mensaje
            }
            if (let) { //Si es un numero se realizará el resto del codigo

                if (mes2 >= 1 && dia2 >= 1 && dia2 <= 31 && mes2 <= 12 && anyo2 >= 1910) { //Comrpuebo que la fecha introducida sea real (meses mayores de 12, ect)
                    System.out.println(dia2 + "+" + mes2 + "+" + anyo2 + "=" + anyo_total); //Se suma la fecha introducida

                    String anyo_string = Integer.toString(anyo_total);
                    int num1 = Integer.parseInt(anyo_string.substring(0, 1)); //Se le da un valor a cada dígito del numero
                    int num2 = Integer.parseInt(anyo_string.substring(1, 2));
                    int num3 = Integer.parseInt(anyo_string.substring(2, 3));
                    int num4 = Integer.parseInt(anyo_string.substring(3, 4));
                    int lucky = num1 + num2 + num3 + num4; //Se crea una variable para sumar cada digito del numero
                    System.out.println(+num1 + "+" + num2 + "+" + num3 + "+" + num4 + " = " + lucky); //El programa escribe la suma de los numeros por separados y calcula el resultado
                    System.out.println("Tu numero de la suerte es " + lucky);

                } else System.out.println("La fecha introducida no existe"); //Si la fecha fuera irreal aparecería este mensaje


            }
        }
    }
}
