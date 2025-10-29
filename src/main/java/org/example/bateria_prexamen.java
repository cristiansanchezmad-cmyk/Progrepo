package org.example;

import java.util.Scanner;

public class bateria_prexamen {
    static void main() {
        Scanner teclado = new Scanner(System.in);
      /*  int numcant = 0;
        int num =0;
        String menores ="";
        String mayores="";
        String iguales="";
        System.out.println("¿Cuantos numeros vas a escribir?");
        numcant = teclado.nextInt();

        for (int i = 0; i < numcant; i++) {
            System.out.println("Escribe el numero");
            num = teclado.nextInt();
            if (num < 0) {
               menores+=Integer.toString(num) + " ";

            } else if (num>0) {
                mayores+=Integer.toString(num) + " ";
            }else{
                iguales+=Integer.toString(num)+ " ";
            }
        }
        System.out.println("Los numeros mayores que 0 son " + mayores);
        System.out.println(" Los numeros que son menores que 0 son " + menores );
        System.out.println("Los numero que son iguales a 0 son " + iguales);
   */
        /*
        int num2;
        System.out.println("Introduce un numero positivo o negtivo para darlo como exponente");
        int numero = teclado.nextInt();
        System.out.println("Introduce un  numero para el exponente");
        num2 = teclado.nextInt();
        int comp = numero;
        if (num2 < 0) {
            System.out.println("El numero no puede ser negativo");
        } else if (num2==0) {
            System.out.println("EL numero vale 1");
        } else {
            for (int i=1;i<num2;i++) {
                numero = numero * comp;

            }
            System.out.println(numero);
        }
*/
        int acum = 0;
        System.out.println("¿Cual es el precio que hay que registrar? ");
        int precio = teclado.nextInt();
        System.out.println("¿Cuantos meses vas a necesitar para pagarlo?");
        int mes = teclado.nextInt();
        acum=precio;
        for (int i = 0; i < mes; i++) {



            System.out.println("El mes " + i + " habré pagado " + precio);
            precio += precio;

        }
        precio=precio-acum;
        System.out.println(precio);
    }
}
