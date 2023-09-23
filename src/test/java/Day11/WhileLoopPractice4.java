package Day11;

public class WhileLoopPractice4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (i % 3 == 0) {
                sum = sum +i;

            }

        }
        System.out.println("sum=" + sum);
    }
} //pokaz liczby ktore dziela sie przez 3 bez reszty i zsumuj je