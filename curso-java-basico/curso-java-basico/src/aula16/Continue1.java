package aula16;

import java.util.Scanner;

public class Continue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();

        for (double i = valor1; i <= valor2; i++) {
            if(i % 2 == 0){
                continue;
            }else {
                System.out.println(i);
                System.out.println("Numero informado é impar:");
            }
        }
    }
}
