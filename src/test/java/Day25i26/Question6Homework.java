package Day25i26;

public class Question6Homework {
    public static void main(String[] args) {
        //String str="SENEMAKTURK";//
        //System.out.println(str.substring(0,5));//
        System.out.println(withoutEnd("Hello"));
        System.out.println(withoutEnd("Java"));
        System.out.println(withoutEnd("coding"));

    }

    public static String withoutEnd(String word) {
        return word.substring(1, word.length() - 1);


    }
}