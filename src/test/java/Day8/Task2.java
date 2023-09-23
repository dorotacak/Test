package Day8;

public class Task2 {
    public static void main(String[] args) {
        /*Revenue can be calculated as the selling price of the product times the quantity sold, i.e. revenue = price × quantity.
                Write a program that asks the user to enter product price and quantity and then calculate the revenue.
                 If the revenue is more than 5000 a discount is 10% offered.
            Program should display the discount and net revenue.*/
        double price=3.5;
        int quantity=3350;
        double revenue= price*quantity;
        double discount= 0;
        if (revenue>5000) {
            discount=revenue*0.1;
            revenue=revenue-discount;
        }
        System.out.println(discount);
        System.out.println(revenue);
    }
}
