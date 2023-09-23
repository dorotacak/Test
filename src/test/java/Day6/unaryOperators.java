package Day6;

public class unaryOperators {
    public static void main(String[] args) {
        int i1=10;
        int i2=-100;
        int result=-(i1+i2);
        System.out.println(result);
        System.out.println("************");

        int i=10;
        int j=5;
        i++; // same as i=i+1
        --j; // same as j=j-1
        System.out.println(i);
        System.out.println(j);
        System.out.println(i++); // in memory i=12
        System.out.println(++i);


        System.out.println("*******");
        int a=2;
        int b= a++; //b=a in memory a=3
        System.out.println(a);
        System.out.println(b);
        System.out.println("*******");

        int c=2;
        System.out.println(c++); //in memory c=3
        int d=c+1;
        System.out.println(d);

        System.out.println("*******");
        int k=3;
        System.out.println(--k);   //output 2
        int t=k--;
        System.out.println(t);


        boolean flag=true;
        System.out.println(!flag);
        System.out.println(!!flag);



    }
}
