package Day19;

import java.util.Scanner;

public class UserInput1 {
    public static void main(String[] args) {
        Scanner Medicine=new Scanner(System.in);
        System.out.println("Medicine in Germany he wants");
        String x=Medicine.nextLine();
        System.out.println(x+ " is happy");

        Scanner Car=new Scanner(System.in);
        System.out.println("I will drive a mercedes.");
        String y=Car.nextLine();
        System.out.println(y + " soon ");

        Scanner House=new Scanner(System.in);
        System.out.println("Leaving in Germany");
        String z=House.nextLine();
        System.out.println("House by the sea");
    }

}
