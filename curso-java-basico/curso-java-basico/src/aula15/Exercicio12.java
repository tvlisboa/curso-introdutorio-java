package aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionario.");
        String nomeFunc = sc.nextLine();

        System.out.println("Horas trablhadas diaramente.");
        double horasTrabalhadas = sc.nextDouble();

        System.out.println("Dias trabalhado na semana.");
        int diasTrabalhados = sc.nextInt();

        System.out.println("Semanas trabalahadas.");
        int semanasTrabalhadas = sc.nextInt();

        System.out.println("Valor por hora trablhada.");
        double valorPorHora = sc.nextDouble();

        double valorDiaria = (horasTrabalhadas * valorPorHora );
        double valorSemana = valorDiaria * diasTrabalhados;
        double salarioBruto = valorSemana * semanasTrabalhadas;

        double descontoIr = 0;

        if(salarioBruto <= 900){
            descontoIr = 0;
        }else if(salarioBruto > 900 && salarioBruto <= 1500){
            descontoIr = 5;
        }else if(salarioBruto > 1500 && salarioBruto <= 2500){
            descontoIr = 10;
        } else if (salarioBruto > 2500) {
            descontoIr = 20;
        }

        double impostoRenda = (salarioBruto / 100) * descontoIr;
        double inns = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) - 11;
        double totalDesconto = impostoRenda + inns;
        double salarioFinal = salarioBruto - totalDesconto;
    }
}
