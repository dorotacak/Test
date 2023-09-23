package Day13;

public class PassMultipleArguments {
    public static void main(String[] args) {
      Sum(99.5,97,89);
    }
    public static void Sum (double Num1,int Num2,int Num3){
        double Sum=Num1+Num2+Num3;
        System.out.println("The sum is " + Sum);
    }
}
