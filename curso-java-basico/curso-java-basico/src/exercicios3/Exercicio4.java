package exercicios3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[5];
        double[] vetorB = new double[vetorA.length];

        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Digite um valor a seguir: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = Math.sqrt(vetorA[i]);
        }
        System.out.println("VETOR A");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        DecimalFormat df = new DecimalFormat("###,###.###");


        System.out.println("VETOR B");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(df.format(vetorB[i]) + " ");
        }
        System.out.println(" ");
    }
}
