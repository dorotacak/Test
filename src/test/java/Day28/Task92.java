package Day28;

import java.util.Arrays;

public class Task92 {
    public static void main(String[] args) {
        int[]Numbers=new int[10];
        for(int i=0; i<Numbers.length; i++){
            Numbers[i]=i+1;

        }
        for(int i=0; i<Numbers.length; i++){
            System.out.println(Numbers[i]*19);
        }

    }
}
