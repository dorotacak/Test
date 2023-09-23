package Day3;

public class ArithmeticOprerators {
    public static void main(String[] args) {
        //Addition   +    10+5
        //Subtraction  -  10-5
        //Division    /   10/5    output 2
        //Multiplication *  10*5
        //Modulus      %    10%3=1    //reszta
        

        System.out.println(50+5);
        System.out.println(40-10);
        System.out.println(60/6);
        System.out.println(80*8);


        int chairs=140;
        System.out.println(chairs+2);
        int table=156;
        System.out.println(table-10);
        table=table*10;
        System.out.println(table);
        chairs=chairs/14;
        System.out.println(chairs);

        int total=chairs+table;
        System.out.println("total is : "+ total);


        double balance= 1200.50;
        double transaction=56.44;
        balance=balance-transaction;
        System.out.println(balance);
    }
}
