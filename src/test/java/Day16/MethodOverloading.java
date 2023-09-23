package Day16;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(3, 6, 80));
        System.out.println(sum(90, 56));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
}
