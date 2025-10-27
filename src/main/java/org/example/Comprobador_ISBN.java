package org.example;

import java.util.Scanner;

public class Comprobador_ISBN {
    static void main() {

        Scanner teclado = new Scanner(System.in); //Creo el comando para el teclado
        System.out.println("[1] VALIDAR TU ISBN"); //Creo las 3 posibles opciones
        System.out.println("[2] REPARAR TU ISBN");
        System.out.println("[3] SALIR");
        String modo = teclado.nextLine(); //Aquí el usuario pondrá el modo que querrá usar
        int isbntotal = 0;//Creamos las variables que vamos a usar en el caso 1 y 2 para no repetir codigo
        switch (modo) {
            case "1": //Creamos el caso uno que será la comprobación del isbn
                System.out.println("Introduce tu ISBN de 10 dígitos:");
                String isbn = teclado.nextLine();

                if (isbn.length() != 10) {
                    System.out.println("El ISBN debe tener exactamente 10 caracteres."); //Creamos un if donde si el numero es disitinto de 10 slga el siguiente mensaje
                    return;
                }
                for (int i = 0; i < 10; i++) { //Creamos un bucle for que recorra todas las posciones
                    char c = isbn.charAt(i);
                    int valor; //Creamos la variable de valor para convertir la x mas adelante

                    if (i == 9 && (c == 'X' || c == 'x')) { //Creamos un if donde si solo en la posiciona 9 hay una x o X valga 10
                        valor = 10;
                    } else { //Intentamos convertir el resto de caracteres a número
                        try {
                            valor = Integer.parseInt(String.valueOf(c)); //El resto de numeros pasaran de palabras o string a numeros
                        } catch (NumberFormatException e) { //Si falla, el caracter no es número válido
                            System.out.println("ISBN inválido. Solo números o X en la última posición.");
                            return;
                        }
                    }
                    isbntotal += valor * (10 - i); //Aqui se operan todos los numeros del isbn por su respectiva posicion y se guarda en la variable isbntotal
                }

                    if (isbntotal % 11 == 0) { //Ahora comprobamos que el isbn sea o no divisible entre 11
                        System.out.println("El ISBN es válido ."); //Si lo es saldrá esto
                    } else {
                        System.out.println("El ISBN no es válido."); //Sino, esto
                    }

                break;

            case "2": //Comenzamos el caso 2
                System.out.println("Introduce tu ISBN con '?':"); //Le pedimos al usuario el isbn con interrogante (?)
                String isbn2 = teclado.nextLine(); //El usario lo escribe

                if (isbn2.length() != 10) {
                    System.out.println("El ISBN debe tener exactamente 10 caracteres."); //Creamos un if donde si el numero es disitinto de 10 slga el siguiente mensaje
                    return;
                }
                int posInterrogante = -1; // Creamos la posicion del interrogante, está con un numero negativo para dar un valor, y esta no puede ser 0 ya que este numero tambien se puede poner en el isbn

                for (int i = 0; i < 10; i++) { //Como en el caso 1, recorremos todas las posiciones
                    char c = isbn2.charAt(i);
                    int peso = 10 - i;
                    int valor; //Creamos las variables

                    if (c == '?') { //Un if donde si la posicion de un numero del isbn equivale a ?
                        posInterrogante = i;
                    } else if (c >= '0' && c <= '9') { //Si los numeros son entre 0 o 9
                        valor = Integer.parseInt(String.valueOf(c));
                        isbntotal += peso * valor; //Se calcula la misma operacion que en el caso 1
                    }

                }
                int pesoInterrogante = 10 - posInterrogante; //Buscamos por que se va a multiplicar el interrogante
                for (int x = 0; x <= 9; x++) { //Se crea un for para probar todos los valores del uno al 9
                    int sumaTotal = isbntotal + pesoInterrogante * x;
                    if (sumaTotal % 11 == 0) { //Comprobamos si la suma del isbn con el valor interrogante es divisible entr 11
                        System.out.println("El dígito '?' debe ser: " + x); //Creamos la solucion
                        break;
                    }
                }
                break;
            case "3": //Creamos el caso 3
                System.out.println("Saliendo..."); //Escribimos saliendo
                break;
        }
    }
}
