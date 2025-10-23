package aula10;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Gerenciamento de DOWNLOADS:");
        System.out.println("----------------------------");

        System.out.println("Informe o TAMANHO do arquivo em MB: ");
        double arquivo = sc.nextDouble();

        System.out.println("Informe a velocidade da sua CONEXAO em MBPS: ");
        double conexao = sc.nextDouble();

        double mediaTempo = arquivo / conexao;

        System.out.println("O tempo estimado de download é ");
        System.out.println(mediaTempo);
        sc.close();
    }
}
