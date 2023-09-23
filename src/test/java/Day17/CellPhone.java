package Day17;

public class CellPhone {
    String brand;
    double screenSize;
    String color;
    double price;
    public void call(){
        System.out.println(brand + " is calling");
    }
    public void message (){
        System.out.println(color + " sent a message");
    }
    public void takeAphoto (){
        System.out.println(screenSize + " is taking best photo");
    }
}
