package Day17;

public class EmployeeObject {
    public static void main(String[]arg){
        Employee person1=new Employee();
        Employee person2=new Employee();
       // Employee person3=new Employee();
        person1.salary=9000;
        person1.name="John";
        person1.jobTitle="Director";
        person2.salary=5000;
        System.out.println(person1.name);
        System.out.println(person1.jobTitle);
        System.out.println(person1.jobTitle);
person1.work(); // calling method
person1.attendMeeting();
person2.introduce();
person2.work();

   }


}
