

import java.util.Scanner;

public class Recus_ej {

    static int limite = 10;

    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        imprimir(1);
    }

    public static void imprimir(int inicio) {
        if (inicio <= limite) {
            System.out.println(inicio);
            imprimir(inicio + 1);
        }

    }
}

    static void main (String[] args) {
        Scanner telcado = new Scanner(System.in);
        System.out.println(sumar(10));
    }

    public static int sumar (int num ) {
    if (num==0){
        return 0;
    }else {
        return num+sumar(num-1);
    }



    }
