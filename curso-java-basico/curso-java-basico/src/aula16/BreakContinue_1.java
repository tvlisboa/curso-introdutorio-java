package aula16;

import java.util.Scanner;

public class BreakContinue_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double num1 = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double num2 = sc.nextDouble();

        for(double i=num1; i<=num2; i++) {
            System.out.println(i);

            if(i % 5 == 0){
                System.out.println("Numeros divisiveis : " + num1);
                break;
            }
        }
    }
}
