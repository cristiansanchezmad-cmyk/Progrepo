package org.example;

import java.util.Scanner;

public class Comprobador_ISBN {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("[1] VALIDAR TU ISBN");
        System.out.println("[2] REPARAR TU ISBN");
        System.out.println("[3] SALIR");
        String modo = teclado.nextLine();
        int num=0;
        int op2=10;
        switch (modo){
            case "1":
            System.out.println("Introduce tu ISBN...");
            String isbn = teclado.nextLine();
        int tamanyo =isbn.length();
                int numfin = isbn.charAt(9);
            if (tamanyo==10-1) {
                for (int i = 0; i < isbn.length(); i++) {

                }

            /* }else if (numfin="X"){

                              for (int i = 0; i < isbn.length(); i++) {
                    if (i == isbn.length() - 1 && isbn.substring(i).equals("X")) {
                        int numfin = 10;
                        op1 += numfin * op2;
                    }else{
                        try {
                            op1 += Integer.parseInt(isbn.substring(i, i + 1)) * op2;

                            op2--;
                        }catch (NumberFormatException e) {
                            System.out.println("Formato Incorrecto");
                            return;
                        }
                        }
                   if (op1%11)

                    }

                    {
                    }
            */
                }else  {
                System.out.println("El ISBN no tiene 10 numeros");
            }
                break;
            case "2":
            break;
            case "3":
         break;
        }

        //num 11%==0
    }
}
