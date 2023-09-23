package Day7;

public class Task2 {
    public static void main(String[] args) {
        int hours=35;
        double payrate=1000;
        if (hours>40) {
            payrate=payrate*1.5;

        }
        System.out.println(payrate);
    }
}
// godziny 40, wowczas payrate 1500, jesli 35, condition if nie dziala//