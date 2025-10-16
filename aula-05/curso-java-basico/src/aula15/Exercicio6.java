package aula15;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Numero 1");
        double numero1 = sc.nextDouble();

        System.out.println("Numero 2");
        double numero2 = sc.nextDouble();

        System.out.println("Numero 3");
        double numero3 = sc.nextDouble();

        if(numero1 > numero2 && numero1 > numero3){
            System.out.println("Numero informado a seguir é o maior");
            System.out.println(numero1);
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("Numero informado a seguir é o maior");
            System.out.println(numero2);
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("Numero informado a seguir é o maior");
            System.out.println(numero3);
        }
        sc.close();
    }
}
