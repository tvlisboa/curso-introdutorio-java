package exercicios3;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Digite um valor do vetor A: " + i);
            vetorA[i] = input.nextInt();
        }

        for(int i = 0; i<vetorB.length; i++){
            System.out.println("Digite um valor do vetor B: " + i);
            vetorB[i] = input.nextInt();
        }

        for(int i = 0; i<vetorC.length; i++){
            vetorC[i] = vetorA[i] * vetorB[i];
        }

        System.out.println("VetorA: ");
        for(int i = 0; i<vetorA.length; i++){
            System.out.print(vetorA[i] + " ");
        }

        System.out.println(" ");
        System.out.println("VetorB: ");
        for(int i = 0; i<vetorB.length; i++){
            System.out.print(vetorB[i] + " ");
        }

        System.out.println(" ");
        System.out.println("VetorC: ");
        for(int i = 0; i<vetorC.length; i++){
            System.out.print(vetorC[i] + " ");
        }
        System.out.println(" ");
    }
}
