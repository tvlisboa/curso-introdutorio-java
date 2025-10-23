package aula10;

public class ReferenceType {
    public static void main(String[] args) {

        /**
         * O valor de Y na verdade
         * é uma copia do valor
         * mesmo alterando o valor de
         * x, y ainda mantem como copia da
         * primeira definicao
         */

        int x = 32;
        int y = x;


        System.out.println(x);
        System.out.println(y);

        x = 21;

        System.out.println(x);
        System.out.println(y);

    }
}
