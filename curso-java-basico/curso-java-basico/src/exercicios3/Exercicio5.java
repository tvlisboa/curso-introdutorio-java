package exercicios3;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for(int i = 0; i<vetorA.length; i++){
            System.out.println("Digite um valor: ");
            vetorA[i] = input.nextInt();
            vetorB[i] = vetorA[i] * i;
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
    }
}
