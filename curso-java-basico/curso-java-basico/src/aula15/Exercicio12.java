package aula15;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionario.");
        String nomeFunc = sc.nextLine();

        System.out.println("Informe o setor do funcionario.");
        String setorFunc = sc.nextLine();

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

        double percentIr = 0;

        if(salarioBruto <= 900.00){
            percentIr = 0;
        }else if(salarioBruto > 900.00 && salarioBruto <= 1500.00){
            percentIr = 5;
        }else if(salarioBruto > 1500.00 && salarioBruto <= 2500.00){
            percentIr = 10;
        } else if (salarioBruto > 2500.00) {
            percentIr = 20;
        }

        double impostoRenda = (salarioBruto / 100) * percentIr;
        double inns = (salarioBruto / 100) * 10;
        double sindicato = (salarioBruto / 100) * 3;
        double fgts = (salarioBruto / 100) * 11;
        double totalDesconto = impostoRenda + inns + sindicato;
        double salarioLiquido = salarioBruto - totalDesconto;


        System.out.println("SISTEMA DEMONSTRATIVO");
        System.out.println("##############################");
        System.out.println("Nome funcionario: " + nomeFunc);
        System.out.println("Setor funcionario: " + setorFunc);
        System.out.println("Salario bruto do funcionario: "  + salarioBruto);
        System.out.println("Percentual de contribuicao IR: " + percentIr + " % ");
        System.out.println("Total desconto IR: " + impostoRenda);
        System.out.println("Desconto INSS: " + inns);
        System.out.println("Desconto SINDICATO: " + sindicato);
        System.out.println("Total de descontos aplicado: " + totalDesconto);
        System.out.println("Salario liquido atual: " + salarioLiquido);
        System.out.println("##############################");
        sc.close();
    }
}
