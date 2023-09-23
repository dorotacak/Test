package Day28;

import java.util.Arrays;
import java.util.Random;

public class Task91 {
    public static void main(String[] args) {
        Random Element = new Random();
        int[] Numbers = new int[10];
        /*Numbers[0]=Element.nextInt(100);
        Numbers[1]=Element.nextInt(100);
        Numbers[2]=Element.nextInt(100);
        Numbers[3]=Element.nextInt(100);
        Numbers[4]=Element.nextInt(100);
        Numbers[5]=Element.nextInt(100);
        Numbers[6]=Element.nextInt(100);
        Numbers[7]=Element.nextInt(100);
        Numbers[8]=Element.nextInt(100);
        Numbers[9]=Element.nextInt(100);*/
        //I sposob a ponizej drugi sposob

        for (int i = 0; i < Numbers.length; i++) {
            Numbers[i] = Element.nextInt(100);
        }
        System.out.println(Arrays.toString(Numbers));

    }

}
