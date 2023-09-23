package Day22;

public class CTask1 {
    public static void main(String[] args) {
        String email="senemce@gmail.com";
        if(email.contains("yahoo")){
        System.out.println("its yahoo account");
    } else if (email.contains("gmail")) {
            System.out.println("google account");

        } else if (email.contains("outlook")) {
            System.out.println("hotmail");


        }else{
            System.out.println("unknown account");
        }
    }
}
