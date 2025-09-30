package org.example;



import java.util.Scanner;

public class Ej2 {

    static void main(){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Numero de horas trabajadadas");
       double hora = 0;
       double tarifa = 0;
       double SALARIO2 = 0;
        try {
         hora = teclado.nextInt();
        System.out.println("Escribe de tu tarifa por hora");
         tarifa = teclado.nextInt();
        SALARIO2 = (hora * tarifa);
        } catch (Exception e) {}

            if (hora > 40) {
                double Hextra = hora - 40;
                double Pextra = Hextra * (tarifa * 1.5);
                double SALARIO1 = tarifa * 40 + Pextra;
                System.out.println("Tu salario bruto es de " + SALARIO1 + "€");
            } else if (hora>0 && hora<40)
            { System.out.println("Tu salario bruto es " + SALARIO2 + "€");}
            else {
                System.out.println("Los datos no pueden ser negativos");
            }




        }
        }



