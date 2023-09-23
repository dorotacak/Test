package Day9;

import java.util.logging.SocketHandler;

public class SwitchCaseStatement {
    public static void main(String[] args) {
        /*
        switch(expression){
           case constant1:
             statement 1;
             statement 2;
          break;
        case constant2:
         statement 1;
        statement 2;
        break;


        default:
         statement 1;
        statement 2;
        break;
        }

         */


        String weather="freezing";
        switch(weather){
            case "sunny":
                System.out.println("Go to swimming");
                System.out.println("Go to park");
                break;

            case "rainy":
                System.out.println("stay at home");
                System.out.println("Code Java");
                System.out.println("read a book");
                break;
            case "windy":
                System.out.println("wear hat");
                System.out.println("Code Java");
                System.out.println("fly kite");
                break;
                default:
                System.out.println("Code Java in any weather");



        }
    }
}
