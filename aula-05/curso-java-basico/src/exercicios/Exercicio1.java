package exercicios;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite primeiro numero a seguir: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite segundo numero a seguir: ");
        double num2 = sc.nextDouble();

        if (num1 > num2){
            System.out.println("O numero 1 informado é maior:" + num1);
        }else if (num1 < num2){
            System.out.println("O numero 2 informado é maior:" + num2);
        }else if (num1 == num2){
            System.out.println("Os numeros informados sao iguais:" );
        }
    }
}
