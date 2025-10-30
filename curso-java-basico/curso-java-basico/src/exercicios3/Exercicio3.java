package exercicios3;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Digite um valor: " + i);
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] * vetorA[i];
        }
        System.out.println("VETOR A: ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }
        System.out.println(" ");
        System.out.println("VETOR B: ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }
        System.out.println(" ");
    }
}
