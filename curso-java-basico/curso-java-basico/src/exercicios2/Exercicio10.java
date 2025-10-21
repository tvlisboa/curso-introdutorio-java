package exercicios2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura a seguir em CELSIUS:");
        double celsius = sc.nextDouble();

        double farenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura informada em Farenheit: " + farenheit);
        sc.close();
    }
}
