package Day25i26;

public class CTask1 {
    public static void main(String[] args) {
        String Musab="Mr. Doktor Musab Kamil Cakar";
        if(Musab.startsWith("Mr")){
            System.out.println("He is married man");
        } else if (Musab.startsWith("Mrs.")) {
            System.out.println("Married woman");
        } else if (Musab.startsWith("Ms")) {
            System.out.println("Some woman");
        } else if (Musab.startsWith("Dr")) {
            System.out.println("Doctor man or woman");
        }else{
            System.out.println("Unknown status");
        }
    }
}
