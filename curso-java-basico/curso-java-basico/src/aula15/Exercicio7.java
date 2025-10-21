package aula15;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tres numeros a seguir");
        System.out.println("Primeiro numero");
        double numero1 = sc.nextDouble();

        System.out.println("Segundo numero");
        double numero2 = sc.nextDouble();

        System.out.println("Terceiro numero");
        double numero3 = sc.nextDouble();

        if(numero1 < numero2 && numero1 < numero3){
            System.out.println("O numero informado é menor");
            System.out.println(numero1);
        } else if (numero2 < numero1 && numero2 < numero3) {
            System.out.println("O numero informado é menor");
            System.out.println(numero2);
        }else if (numero3 < numero1 && numero3 < numero2) {
            System.out.println("O numero informado é menor");
            System.out.println(numero3);
        }
        sc.close();
    }
}
