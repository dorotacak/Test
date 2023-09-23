package Day8;

public class example5 {
    public static void main(String[] args) {
        int grade=96;
        if (grade>90) {
            System.out.println("A plus");
        } else if (grade<90 & grade>80) {
            System.out.println("A");
        } else if (grade>70&grade<80) {
            System.out.println("B");
        } else if (grade>60&grade<70) {
            System.out.println("C");
        } else if (grade>50&grade<60) {
            System.out.println("D");
        } else if (grade<50) {
            System.out.println("Failed");

        }
        else{
            System.out.println("it is crazy");
        }

    }
    }

