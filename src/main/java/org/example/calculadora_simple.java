package org.example;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class calculadora_simple {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double num=0; //Defino las variables
        double num2= 0;
        double resultado=0;
        String ra="R";
        System.out.println("*******INTRODUCE UN NUMERO*******"); //Escribo que introduzca un numero
        try {
            num = teclado.nextInt(); //Aqui se introduce
        }catch (Exception e){ //Se crea un try catch que verfique que lo introducido es un numero
            System.out.println("El formato introducido es incorrecto"); //Escribo el mensaje que saldría si lo introducido es distinto a un numero
            return;
        }

        System.out.println("-----------------------"); //Aqui escribo el menú con las diferentes operaciones
        System.out.println("[+] --> Sumar");
        System.out.println("[-] --> Restar");
        System.out.println("[X] --> Multiplicar");
        System.out.println("[/] --> Dividir");
        System.out.println("[R] --> Raíz Cuadrada");
        System.out.println("-----------------------");
        System.out.println("Elige una operación");
        String op =teclado.next();//Aquí el usuario escribe la operación que quiere realizar
        if (op.equals(ra)) { //Creo un if donde si el usuario elige la raíz cuadrada no le pida un segundo numero
        }else{
            System.out.println("Introduce el segundo numero"); //El programa pide un segundo nunmero
            num2=teclado.nextInt(); //El usuario lo escribe
        }
        switch (op.toUpperCase()) { //Aqui creo el switch con los diferentes casos

            case "+": //El caso de la suma
                resultado=num+num2;
                System.out.println("El resultado es " + resultado);
                break; //Introsuzco el break debajo de cada caso
            case "-": //El caso de la resta
                 resultado=num-num2;
                System.out.println("El resultado es " + resultado);
                break;
            case "X": //El caso de la multiplicación
                resultado=num*num2;
                System.out.println("El resultado es " + resultado);
            break;
                case"/": //EL caso de la división
                if (num2!=0) { //Creo un if donde verifique si el segundo numero en el caso de la división es distinto a 0
                    resultado = num / num2;
                    System.out.println("El resultado es " + resultado);
                }else System.out.println("No se puede dividir entre 0");{ //Este es el mensaje de error si el numero de introducido es distinto de 0
                }
                break;
            case "R":
                if (num<0) { //Creo un if para verifique que el numero intrducido sea menor que 0
                    System.out.println("El resultado es un numero irreal, por tanto no se puede realizar la operación"); //Si fuera menor que 0, se introduce el siguiente mensaje
                }else {

                    resultado = Math.sqrt(num);
                    System.out.println("EL resultado es " + resultado);
                }
                break;
            default:
                System.out.println("El formato introducido no es correcto"); //Este mensaje aparecerá si la operación que se escribe es incorrrecta u otra cosa diferente a la que se pide
        }
    }
}
