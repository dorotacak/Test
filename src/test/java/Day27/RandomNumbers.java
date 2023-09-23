package Day27;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random Tn=new Random();
        int Number=Tn.nextInt(10);
        System.out.println(Number);
        System.out.println(Tn.nextDouble());


    }
}
