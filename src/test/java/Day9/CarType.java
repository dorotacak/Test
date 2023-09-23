package Day9;

public class CarType {
    public static void main(String[] args) {
        boolean isRushHour = false;
        int carType = 2;
        double Price = 0.0;
        if (carType ==1) {
            if (isRushHour) {
                Price =30.0;
            } else  {
                Price = 5.0;
            }
        } else if (carType==2) {
            if (isRushHour) {
                Price = 55.30;
            } else {
                Price = 15.99;
            }
        }
        System.out.println("Total cost:" + Price);
    }

}
