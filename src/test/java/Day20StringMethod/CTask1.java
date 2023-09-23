package Day20StringMethod;

public class CTask1 {
    public static void main(String[] args) {

        String word = "Audi";
        if (word.charAt(0) == 'A') {
            System.out.println("A is a first letter.");
        } else {
            System.out.println("It's not right.");

        }


        String word3 = "Citroen";

        if (word3.charAt(2) == 't') {
            System.out.println("T is second letter");
        } else {
            System.out.println("T is not a second letter");

        }
        String word4 = "Citroen";
        if (word4.charAt(3) == 'r') {
            System.out.println("R is a third letter");
        } else {
            System.out.println("R is not a third letter");
        }

    }

}


