package Day25i26;

public class QuestionHomework10 {
    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));

    }public static Boolean frontAgain(String word){
        return (word.substring(0,2)).equals(word.substring(word.length()-2));

    }
}
