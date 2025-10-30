package aula19;

public class ArrayTimes {
    public static void main(String[] args) {

        String[] times = new String[5];
        times[0] = "FLAMENGO";
        times[1] = "FLUMINENSE";
        times[2] = "VASCO";
        times[3] = "BOTAFOGO";
        times[4] = "AMERICA";

        System.out.println("Time na posicao : " + times[0]);
        System.out.println("Time na posicao : " + times[4]);
        System.out.println("O tamanho do array informado é: " + times.length);

        for (int i = 0; i < times.length; i++) {
            System.out.println("Os times localizados dentro do array sao: " + (i + 1) + " " +  times[i]);
        }

        for(String time : times) {
            System.out.println(time);
        }
    }
}
