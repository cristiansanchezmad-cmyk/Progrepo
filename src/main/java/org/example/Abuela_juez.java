
import java.util.Scanner;

static java.util.Scanner in;

public static void casoDePrueba() {


    Scanner teclado = new Scanner(System.in);

    int[] dientesup = new int[6];
    int[] dientesbajo = new int[6];
    int cont = 0;


    String[] dientes1 = teclado.nextLine().split(" ");
    for (int i = 0; i < 6; i++) {
        dientesup[i] = Integer.parseInt(dientes1[i]);
    }


    String[] dientes2 = teclado.nextLine().split(" ");
    for (int i = 0; i < 6; i++) {
        dientesbajo[i] = Integer.parseInt(dientes2[i]);
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
}




// casoDePrueba

public static void main(String[] args) {

    in = new java.util.Scanner(System.in);

    int numCasos = in.nextInt();
    for (int i = 0; i < numCasos; i++)
        casoDePrueba();
} // main
