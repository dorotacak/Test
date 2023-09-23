package Day30;

public class CLengh {
    public static void main(String[] args) {
        int[][]numbers={
                {1,2,3,4},//row-0
                {5,6},//row-1
                {9,10,11,12,30,50,60}//row-2

        };
        //display the number of rows
        System.out.println(numbers.length);
        //display the number of columns in each rows
        for(int i=0; i<numbers.length; i++){
            System.out.println("The numbers of colums in raw "+i +"is "+ numbers[i].length);
        }
    }
}
