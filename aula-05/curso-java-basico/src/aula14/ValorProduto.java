package aula14;

import java.util.Scanner;

public class ValorProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do Produto: ");
        double valorProd = sc.nextDouble();

        if(valorProd <= 10){
            System.out.println("Abaixo do preco.");

        } else if (valorProd > 10 && valorProd < 15) {
            System.out.println("Um pouco acima do preco");

        } else if (valorProd >= 15 && valorProd < 25) {
            System.out.println("Produto acima do preco");

        } else if (valorProd >= 25 && valorProd < 50) {
            System.out.println("Acima do preco nos ultimos 30 dias");

        }else {
            System.out.println("Aguardar promocao.");
        }

        System.out.println("O valor informado do produto é: ");
        System.out.println(valorProd);
        sc.close();
    }
}
