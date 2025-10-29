package aula16;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero de inicio: ");
        double inicio = sc.nextDouble();

        System.out.println("Digite outro numero de saida: ");
        double saida = sc.nextDouble();

        for(double i=inicio; i<=saida; i++){
            System.out.println(i);
            if(i % 3 == 0){
                System.out.println("O primeiro numero divisivel por 3 é: " + i);
                break;
                }
            }
        }
    }
