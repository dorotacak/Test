package Day6;

public class Task1 {
    public static void main(String[] args) {
        int a=50;
        int result= --a + a++ + a-- + a++;

        // a in memory 50    49    50   49  50
        // result      49    49    50   49
        System.out.println(result);
        System.out.println(a);
    }
}
