package Day25i26;

public class Question5Homework {
    public static void main(String[] args) {
        String Word="WooHoo";
        System.out.println(firstHalf(Word));
        System.out.println(firstHalf("HelloThere"));
        System.out.println(firstHalf("abcdef"));


    }public static String firstHalf(String word){
        int x=word.length()/2;//int x bo tutaj wynikiem będzie na pewno liczba
        return word.substring(0,x);//pierwsza metoda
        //return word.substring(0,word.length()/2);/ druga metoda

    }
}
