package exercicios2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe dois numeros a inteiros seguir: ");
        System.out.print("Numero 1: ");
        int num1 = sc.nextInt();

        System.out.print("Numero 2: ");
        int num2 = sc.nextInt();

        System.out.println("Informe um numero real a seguir: ");
        System.out.print("Numero 3: ");
        double num3 = sc.nextDouble();

        double result1 = (num1 * 2) + (num2 / 2);
        double result2 = (num1 * 3) + num3;
        double result3 = Math.pow(num3, 3);


        System.out.println("O resultado da primeira: " + result1);
        System.out.println("O resultado da segunda: " + result2);
        System.out.println("O resultado da terceira: " + result3);
        sc.close();
    }
}
