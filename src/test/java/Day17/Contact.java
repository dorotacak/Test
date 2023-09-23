package Day17;

public class Contact {
    String name;
    int phoneNumber;
    String email;
    public void call(){
        System.out.println(phoneNumber + " is calling");

    }
    public void sendMessage(){
        System.out.println(name + "from this " + phoneNumber + " sent me a message");
    }
    public void sendEmail(){
        System.out.println(" This " + email+ " sent me email");
    }
}
