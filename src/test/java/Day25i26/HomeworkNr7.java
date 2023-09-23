package Day25i26;

public class HomeworkNr7 {
    public static void main(String[] args) {
        int total = 0;
        String letters="abcdefg";

        total+=letters.substring(1,2).length(); //1
        total+=letters.substring(6,6).length();//0
        total+=letters.substring(5,6).length();//1
        System.out.println(total);
    }
}
