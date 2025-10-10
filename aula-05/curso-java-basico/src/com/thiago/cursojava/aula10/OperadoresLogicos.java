package com.thiago.cursojava.aula10;

public class OperadoresLogicos {
    public static void main(String[] args) {
        int value1 = 1;
        int value2 = 2;
        boolean result1 = (value1 == 1) && (value2 == 2);
        boolean result2 = (value1 == 1) || (value2 == 3);
        boolean result3 = (value1 >= 11) || (value2 == 3);

        System.out.println("Value1 is 1 AND Value2 is 2 = result is:" + result1); //true
        System.out.println("Value1 is 1 OR Value2 is 2 = result is:"  + result2); //true
        System.out.println("Value1 is 1 OR Value2 is 2 = result is:"  + result3); //false

        boolean verdadeiro = true;
        boolean falso = false;

        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);

    }
}
