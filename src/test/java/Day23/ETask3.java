package Day23;

import java.util.Scanner;

public class ETask3 {
    public static void main(String[] args) {
        Scanner name1 = new Scanner(System.in);
        System.out.println("enter UserName");
        String UserName = name1.nextLine();
        System.out.println("Password");
        String Password = name1.nextLine();
        String UseName1 = "dorota";
        String Password1 = "24689";
        if (UserName.equals("") && Password.equals("")) {
            System.out.println("Username and Password can not be empty");

        } else if (UserName.equals("") && !Password.equals("")) {
            System.out.println("Username can not be empty");


        } else if (!UserName.equals("") && Password.equals("")) {
            System.out.println("Password can not be empty");

        } else if (!UserName.equals(UseName1) && Password.equals(Password1)) {
            System.out.println("Username is not valid");

        } else if (UserName.equals(UseName1) && Password.equals(Password1)) {
            System.out.println("Usee logged in succesfully");


        }
    }
}