package exercicios4;

public class Exercicio4 {
    public static void main(String[] args) {

        double popA = 80000;
        double popB = 200000;
        double cont = 0;

        while (popA < popB) {

            popA += (popA / 100) * 3.5;
            popB += (popB / 100) * 1.5;
            cont++;
        }
        System.out.println("A populacao da cidade A será igual: " + popA);
        System.out.println("A populcao da cidade B será igual: " + popB);
        System.out.println("Quantidade de anos : " + cont + "anos.");
    }
}
