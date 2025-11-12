package aula16;

import java.util.Scanner;

public class Break3 {
    public static void main(String[] args) {

        /**
         * Solicitar dois numeros ao ususario
         * vai fazer um for para varrer e comparar os numeros
         * vai imprimir os numeros ate
         * achar o parametro que e divisel
         * e sai do loop
         */

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero inical: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite um numero final: ");
        double num2 = sc.nextDouble();

        for(double i = num1; i<=num2; i++){
            System.out.println(i);
            if(i % 6 == 0){
                System.out.println("Valores divisiveis: ");
                System.out.println(i);
                break;
            }
        }
    }
}
