package Day13;

public class TaskMultiArguments {
    public static void main(String[] args) {
       Salary (39.5,150);
    }
    public static void Salary (double hours,double pay){
        double salary=hours*pay;
        System.out.println("Salary is " + salary);
    }
}
