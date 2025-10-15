package exercicios2;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do funcionário a seguir: ");
        String nomeFunc = sc.nextLine();

        System.out.println("Setor do funcionárioa: ");
        String nomeSetor = sc.nextLine();

        System.out.println("Informe quantidade de horas trabalhadas diariamente: ");
        double horasDia = sc.nextDouble();

        System.out.println("Informe quantidade de dias trabalhados: ");
        int diasTrab = sc.nextInt();

        System.out.println("Quantidade de semana trabalhada: ");
        int semanaTrab = sc.nextInt();

        System.out.println("Valor hora trabalhada: ");
        double horaTrab = sc.nextDouble();

        double salarioBruto = horasDia * horaTrab * diasTrab * semanaTrab;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoRenda = (salarioBruto / 100) * 11;
        double totalDesconto =  inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDesconto;


        System.out.println("**********************");
        System.out.println("O funcionário :" + nomeFunc);
        System.out.println("Setor: " + nomeSetor);
        System.out.println("Recebe o valor bruto de: $$" + salarioBruto);
        System.out.println("Descontos aplicados no mês: ");
        System.out.println("**********************");
        System.out.println("INSS: " + inss);
        System.out.println("Sindicato: " + sindicato);
        System.out.println("ImpostoRenda: " + impostoRenda);
        System.out.println("TotalDesconto: " + totalDesconto);
        System.out.println("Salario LIQUIDO do funcionario é: " + salarioLiquido);
        System.out.println("**********************");
        sc.close();
    }
}
