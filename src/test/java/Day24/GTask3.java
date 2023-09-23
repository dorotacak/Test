package Day24;

import java.util.Scanner;

public class GTask3 {
    public static void main(String[] args) {
        Scanner Name=new Scanner(System.in);
        System.out.println("enter the first name");
        String FirstName=Name.next().toLowerCase();
        System.out.println(FirstName);
        System.out.println(("" + FirstName.charAt(0)).toUpperCase()+FirstName.substring(1));
        FirstName=("" + FirstName.charAt(0)).toUpperCase()+FirstName.substring(1);
        System.out.println("enter the last name");
        String LastName=Name.next().toLowerCase();
        System.out.println(LastName);
        LastName=(""+LastName.charAt(0)).toUpperCase()+LastName.substring(1);
        System.out.println((""+LastName.charAt(0)).toUpperCase()+LastName.substring(1));
        System.out.println(FirstName+ " " +LastName);


    }
}
