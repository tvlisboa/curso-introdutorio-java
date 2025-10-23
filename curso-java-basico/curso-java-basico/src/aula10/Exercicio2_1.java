package aula10;

import java.util.Scanner;

public class Exercicio2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira tres numeros a seguir! ");
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();
        double number3 = sc.nextDouble();

        System.out.print("O numero informado pelo usuario foi: ");
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}
