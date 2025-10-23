package aula10;

import java.util.Scanner;

/**
 * Converta metros em centimetros
 */

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os metros a serem calculados a seguir: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.println("Metros convertidos: " + centimetros + "cm");

    }
}
