package aula16;

import java.util.Scanner;

public class Break1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Pede ao usuario para informar um numero de entrada
         * Pede ao usuario para informar um numero de saida
         * Se o numero informado for divisivel por 5 e igual a 0
         * Imprimi na tela e sai do loop
         */

        System.out.println("Insira um numero inicial: ");
        double num1 = sc.nextDouble();

        System.out.println("Insira um numero final: ");
        double num2 = sc.nextDouble();

        for (double i = num1; i <= num2; i++) {
            if( i % 5 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
