package Day18;

public class ABMW {
    String make;
    String model;
    double price;

    public void ShowPrice(){
        switch(model){
            case "330i":
                price=40.250;
                break;
            case "740i":
                price=85.000;
                break;
            case "M3":
                price=65.000;
                break;
            default:
                System.out.println(model + " is not avaliable");
                price=0.0;

        }
        System.out.println("price is "+ price);
    }
}
