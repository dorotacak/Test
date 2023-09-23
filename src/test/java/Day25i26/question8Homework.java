package Day25i26;

public class question8Homework {
    public static void main(String[] args) {
        System.out.println(left2("Hello"));
        System.out.println(left2("Java"));
        System.out.println(left2("Hi"));
    }public static String left2(String a){
        return a.substring((2)).concat(a.substring(0,2));

    }
}
