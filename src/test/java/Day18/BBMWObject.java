package Day18;

public class BBMWObject {
    public static void main(String[] args) {
       ABMW car1=new ABMW();
       ABMW car2=new ABMW();
       car1.model="330i";
       car1.ShowPrice();
       car2.model="740i";
        car2.ShowPrice();
        System.out.println(car2.make);
        System.out.println(car1.make);
        System.out.println("------------            ");
        car2.make="mercedes";
        System.out.println(car2.make);


    }
}
