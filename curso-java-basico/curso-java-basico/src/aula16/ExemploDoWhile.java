package aula16;

public class ExemploDoWhile {
    public static void main(String[] args) {

        int valInicio = 11;
        int valFim = 10;

        do{
            valInicio++;
            System.out.println("O valor do inicio é: " + valInicio);
        }while(valInicio <= valFim);

        System.out.println(valInicio);
    }

}
