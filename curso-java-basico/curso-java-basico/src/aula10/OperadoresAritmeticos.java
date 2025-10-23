package aula10;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        /**
         * Usando o operador de soma
         * para somar dois valores
         */

        //3
        int result = 2 + 1;
        System.out.println(result);

        //2
        result = result - 1;
        System.out.println(result);

        //4
        result = result * 2;
        System.out.println(result);

        //2
        result = result / 2;
        System.out.println(result);

        //10
        result = result + 8;
        System.out.println(result);

        //3
        result = result % 7;
        System.out.println(result);

        /**
         * Usando o operador soma
         * para concatenar duas strings
         */

        String firstString = "Exercicio sobre operadores logicos";
        String secondString = "Concatenando as strings declaradas";
        String lastString = firstString + " " + secondString;
        System.out.println(lastString);

        /**
         * result = result + 1 é a mesma coisa que
         * result ++
         */

        //incrementos
        result = result + 1;
        System.out.println(result);

        result ++;
        System.out.println(result);

        /**
         * result = result - 1 é a mesma coisa que
         * result --
         */

        //decrementos
        result = result - 1;
        System.out.println(result);

        result --;
        System.out.println(result);

        System.out.println(result);

        result --;
        System.out.println(result);
    }
}
