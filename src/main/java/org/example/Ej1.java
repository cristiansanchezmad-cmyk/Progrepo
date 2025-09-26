package org.example;


import java.util.Scanner;

public class Ej1 {

   static void main(){
       Scanner teclado = new Scanner(System.in);
       System.out.println("Numero de horas trabajadadas");
 double hora = teclado.nextInt();
       System.out.println("Escribe de tu tarifa por hora");
     double tarifa = teclado.nextInt();
       System.out.println("Tu salario bruto es " + (hora*tarifa) + "€");

   }
}
