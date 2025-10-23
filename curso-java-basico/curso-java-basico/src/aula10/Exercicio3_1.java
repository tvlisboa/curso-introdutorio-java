package aula10;

import java.util.Scanner;

public class Exercicio3_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Agora iremos somar dois numeros e mostrar na tela");
        System.out.println("Digite um numero a seguir: ");
        double number1 = sc.nextDouble();

        System.out.println("Digite outro numero a seguir: ");
        double number2 = sc.nextDouble();

        double sum = number1 + number2;

        System.out.println("Os numeros informados pelo usuario foram: ");
        System.out.println(number1);
        System.out.println(number2);

        System.out.println("A soma dos numeros informados foi: ");
        System.out.println(sum);

        System.out.println("Obrigado por utilizar nosso sistema");
        System.out.println("Saindo de nossa interface");
    }
}
