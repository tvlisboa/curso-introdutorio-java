package aula16;

import java.util.Scanner;

public class BreakContinue_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double inicio = sc.nextDouble();

        System.out.println("Digite outro numero: ");
        double maximo = sc.nextDouble();

        for(double i = inicio; i <= maximo; i ++){
            if(i % 7 == 0){
                System.out.println("Numero é divisivel por 7: ");
                System.out.println(i);
                break;
            }
        }
    }
}
