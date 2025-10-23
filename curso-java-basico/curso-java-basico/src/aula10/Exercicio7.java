package aula10;

import java.util.Scanner;

/**
 * Peca ao usuario para informar a area
 * do quadrado e em seguida
 * mostre o dobro da area
 * para o usuario
 */

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado: ");
        double lado = sc.nextDouble();

        double perimetro1 = lado * lado;
        double perimetro2 = Math.pow(lado, 2);

        System.out.println("A perimetro do quadrado: " + perimetro1);
        System.out.println("A perimetro do quadrado: " + perimetro2);

        System.out.println("O dobro da area do quadrado informado é " + (perimetro1 * 2));
        System.out.println("O dobro da area do quadrado informado é " + (perimetro2 * 2));
    }
}
