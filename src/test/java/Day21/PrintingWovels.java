package Day21;

public class PrintingWovels {
    public static void main(String[] args) {
        String word = "Mercedes";
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' | word.charAt(i)=='e'|word.charAt(i)=='i'|word.charAt(i)=='o'|word.charAt(i)=='u') {
                System.out.println(word.charAt(i));
            }
        }
    }
}