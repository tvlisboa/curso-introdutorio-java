package aula15;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe nome do funcionario.");
        String nome = sc.nextLine();

        System.out.println("Informe o salario do funcionario.");
        double salarioAtual = sc.nextDouble();
        double percentual = 0;

        if(salarioAtual <= 280.0){
            percentual = 20;
        }else if (salarioAtual > 280 && salarioAtual <= 700) {
            percentual = 15;
        }else if (salarioAtual > 700 && salarioAtual <= 1500) {
            percentual = 10;
        } else if (salarioAtual > 1500) {
            percentual = 5;
        }

        double aumento = (salarioAtual / 100 ) * percentual;
        double salarioAjustado = salarioAtual + aumento;

        System.out.println("O funcionario: " + nome);
        System.out.println("Com o salario informado antigo: " + salarioAtual);
        System.out.println("Recebeu o aumento de:" + percentual + "%");
        System.out.println("O aumento foi: " + aumento);
        System.out.println("O salario atual: " + salarioAjustado);
    }
}
