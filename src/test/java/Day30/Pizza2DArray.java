package Day30;

import java.util.Arrays;

public class Pizza2DArray {
    public static void main(String[] args) {
        String[][] pizza = {{"pineapple", "pepperoni"},
                {"anchovis", "mushroom", "olives"},
                {"4 cheese"},
                {"chicken", "tomatoes", "onion"},
                {"green peppers", "brokoli", "spinach"}

        };
        for (int row = 0; row < pizza.length; row++) {
            for (int column = 0; column < pizza[row].length; column++) {
                System.out.println(pizza[row][column]);

                System.out.println(Arrays.toString(pizza[3]));
                System.out.println(pizza[4][1]);
            }

        }

    }
}
