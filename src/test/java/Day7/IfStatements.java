package Day7;

public class IfStatements {
    public static void main(String[] args) {
        // Syntax

        // if ( score >= 50 ) {

        // congratulate();

        // }

        int score=90;
        if (score>=70) {
            System.out.println("Excellent");
        }
        System.out.println("*******");

        int sales=5000;
        double salary=10000;
        double commitionRate;
        if (sales>5000) {
            int bonus =500;
            commitionRate=1.12;
            salary=salary*commitionRate+bonus;

        }
        System.out.println("New Salary : " + salary);

    }
}
