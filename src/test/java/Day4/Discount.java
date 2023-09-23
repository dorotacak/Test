package Day4;

public class Discount {
    public static void main(String[] args) {
        // this program calculates the sale price of an item
        // that is regularly priced at $59, with a %20 discount on it.
        double regularPrice=59;
        double regularDiscount=0.2;
        double salesPrice;
        salesPrice=regularDiscount*regularPrice;
        double totalPrice;
        totalPrice=regularPrice-salesPrice;
       // totalPrice=regularPrice-(regularPrice*regularDiscount);
        System.out.println(totalPrice);
        System.out.println(salesPrice);



    }
}
