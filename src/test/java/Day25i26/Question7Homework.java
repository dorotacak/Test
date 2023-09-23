package Day25i26;

public class Question7Homework {
    public static void main(String[] args) {
        System.out.println(comboString("Hello","hi"));
        System.out.println(comboString("hi","Hello"));
        System.out.println(comboString("aaa","b"));
    }public static String comboString(String a, String b){
        String newWord;
        if(a.length()>b.length()){
            newWord=b+a+b;  // lub b.concat(a).concat(b) bab

        }else{
            newWord=a+b+a;
        }
        return newWord;

    }

}
