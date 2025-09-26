package org.example;



import java.util.Scanner;

public class Ej2 {

    static void main(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Numero de horas trabajadadas");
        double hora = teclado.nextInt();
        System.out.println("Escribe de tu tarifa por hora");
        double tarifa = teclado.nextInt();
        if (hora>40) {
            double Hextra = hora-40;
            double Pextra = Hextra* (tarifa *1.5);
            double SALARIO1 = tarifa*40 + Pextra;
            System.out.println( "Tu salario bruto es de " + SALARIO1 + "€");
        } else {
            double SALARIO2 = (hora*tarifa);
            System.out.println("Tu salario bruto es " + SALARIO2 +  "€");
        }
    }
}

