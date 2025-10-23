package aula10;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero (inteiro) a seguir: ");
        double numero1 = sc.nextDouble();

        System.out.println("Digite outro numero (inteiro) a seguir: ");
        double numero2 = sc.nextDouble();

        System.out.println("Digite outro numero (real) a seguir: ");
        double numero3 = sc.nextDouble();

        double res1 = (numero1 * 2) * (numero2 / 2);
        double res2 = (numero1 * 3) + numero3;
        double res3 = Math.pow(numero3, 3);

        System.out.println("O resultado dos numeros digitados foram: ");
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
        sc.close();
    }
}
