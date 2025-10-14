package exercicios;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero a seguir.");
        int n1 =sc.nextInt();

        System.out.println("Digite outro numero a seguir.");
        int n2 =sc.nextInt();

        System.out.println("Digite mais um numero a seguir.");
        int n3 =sc.nextInt();

        if(n1 >= n2 && n1 >= n3){
            System.out.println("Numero 1 e o maior informado");
        }else if(n2 >= n1 && n2 >= n3){
            System.out.println("Numero 2 e o maior informado");
        }else if(n3 >= n1 && n3 >= n2){
            System.out.println("Numero 3 e o maior informado");
        }
    }
}
