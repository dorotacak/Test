package Day25i26;

public class EQuestion2 {
    public static void main(String[] args) {
        String Name1="Hi";
        String Name2="Bye";
        System.out.println(makeAbba(Name1,Name2));
        System.out.println(makeAbba("Yo","Alice"));
        System.out.println(makeAbba("What","Up"));
    }public static String makeAbba(String a,String b){
        return a+b+b+a;
    }
}
