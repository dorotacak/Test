package Day27;

import java.util.Scanner;

public class Task87 {
    public static void main(String[] args) {
        String[]Days=new String[7];
        Days[0]="Monday";
        Days[1]="Tuesday";
        Days[2]="Wednesday";
        Days[3]="Thursday";
        Days[4]="Friday";
        Days[5]="Saturday";
        Days[6]="Sunday";

        Scanner Pytanie=new Scanner(System.in);
        System.out.println("Whats is the day of index");
        int indexNumber=Pytanie.nextInt();

        System.out.println("Today is " + Days[indexNumber]);
    }
}
