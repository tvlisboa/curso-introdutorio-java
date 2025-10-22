package aula15;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o primeiro numero");
        double num1 = sc.nextDouble();

        System.out.println("Insira o segundo numero");
        double num2 = sc.nextDouble();

        System.out.println("Insira o terceiro numero");
        double num3 = sc.nextDouble();

        if(num1 <= num2 && num1 <= num3 && num2 <= num3) {
            //num1 é menor
            //num2 é menor que num3
            //num3 e maior
            //num1 < 2 num2 < num3
            System.out.println(num3 + " - " + num2 + " - " + num1);

        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
            //num1 é menor
            //num3 é menor que num2
            //num2 e maior
            //num1 < num3 < num2
            System.out.println(num2 + " - " + num3 + " - " + num1);

        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            //num2 é menor
            //num1 é menor que num3
            //num3 é maior
            System.out.println(num3 + " - " + num1 + " - " + num2);

        }else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
            //num2 e menor
            //num3 e menor que num1
            //num1 e o maior
            System.out.println(num1 + " - " + num3 + " - " + num2);

        }else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            //num3 e menor
            //num1 e menor que num
            System.out.println(num2 + " - " + num1 + " - " + num3);

        }else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
            //num3 é o menor
            //num2 e menor que num1
            //num1 e o maior
            System.out.println(num1 + " - " + num2 + " - " + num3);
        }
    }
}
