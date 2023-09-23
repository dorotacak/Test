package Day20StringMethod;

public class FPrintingEachCharacter {
    public static void main(String[] args) {
        String str = "Cybertek School";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));// bez "ln" cybertek school bedzie w 1 linii
        }
    }
}

