package Day15;

public class Task4Homework {
    public static void main(String[] args) {
        if (isPrime(2)) {
            System.out.println("2 is a prime number");
        } else {
            System.out.println("2 is not a prime number");
        }

    }

    public static boolean isPrime(int number) {

        boolean flag = true;
        if (number == 0 || number == 1) {
            flag = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % 1 == 0) {
                    flag = false;
                    break;
                }


            }

        }
        return flag;
    }
}