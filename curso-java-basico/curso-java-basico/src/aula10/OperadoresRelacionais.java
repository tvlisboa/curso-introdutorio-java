package aula10;

public class OperadoresRelacionais {
    public static void main(String[] args) {
        int value1 = 3;
        int value2 = 2;

        int result = value1 + value2;

        System.out.println("Value 1 == Value 2: " + (value1 == value2));    //false
        System.out.println("Value 1 != Value 2: " + (value1 != value2));    //true
        System.out.println("Value 1 > Value 2: " + (value1 > value2));      //false
        System.out.println("Value 1 >= Value 2: " + (value1 >= value2));    //false
        System.out.println("Value 1 < Value 2: " + (value1 < value2));      //true
        System.out.println("Value 1 <= Value 2: " + (value1 <= value2));    //true
        System.out.println(result);
    }
}
