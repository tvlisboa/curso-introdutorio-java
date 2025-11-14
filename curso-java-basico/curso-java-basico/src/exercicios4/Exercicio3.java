package exercicios4;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean infoValidas = false;
        String nome;
        int idade;
        double salario;
        String genero;
        String estadoCivil;

        do{
            System.out.println("Digite seu nome: ");
            nome = sc.next();

            if(nome.length() < 3){
                infoValidas = false;
                System.out.println("Nome invalido");
                System.out.println("O campo Informado precisa ter mais de 3 caracteres");
            }else{
                infoValidas = true;
                System.out.println("Nome valido");
                System.out.print("Nome informado do usuario foi: " + nome);
            }

        }while(!infoValidas);

        infoValidas = false;

        do{
            System.out.println("Digite sua idade: ");
            idade = sc.nextInt();

            if(idade < 0 || idade > 100){
                infoValidas = false;
                System.out.println("Idade invalida");
                System.out.println("A idade deve ser entre 0 anos e 100 anos");
            }else{
                infoValidas = true;
                System.out.println("Idade validda");
                System.out.print("A idade informada foi: " + idade);
            }
        }while(!infoValidas);

        infoValidas = false;

        do{
            System.out.println("Informe seu salario: ");
            salario = sc.nextDouble();

            if(salario <= 0){
                infoValidas = false;
                System.out.println("Salario invalido");
                System.out.println("O valor do salario deve ser maior do que zero.");
            }else{
                infoValidas = true;
                System.out.println("Salario valido");
                System.out.print("O salario informado foi: " + salario);
            }
        }while(!infoValidas);

        infoValidas = false;

        do{
            System.out.println("Informe o genero do usuario: ");
            genero = sc.next();

            if(genero.equalsIgnoreCase("M") ||
                    genero.equalsIgnoreCase("F")){
                infoValidas = true;
                System.out.println("Genero valido");
                System.out.println("O genero informado do usuario é: " + genero);
            }else{
                infoValidas = false;
                System.out.println("Genero Invalido");
                System.out.print("Digite uma opcao valida - (M) MASCULINO ou (F) FEMININO");
            }
        }while(!infoValidas);

        infoValidas = false;

        do{
            System.out.println("Informe seu estado civil");
            estadoCivil = sc.next();

            if(estadoCivil.equalsIgnoreCase("S")
                    || estadoCivil.equalsIgnoreCase("C")
                    || estadoCivil.equalsIgnoreCase("D")
                    || estadoCivil.equalsIgnoreCase("V")){
                infoValidas = true;
                System.out.println("Estado civil valido");
                System.out.println("O estado civil do usuario é: " + estadoCivil);
            }else{
                infoValidas = false;
                System.out.println("Estado civil Invalido");
                System.out.print("Digite uma opcao valida abaixo - " +
                        "(S) - SOLTEIRO / " +
                        "(C) - CASADO /" +
                        "(D) - DIVORCIADO /" +
                        "(V) - VIUVO");
            }
        }while(!infoValidas);

        System.out.println("Informacoes inseridas pelo usuario");
        System.out.println("Nome do usuario: " + nome);
        System.out.println("Idade do usuario: " + idade);
        System.out.println("Salario do usuario: " + salario);
        System.out.println("Genero do usuario: " + genero);
        System.out.println("Estado civil do usuario: " + estadoCivil);
        System.out.println("Obrigado por utilizar nosso sistema.");
    }
}
