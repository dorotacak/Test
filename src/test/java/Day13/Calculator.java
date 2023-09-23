package Day13;

public class Calculator {
    public static void main(String[] args) {
     Calculator (87,94,"+");
     Calculator(60,12,"/");
     Calculator (79,99,"*");
    }
    public static void Calculator(int Num1,int Num2, String Operator){
        switch (Operator){
            case "+":
                System.out.println(Num1+Num2);
                break;
            case "-":
                System.out.println(Num1-Num2);
                break;
            case "*":
                System.out.println(Num1*Num2);
                break;
            case "/":
                System.out.println(Num1/Num2);
                break;


        }

    }

}
