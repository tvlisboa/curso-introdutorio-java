package aula19;

public class ArrayPerfumes {
    public static void main(String[] args) {

        String[] perfumes = new String[5];
        perfumes[0] = "212 MAN";
        perfumes[1] = "BVLGARI MAN";
        perfumes[2] = "DIOR SAVAGE";
        perfumes[3] = "MYSELF";
        perfumes[4] = "TOM FORD";

        System.out.println("Prfume na posicao: " + perfumes[3]);
        System.out.println("Prfume na posicao: " + perfumes[0]);
        System.out.println("O tamanho do array informado é: " + perfumes.length + " posicao");

        for(int count = 0; count < perfumes.length; count++){
            System.out.println("Perfume na posicao: " + (count + 1) + " " + perfumes[count]);
        }
        System.out.println("Acima listado todos os perfumes do array");
    }
}
