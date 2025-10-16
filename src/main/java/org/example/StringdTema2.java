package org.example;

public class StringdTema2 {
    static void main() {
        String frase ="Al palo JuanFran del Atleti palo djkjdkjw ewpwedpdwpdw palo";

        int tamanyo = frase.length(); //para saber el tamaño del String
        System.out.println(tamanyo);

        System.out.println(frase.charAt(8)); //la letra que está en la posicion 8

        String trozo = frase.substring(8 ,16); //lo que hya escrito entre la letra 8 y la 16
        System.out.println(trozo);

        String trozo_final = frase.substring(17); // lo que hay a partir de la poscion 17
        System.out.println(trozo_final);

        int posicion = frase.indexOf("palo"); // en que posicion empieza la palabra palo
        System.out.println(posicion);

        int posicion2 = frase.indexOf("palo", 10); // en que posicion está la otra palabra igual, en este caso palo
        System.out.println(posicion2);

        int posicion_ultimo = frase.lastIndexOf("palo");
        System.out.println(posicion_ultimo);

        String frase_minusculas = frase.toLowerCase(); //convierte minusculas
        System.out.println(frase_minusculas);

        String frase_mayusculas = frase.toUpperCase(); //convierte a mayusuculas
        System.out.println(frase_mayusculas);

        String base_datos = "Raúl            ";
        System.out.println(base_datos.trim() + " - " + base_datos +"#"); //elimina los espacios

        boolean igual = base_datos.trim().equals("Raúl"); //comparar algo con el dato princiapl en este caso raul con raul
        System.out.println(igual);

        boolean igual_sin_mayusculas = base_datos.equals("Raúl");
        System.out.println(igual_sin_mayusculas);

        boolean iguañ_sin_mayusculas = "Raúl".equalsIgnoreCase("raúl");
        System.out.println(iguañ_sin_mayusculas);

        String frase_reemplazos = frase.replace("palo", "Florentino");
        System.out.println(frase_reemplazos);
        frase.replaceAll ("palo", "Florentino");

        String equipo = " Real Madrid";
        System.out.println(frase.concat(equipo));
        System.out.println(frase+equipo);
    }
}
