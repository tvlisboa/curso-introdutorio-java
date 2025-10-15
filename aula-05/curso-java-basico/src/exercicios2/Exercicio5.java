package exercicios2;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a medida em metros a seguir: ");
        double metros = sc.nextDouble();

        double centimetros = metros * 100;

        System.out.println("A medida informada em metros: ");
        System.out.println(metros);

        System.out.println("Convertida para centimetros é: ");
        System.out.println(centimetros);
        sc.close();
    }
}
