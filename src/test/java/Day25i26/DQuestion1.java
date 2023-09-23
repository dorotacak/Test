package Day25i26;

public class DQuestion1 {
    public static void main(String[] args) {
        String Name="Bob";
        System.out.println(helloName("Bob"));
        System.out.println(helloName("x"));
        System.out.println(helloName("Alice"));
    }public static String helloName(String Name1){
        return "hello ".concat(Name1).concat("!");

    }
}
