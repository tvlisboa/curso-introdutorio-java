package aula19;

public class ArrayTemperatura {
    public static void main(String[] args) {

        double[] temperaturas = new double[5];
        temperaturas[0] = 30;
        temperaturas[1] = 31;
        temperaturas[2] = 18;
        temperaturas[3] = 20;
        temperaturas[4] = 24;

        System.out.println("Temperaturas: " + temperaturas[0]);
        System.out.println("Temperaturas: " + temperaturas[2]);
        System.out.println("Temperaturas: " + temperaturas[4]);
        System.out.println("$$$$$$$$$$$$$$$");

        for(int i = 0; i < temperaturas.length; i++){
            System.out.println("Temperaturas : " + temperaturas[i]);
            System.out.println("Temperaturas : " + (i + 1) + " " + temperaturas[i]);
        }
        System.out.println("$$$$$$$$$$$$$$$");
        System.out.println("Tamanho do ARRAY :" + temperaturas.length);
    }
}
