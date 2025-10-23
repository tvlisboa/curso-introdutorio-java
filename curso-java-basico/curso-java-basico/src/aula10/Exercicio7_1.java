package aula10;

import java.util.Scanner;

/**
 * Calcule a area do quadrado
 * mostre na tela a rea do quadrado
 * e o dobro da area
 */

public class Exercicio7_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a area do quadrado em centimetros: ");
        double lado = sc.nextDouble();

        /**
         * Para calcular a area do
         * quadrado
         * area = lado * lado
         * calcular o dobro da area
         * area * 2
         */

        double areaQuadrado = Math.pow(lado, 2);

        System.out.println("A area do quadrado informado foi: ");
        System.out.print(areaQuadrado);
        System.out.println("CM");
        System.out.println("O dobro da area do quadrado informado foi: ");
        System.out.print(areaQuadrado * 2);
        System.out.println("CM");
        sc.close();
    }
}
