package exercicios3;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

         int[] vetorA = new int[3];
         double[] vetorB = new double[vetorA.length];

         for(int i = 0; i<vetorA.length; i++){
             System.out.println("Digite um valor: " + i);
             vetorA[i] = sc.nextInt();
             vetorB[i] = vetorA[i] % 2;
         }

         System.out.println("VetorA: ");
         for(int i = 0; i<vetorA.length; i++){
             System.out.println(vetorA[i]);
         }

         System.out.println(" ");
         System.out.println("VetorB: ");
         for(int i = 0; i<vetorB.length; i++){
             System.out.println(vetorB[i]);
         }
         System.out.println(" ");
    }
}
