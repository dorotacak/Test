package Day4;

public class Wages {
    public static void main(String[] args) {
        double regularWage;
        double basePay=25;
        double regularHouse=40;
        double overtimeWages;
        double overTimePay=37.5;
        double overTimeHours=10;
        double totalWage;
        regularWage=basePay*regularHouse;
        overtimeWages=overTimePay*overTimeHours;
        totalWage=regularWage+overtimeWages;
        System.out.println("This week my totalWage is " + totalWage + ".");


    }
}
