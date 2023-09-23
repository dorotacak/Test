package Day9;

public class NestedIfStatement {
    public static void main(String[] args) {
        //Syntax
        int salary=100;
        int yearsOnJob=3;
        if(salary>=300) {
            if (yearsOnJob >= 2) {
                System.out.println("You qualify for the loan");

            }else{
                System.out.println("You must have been on your current job at least  2 years");
            }
            }else{
            System.out.println("You must earn at leas 30000 $ per year");

        }
    }
}
