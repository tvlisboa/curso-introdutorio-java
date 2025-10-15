package exercicios2;

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a temperatura a seguir em Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        double celsius = ( 5 * (fahrenheit - 32) / 9 ) ;

        System.out.println("A temperatura informada em CELSIUS: " + celsius);
        sc.close();
    }
}
