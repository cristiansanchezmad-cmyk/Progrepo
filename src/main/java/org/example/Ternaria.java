package org.example;

public class Ternaria {
    static void main() {
        int a =1, b=2, c=3;
        int resultado= a++ ==2 && c> b ++? a+=b:
                a>0 &&a ==b ?a +=c:
                        a ==c ? a++ : a--;
        System.out.println(resultado);
        a=1;
        b=2;
        c=3;
         resultado =a++ == 1&&a>b++? a+=b :
                a>0&&a==b ? a += c:
                        a ==c ? a++: a--;
        System.out.println(resultado);
        a=1;
        b=2;
        c=3;

        resultado = a++ ==1 && a> b++ ?a += b:
                a > 0 &&a == b?a +=c:
                        a==c ? a++:a--;
        System.out.println(resultado);

        a=4;
        b=5;
        c=6;
        resultado= a++ ==5 && a>b ? a-=b:
                a>3 &&a<10 ? a+=c:
                        a==c ? a++:a--;
        System.out.println(resultado);

    }
}
