package aula16;

import java.util.Scanner;

public class Continue_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de entrada: ");
        double inicio = sc.nextDouble();

        System.out.println("Digite um numero de entrada: ");
        double maximo = sc.nextDouble();

        for (double i = inicio; i <= maximo; i++) {
            if(i % 7 == 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
