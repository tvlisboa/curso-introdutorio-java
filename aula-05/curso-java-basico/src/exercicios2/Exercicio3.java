package exercicios2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um numero a seguir: ");
        double num1 = sc.nextDouble();

        System.out.println("Insira outro numero a seguir: ");
        double num2 = sc.nextDouble();

        double soma = (num1 + num2);

        System.out.println("O usuario informou os seguintes numeros: ");
        System.out.println(num1);
        System.out.println(num2);

        System.out.println("A soma dos numeros informados, foram: ");
        System.out.println(soma);
        sc.close();
    }
}
