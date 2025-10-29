package aula16;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de entrada: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite outro numero de saida: ");
        double num2 = sc.nextDouble();

        for(double i=num1; i<=num2; i++){
            if( i % 5 == 0){
                continue;
            }
            System.out.println("O valode de I divisivel por 5 é: " + i);
        }
    }
}
