package exercicios2;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a lado do quadrado: ");
        double lado = sc.nextDouble();

        double areaQuadrado =  Math.pow(lado, 2);
        double areaQuadradoDouble = areaQuadrado * lado;

        System.out.println("A area do quadrado é: " + areaQuadrado);
        System.out.println("A area do dobro do quadrado é: " +areaQuadradoDouble);
        sc.close();
    }
}
