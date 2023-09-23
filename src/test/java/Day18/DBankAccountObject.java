package Day18;

public class DBankAccountObject {
    public static void main(String[] args) {
        CBankAccount acc1=new CBankAccount();
        acc1.balance=5000000;
        acc1.deposit(50000);
        acc1.showBalance();
        acc1.withdraw(25000);
        acc1.showBalance();
        acc1.charge(8000000,"car");

    }
}
