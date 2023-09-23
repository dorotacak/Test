package Day13;

public class CreditCardMethod {
    public static void main(String[] args) {

        int salary = 1000;
        int creditRate = 10;
        if (salary > 2000 & creditRate > 7) {
            qualify();

        } else {
            noQualify();
        }
    }

    public static void qualify() {
        System.out.println("Congrat you are qualified for the credit");
    }

    public static void noQualify() {
        System.out.println("Im sorry you are not qualified for the credit");
    }
}
