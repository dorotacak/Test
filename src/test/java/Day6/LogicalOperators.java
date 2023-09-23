package Day6;

public class LogicalOperators {
    public static void main(String[] args) {
        // Logical operators have two boolean operands that yield a boolean result

        // &,&& logical AND   if both of them are true it returns true, otherwise false
        // |, || logical OR   if  both of them are false it returns false otherwise true

        int i1=5;
        int i2=10;
        int i3=20;
        int i4=20;
        boolean result =( i1==i2)&&(i3==i4);
        System.out.println(result);

        boolean result2=(i1==i2)||(i3==i4);
        System.out.println(result2);

        int applesCount=20;
        int orangesCount=30;
        int pearsCount=30;
        boolean comp=applesCount<orangesCount||orangesCount>=pearsCount;

        String OutsideWeather="shinny";
        int degree=70;
        boolean compl=(!(OutsideWeather=="rainy"||degree==70));

        boolean x=true;
        boolean z=true;
        int y=20;
        x=(y!=10)&&(z=false);
        System.out.println(x);

        int b=2;
        boolean res=++b==2||--b==2&&--b==2;
        System.out.println(res);





    }
}
