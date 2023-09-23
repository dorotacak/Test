package Day17;

public class CellPhoneObject {
    public static void main(String[] args) {
        CellPhone mobile1=new CellPhone();
        CellPhone mobile2=new CellPhone();
        CellPhone mobile3=new CellPhone();
        mobile3.color="red";
        mobile3.screenSize=20;
        mobile3.price=105;
        mobile1.color="black";
        mobile2.screenSize=30;
        mobile2.takeAphoto();
        mobile1.takeAphoto();
        System.out.println(mobile2.color);
        System.out.println(mobile3.screenSize);
        mobile3.takeAphoto();


    }
}
