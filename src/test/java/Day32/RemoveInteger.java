package Day32;

import java.util.ArrayList;

public class RemoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> Numbers = new ArrayList<Integer>();
        System.out.println(Numbers.size());
        System.out.println(Numbers.isEmpty());
        Numbers.add(100);
        Numbers.add(110);
        Numbers.add(3);
        Numbers.add(119);
        Numbers.add(369);
        Numbers.add(97);


        System.out.println(Numbers);
        Numbers.remove(3);
        System.out.println(Numbers);
        Numbers.remove(2);
        System.out.println(Numbers);






    }
}

