package aula10;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        System.out.println("Exercicio 3");
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero a seguir: ");
        double number1 = sc.nextDouble();

        System.out.println("Digite outro numero a seguir: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;

        System.out.println("A soma dos numeros  informados pelo usuario foram: ");
        System.out.println(sum);
        System.out.println("Fechando o arquivo Exercicio3");
    }
}
