package com.thiago.cursojava.aula10;

public class OperatesRelational {
    public static void main(String[] args) {
        int value1 = 0;
        int value2 = 1;

        int result = value1 + value2;

        System.out.println("Value 1 == Value 2: " + (value1 == value2));
        System.out.println("Value 1 != Value 2: " + (value1 != value2));
        System.out.println("Value 1 > Value 2: " + (value1 > value2));
        System.out.println("Value 1 >= Value 2: " + (value1 >= value2));
        System.out.println("Value 1 < Value 2: " + (value1 < value2));
        System.out.println("Value 1 <= Value 2: " + (value1 <= value2));
        System.out.println(result);
    }
}
