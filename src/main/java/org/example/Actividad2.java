package org.example;
import java.util.Scanner;
public class Actividad2 {


    static void main()  {
        Scanner teclado = new Scanner(System.in);
        System.out.println(" Hola bienvenido a DAM, ¿como te llamas?");
        String nombre = teclado.nextLine();
        System.out.println("Cual es tu curso?");
        String curso = teclado.nextLine();
        System.out.println("Bienvenidob " +  nombre +  " de " + curso);


        System.out.println(" Escribe un numero");
        int num1 = teclado.nextInt();
        System.out.println("Escribe otro numero");
        int num2 = teclado.nextInt();
        System.out.println("El resultado es " + (num1 + num2));

    }
}





