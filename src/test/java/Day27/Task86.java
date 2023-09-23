package Day27;

import java.util.Scanner;

public class Task86 {
    public static void main(String[] args) {
        Scanner Dorota=new Scanner(System.in);

        String[]Months=new String[12];
        Months[0]="January";
        Months[1]="February";
        Months[2]="March";
        Months[3]="April";
        Months[4]="May";
        Months[5]="June";
        Months[6]="July";
        Months[7]="August";
        Months[8]="September";
        Months[9]="October";
        Months[10]="November";
        Months[11]="December";

        System.out.println("What is the index number");
        int indexNumber=Dorota.nextInt();
        System.out.println("The month name is " + Months[indexNumber]);




    }
}
