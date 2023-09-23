package Day15;

import Day7.Age;

public class Task2 {
    public static void main(String[] args) {
        yearsUntilRetirement("Kate", 1980);
    }
    public static int CalculateAge (int yearBirth){
        return 2023-yearBirth; // age
    }
    public static void yearsUntilRetirement (String Name, int Year){
        int Age=60-CalculateAge(Year);
        System.out.println(Name + " retires in " + Age + " years");
    }


}
