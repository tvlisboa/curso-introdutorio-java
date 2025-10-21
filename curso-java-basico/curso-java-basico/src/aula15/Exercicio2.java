package aula15;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero a seguir: ");
        double number = sc.nextDouble();

        if(number < 0){
            System.out.println("O numero informado é negativo");
        } else{
            System.out.println("O numero informado é positivo");
        }
        sc.close();
    }
}
