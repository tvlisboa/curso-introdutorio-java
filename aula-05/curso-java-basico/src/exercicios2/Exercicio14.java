package exercicios2;

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o tamanho do arquivo: ");
        double sizeFile = sc.nextDouble();

        System.out.println("Informe a velocidade da conexão: ");
        double vel = sc.nextDouble();

        double tempoAproximado = sizeFile / vel;

        System.out.println("O tempo estimado para donwload é:" );
        System.out.println(tempoAproximado);
        System.out.println("Minutos aproximadamente");
    }
}
