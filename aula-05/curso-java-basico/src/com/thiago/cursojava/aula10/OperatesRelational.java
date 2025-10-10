package com.thiago.cursojava.aula10;

public class OperatesRelational {
    public static void main(String[] args) {
        double value1 = 1.235;
        double value2 = 3.1451;

        double result = value1 + value2;

        System.out.println("Value 1 == Value 2: " + (value1 == value2));    //false
        System.out.println("Value 1 != Value 2: " + (value1 != value2));    //true
        System.out.println("Value 1 > Value 2: " + (value1 > value2));      //false
        System.out.println("Value 1 >= Value 2: " + (value1 >= value2));    //false
        System.out.println("Value 1 < Value 2: " + (value1 < value2));      //true
        System.out.println("Value 1 <= Value 2: " + (value1 <= value2));    //true
        System.out.println(result);
    }
}
