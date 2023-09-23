package Day29;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    int[]Numbers=new int[4];
    getValues(Numbers);
    for (int value:Numbers){
        System.out.println(value);
    }

}
public static void getValues(int [] number){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a series of " + number.length + " Numbers");
    for(int i=0; i<number.length; i++){
        System.out.println("Enter number " + (i+1) + ":");
        number[i]=sc.nextInt();
    }

}
}
