package aula14;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade a seguir:");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Usuario é maior de idade");
        }else{
            System.out.println("Usuario é menor de idade");
        }
    }
}
