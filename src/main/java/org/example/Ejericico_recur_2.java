package org.example;

import java.util.Scanner;

public class Ejericico_recur_2 {
    static void main(String[] args) {
        menu();

    }
    public static void menu(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("*** Batería de ejericicios sobre  recursividad ***");
        System.out.println("Selecciona a continuación el modo que quieres ejecutar...");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del revés");
        System.out.println("4 - Reves char");
        System.out.println("5- Binario");
        System.out.println("6 - De num a binario");
        System.out.println("7 - Mostrar suma");
        System.out.println("Elije opcion");
        int resp=teclado.nextInt();
 switch (resp) {
     case 1:
         System.out.println("Escribre un numero y contaré la cantidad de digitos que tenga");
         int digi=teclado.nextInt();
         System.out.println(digito(digi));
         break;
     case 2:
         System.out.println("Escribe un numero");
         int numbajo=teclado.nextInt();
         System.out.println("Escribre cuantas veces quieres multiplicarlo");
         int exponente=teclado.nextInt();
         System.out.println(potencia(numbajo,exponente));
         break;
     case 3:
         System.out.println("Introduce tu numero");
         int numre=teclado.nextInt();
         reves(numre);
         break;
     case 4:
         System.out.println("Introduce tu frase");
teclado.nextLine();
         String frase= teclado.nextLine();
        char [] frasechar=frase.toCharArray();
        reves_char(frasechar.length-1,frasechar);
         break;
     case 5:
         System.out.println("Introduce tu numero para comprobar si es binario");
         int num=teclado.nextInt();
         if (binario(num)){
             System.out.println("Es binario");
         }else{
             System.out.println("No es binario");
         }
         break;
     case 6:
         System.out.println("Introduce tu numero para combiarlo a binario");
         int numni=teclado.nextInt();
         System.out.println(binarioanum(numni,""));
         break;
     case 7:
         break;
     default:
         break;

 }
 }
 public static int digito(int num) {

     if (num <10) {
         return 1;
     } else {

     return 1+digito(num/10);
     }

 }
 public static int potencia(int num, int num2){
       if (num2==1){
           return num;
       }else{
           return num*potencia(num, num2-1);
       }
 }
 public static void reves(int num) {
     if (num < 10) {
         System.out.print(num);
     } else {
         System.out.println(num % 10);
         reves(num / 10);
     }

 }
 public static void reves_char(int posicion, char[] frase){
if (posicion==0){
    System.out.print(frase[posicion]);

}else{
    System.out.print(frase[posicion]);
    reves_char(posicion-1, frase);
}

 }

public static boolean binario(int numero) {

    if (numero >= 10) {
        if (numero % 10 == 0 || numero % 10 == 1) {
            binario(numero / 10);
        } else {
            return false;
        }
    } else if (numero == 0 || numero == 1) {
        return true;
    } else {
        return false;
    }
return true;
    }
public  static String binarioanum(int num, String binario){
        if (num<=1){
            return Integer.toString(num);
        }else{
        return binarioanum(num/2,binario)+num%2;
        }
    }

    }
