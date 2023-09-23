package Day10;

public class Practice4 {
    public static void main(String[] args) {
        int sumEven = 0;
        int oddSum = 0;
        for (int x = 1; x <= 100; x++) {
            if (x % 2 == 0) {
                sumEven = sumEven + x;
            } else {
                oddSum = oddSum + x;
            }
        }
            System.out.println(sumEven);
            System.out.println(oddSum);
        }

    }
