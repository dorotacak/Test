package Day16;

public class Fibonacci {
    public static void main(String[] args) {
        int count=8;
        int num1=0; int num2=1;

        for (int i=1; i<count; i++) {
            System.out.print(num2 + " ");
            int sumOfTwo=num1+num2;
            num1=num2;
            num2=sumOfTwo;

        }
    }


}
