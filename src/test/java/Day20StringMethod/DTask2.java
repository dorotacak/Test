package Day20StringMethod;

public class DTask2 {
    public static void main(String[] args) {
        String word2 = "civic";
        if (word2.charAt(0) == word2.charAt(word2.length() - 1)) {
            System.out.println("The same");
        } else {
            System.out.println("Not the same");
        }

        String word1 = "mercedes";
        if (word1.charAt(0) == word1.charAt(word1.length() - 1)) {
            System.out.println("good");

        } else {
            System.out.println("not good");
        }
    }
}