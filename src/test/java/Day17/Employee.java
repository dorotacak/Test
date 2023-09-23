package Day17;

public class Employee {
    String name;
    String jobTitle;
    double salary;
    public void work(){
        System.out.println(name +" " + jobTitle + " is working");
        System.out.println(name + " is tired");
    }
    public void attendMeeting(){
        System.out.println(jobTitle + " attends a meeting");
    }
    public void introduce(){
        System.out.println(salary + " is introduced");
    }
}
