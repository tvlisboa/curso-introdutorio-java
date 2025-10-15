package com.thiago.cursojava.aula10;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        boolean result1 = (value1 == 1) && (value2 == 2);
        boolean result2 = (value1 == 1) || (value2 == 3);
        boolean result3 = (value1 >= 11) || (value2 == 3);

        System.out.println("Valor 1 é igual a 1 e valor 2 é igual a 2 = result: " + result1); //true
        System.out.println("Valor 1 é igual a 1 e valor 2 é igual a 3 = result: " + result2); //true
        System.out.println("Valor 1 é maior ou igual a 11 ou o valor 2 é igual a 3 = result: " + result3); //false

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);  //false
        System.out.println(falso && verdadeiro);  //false
        System.out.println(verdadeiro || falso);  //true
        System.out.println(falso || verdadeiro);  //true
        System.out.println(verdadeiro ^ falso);   //true
        System.out.println(!verdadeiro && falso); //false
        System.out.println(verdadeiro && !falso); //true
    }
}
