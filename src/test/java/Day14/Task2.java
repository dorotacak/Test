package Day14;

public class Task2 {
    public static void main(String[] args) {
love6(6,4);
love6(4,5);
    }

    public static void love6(int num1, int num2) {
        if (num1 == 6 || num2 == 6 || num1 + num2 == 6 || num1 - num2 == 6) {
            System.out.println(true);

        } else {
            System.out.println(false);
        }
    }
}