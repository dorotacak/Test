package Day4;

public class Contribution {
    public static void main(String[] args) {
        //This program calculates the amount of pay that will be
        //contributed to a retirement plan if 5 %, 8% or 10% of monthly pay is withheld.
        //variables to hold the monthly pay and the amount of the contribution.
        double monthlyPay=2400;
        double contribution;

        //calculate and display 5% contribution
        contribution=0.05* monthlyPay;
        System.out.println("5 percent is $" +contribution + " per month.");
        // 8 and 10 homework
        contribution=0.08* monthlyPay;
        System.out.println("8 percent is $" +contribution + " per month.");
        contribution=0.1* monthlyPay;
        System.out.println("10 percent is $" +contribution + " per month. ");
        }

    }

