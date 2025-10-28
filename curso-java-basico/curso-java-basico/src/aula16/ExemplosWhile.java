package aula16;

public class ExemplosWhile {
    public static void main(String[] args) {

        int valInicio = 11;
        int valfim = 10;

        System.out.println("Contando até o valor de :" + valfim);

        while(valInicio <= valfim){
            System.out.println("O valor do inicio é : " + valInicio);
            valInicio++;
        }
        System.out.println(valInicio);
    }
}
