package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1 {

   static void main() {
       Scanner teclado = new Scanner(System.in);
       double hora = 0;
       double tarifa = 0;
       try {
           System.out.println("Numero de horas trabajadadas");
           hora = teclado.nextInt();
           System.out.println("Escribe tu tarifa por hora");
           tarifa = teclado.nextInt();
           System.out.println("Tu salario bruto es " + (hora * tarifa) + "€");
       } catch (Exception e) {
           System.out.println("Formato incorrecto");
           }

       }
   }
