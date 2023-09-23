package Day15;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(lastDigit(15, 5));
        System.out.println(lastDigit(17, 5));
    }
    public static boolean lastDigit(int num1, int num2){
       if (num1%10==num2%10) {
           return true;
       }else{
           return false;

       }
    }

}
