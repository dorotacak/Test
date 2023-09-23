package Day30;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][]scores=new int[3][4];
        scores[0][0]=10;
        scores[0][1]=20;
        scores[2][2]=30;
        //System.out.println(scores);//blad
        //System.out.println(scores[0]);//blad
        // print first row
        System.out.println(scores[0][0]);
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[0][3]);
        // print second row

        System.out.println(scores[1][1]);
        System.out.println(scores[1][2]);


    }
}
