package aula16;

public class LoopWhile {
    public static void main(String[] args) {
        int count = 1;
        int max = 10;

        System.out.println("Contador até o " + max);
        while( count <= max){
            System.out.println("O valor de i é : " + count);
            count++;
        }
        System.out.println(count);
    }
}
