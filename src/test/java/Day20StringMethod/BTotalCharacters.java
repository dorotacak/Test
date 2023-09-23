package Day20StringMethod;

import java.util.Scanner;

public class BTotalCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // ask user

        System.out.println("enter first name"); // write answer
        String firstName = sc.next();
        System.out.println("enter last name");
        String lastName = sc.next();
        System.out.println(firstName.length() + lastName.length());

        Scanner sc1 = new Scanner(System.in);
        System.out.println("write your name");
        String yourName=sc1.next();
        System.out.println("write your last name");
        String yourLast=sc1.next();
        System.out.println(yourLast.length()+yourName.length());

        Scanner sc2=new Scanner(System.in);
        System.out.println("enter car name");
        String car= sc2.next();

        Scanner sc5=new Scanner(System.in);
        System.out.println("Write your birth date");
        String Age=sc5.next();
        System.out.println("Write your birth place");
        String Place= sc5.next();
        System.out.println(Age.length()+Place);






    }
}