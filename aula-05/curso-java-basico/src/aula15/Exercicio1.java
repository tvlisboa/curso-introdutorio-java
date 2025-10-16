package aula15;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira dois numeros a seguir.");
        System.out.print("Digite um numero aa seguir: ");
        int num1 = sc.nextInt();

        System.out.print("Digite outro numero a seguir: ");
        int num2 = sc.nextInt();

        if(num1 > num2) {
            System.out.println("O numero informado " + num1);
            System.out.println("É maior");
        } else if(num2 > num1) {
            System.out.println("O numero informado " + num2);
            System.out.println("É maior.");
        }
        sc.close();
    }
}
