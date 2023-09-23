package Day17;

public class ContactObject {
    public static void main(String[] args) {
        Contact friend1=new Contact();
        Contact friend2=new Contact();
        Contact friend3=new Contact();
        friend3.email="d.cakar@wp.pl";
        friend2.name="Dorota";
        friend3.phoneNumber=501654777;
        friend2.phoneNumber=737481313;
        System.out.println(friend1.phoneNumber);
        System.out.println(friend2.name);
        System.out.println(friend3.email);
        friend3.call();
        friend3.sendEmail();
    }

}
