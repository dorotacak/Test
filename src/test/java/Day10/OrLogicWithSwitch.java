package Day10;

public class OrLogicWithSwitch {
    public static void main(String[] args) {
        // A or B or C --> Pass
        //D or E --> Fail
        char  grade ='D';
       /* switch (grade){
            case 'A':
                System.out.println("Pass");
                break;
            case 'B':
                System.out.println("Pass");
                break;
            case 'C':
                System.out.println("Pass");
                break;
            case 'D':
                System.out.println("fail");
                break;
            case 'E':
                System.out.println("Fail");
                break;
                */
         switch (grade){
             case 'A':
             case 'B':
             case 'C':
                 System.out.println("Pass");
                 break;
             case 'D': case 'E':
                 System.out.println("Fail");
                 break;




        }

    }

}
