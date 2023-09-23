package Day8;

public class Examples {
    public static void main(String[] args) {
        int hours=65;
        double payrate=1000;
        if (hours>10&hours<40) {
            payrate=payrate*2.5;
        }
        else{
            payrate=payrate*3.5;
        }
        System.out.println(payrate);

    }


}
