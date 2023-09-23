package Day18;

public class CBankAccount {
    double balance;
    String accountHolder;
    int accountNumber;
    public void deposit(double amount){
        System.out.println("depositing $" + amount + " to" + accountNumber);
        balance=balance+ amount;
    }
    public void withdraw( double amount){
        System.out.println("withdrawing $" + amount + " from" + accountNumber);
        balance=balance-amount;


    }
    public void showBalance(){
        System.out.println("-----------");
        System.out.println("accountholder : "+ accountHolder);
        System.out.println("accountnumber : "+ accountNumber);
        System.out.println("balance: "+ balance);

    }
    public void charge(double price, String item){
        if (balance>=price){
            System.out.println("You can buy this "+ item);
        }else{
            System.out.println("You can not buy this "+ item);
        }



    }


}
