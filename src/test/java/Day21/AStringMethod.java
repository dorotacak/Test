package Day21;

public class AStringMethod {
    public static void main(String[] args) {
        String emoji = ";0";
        if (emoji.length() != 2) {
            System.out.println("invalid emoji");
            return; // stop execution
        }
        if (emoji.charAt(0) == ':') {
            if (emoji.charAt(1) == ')') {
                System.out.println("Smile");
            } else if (emoji.charAt(1) == '(') {
                System.out.println("Sad");
            } else if (emoji.charAt(1) == '/') {
                System.out.println("Upset");
            } else if (emoji.charAt(1) == 'p') {
                System.out.println("Playful");
            } else {
                System.out.println("Invalid emoji");

            }
        } else if (emoji.charAt(0) == ';') {
            if (emoji.charAt(1) == ')') {
                System.out.println("Wink");
            } else if (emoji.charAt(1) == '0') {
                System.out.println("Surprised");
            } else {
                System.out.println("Invalid emoji");
            }


        }
    }
}

