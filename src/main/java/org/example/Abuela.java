
import java.util.Scanner;
static Scanner teclado = new Scanner(System.in);

 void main(){
     int [] hola = new int[6];
     meter(hola);
     System.out.println(Arrays.toString(meter(hola)));
    int[] dientesup = new int[6];
    int[] dientesbajo = new int[6];
    int cont = 0;
    int contvuelt=0;
    int canti;
    try {
         canti = teclado.nextInt();
        teclado.nextLine();
    }catch (InputMismatchException e){
        System.out.println("Entrada inválida, se requiere un número entero");
        return;
    }

do {


    String[] dientes1 = teclado.nextLine().split(" ");

    for (int i = 0; i < 6; i++) {
        try {
            dientesup[i] = Integer.parseInt(dientes1[i]);
            if (dientes1.length != 6) {
                System.out.println("Error: deben introducirse 6 valores.");
                return;
            }

        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, se requiere un número entero.");
            return;
        }
        if (dientesup[i] < 0 || dientesup[i] > 2000) {
            System.out.println("Error: cada valor debe estar entre 0 y 2000.");
            return;
        }
    }


    String[] dientes2 = teclado.nextLine().split(" ");
    for (int i = 0; i < 6; i++) {
        try {
            dientesbajo[i] = Integer.parseInt(dientes2[i]);
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida, se requiere un número entero.");
            return;
        }
        if (dientes2.length != 6) {
            System.out.println("Error: deben introducirse 6 valores.");
            return;
        }
        if (dientesbajo[i] < 0 || dientesbajo[i] > 2000) {
            System.out.println("Error: cada valor debe estar entre 0 y 2000.");
            return;
        }
    }


    for (int i = 0; i < 6; i++) {
        if (dientesup[i] != dientesbajo[i]) {
            cont++;
        }else{
            cont--;
        }
    }

    if (cont == 6) {
        System.out.println("SI");
    } else {
        System.out.println("NO");
    }
    contvuelt++;
}while (contvuelt<canti);



}

public static int[] meter (int num[]){
    System.out.println("Introduce Hilera");
    for (int i = 0; i < num.length; i++) {
        num[i] = teclado.nextInt();
    }
     return num;
}











