package Day11;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++) {
            if (i==4) {
                continue;

            }
            System.out.println(i);
        } //jeśli  zrobie break zamiast continue to bedzie wynik 1,2,3

    }
}
