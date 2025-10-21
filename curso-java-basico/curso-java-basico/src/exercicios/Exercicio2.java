package exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();

        if (num1 >= 0) {
            System.out.println("O numero informado é positivo.");
        }else {
            System.out.println("O numero informado é negativo");
        }
        sc.close();
    }
}
