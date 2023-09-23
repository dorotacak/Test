package Day5;

public class UnaryOperators {
    public static void main(String[] args) {
        // OPERATOR        NAME                        MEANING
        //+                Unary Plus Operator         indicates positive value
        //-
        //++               Increment Operator          increments a value by 1
        //--               Decrement Operator          decrements a value by 1
        // !               logical complement operator   Inverse the value of a boolean


        int var=100;
        var ++; //lub//
        // var=var+1;
        System.out.println(var);
        var --;
        System.out.println(var);

        //++ var, --var -->PRE
        //var ++, var-- --> POST

        int a=25;
        System.out.println(++a);   // first increase or decrease then use it
        System.out.println(--a);

        int b=68;
        System.out.println(b++);    // first use then increase or decrease
       //b=69
        System.out.println(b--);
      // b=68
        System.out.println(b+3);

    }
}
