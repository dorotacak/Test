package Day31;

public class ATask95 {
    public static void main(String[] args) {
        int[][] numbers = {
                {68, 75, 54, 80},
                {100, 64, 20, 50},
                {10, 35, 40, 90}
        };
        int sum = 0;
        for (int i = 0; i < numbers[0].length; i++) {
            sum = sum + numbers[0][i];

        }
        System.out.println(sum/numbers[0].length);

        int sum2=0;
        for(int k=0; k<numbers.length; k++){
            sum2=sum2 + numbers[k][0];

        }
        System.out.println(sum2);
    }

}