package aula17;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nomeUser;
        String sexoUser;
        String estadoCivil;
        int idadeUser;
        double salUser;

        boolean infoValida = false;

        do {
            System.out.println("Digite o nome do usuario: ");
            nomeUser = sc.nextLine();

            if (nomeUser.length() > 3) {
                infoValida = true;
                System.out.println("Nome do usuario é valido");
            } else {
                infoValida = false;
                System.out.println("Nome do usuario nao e valido");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Digite sua idade");
            idadeUser = sc.nextInt();

            if (idadeUser > 0 && idadeUser < 75) {
                infoValida = true;
                System.out.println("A idade do usuario informada é: " + idadeUser);
            } else {
                infoValida = false;
                System.out.println("Idade informada é invalida.");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Informe o salario do usuario");
            salUser = sc.nextDouble();

            if (salUser > 0) {
                infoValida = true;
                System.out.println("O salario do usuario informado: ");
                System.out.println(salUser);
            } else {
                infoValida = false;
                System.out.println("O Salario informado é invalido.");
                System.out.println("O salario precisa ser maior do que ZERO");
            }

        } while (!infoValida);

        infoValida = false;

        do {
            System.out.println("Informe o sexo do usuario");
            sexoUser = sc.next().toUpperCase();

            if(sexoUser.equalsIgnoreCase("M") || sexoUser.equalsIgnoreCase("F")){
                infoValida = true;
                System.out.println("Sexo informado." +sexoUser);
            }else {
                infoValida = false;
                System.out.println("Sexo informado invalido.");
                System.out.println("Precisa ser preenchido com M - Masculino ou F - Feminino");
            }

        }while (!infoValida) ;

        infoValida = false;

            do {
                System.out.println("Informe o estado-civil do usuario");
                estadoCivil = sc.next().toUpperCase();

                if(estadoCivil.equalsIgnoreCase("S - Solteiro")
                        || estadoCivil.equalsIgnoreCase("C - Casado")
                        || estadoCivil.equalsIgnoreCase("D - Divorciado")
                        || estadoCivil.equalsIgnoreCase("V - Viuvo")) {
                    infoValida = true;
                    System.out.println("Estado-civil informado." +estadoCivil);
                }else {
                    infoValida = false;
                    System.out.println("Estado-civil informado." +estadoCivil);
                }

        } while (!infoValida);

            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            System.out.println("Informações inseridas pelo usuario: ");
            System.out.println("Nome do usuario: " + nomeUser);
            System.out.println("Idade do usuario: " + idadeUser);
            System.out.println("Salario do usuario: " + salUser);
            System.out.println("Sexo do usuario: " + sexoUser);
            System.out.println("Estado civil do usuario: " + estadoCivil);
            System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            sc.close();
    }
}