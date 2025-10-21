package aula15;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o preco do produto 1");
        double preco1 = sc.nextDouble();

        System.out.println("Digite o preco do produto 2");
        double preco2 = sc.nextDouble();

        System.out.println("Digite o preco do produto 3");
        double preco3 = sc.nextDouble();

        if(preco1 < preco2 && preco1 < preco3) {
            System.out.println("Comprar o produto 1");
        }else if(preco2 < preco1 && preco2 < preco3) {
            System.out.println("Comprar o produto 2");
        }else if(preco3 < preco1 && preco3 < preco2) {
            System.out.println("Comprar o produto 3");
        }
        sc.close();
    }
}
