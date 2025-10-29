package aula16;

public class Label {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++){
            rotulo1:{
                rotulo2:{
                    rotulo3:{
                        System.out.println("Rotulo 3: ");
                        System.out.println(i);
                    }
                    System.out.println("Rotulo 2: ");
                    System.out.println(i);
                }
                System.out.println("Rotulo 1: ");
                System.out.println(i);
            }
            System.out.println(i);
        }
    }
}
