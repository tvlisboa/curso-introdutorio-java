package aula15;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o lado 1");
        double lado1 = sc.nextDouble();

        System.out.println("Insira o lado 2");
        double lado2 = sc.nextDouble();

        System.out.println("Insira o lado 3");
        double lado3 = sc.nextDouble();

        if(((lado1 + lado2) > lado3) ||
                ((lado1 + lado3) > lado2) ||
                ((lado2 + lado3) > lado1)) {

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("Escaleno");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Isoceles");
            }
        }else {
            System.out.println("Os lados informados nao forma um triangulo");
        }
        sc.close();
    }
}
